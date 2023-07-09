package com.example.springmultidbtest.database

import org.springframework.beans.factory.annotation.Qualifier
import org.springframework.boot.context.properties.ConfigurationProperties
import org.springframework.boot.jdbc.DataSourceBuilder
import org.springframework.boot.orm.jpa.EntityManagerFactoryBuilder
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.data.jpa.repository.config.EnableJpaRepositories
import org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean
import javax.sql.DataSource

/**
 * @author Jefferson Alves Reis (jefaokpta) < jefaokpta@hotmail.com >
 * Date: 09/07/23
 */
@Configuration
@EnableJpaRepositories(
    basePackages = ["com.example.springmultidbtest.repository.remote"],
    entityManagerFactoryRef = "remoteEntityManagerFactory"
)
class RemoteDbConfig {

    @Bean
    @ConfigurationProperties(prefix = "remote.datasource")
    fun remoteDataSource(): DataSource = DataSourceBuilder.create().build()

    @Bean
    fun remoteEntityManagerFactory(
        builder: EntityManagerFactoryBuilder,
        @Qualifier("remoteDataSource") dataSource: DataSource
    ): LocalContainerEntityManagerFactoryBean = builder
        .dataSource(dataSource)
        .packages("com.example.springmultidbtest.model.remote")
        .build()
}