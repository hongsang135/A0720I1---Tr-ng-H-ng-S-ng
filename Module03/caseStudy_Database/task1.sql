create database casestudy;

use casestudy;

create table vitri(
	idvitri int primary key auto_increment,
    tenvitri varchar(45) not null
);

create table trinhdo(
	idtrinhdo int primary key auto_increment,
    trinhdo varchar(45) not null
);

create table bophan(
	idbophan int primary key auto_increment,
    tenbophan varchar(45) not null
);

create table loaikhach(
	idloaikhach int primary key auto_increment,
    tenloaikhach varchar(45) not null
);

create table kieuthue(
	idkieuthue int primary key auto_increment,
    tenkieuthue varchar(45) not null,
    gia int not null
);

create table loaidichvu(
	idloaidichvu int primary key auto_increment,
    tenloaidichvu varchar(45) not null
);

create table dichvudikem(
	iddichvudikem int primary key auto_increment,
    tendichvudikem varchar(45) not null,
    gia int not null,
    donvi int not null,
    trangthaikhadung varchar(45)
);

create table nhanvien(
	idnhanvien int primary key auto_increment,
    hoten varchar(45) not null,
    idvitri int not null,
    idtrinhdo int not null,
    idbophan int not null,
    ngaysinh date not null,
    socmtnd varchar(45) not null unique,
    luong varchar(45) not null,
    sdt varchar(45) not null,
    email varchar(45) not null,
    diachi varchar(45) not null,
    foreign key (idvitri) references vitri(idvitri),
    foreign key (idtrinhdo) references trinhdo(idtrinhdo),
    foreign key (idbophan) references bophan(idbophan)
);

create table khachhang(
	idkhachhang int primary key auto_increment,
    idloaikhach int not null,
    hoten varchar(45) not null,
    ngaysinh date not null,
    socmtnd varchar(45) not null unique,
    sdt varchar(45) not null,
    email varchar(45) not null,
    diachi varchar(45) not null,
    foreign key (idloaikhach) references loaikhach(idloaikhach)
);

create table dichvu(
	iddichvu int primary key auto_increment,
    tendichvu varchar(45) not null,
    dientich int not null,
    sotang int not null,
    songuoitoida int not null,
    chiphithue int not null,
    idkieuthue int not null,
    idloaidichvu int not null,
    trangthai varchar(45) not null,
    foreign key (idkieuthue) references kieuthue(idkieuthue),
    foreign key (idloaidichvu) references loaidichvu(idloaidichvu)
);

create table hopdong(
	idhopdong int primary key auto_increment,
    idnhanvien int not null,
    idkhachhang int not null,
    iddichvu int not null,
    ngaylamhopdong date not null,
    ngayketthuc date not null,
    tiendatcoc int not null,
    tongtien int not null,
    foreign key (idkhachhang) references khachhang(idkhachhang),
    foreign key (iddichvu) references dichvu(iddichvu),
    foreign key (idnhanvien) references nhanvien(idnhanvien)
);

create table hopdongchitiet(
	idhopdongchitiet int primary key auto_increment,
    idhopdong int not null,
    iddichvudikem int not null,
    soluong int not null,
    foreign key (idhopdong) references hopdong(idhopdong),
    foreign key (iddichvudikem) references dichvudikem(iddichvudikem)
);

insert into vitri(tenvitri) values ('phuc vu');

insert into trinhdo(trinhdo) values ('dai hoc');

insert into bophan(tenbophan) values ('hanh chinh');

insert into loaikhach(tenloaikhach) values ('diamond');

insert into kieuthue(tenkieuthue, gia) values ('theo ngay', 1000000);

insert into loaidichvu(tenloaidichvu) values ('villa');

insert into dichvudikem(tendichvudikem, gia, donvi, trangthaikhadung) values ('massage', 500000, 5, 'su dung duoc');

insert into nhanvien(hoten, idvitri, idtrinhdo, idbophan, ngaysinh, socmtnd, luong, sdt, email, diachi) 
values ('sang', 1,1,1, 11/12/1886, 184526356, '5 trieu', 039652145, 'hongsang@gmail.com' , 'da nang');

insert into khachhang(idloaikhach, hoten, ngaysinh, socmtnd, sdt, email, diachi) 
values (1, 'nam', 11/12/1886, 184526356, 039652145, 'hongsang@gmail.com' , 'da nang');

insert into dichvu(tendichvu, dientich, sotang, songuoitoida, chiphithue, idkieuthue, idloaidichvu, trangthai)
values ('villa', 500, 3, 5, 5000000, 1,1,'con phong');

insert into hopdong(idnhanvien, idkhachhang, iddichvu, ngaylamhopdong, ngayketthuc, tiendatcoc, tongtien)
values (1,1,1,05/12/2020,15/12/2020,500000,10000000);

insert into hopdongchitiet(idhopdong, iddichvudikem, soluong) values (1,1,1);