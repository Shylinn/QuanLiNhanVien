package qlnhanvien;

import java.util.Date;

/**
 * NhanVienQuanLy.
 *
 * @author hasu
 */
public class NhanVienQuanLy extends NhanVienCC {

    private float phuCapChucVu;

    public NhanVienQuanLy() {
    }

    public NhanVienQuanLy(String maNV, String tenNV, Date namSinh, String trinhDo, float luongCB, String truongDT, String chuyenMon, float phuCapChucVu) {
        super(truongDT, chuyenMon, maNV, tenNV, namSinh, trinhDo, luongCB);
        this.setPhuCapChucVu(phuCapChucVu);
    }

    public float getPhuCapChucVu() {
        return phuCapChucVu;
    }

    public final void setPhuCapChucVu(float phuCapChucVu) {
        if (phuCapChucVu >= 0.0F) {
            this.phuCapChucVu = phuCapChucVu;
        }
    }

    @Override
    public float tinhLuong() {
        return getLuongCB() + this.phuCapChucVu;
    }

     @Override
    public void input() {
        System.out.println("Input thong tin nhan vien quan ly:");
        super.input();
        setPhuCapChucVu(Util.inputFloat("Nhap phu cap chuc vu"));
    }
    
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NhanVienQuanLy{");
        sb.append(super.toString());
        sb.append(", phuCapChucVu=").append(String.format(".1f", phuCapChucVu));
        sb.append(", Luong=" + String.format("%.1f", tinhLuong()));
        sb.append('}');
        return sb.toString();
    }

}
