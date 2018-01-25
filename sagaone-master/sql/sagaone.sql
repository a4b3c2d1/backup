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


create table if not exists review_value(
id int not null primary key auto_increment,
value float not null unique
);

create table if not exists review_info(
id int not null primary key auto_increment,
user_id varchar(16),
product_id int not null,
value float not null,
review varchar(255) not null,
update_date datetime,
foreign key(user_id) references user_info(user_id),
foreign key(product_id) references product_info(product_id),
foreign key(value) references review_value(value)
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





insert into review_value values(1,1);
insert into review_value values(2,2);
insert into review_value values(3,3);
insert into review_value values(4,4);
insert into review_value values(5,5);


insert into user_info values(1, "taro", "123", "山田", "太郎", "やまだ", "たろう", 0, "taro@aaa.com", 1, 1, "2018/01/09", "2018/01/09");
insert into user_info values(2, "jiro", "123", "田中", "次郎", "たなか", "じろう", 0, "jiro@bbb.com", 1, 1, "2018/01/09", "2018/01/09");
insert into user_info values(3, "ichiro", "123", "鈴木", "一郎", "すずき", "いちろう", 0, "ichiro@ccc.com", 1, 1, "2018/01/09", "2018/01/09");
insert into user_info values(4, "saburo", "123", "佐藤", "三郎", "さとう", "さぶろう", 0, "saburo@ddd.com", 1, 1, "2018/01/09", "2018/01/09");
insert into user_info values(5, "shiro", "123", "伊藤", "四郎", "いとう", "しろう", 0, "shiro@eee.com", 1, 1, "2018/01/09", "2018/01/09");

insert into m_category values(1, 1, "本", "本です", "2018/01/09", "2018/01/09");
insert into m_category values(2, 2, "家電・パソコン", "家電・パソコンです", "2018/01/09", "2018/01/09");
insert into m_category values(3, 3, "おもちゃ・ゲーム", "おもちゃ・ゲームです", "2018/01/09", "2018/01/09");

insert into product_info values(1, 1, "3Dプリンター", "すりーでぃーぷりんたー", "3Dでプリントできます。", 2, 50000, "./img/3dprinter.jpg", "3dprinter", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(2, 2, "All-in-OnePC", "オールインワンパソコン", "高性能で安価です。", 2, 100000, "./img/allinone-pc.jpg", "allinone-pc", "2016/01/01", "bsus", 1, "2018/01/09", "2018/01/09");
insert into product_info values(3, 3, "電卓", "でんたく", "使いやすい電卓です。", 2, 500, "./img/caliculator.jpg", "caliculator", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(4, 4, "カメラ", "かめら", "見た目がかっこいいです。", 2, 50000, "./img/camera2.jpg", "camera2", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(5, 5, "ポラロイドカメラ", "ぽらろいどかめら", "昔ながらのカメラです。", 2, 30000, "./img/camera3.jpg", "camera3", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(6, 6, "携帯電話", "けいたいでんわ", "ガラケーです。", 2, 30000, "./img/cellphone1.jpg", "cellphone1", "2016/01/01", "bu", 1, "2018/01/09", "2018/01/09");
insert into product_info values(7, 7, "スマートフォン", "すまーとふぉん", "最新のスマホです。", 2, 100000, "./img/cellphone2.jpg", "cellphone2", "2016/01/01", "bu", 1, "2018/01/09", "2018/01/09");
insert into product_info values(8, 8, "チェスセット", "ちぇすせっと", "チェスを楽しめます。", 3, 1000, "./img/chess.jpg", "chess", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(9, 9, "コーヒーメーカー", "こーひーめーかー", "おいしいコーヒーが飲めます。", 2, 10000, "./img/coffeemaker.jpg", "coffeemaker", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(10,10, "電子レンジ", "でんしれんじ", "おいしく温められます。", 2, 20000, "./img/dennshirennzi.jpg", "dennshirennzi", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(11,11, "公衆電話", "こうしゅうでんわ", "公衆電話が設置できます。", 2, 500000, "./img/dennwa.jpg", "dennwa", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(12,12, "デスクトップ", "ですくとっぷ", "高性能で静かです。", 2, 50000, "./img/desktoppc.jpg", "desktoppc", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(13,13, "DVDプレイヤー", "でぃーぶいでぃーぷれいやー", "DVDが楽しめます。", 2, 10000, "./img/dvdplayer.jpg", "dvdplayer", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(14,14, "イヤフォン", "いやふぉん", "いい音で聴けます。", 2, 2000, "./img/earphone.jpg", "earphone", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(15,15, "fax", "ふぁっくす", "昔ながらのfaxです。", 2, 5000, "./img/fax.jpg", "fax", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(16,16, "冷蔵庫", "れいぞうこ", "たくさん入ります。", 2, 100000, "./img/freezer.jpg", "freezer", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(17,17, "学問のすすめ", "がくもんのすすめ", "夏目漱石の代表作です。", 1, 500, "./img/gakumonnnosusume.jpg", "gakumonnnosusume", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(18,18, "DSS", "でぃーえすえす", "外でゲームができます。", 3, 15000, "./img/game-machine.jpg", "game-machine", "2016/01/01", "任天", 1, "2018/01/09", "2018/01/09");
insert into product_info values(19,19, "pss", "ぷれすてーしょんずー", "ゲームが楽しめます。", 3, 10000, "./img/game-machine2.jpg", "game-machine2", "2016/01/01", "ソニ", 1, "2018/01/09", "2018/01/09");
insert into product_info values(20,20, "wiii", "うぃいい", "家族でゲームを楽しめます。", 3, 20000, "./img/game-machine3.jpg", "game-machine3", "2016/01/01", "任天", 1, "2018/01/09", "2018/01/09");
insert into product_info values(21,21, "zbox", "ぜっとぼっくす", "海外のゲームです。", 3, 30000, "./img/game-machine4.jpg", "game-machine4", "2016/01/01", "マイクロ", 1, "2018/01/09", "2018/01/09");
insert into product_info values(22,22, "ゲームポーイ", "げーむぽーい", "懐かしのゲーム機です。", 3, 10000, "./img/gameboy.jpg", "gameboy", "2016/01/01", "任天", 1, "2018/01/09", "2018/01/09");
insert into product_info values(23,23, "ヘッドフォン", "へっどふぉん", "いい音で聴けます。", 2, 10000, "./img/headphone.jpg", "headphone", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(24,24, "ヘリコプター", "へりこぷたー", "安いヘリコプターです。", 3, 1000000, "./img/hericopter.jpg", "hericopter", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(25,25, "人を動かす", "ひとをうごかす", "面白い本です。", 1, 500, "./img/hitowougokasu.jpg", "hitowougokasu", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(26,26, "一眼カメラ", "いちがんかめら", "高性能の一眼カメラです。", 2, 10000, "./img/itigan_camera.jpg", "itigan_camera", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(27,27, "壁", "かべ", "ためになる本です。", 1, 500, "./img/kabe.jpg", "kabe", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(28,28, "キーボード", "きーぼーど", "使いやすいキーボードです。", 2, 5000, "./img/keyboad1.jpg", "keyboad1", "2016/01/01", "fuji", 1, "2018/01/09", "2018/01/09");
insert into product_info values(29,29, "こころ", "こころ", "夏目漱石の代表的な本です。", 1, 500, "./img/kokoro.jpg", "kokoro", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");
insert into product_info values(30,30, "電話", "でんわ", "くろいでんわです。", 2, 10000, "./img/Kurodenwa.jpg", "Kurodenwa", "2016/01/01", "sagaone", 1, "2018/01/09", "2018/01/09");

insert into product_info values(31, 31, "舞姫", "まいひめ", "舞姫：森鴎外著", 1, 1000, "./img/maihime.jpg", "maihime", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(32, 32, "マッサージマシン", "まっさーじましん", "全身コリほぐし機能搭載高性能マッサージマシンです。", 2, 120000, "./img/massage-machine.jpg", "massage-machine", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(33, 33, "オセロ", "おせろ", "定番ボードゲームです。", 3, 2000, "./img/othello.jpg", "othello", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(34, 34, "プリンター", "ぷりんたー", "WiFi機能付インクジェットプリンター", 2, 15000, "./img/printer.jpg", "printer", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(35, 35, "ラジカセ", "らじかせ", "AM/FM、CD、カセット再生機能付き。肩に担ぎたくなる見た目です。", 2, 18000, "./img/radikase.jpg", "radikase", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(36, 36, "ラジオ", "らじお", "AM/FM対応のシンプルなラジオです。", 2, 2500, "./img/radio.jpg", "radio", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(37, 37, "レコードプレーヤー", "れこーどぷれーやー", "かなり古い見た目のスピーカー付レコードプレーヤー", 2, 50000, "./img/recordplayer.jpg", "recordplayer", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(38, 38, "ルーター", "るーたー", "高機能高速通信対応ルーター", 2, 7000, "./img/rooter.jpg", "rooter", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(39, 39, "ルービックキューブ", "るーびっくきゅーぶ", "定番アイテム。結構難しい。", 3, 1500, "./img/rubiccube.jpg", "rubiccube", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(40, 40, "シェーバー", "しぇーばー", "防水対応、３枚刃で深剃りできます。", 2, 9000, "./img/shaver.jpg", "shaver", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(41, 41, "スピーカー", "すぴーかー", "アンプ内蔵スピーカー", 2, 13000, "./img/speaker.jpg", "speaker", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(42, 42, "将棋", "しょうぎ", "定番ボードゲーム。", 3, 5000, "./img/syougi.jpg", "syougi", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(43, 43, "タケコプター", "たけこぷたー", "未来の世界のすごい技術で出来た空飛ぶ帽子です。", 3, 500000, "./img/takecopter.jpg", "takecopter", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(44, 44, "トースター", "とーすたー", "外はカリッ中はフワッと美味しく仕上がります。", 2, 4000, "./img/toaster.jpg", "toaster", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(45, 45, "トランプ", "とらんぷ", "定番カードゲームです。", 3, 800, "./img/trammp.jpg", "trammp", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(46, 46, "ターンテーブル", "たーんてーぶる", "33/45/78回転対応、ストレートアームプレーヤー", 2, 40000, "./img/turntable.jpg", "turntable", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(47, 47, "液晶テレビ", "えきしょうてれび", "40型4K薄型、省電力モデル", 2, 80000, "./img/tv.jpg", "tv", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(48, 48, "ブラウン管テレビ", "ぶらうんかんてれび", "レトロなデザインのブラウン管テレビです。", 2, 25000, "./img/tv2.jpg", "tv2", "2018/01/20", "sagawa", 1, "2018/01/20", "2018/01/20");
insert into product_info values(49, 49, "マゼランペンギン", "まぜらんぺんぎん", "ピングーではありません。必ず家の浴槽ではなく飼う用のプールをご用意の上、毎日掃除をしてプールの水も変えてください。１日二回、体重の一割分の魚を与えてください。", 3, 3000000, "./img/penguin17_magellanic.jpg", "mazerannpennginn", "1900/01/09", "海", 1, "2018/01/09", "2018/01/09");


insert into cart_info values(1, "taro", "taro", 1, 1, 5000, "2018/01/09", "2018/01/09");
insert into cart_info values(2, "taro", "taro2", 2, 2, 500, "2018/01/11", "2018/01/11");

insert into purchase_history_info values(1, "taro", 1, 1, 50000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(2, "taro", 2, 1, 100000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(3, "taro", 3, 1, 500, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(4, "taro", 4, 1, 50000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(5, "taro", 5, 1, 30000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(6, "jiro", 1, 1, 50000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(8, "jiro", 2, 1, 100000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(9, "jiro", 3, 1, 500, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(10, "jiro", 4, 1, 50000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(11, "saburo", 1, 1, 50000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(12, "saburo", 2, 1, 100000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(13, "saburo", 3, 1, 500, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(14, "shiro", 1, 1, 50000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(15, "shiro", 2, 1, 100000, "2018/01/09", "2018/01/09");
insert into purchase_history_info values(16, "ichiro", 1, 1, 50000, "2018/01/09", "2018/01/09");

insert into destination_info values(1, "taro", "山田", "太郎", "やまだ", "たろう", "taro@aaa.com", "00011112222", "東京都渋谷区渋谷1-1-1",1, "2018/01/09", "2018/01/09") ;
insert into destination_info values(2, "taro", "山田", "太郎", "やまだ", "たろう", "taro@aaa.com", "00011112222", "東京都千代田区丸の内1-1-1",0, "2018/01/09", "2018/01/09") ;

insert into review_info values(1, "taro", 1, 5, "使いやすいです", "2018/01/23");
insert into review_info values(2, "taro", 2, 4, "値段の割にはいいです", "2018/01/23");
insert into review_info values(3, "taro", 3, 3, "すぐに壊れました", "2018/01/23");
insert into review_info values(4, "taro", 4, 2, "カメラかと思ったら模型でした", "2018/01/23");
