use librarydb;

drop table if exists book_info;

create table book_info(
book_id int(11) primary key auto_increment,
isbn bigint(13),
place_id int(11),
foreign key(place_id) references place_info(place_id)
);

