set names utf8;
set foreign_key_checks = 1;
drop database if exists sagaone;

create database if not exists sagaone;
use sagaone;


create table if not exists user_info(
id int not null primary key auto_increment,
user_id varchar(16) unique,
password varchar(16) not null,
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
sex tinyint default 0 not null,
email varchar(32) not null,
status tinyint default 0 not null,
logined tinyint default 0 not null,
regist_date datetime not null,
update_date datetime
);


create table if not exists destination_info(
id int not null primary key auto_increment,
user_id varchar(16),
family_name varchar(32) not null,
first_name varchar(32) not null,
family_name_kana varchar(32) not null,
first_name_kana varchar(32) not null,
email varchar(32) not null,
tel_number varchar(13) not null,
user_address varchar(50) not null,
status tinyint default 0 not null,
regist_date datetime not null,
update_date datetime,
foreign key(user_id) references user_info(user_id)
);


create table if not exists m_category(
id int not null primary key auto_increment,
category_id int not null unique,
category_name varchar(20) not null unique,
category_description varchar(100),
insert_date datetime not null,
update_date datetime
);


create table if not exists product_info(
id int not null primary key auto_increment,
product_id int not null unique,
product_name varchar(100) not null unique,
product_name_kana varchar(100) not null unique,
product_description varchar(255) not null,
category_id int not null,
price int,
image_file_path varchar(100),
image_file_name varchar(50),
release_date datetime not null,
release_company varchar(50),
status tinyint default 0 not null,
regist_date datetime not null,
update_date datetime,
foreign key(category_id) references m_category(category_id)
);


create table if not exists cart_info(
id int not null primary key auto_increment,
user_id varchar(16),
temp_user_id varchar(128),
product_id int not null,
product_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime,
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
);



create table if not exists purchase_history_info (
id int not null primary key auto_increment,
user_id varchar(16),
product_id int not null,
product_count int not null,
price int not null,
regist_date datetime not null,
update_date datetime,
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
);


create table if not exists review_info(
id int not null primary key auto_increment,
user_id varchar(16),
product_id int not null,
value float not null,
review varchar(255) not null,
update_date datetime,
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id)
);

create table if not exists card_info(
id int not null primary key auto_increment,
user_id varchar(16),
card_number varchar(32) not null,
limit_year varchar(32) not null,
limit_month varchar(32) not null,
security_number varchar(32) not null,
nominee varchar(32) not null,
status tinyint default 0 not null,
regist_date datetime not null,
update_date datetime,
foreign key(user_id) references user_info(user_id)
);



insert into user_info values(1, "taro", "123", "山田", "太郎", "やまだ", "たろう", 0, "taro@aaa.com", 1, 1, "2018/01/09", "2018/01/09");

insert into m_category values(1, 1, "本", "本です", "2018/01/09", "2018/01/09");
insert into m_category values(2, 2, "家電・パソコン", "家電・パソコンです", "2018/01/09", "2018/01/09");
insert into m_category values(3, 3, "おもちゃ・ゲーム", "おもちゃ・ゲームです", "2018/01/09", "2018/01/09");
insert into m_category values(4, 4, "おもちゃ・ぬいぐるみ", "おもちゃ・ぬいぐるみです", "2018/01/09", "2018/01/09");

insert into product_info values(1, 1, "カメラ", "かめら", "低価格で扱いやすいコンパクトカメラです。", 2, 5000, "./img/camera.jpg", "camera", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(2, 2, "マウス", "まうす", "お手ごろな価格ながら使いやすいPC用マウスです", 2, 500, "./img/mausu.jpg", "mausu", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(3, 3, "ノートパソコン", "のーとぱそこん", "最新のノートパソコンです。薄さが売りながらも、ハイスペックです。", 2, 100000, "./img/notepc1.jpg", "notepc1", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(4, 4, "一眼レフカメラ", "いちがんれふかめら", "高性能の一眼レフカメラ。プロにも愛された不朽の名品です。", 2, 70000, "./img/camera1.jpg", "camera1", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(5, 5, "キーボード", "きーぼーど", "安いPC用キーボード。", 2, 3000, "./img/keyboad1.jpg", "keyboad1", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");

insert into product_info values(6, 6, "嘔吐", "おうと", "嘔吐：サルトル著", 1, 3000, "./img/outo.jpg", "outo", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(7, 7, "人を動かす", "ひとをうごかす", "人を動かす：カーネギー著", 1, 3000, "./img/hitowougokasu.jpg", "hitowougokasu", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(8, 8, "壁", "かべ", "壁：阿部公房著", 1, 3000, "./img/kabe.jpg", "kabe", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(9, 9, "こころ", "こころ", "こころ：夏目漱石著", 1, 3000, "./img/kokoro.jpg", "kokoro", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(10, 10, "人間失格", "にんげんしっかく", "人間失格：太宰治著", 1, 3000, "./img/ninngennsikkaku.jpg", "ninngennsikkaku", "2018/01/09", "sagawa", 1, "2018/01/09", "2018/01/09");
insert into product_info values(11, 11, "トゲデマルのぬいぐるみ", "とげでまるのぬいぐるみ", "ポケモンセンター。トゲデマルのかわいいぬいぐるみです。", 4, 800, "./img/togedemaru.jpg", "togedemaru", "2018/01/01", "pokemonn-center", 1, "2018/01/01", "2018/01/01");
insert into product_info values(12, 12, "エモンガのぬいぐるみ", "えもんがのぬいぐるみ", "ポケモンセンター。エモンガのかっこいいぬいぐるみです。", 4, 800, "./img/emonga.jpg", "emonga", "2018/01/01", "pokemonn-center", 1, "2018/01/01", "2018/01/01");
insert into product_info values(13, 13, "公衆電話", "こうしゅうでんわ", "1分10円取られます。",2, 60000, "./img/dennwa.jpg", "koushuudennaw", "1970/01/09", "日本電信株式会社", 1, "2018/01/09", "2018/01/09");

insert into cart_info values(1, "taro", "taro", 1, 1, 5000, "2018/01/09", "2018/01/09");
insert into cart_info values(2, "taro", "taro2", 2, 2, 500, "2018/01/11", "2018/01/11");
insert into purchase_history_info values(1, "taro", 1, 1, 5000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(2, "taro", 2, 1, 500, "2018/01/09", "2018/01/09");
insert into destination_info values(1, "taro", "山田", "太郎", "やまだ", "たろう", "taro@aaa.com", "00011112222", "東京都渋谷区渋谷1-1-1",1, "2018/01/09", "2018/01/09") ;
insert into destination_info values(2, "taro", "山田", "太郎", "やまだ", "たろう", "taro@aaa.com", "00011112222", "東京都千代田区丸の内1-1-1",0, "2018/01/09", "2018/01/09") ;


