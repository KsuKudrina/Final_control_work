# Final_control_work
1.
mkdir Final_control_work

cd Final_control_work

cat > pet_animal

        собаки
        кошки
        хомяки

cat > pack_animal

        лошади
        верблюды
        ослы

cat pet_animal pack_animal > animals

cat animals

        собаки
        кошки
        хомяки
        лошади
        верблюды
        ослы

mv animals human_friends

 ls -l

        итого 12

        -rw-rw-r-- 1 ksu-vb ksu-vb 76  ноя  1 17:25 human_friends

        -rw-rw-r-- 1 ksu-vb ksu-vb 39  ноя  1 17:20 pack_animal

        -rw-rw-r-- 1 ksu-vb ksu-vb 37  ноя  1 17:24 pet_animal


2.

mkdir Nursery

ls -l

        итого 16

        -rw-rw-r-- 1 ksu-vb ksu-vb   76 ноя  1 17:25 human_friends

        drwxrwxr-x 2 ksu-vb ksu-vb 4096 ноя  1 17:32 Nursery

        -rw-rw-r-- 1 ksu-vb ksu-vb   39 ноя  1 17:20 pack_animal

        -rw-rw-r-- 1 ksu-vb ksu-vb   37 ноя  1 17:24 pet_animal


sudo mv human_friends /home/ksu-vb/Final_control_work/Nursery

ls -l

        итого 12

        drwxrwxr-x 2 ksu-vb ksu-vb 4096 ноя  1 17:32 Nursery

        -rw-rw-r-- 1 ksu-vb ksu-vb   39 ноя  1 17:20 pack_animal

        -rw-rw-r-- 1 ksu-vb ksu-vb   37 ноя  1 17:24 pet_animal


cd -

        /home/ksu-vb/Final_control_work/Nursery

ls -l

        итого 4

        -rw-rw-r-- 1 ksu-vb ksu-vb 76 ноя  2 09:29 human_friends




3.

wget https://dev.mysql.com/get/mysql-apt-config_0.8.24-1_all.deb

cd Загрузки

sudo dpkg -i mysql-apt-config_0.8.24-1_all.deb

sudo apt-get update

sudo apt-get install mysql-server

systemctl status mysql


4.

wget  https://dev.mysql.com/get/Downloads/Connector-J/mysql-connector-j_8.0.32-1ubuntu22.04_all.deb

sudo dpkg - i mysql-connector-j_8.0.32-1ubuntu22.04_all.deb

sudo dpkg -r mysql-connector-j

sudo apt-get autoremove




mkdir mydb

docker run --name mariadb-container -d -v /home/ksu-vb/Final_control_work/mydb:/var/lib/mysql -e MARIADB_ROOT_PASSWORD=5645 mariadb:10.10.2


docker ps

docker exec -it ID bash

mysql -u root -p

        create database HumanFriends;

        show databases;

        exit
exit

docker run --name myadmin-gb -d --link mariadb-container:db -p 8081:80 phpmyadmin/phpmyadmin

## в браузере

* 0.0.0.0:8081