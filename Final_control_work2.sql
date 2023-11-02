USE HumanFriends;
insert into cats (PetId, name, command,  birthday) values
    (2, 'Кот1', 'Есть', '2019-01-01'),
    (2, 'Кот2', 'Спать', '2022-02-15'),
	(2, 'Кот3', 'Мурчать', '2020-10-30'),
    (2, 'Кот4', 'Бегать', '2019-03-18');
    
    select * from cats;

    insert into dogs (PetId, name, command,  birthday) values
    (1, 'Собака1', 'Есть', '2019-01-01'),
    (1, 'Собака2', 'Лежать', '2022-02-15'),
	(1, 'Собака3', 'Сидеть', '2020-10-30'),
    (1, 'Собака4', 'Лапу', '2019-03-18');
	
    select * from dogs;
 
	insert into hamsters (PetId, name, command,  birthday) values
    (3, 'Хомяк1', 'Спать', '2019-01-01'),
    (3, 'Хомяк2', 'Есть', '2022-02-15'),
	(3, 'Хомяк3', 'Бегать', '2020-10-30'),
    (3, 'Хомяк4', 'Мыться', '2019-03-18');
	
    select * from hamsters;
     
	insert into camels (PackId, name, command,  birthday) values
    (2, 'Верб1', 'Жевать', '2019-01-01'),
    (2, 'Верб2', 'Плевать', '2022-02-15'),
	(2, 'Верб3', 'Спать', '2020-10-30'),
    (2, 'Верб4', 'Идти', '2019-03-18');
	
    select * from camels;
     
	insert into horses (PackId, name, command,  birthday) values
    (1, 'Конь1', 'Ржать', '2019-01-01'),
    (1, 'Конь2', 'Есть', '2022-02-15'),
	(1, 'Конь3', 'Бежать', '2020-10-30'),
    (1, 'Конь4', 'Идти', '2019-03-18');
	
    select * from horses;    
     
	insert into donkeys (PackId, name, command,  birthday) values
    (3, 'Осел1', 'Стоять', '2019-01-01'),
    (3, 'Осел2', 'Есть', '2022-02-15'),
	(3, 'Осел3', 'Идти', '2020-10-30'),
    (3, 'Осел4', 'Спать', '2019-03-18');
	
    select * from donkeys; 
 	
    insert into pet_animals (name) values
    ('Собаки'),
    ('Кошки'),
	('Хомяки');
	
    select * from pet_animals;
    
    insert into pack_animals (name) values
    ('Лошади'),
    ('Верблюды'),
	('Ослы');
	
    select * from pack_animals;