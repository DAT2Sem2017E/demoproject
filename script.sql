use test;
create table log_in(
id int(5) primary key auto_increment,
name varchar(30),
password varchar(40)
);
insert into log_in (name, password) 
values ('hans', 'grethe123'), ('pippi', 'langstr�mpe123'), ('anders', 'riprapogrup'), ('freddy', 'fr�k123'), ('snehvide', 'syvsm�dv�rge'), ('r�dh�tte', 'bedstemor123'), ('peter', 'wendy123'), ('kaptajnklo', 'klokkeblomst'); 