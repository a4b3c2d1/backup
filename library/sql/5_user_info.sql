use librarydb;

drop table if exists user_info;

create table user_info(
user_id int(11) primary key auto_increment,
name varchar(16),
create_day datetime
);