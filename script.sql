use test;
create table log_in(
id int(5) primary key auto_increment,
name varchar(30),
password varchar(40)
);
insert into log_in (name, password) 
values ('hans', 'grethe123'), ('pippi', 'langstrømpe123'), ('anders', 'riprapogrup'), ('freddy', 'fræk123'), ('snehvide', 'syvsmådværge'), ('rødhætte', 'bedstemor123'), ('peter', 'wendy123'), ('kaptajnklo', 'klokkeblomst'); 