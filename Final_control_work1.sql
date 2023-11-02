CREATE DATABASE HumanFriends;

DROP TABLE IF EXISTS cats;
CREATE TABLE cats (
	CatId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    PetId INT,
    name VARCHAR(45),
    command VARCHAR(45),
    birthday DATE,
    FOREIGN KEY (PetId) REFERENCES Pet_Animals(id)
);

DROP TABLE IF EXISTS dogs;
CREATE TABLE dogs (
	DogId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    PetId INT,
    name VARCHAR(45),
    command VARCHAR(45),
    birthday DATE,
    FOREIGN KEY (PetId) REFERENCES Pet_Animals(id)
);
DROP TABLE IF EXISTS hamsters;
CREATE TABLE hamsters (
	HamsId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    PetId INT,
    name VARCHAR(45),
    command VARCHAR(45),
    birthday DATE,
    FOREIGN KEY (PetId) REFERENCES Pet_Animals(id)
);
DROP TABLE IF EXISTS horses;
CREATE TABLE horses (
	HorsId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    PackId INT,
    name VARCHAR(45),
    command VARCHAR(45),
    birthday DATE,
    FOREIGN KEY (PackId) REFERENCES Pack_Animals(id)
);
DROP TABLE IF EXISTS camels;
CREATE TABLE camels (
	CamId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    PackId INT,
    name VARCHAR(45),
    command VARCHAR(45),
    birthday DATE,
    FOREIGN KEY (PackId) REFERENCES Pack_Animals(id)
);
DROP TABLE IF EXISTS donkeys;
CREATE TABLE donkeys (
	DonkId INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    PackId INT,
    name VARCHAR(45),
    command VARCHAR(45),
    birthday DATE,
    FOREIGN KEY (PackId) REFERENCES Pack_Animals(id)
);

DROP TABLE IF EXISTS Pet_Animals;
CREATE TABLE Pet_Animals (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45)
);
DROP TABLE IF EXISTS Pack_Animals;
CREATE TABLE Pack_Animals (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(45)
);


