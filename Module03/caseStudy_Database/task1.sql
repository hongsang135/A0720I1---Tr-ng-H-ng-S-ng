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
-- nhap vi tri  -- Lễ tân, phục vụ, chuyên viên, giám sát, quản lý, giá đốc.

ALTER TABLE `casestudy`.`vitri` 
ADD UNIQUE INDEX `tenvitri_UNIQUE` (`tenvitri` ASC) VISIBLE;
;

insert into vitri(tenvitri) values ('phuc vu');
insert into vitri(tenvitri) values ('le tan');
insert into vitri(tenvitri) values ('chuyen vien');
insert into vitri(tenvitri) values ('giam sat');
insert into vitri(tenvitri) values ('quan ly');
insert into vitri(tenvitri) values ('giam doc');

insert into trinhdo(trinhdo) values ('dai hoc');
insert into trinhdo(trinhdo) values ('trung cap');
insert into trinhdo(trinhdo) values ('cao dang');
insert into trinhdo(trinhdo) values ('sau dai hoc');

-- Sale – Marketing, Hành Chính, Phục vụ, Quản lý.
insert into bophan(tenbophan) values ('hanh chinh');
insert into bophan(tenbophan) values ('phuc vu');
insert into bophan(tenbophan) values ('quan ly');
insert into bophan(tenbophan) values ('sale - marketing');

-- (Diamond, Platinium, Gold, Silver, Member).
insert into loaikhach(tenloaikhach) values ('diamond');
insert into loaikhach(tenloaikhach) values ('platinium');
insert into loaikhach(tenloaikhach) values ('gold');
insert into loaikhach(tenloaikhach) values ('silver');
insert into loaikhach(tenloaikhach) values ('member');

insert into kieuthue(tenkieuthue, gia) values ('theo ngay', 1000000);
insert into kieuthue(tenkieuthue, gia) values ('theo gio', 100000);
insert into kieuthue(tenkieuthue, gia) values ('theo nam', 15000000);
insert into kieuthue(tenkieuthue, gia) values ('theo thang', 10000000);

insert into loaidichvu(tenloaidichvu) values ('villa');
insert into loaidichvu(tenloaidichvu) values ('house');
insert into loaidichvu(tenloaidichvu) values ('room');

-- massage, karaoke, thức ăn, nước uống, thuê xe di chuyển tham quan resort.
insert into dichvudikem(tendichvudikem, gia, donvi, trangthaikhadung) values ('massage', 500000, 5, 'su dung duoc');
insert into dichvudikem(tendichvudikem, gia, donvi, trangthaikhadung) values ('karaoke', 500000, 5, 'su dung duoc');
insert into dichvudikem(tendichvudikem, gia, donvi, trangthaikhadung) values ('thuc an', 500000, 5, 'su dung duoc');
insert into dichvudikem(tendichvudikem, gia, donvi, trangthaikhadung) values ('nuoc uong', 500000, 5, 'su dung duoc');
insert into dichvudikem(tendichvudikem, gia, donvi, trangthaikhadung) values ('thue xe', 500000, 5, 'su dung duoc');

insert into nhanvien(hoten, idvitri, idtrinhdo, idbophan, ngaysinh, socmtnd, luong, sdt, email, diachi) 
values ('sang', 1,1,1, 11/12/1886, 184526356, '5 trieu', 039652145, 'hongsang@gmail.com' , 'da nang');
insert into nhanvien(hoten, idvitri, idtrinhdo, idbophan, ngaysinh, socmtnd, luong, sdt, email, diachi) 
values ('to thanh nam', 2,2,2, 15/05/1886, 184526359, '5 trieu', 039652145, 'nam@gmail.com' , 'da nang');
insert into nhanvien(hoten, idvitri, idtrinhdo, idbophan, ngaysinh, socmtnd, luong, sdt, email, diachi) 
values ('thanh dat', 1,2,1, 11/12/1886, 184525356, '5 trieu', 039652145, 'hongsang@gmail.com' , 'da nang');
insert into nhanvien(hoten, idvitri, idtrinhdo, idbophan, ngaysinh, socmtnd, luong, sdt, email, diachi) 
values ('viet vu', 3,3,3, 9/12/1886, 184546356, '5 trieu', 039652145, 'hongsang@gmail.com' , 'da nang');
insert into nhanvien(hoten, idvitri, idtrinhdo, idbophan, ngaysinh, socmtnd, luong, sdt, email, diachi) 
values ('ngoc the', 1,2,3, 11/12/1886, 184526146, '5 trieu', 039652145, 'hongsang@gmail.com' , 'da nang');

insert into khachhang(idloaikhach, hoten, ngaysinh, socmtnd, sdt, email, diachi) 
values (1, 'nam', 11/12/1886, 184526356, 039652145, 'hongsang@gmail.com' , 'da nang');
insert into khachhang(idloaikhach, hoten, ngaysinh, socmtnd, sdt, email, diachi) 
values (2, 'sang', 10/10/1992, 184526357, 039652145, 'hongsang@gmail.com' , 'hue');
insert into khachhang(idloaikhach, hoten, ngaysinh, socmtnd, sdt, email, diachi) 
values (1, 'dat', 11/12/1998, 184526358, 039652145, 'hongsang@gmail.com' , 'quang binh');
insert into khachhang(idloaikhach, hoten, ngaysinh, socmtnd, sdt, email, diachi) 
values (2, 'vu', 11/12/2000, 184526396, 039652145, 'hongsang@gmail.com' , 'da nang');
insert into khachhang(idloaikhach, hoten, ngaysinh, socmtnd, sdt, email, diachi) 
values (3, 'the', 11/12/2005, 184526656, 039652145, 'hongsang@gmail.com' , 'quang tri');
insert into khachhang(idloaikhach, hoten, ngaysinh, socmtnd, sdt, email, diachi) 
values (1, 'hong', 11/12/1960, 174526356, 039652145, 'hongsang@gmail.com' , 'da nang');

insert into dichvu(tendichvu, dientich, sotang, songuoitoida, chiphithue, idkieuthue, idloaidichvu, trangthai)
values ('villa', 500, 3, 5, 5000000, 1,1,'con phong');

insert into hopdong(idnhanvien, idkhachhang, iddichvu, ngaylamhopdong, ngayketthuc, tiendatcoc, tongtien)
values (1,1,1,05/12/2020,15/12/2020,500000,10000000);
insert into hopdong(idnhanvien, idkhachhang, iddichvu, ngaylamhopdong, ngayketthuc, tiendatcoc, tongtien)
values (2,2,2,05/12/2020,15/12/2020,500000,10000000);
insert into hopdong(idnhanvien, idkhachhang, iddichvu, ngaylamhopdong, ngayketthuc, tiendatcoc, tongtien)
values (1,2,2,05/12/2020,15/12/2020,500000,10000000);
insert into hopdong(idnhanvien, idkhachhang, iddichvu, ngaylamhopdong, ngayketthuc, tiendatcoc, tongtien)
values (1,3,3,05/12/2020,15/12/2020,500000,10000000);
insert into hopdong(idnhanvien, idkhachhang, iddichvu, ngaylamhopdong, ngayketthuc, tiendatcoc, tongtien)
values (1,3,3,05/12/2020,15/12/2020,500000,10000000);

insert into hopdongchitiet(idhopdong, iddichvudikem, soluong) values (1,1,1);