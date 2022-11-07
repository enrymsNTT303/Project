use quanlicuahang;
show tables;
drop table managerUser;
create table managerUser(
  m_ID int not null auto_increment,
  m_accountN varchar(20) NOT NULL,
  m_accountP varchar(20) NOT NULL,
  m_firstName varchar(50) NOT NULL,
  m_lastName varchar(50) NOT NULL,
  m_addr varchar(50) NOT NULL,
  m_phoneNum varchar(10) NOT NULL,
  primary key ( m_ID, m_accountN)
);
insert into managerUser values(
		'1', 'admin', 'admin', 
		'admin', 'admin', 'non',
        '0123456789');
select *from managerUser;
Select m_firstName, m_lastName FROM managerUser WHERE m_accountN = 'admin';
create table staffUser(
  staffID int not null auto_increment,
  s_accountN varchar(20) NOT NULL,
  s_accountP varchar(20) NOT NULL,
  s_firstName varchar(50) NOT NULL,
  s_lastName varchar(50) NOT NULL,
  s_bdate	date,
  s_addr varchar(50) NOT NULL,
  s_phoneNum varchar(10) NOT NULL,
  primary key ( s_ID, s_accountN)
);
insert into staffUser values(
		'1', 'user1', 'user1', 
		'userP1', 'userL1', 'none',
        '0123456789');
-- select *from staffUser;
select s_firstname , s_lastname from staffUser where s_accountN='user1' and s_accountP='user1';
drop table products;
create table products (
	productID varchar (15) NOT NULL,
	productName varchar(50) NOT NULL,
	price long NOT NULL,
	inStorage long NOT NULL,
    importTime varchar(100) not null,
    primary key (productID)
);
insert into products values('1','test','1000');
select *from products;
drop table warehouse;
create table warehouse(
	productID_W varchar(15) not null,
    quantity  int		not null,
    primary key (productID_W)
);
insert into P_storage values ('1','15');

create table invoice(
	invoiceID	varchar(10) not null,
    i_cusID 	varchar(10) not null,
    i_empID		varchar(10) not null,
    i_total 	int not null,
    primary key(invoiceID),
    FOREIGN KEY (i_productID) REFERENCES products_in4(productID)
);
drop table invoice;
CREATE TABLE PhieuNhap(
	MaPhieuNhap varchar(10) NOT NULL,
	MaNhanVien varchar(5) NOT NULL,
	TongTien int NOT NULL,
	NgayNhap date NOT NULL
);
delimiter $$
create procedure insertProduct (in P_productID varchar(15), in P_productName varchar(50), in P_price int, in P_inStorage int, in P_importTime varchar(100)) 
Begin 
	insert into products (productID, productName, price, inStorage, importTime ) values (P_productID, P_productName, P_price, P_inStorage, P_importTime);
END $$
drop procedure insertProduct ;