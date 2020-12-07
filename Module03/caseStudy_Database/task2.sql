use casestudy;

-- yeu vau 2
select hoten,substring_index(hoten," ", -1 ) as tennv
from nhanvien 
having (tennv like 'H%' or tennv like 'T%' or tennv like 'K%') and length(tennv)<15;

-- yeu cau 3
SELECT *, (year(curdate()) - year(ngaysinh)) - (right(curdate(), 5) < right(ngaysinh, 5)) as tuoiKH
FROM khachhang
having tuoikh between 18 and 50 and (diachi = 'da nang' or diachi= 'quang tri');

-- yeu cau 4
select khachhang.*, count(hopdong.idkhachhang) from ((khachhang 
inner join hopdong on khachhang.idkhachhang = hopdong.idkhachhang)
inner join loaikhach on loaikhach.idloaikhach = khachhang.idloaikhach)
where khachhang.idloaikhach = 1
group by idkhachhang;

