package com.example.appgk;

public class Nhac {
    private String tenNhac;
    private int img;
    private String tenCaSi;
    private String tacGia;
    private String moTa;

    public Nhac(String tenNhac, int img, String tenCaSi, String tacGia, String moTa) {
        this.tenNhac = tenNhac;
        this.img = img;
        this.tenCaSi = tenCaSi;
        this.tacGia = tacGia;
        this.moTa = moTa;
    }

    public String getMoTa() {

        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    public Nhac() {
    }

    public String getTenNhac() {
        return tenNhac;
    }

    public void setTenNhac(String tenNhac) {
        this.tenNhac = tenNhac;
    }

    public int getImg() {
        return img;
    }

    public void setImg(int img) {
        this.img = img;
    }

    public String getTenCaSi() {
        return tenCaSi;
    }

    public void setTenCaSi(String tenCaSi) {
        this.tenCaSi = tenCaSi;
    }

    public String getTacGia() {
        return tacGia;
    }

    public void setTacGia(String tacGia) {
        this.tacGia = tacGia;
    }

    @Override
    public String toString() {
        return "Nhac{" +
                "tenNhac='" + tenNhac + '\'' +
                ", img=" + img +
                ", tenCaSi='" + tenCaSi + '\'' +
                ", tacGia='" + tacGia + '\'' +
                '}';
    }
}
