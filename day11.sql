create table tblorders(OrderID varchar,CustomerID varchar,EmployeeID varchar,OrderDate date,ShippedDate date);
create table tblcustomers(CustomerID varchar,city varchar);
create table tblshippers(ShipperID varchar,company varchar);
create table tblorderdetails(OrderID varchar,ProductID varchar);
create table tblproducts(ProductID varchar,ProductName varchar);

alter table tblcustomers add primary key (CustomerID);
alter table tblproducts add primary key(ProductID);
alter table tblorders add primary key(OrderId);
alter table tblshippers add primary key(ShipperID);

alter table tblorders add constraint ckdate check(ShippedDate>OrderDate);
alter table tblshippers add constraint uqcompany unique(company);
alter table tblorderdetails add column quantity int;
alter table tblorderdetails add constraint ckqt check(quantity>10);

alter table tblorders add constraint fk1 foreign key(CustomerID)references tblcustomers(CustomerID);
alter table tblorderdetails add constraint fk2 foreign key(OrderID)references tblorders(OrderID);
alter table tblorderdetails add constraint fk3 foreign key(ProductID)references tblproducts(ProductID);

alter table tblcustomers add column country varchar;
alter table tblcustomers alter column country set default 'CANADA'

insert into tblcustomers values('c1','otawa','canada');
insert into tblcustomers values('c2','hummsberg','canada');
select * from tblcustomers;
insert into tblorders values ('o1','c1','e1','2010-10-21','2010-10-23');
insert into tblorders values('o2','c2','e2','2010-10-11','2010-09-22');

insert into tblproducts values('p1','mac');
insert into tblproducts values('p2','laptop');
select *from tblproducts;

insert into tblshippers values('s1','mahindra');
insert into tblshippers values ('s2','tata');
insert into tblshippers values('s3','mahindra');

insert into tblorderdetails values('o1','p1',23);
insert into tblorderdetails values('o2','p2',2);








