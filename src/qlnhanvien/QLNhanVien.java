package qlnhanvien;

import java.util.Date;

/**
 * QLNhanVien.
 *
 * @author hasu
 */
public class QLNhanVien {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        QLNhanVien qlnv = new QLNhanVien();
        System.out.println("test 1");
        qlnv.test();
        System.out.println("test 2");
        qlnv.test2();
        System.out.println("test 3");
        qlnv.test3();
    }

    private void test() {
        NhanVien nv = new NhanVienPhucVu();
        nv.setMaNV("PV001");
        nv.setTenNV("Phuc vu 001");
        nv.setNamSinh(new Date("2000/02/03"));
        nv.setTrinhDo("DH");
        nv.setLuongCB(10000000F);
        nv.output();

        // Nhan vien quan ly
        nv = new NhanVienQuanLy();
        nv.setMaNV("QL001");
        nv.setTenNV("Quan ly 001");
        nv.setNamSinh(new Date("2002/2/23"));
        nv.setTrinhDo("DH");
        nv.setLuongCB(30000000F);
        ((NhanVienQuanLy) nv).setPhuCapChucVu(1000000F);
        nv.output();

        // Nhan vien nghien cuu
        nv = new NhanVienNghienCuu();
        nv.setMaNV("NC001");
        nv.setTenNV("Nghien cuu 001");
        nv.setNamSinh(new Date("1992/12/23"));
        nv.setTrinhDo("DH");
        nv.setLuongCB(33000000F);
        ((NhanVienNghienCuu) nv).setPhuCapDocHai(900000F);
        nv.output();
    }

    private void test2() {
        NhanVien nv = new NhanVienPhucVu("PV002",
                "Phuc vu 002",
                new Date("1992/12/23"),
                "DH",
                12000000F);
        nv.output();
        
        // nhan vien quan ly
        nv = new NhanVienQuanLy(
                "QL002",
                "Quan ly 002",
                new Date("1990/12/2"),
                "DH",
                32000000F,
                "UIT",
                "CNTT",
                9500000F);
        nv.output();
        
        // nhan vien nghien cuu
        nv = new NhanVienNghienCuu(
                "QL002",
                "Quan ly 002",
                new Date("1991/1/2"),
                "DH",
                33000000F,
                "BK",
                "DT",
                9550000F);
        nv.output();
    }
    
    private void test3() {
        NhanVien nv = new NhanVienPhucVu();
        nv.input();
        nv.output();
        
        // nhan vien quan ly
        nv = new NhanVienQuanLy();
        nv.input();
        nv.output();
        
        // nhan vien nghien cuu
        nv = new NhanVienNghienCuu();
        nv.input();
        nv.output();
    }
}
