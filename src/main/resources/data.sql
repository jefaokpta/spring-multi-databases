CREATE TABLE persons(
    id BIGINT NOT NULL AUTO_INCREMENT,
    name varchar(255) NOT NULL,
    age INTEGER NOT NULL,
    PRIMARY KEY (id)
);

INSERT INTO persons(name, age) VALUES('John', 30);
INSERT INTO persons(name, age) VALUES('Jane', 25);