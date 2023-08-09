package qlnhanvien;

import java.util.Date;

/**
 * NhanVien.
 *
 * @author hasu
 */
public abstract class NhanVien {

    private String maNV;
    private String tenNV;
    private Date namSinh;
    private String trinhDo;
    private float luongCB;

    public NhanVien() {
    }

    public NhanVien(String maNV, String tenNV, Date namSinh, String trinhDo, float luongCB) {
        this.setMaNV(maNV);
        this.setTenNV(tenNV);
        this.setNamSinh(namSinh);
        this.setTrinhDo(trinhDo);
        this.setLuongCB(luongCB);
    }

    public String getMaNV() {
        return maNV;
    }

    public final void setMaNV(String maNV) {
        if (maNV != null && !maNV.isBlank()) {  // isBlank() tuong duong Trim().isEmpty()
            this.maNV = maNV;
        }
    }

    public String getTenNV() {
        return tenNV;
    }

    public final void setTenNV(String tenNV) {
        if (tenNV != null && !tenNV.isBlank()) {
            this.tenNV = tenNV;
        }
    }

    public Date getNamSinh() {
        return namSinh;
    }

    public final void setNamSinh(Date namSinh) {
        if (namSinh != null) {
            this.namSinh = namSinh;
        }
    }

    public String getTrinhDo() {
        return trinhDo;
    }

    public final void setTrinhDo(String trinhDo) {
        if (trinhDo != null && !trinhDo.isBlank()) {
            this.trinhDo = trinhDo;
        }
    }

    public float getLuongCB() {
        return luongCB;
    }

    public final void setLuongCB(float luongCB) {
        if (luongCB >= 0) {
            this.luongCB = luongCB;
        }
    }

    public void input() {
        setMaNV(Util.inputString("Nhap ma nhan vien"));
        setTenNV(Util.inputString("Nhap ma ten nhan vien"));
        setNamSinh(Util.inputDate("Nhap nam sinh"));
        setTrinhDo(Util.inputString("Nhap trinh do"));
        setLuongCB(Util.inputFloat("Nhap luong co ban"));
    }
    
    public void output() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("maNV=").append(maNV);
        sb.append(", tenNV=").append(tenNV);
        sb.append(", namSinh=").append(Util.toString(namSinh));
        sb.append(", trinhDo=").append(trinhDo);
        sb.append(", luongCB=").append(String.format("%.1f", luongCB));
        return sb.toString();
    }
    
    public abstract float tinhLuong();
}
