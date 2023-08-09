package qlnhanvien;

import java.util.Date;

/**
 * NhanVienNghienCuu.
 *
 * @author hasu
 */
public class NhanVienNghienCuu extends NhanVienCC {

    private float phuCapDocHai;

    public NhanVienNghienCuu() {
    }

    public NhanVienNghienCuu(String maNV, String tenNV, Date namSinh, String trinhDo, float luongCB, String truongDT, String chuyenMon, float phuCapDocHai) {
        super(truongDT, chuyenMon, maNV, tenNV, namSinh, trinhDo, luongCB);
        this.setPhuCapDocHai(phuCapDocHai);
    }

    public float getPhuCapDocHai() {
        return phuCapDocHai;
    }

    public final void setPhuCapDocHai(float phuCapDocHai) {
        if (phuCapDocHai >= 0) {
            this.phuCapDocHai = phuCapDocHai;
        }
    }

    @Override
    public float tinhLuong() {
        return getLuongCB() + this.phuCapDocHai;
    }

        @Override
    public void input() {
        System.out.println("Input thong tin nhan vien nghien cuu:");
        super.input();
        setPhuCapDocHai(Util.inputFloat("Nhap phu cap doc hai"));
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NhanVienNghienCuu{");
        sb.append(super.toString());
        sb.append(", phuCapDocHai=").append(String.format("%.1f", phuCapDocHai));
        sb.append(", Luong=" + String.format("%.1f", tinhLuong()));
        sb.append('}');
        return sb.toString();
    }
}
