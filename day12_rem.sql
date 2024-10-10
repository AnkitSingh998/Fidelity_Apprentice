create table pizza(pizza_id varchar(10),cust_id varchar(10),partner_id varchar(10),pizza_name varchar(15),pizza_type varchar(15),order_date date,amount BIGINT);
create table customer(customer_id varchar(10),cust_name varchar(20),cust_phone BIGINT,cust_address varchar(20));
create table delivery_partner(partner_id varchar(10),partner_name varchar(15),rating BIGINT);

alter table pizza add primary key(pizza_id);
alter table customer add primary key(customer_id);
alter table delivery_partner add primary key(partner_id);
alter table pizza add constraint f1 foreign key (cust_id)references customer(customer_id);
alter table pizza add constraint f2 foreign key (partner_id)references delivery_partner(partner_id);

insert into customer values('c1','atul',932083049,'a1');
insert into customer values('c2','aryan',3903034,'a2');
insert into customer values('c3','kiara',930493240,'a3');
insert into customer values('c4','kunal',99304030,'a4');
insert into customer values('c5','reshma',94389493,'a5');

insert into delivery_partner values('p1','anij',4);
insert into delivery_partner values('p2','santosh',3);
insert into delivery_partner values('p3','aryan',2);
insert into delivery_partner values('p4','firoz',5);
insert into delivery_partner values('p5','james',1);

insert into pizza values('p1','c1','p3','periperi','extra large','2022-10-23',1000);
insert into pizza values('pi2','c3','p2','panner','large','2022-11-23',500);
insert into pizza values('pi3','c1','p4','chicken','extra large','2022-12-25',1000);
insert into pizza values('pi4','c4','p1','mushroom','medium','2022-12-23',250);
insert into pizza values('p15','c2','p3','salad','extra large','2022-10-3',1000);

select * from pizza;

--question 10--
update pizza set amount=amount*.97 where pizza_type='extra large';
select * from pizza;

--- question 11 ----
create table salesman(salesman_id numeric(5),name varchar(30),city varchar(15),commission decimal(5,2));
create table orderss(ord_no numeric(5),purch_amt decimal(8,2),order_date date,customer_id numeric(5),salesman_id numeric(5));
alter table salesman add primary key(salesman_id);
alter table orderss add primary key(ord_no);
alter table orderss add constraint f1 foreign key (salesman_id)references salesman(salesman_id);

insert into salesman values(112,'raghu','mumbai',100.00);
insert into salesman values(113,'shalini','patna',230.00);
insert into salesman values(114,'arya','delhi',45.00);

insert into orderss values(230,10000.00,'2020-11-29',20,112);
insert into orderss values(232,20000.00,'2020-10-2',21,113);
insert into orderss values(234,1000.00,'2020-02-9',29,112);

select *from orderss;
select *from salesman;



--question 12---

create table supplier(supplier_id numeric(5),supplier_name varchar(150),address varchar(150),city varchar(150),state varchar(15),country varchar(15),contact varchar(10));
alter table supplier add primary key(supplier_id);
alter table supplier add constraint chk_contact_lgth check (length(contact)=10);

insert into supplier values(23,'rakesh','a1','patna','bihar','india','9876543210');
select * from supplier;







