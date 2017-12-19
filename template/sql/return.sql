use ecsite1;

update item_info_transaction set item_price=100,item_stock=50,insert_date=CURRENT_TIMESTAMP,update_date=null where id=1;
update item_info_transaction set item_price=100,item_stock=50,insert_date=CURRENT_TIMESTAMP,update_date=null where id=2;