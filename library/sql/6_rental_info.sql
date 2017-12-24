use librarydb;

drop table if exists rental_info;

create table rental_info(
renatal_id int(11) primary key auto_increment,
user_id int(11),
book_id int(11),
rental_day datetime,
return_day datetime,
foreign key(user_id) references user_info(user_id),
foreign key(book_id) references book_info(book_id)
);