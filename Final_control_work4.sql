drop table if exists youngAnimals;

create table youngAnimals (
	id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
    AnimId INT,
	name VARCHAR(45),
    command VARCHAR(45),
    birthday DATE,
	age TEXT);
    
INSERT INTO youngAnimals (AnimId, name, command, birthday, age)
SELECT AnimId, name, command, birthday, age_animal(birthday)
FROM humanfriends
WHERE TIMESTAMPDIFF(YEAR, birthday, CURDATE()) BETWEEN 1 AND 3;

select * from youngAnimals;

