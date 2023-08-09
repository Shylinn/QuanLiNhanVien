package qlnhanvien;

import java.util.Date;

/**
 * NhanVienPhucVu.
 *
 * @author hasu
 */
public class NhanVienPhucVu extends NhanVien {

    public NhanVienPhucVu() {
    }

    public NhanVienPhucVu(String maNV, String tenNV, Date namSinh, String trinhDo, float luongCB) {
        super(maNV, tenNV, namSinh, trinhDo, luongCB);
    }

    @Override
    public float tinhLuong() {
        return getLuongCB();
    }

    @Override
    public void input() {
        System.out.println("Input thong tin nhan vien phuc vu:");
        super.input();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NhanVienPhucVu{");
        sb.append(super.toString());
        sb.append(", Luong=" + String.format("%.1f", tinhLuong()));
        sb.append('}');
        return sb.toString();
    }

}
