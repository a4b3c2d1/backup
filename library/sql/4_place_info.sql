use librarydb;

drop table if exists place_info;

create table place_info(
place_id int(11) primary key auto_increment,
place_name varchar(16)
);