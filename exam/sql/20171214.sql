start transaction;
insert into user_info(uiname, uiage, uiid, uipwd, cino)
values('청길동',30,'blue3','blue',1);
update user_info
set uiname='황길동'
where uiid='blue3';
select * from user_info;
rollback;
create view v_user_info
as
(select ui.uiid, ui.uipwd,ci.ciname,ci.cidesc
from user_info ui, class_info ci
where ui.cino = ci.cino);



select * from (select ui.uiid, ui.uipwd,ci.ciname,ci.cidesc
from user_info ui, class_info ci
where ui.cino = ci.cino) a;
delimiter $$
create procedure p_insert_class_info(
in p_ciname varchar(100),p_cidesc varchar(500))
begin
	start transaction;
	insert into class_info(ciname,cidesc)
	values(p_ciname,p_cidesc);
	commit;
	select * from class_info;
end
$$
delimiter ;


call p_insert_class_info('컴활반','컴퓨터활용능력반');