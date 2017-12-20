use librarydb;

drop table if exists manager_login;

create table manager_login(
id int(11) primary key auto_increment,
login_id varchar(16) unique,
login_pass varchar(16),
user_name varchar(16),
lastlogin_time datetime,
updated_time datetime
);