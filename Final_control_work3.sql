delete from camels where CamId > 0;
select * from camels;
drop table if exists NewPack; 
create table NewPack (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select  PackId,
		name, 
        command, 
        birthday
from horses union 
select  PackId,
		name, 
        command, 
        birthday
from donkeys;

select * from NewPack;

drop table if exists NewPet; 
create table NewPet (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select  PetId,
		name, 
        command, 
        birthday
from cats union 
select  PetId,
		name, 
        command, 
        birthday
from dogs union
select PetId,
		name, 
        command, 
        birthday
from hamsters;

select * from NewPack;

drop table if exists HumanFriends; 
create table HumanFriends (id INT NOT NULL AUTO_INCREMENT PRIMARY KEY)
select  PackId as AnimId,
		name, 
        command, 
        birthday
from newpack union 
select  PetId as AnimId,
		name, 
        command, 
        birthday
from newpet;