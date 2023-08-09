package qlnhanvien;

import java.util.Date;

/**
 * NhanVienCC.
 *
 * @author hasu
 */
public abstract class NhanVienCC extends NhanVien {

    private String truongDT;
    private String chuyenMon;

    public NhanVienCC() {
    }

    public NhanVienCC(String truongDT, String chuyenMon, String maNV, String tenNV, Date namSinh, String trinhDo, float luongCB) {
        super(maNV, tenNV, namSinh, trinhDo, luongCB);
        this.setTruongDT(truongDT);
        this.setChuyenMon(chuyenMon);
    }

    public String getTruongDT() {
        return truongDT;
    }

    public final void setTruongDT(String truongDT) {
        if (truongDT != null && !truongDT.isBlank()) {
            this.truongDT = truongDT;
        }
    }

    public String getChuyenMon() {
        return chuyenMon;
    }

    public final void setChuyenMon(String chuyenMon) {
        if (chuyenMon != null && !chuyenMon.isBlank()) {
            this.chuyenMon = chuyenMon;
        }
    }

    @Override
    public void input() {
        super.input();
        setTruongDT(Util.inputString("Nhap truong dao tao"));
        setChuyenMon(Util.inputString("Nhap chuyen mon"));
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(super.toString());
        sb.append(", truongDT=").append(truongDT);
        sb.append(", chuyenMon=").append(chuyenMon);
        return sb.toString();
    }
    
}
