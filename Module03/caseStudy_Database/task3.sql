use casestudy;
-- yeu cau 5
-- Hiển thị IDKhachHang, HoTen, TenLoaiKhach, IDHopDong,TenDichVu, NgayLamHopDong, NgayKetThuc, 
-- TongTien (VớiTongTien được tính theo công thức như sau: ChiPhiThue +
-- SoLuong*Gia, với SoLuong và Giá là từ bảng DichVuDiKem) cho tất cả
-- các Khách hàng đã từng đặt phỏng. (Những Khách hàng nào chưa từng
-- đặt phòng cũng phải hiển thị ra).

SELECT khachHang.IDKhachHang, khachHang.HoTen, loaiKhach.TenLoaiKhach, hopDong.IDHopDong,
dichVu.TenDichVu, hopDong.NgayLamHopDong, hopDong.NgayKetThuc, dichVu.chiphithue + (hopDongChiTiet.soLuong * dichvudikem.gia) as tongTien 
from khachHang
left join hopdong on khachHang.idKhachHang = hopdong.idKhachHang
left join loaiKhach on khachHang.idLoaiKhach = loaiKhach.idLoaiKhach
left join dichVu on dichvu.iddichvu = hopdong.iddichvu
left join hopDongChiTiet on hopdong.idhopdong = hopDongChiTiet.idHopDong
left join dichVuDiKem on hopDongChiTiet.idDichVuDiKem = dichVuDiKem.idDichVuDiKem;

-- yeu cau 6: Hiển thị IDDichVu, TenDichVu, DienTich, ChiPhiThue,
-- TenLoaiDichVu của tất cả các loại Dịch vụ chưa từng được Khách hàng
-- thực hiện đặt từ quý 1 của năm 2019 (Quý 1 là tháng 1, 2, 3).
SELECT dichVu.IDDichVu, dichVu.TenDichVu, dichVu.DienTich, dichVu.ChiPhiThue, loaidichvu.idLoaiDichVu
from dichVu
left join loaidichvu on dichvu.idLoaiDichVu = loaiDichVu.idLoaiDichVu
where 
	not dichvu.idDichVu in(
		select hopDong.idDichVu
        from hopdong
	);

-- 7....Hiển thị thông tin IDDichVu, TenDichVu, DienTich, SoNguoiToiDa,
-- ChiPhiThue, TenLoaiDichVu của tất cả các loại dịch vụ đã từng được
-- Khách hàng đặt phòng trong năm 2018 nhưng chưa từng được Khách
-- hàng đặt phòng trong năm 2019.hopdong
select DichVu.IDDichVu, DichVu.TenDichVu, DichVu.DienTich, Dichvu.SoNguoiToiDa, DichVu.ChiPhiThue, LoaiDichVu.TenLoaiDichVu
from DichVu inner join (select * from HopDong where year(NgayLamHopDong) = 2018) as HopDong2018 on DichVu.IDDichVu = HopDong2018.IDDichVu
left join (select * from HopDong where year(NgayLamHopDong) = 2019) as HopDong2019 on DichVu.IDDichVu = HopDong2019.IDDichVu
left join LoaiDichVu on LoaiDichVu.IDLoaiDichVu = DichVu.IDLoaiDichVu
where HopDong2019.IDDichVu is null
group by DichVu.IDDichVu;

-- yeu cau 8
select distinct HoTen from KhachHang;
select HoTen from KhachHang group by HoTen;
