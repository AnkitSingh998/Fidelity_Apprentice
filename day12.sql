create table customers(customer_id varchar(10),customer_name varchar(20),address varchar(20),phone_no bigint,email_id varchar(20));
create table delivery_partners(partner_id varchar(10),partner_name varchar(20),phone_no bigint,rating int);
create table hotel_details(hotel_id varchar(10),hotel_name varchar(20),hotel_type varchar(20),rating int);
create table orders(order_id varchar(10),customer_id varchar(10),hotel_id varchar(10),partner_id varchar(10),order_date date,order_amount int);

alter table customers add primary key(customer_id);
alter table delivery_partners add primary key(partner_id);
alter table hotel_details add primary key(hotel_id);
alter table orders add primary key(order_id);
alter table orders add constraint f1 foreign key (customer_id)references customers(customer_id);
alter table orders add constraint f2 foreign key (partner_id)references delivery_partners(partner_id);
alter table orders add constraint f3 foreign key(hotel_id)references hotel_details(hotel_id);

insert into customers values('c1','Adil','a1',8310090198,'adil@gmail.com');
insert into customers values('c2','Aakib','a2',879000890,'aakib@gmail.com');
insert into customers values('c3','Shweta','a3',8209892002,'shweta@gmail.com');
insert into customers values('c4','Sikha','a4',9082902830,'sikha@gmail.com');
insert into customers values('c5','Animesh','a5',9034904);
insert into customers values('c6','Akhil','a6',9494055);
insert into customers values('c7','Shaily','a7',5859505,'shaily@gmail.com');


select *from customers;

insert into delivery_partners values('p1','astha',9029030303,2);
insert into delivery_partners values('p2','salman',9303840,3);
insert into delivery_partners values('p3','ashsish',8493030,2);
insert into delivery_partners values('p4','aryan',893023,5);
insert into delivery_partners values('p5','sneha',00939304,5);
insert into delivery_partners values('p6','aditya',4840303,4);

insert into hotel_details values('h1','annapurana','veg',4);
insert into hotel_details values('h2','udupi','veg',3);
insert into hotel_details values('h3','bilal','non-veg',2);
insert into hotel_details values('h4','sawik','veg',5);
insert into hotel_details values('h5','usman','non-veg',4);

insert into orders values('o1','c1','h1','p1','2019-05-13',5000);
insert into orders values('o2','c3','h1','p2','2019-04-19',3000);
insert into orders values('o3','c2','h2','p1','2019-02-13',2000);
insert into orders values('o4','c5','h3','p6','2019-01-13',1000);
insert into orders values('o5','c3','h1','p5','2019-07-13',2000);
insert into orders values('o6','c4','h1','p3','2019-06-13',520);
insert into orders values('o7','c7','h3','p2','2019-10-13',509);
insert into orders values('o8','c2','h1','p3','2019-12-13',5089);
insert into orders values('o9','c3','h3','p3','2019-05-22',5089);




--question1---
select partner_id,partner_name,phone_no from delivery_partners where rating>=3 and rating<=5 ORDER BY partner_id;
--question2--
update  customers set phone_no=987654321 where customer_id='c2';
select * from  customers order by customer_id;
--question3--
select customer_id,customer_name,address,phone_no from customers where email_id is not null order by customer_id;
--question4--
alter table customers alter column customer_id type int using customer_id::integer;
--question5--
alter table hotel_details rename column rating to hotel_rating;
select * from hotel_details;
--question6--
select concat(hotel_name,' is a ',hotel_type,' hotel')as hotel_info from hotel_details;
--question7--
select h.hotel_id,h.hotel_name,count(o.order_id) as no_of_orders from hotel_details h join orders o on h.hotel_id=o.hotel_id group by h.hotel_id,h.hotel_name having count(o.order_id)>4 order by h.hotel_id asc;
--question8--
select h.hotel_id,h.hotel_name,h.hotel_type from hotel_details h where h.hotel_id not in (select distinct o.hotel_id from orders o where date_part('month',o.order_date)=5 and date_part('year',o.order_date)=2019)order by h.hotel_id asc;
--question9--
select o.order_id,c.customer_name,h.hotel_name,o.order_amount from orders o join customers c on o.customer_id=c.customer_id join hotel_details h on o.hotel_id=h.hotel_id order by o.order_id asc;












