-- One 2 One Unidirectional

--drop table if exists shopping_cart_o2ou;
--drop table if exists item_o2ou;

--select * from shopping_cart_o2ou;
--select * from item_o2ou;


-- One 2 One Bidirectional
--select * from shopping_cart_o2ob;
--select * from item_o2ob;

-- One 2 Many Unidirectional, three tables will be created

--drop table if exists shopping_cart_o2mu_items cascade;
--drop table if exists shopping_cart_o2mu cascade;
--drop table if exists item_o2mu cascade;

select * from shopping_cart_o2mu_items;
select * from shopping_cart_o2mu;
select * from item_o2mu;

-- One 2 Many Bidirectional
select * from shopping_cart_o2mb;
select * from item_o2mb;

-- Many 2 Many Unidirectional

select * from shopping_cart_item_m2mu;
select * from shopping_cart_o2mb;
select * from item_o2mb;

-- Many 2 Many Bidirectional
select * from shopping_cart_item_m2mb;
select * from shoppingcart_m2mb;
select * from item_m2mb;

