create table worker(worker_id numeric,first_name varchar,last_name varchar,salary bigint,joining_date date,department varchar);
create table bonus(worker_ref_id numeric,bonus_amount bigint,bonus_date date);
create table title(worker_ref_id numeric,worker_title varchar,affected_from date);

alter table worker add primary key (worker_id);
alter table title add constraint ff1 foreign key(worker_ref_id)references worker(worker_id);
alter table bonus add constraint ff2 foreign key(worker_ref_id)references worker(worker_id);

insert into worker values(1,'Ankit','Singh',45000,'2024-08-16','developer');
insert into worker values(2,'Adiya','Pratap',30000,'2024-04-12','tester');
insert into worker values(3,'Ashmit','Singh',45000,'2024-08-11','developer');
insert into worker values(4,'Shalini','Gowda',50000,'2024-08-2','lead');
insert into worker values(5,'Kiara','Advani',90000,'2024-08-1','head');
insert into worker values(6,'Rakesh','Singh',30000,'2024-08-3','developer');
insert into worker values(7,'Nikhil','Yadav',45000,'2024-08-4','tester');
insert into worker values(8,'Pushkar','Anand',50000,'2024-08-9','tester');

select * from worker;

insert into bonus values(1,5000,'2024-10-23');
insert into bonus values(4,1000,'2024-10-24');
insert into bonus values(2,1000,'2024-10-22');
insert into bonus values(2,1000,'2024-10-21');

select *from bonus;

insert into title values(1,'developer','2024-09-16');
insert into title values(2,'tester','2024-09-16');
insert into title values(3,'tester','2024-09-16');
insert into title values(4,'manager','2024-09-16');
insert into title values(5,'executive','2024-09-16');
insert into title values(6,'lead','2024-09-16');
insert into title values(7,'tester','2024-09-16');
insert into title values(8,'developer','2024-09-16');

select *from title;

---question 1--
select w.first_name ,w.salary,t.worker_title from worker w join title t on w.worker_id=t.worker_ref_id;

---question 2--
create or replace function get_nth_highest(nth_highest integer)
returns integer as $$
declare 
nth_highest_salary int;
offset_val int;
begin

select distinct salary 
into nth_highest_salary
from (
select distinct salary
from worker
order by salary desc limit 1 offset 3
) as subquery;
return (select count (*) from worker where salary=nth_highest_salary);
end;
$$ language plpgsql;

select get_nth_highest(3);




