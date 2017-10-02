/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.Date;

/**
 *
 * @author Admin
 */
public class m_khach_hang {
    
    private int ma_khach_hang;
    private String ten_khach_hang;
    private String mat_khau;
    private int phai;
    private String dia_chi;
    private String ngay_sinh;
    private String dien_thoai;
    private String email;

    public m_khach_hang() {
    }

    public m_khach_hang(int ma_khach_hang, String ten_khach_hang, String mat_khau, int phai, String dia_chi, String ngay_sinh, String dien_thoai, String email) {
        this.ma_khach_hang = ma_khach_hang;
        this.ten_khach_hang = ten_khach_hang;
        this.mat_khau = mat_khau;
        this.phai = phai;
        this.dia_chi = dia_chi;
        this.ngay_sinh = ngay_sinh;
        this.dien_thoai = dien_thoai;
        this.email = email;
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

    public String getTen_khach_hang() {
        return ten_khach_hang;
    }

    public void setTen_khach_hang(String ten_khach_hang) {
        this.ten_khach_hang = ten_khach_hang;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public int getPhai() {
        return phai;
    }

    public void setPhai(int phai) {
        this.phai = phai;
    }

    public String getDia_chi() {
        return dia_chi;
    }

    public void setDia_chi(String dia_chi) {
        this.dia_chi = dia_chi;
    }

    public String getNgay_sinh() {
        return ngay_sinh;
    }

    public void setNgay_sinh(String ngay_sinh) {
        this.ngay_sinh = ngay_sinh;
    }

    public String getDien_thoai() {
        return dien_thoai;
    }

    public void setDien_thoai(String dien_thoai) {
        this.dien_thoai = dien_thoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "m_khach_hang{" + "ma_khach_hang=" + ma_khach_hang + ", ten_khach_hang=" + ten_khach_hang + ", mat_khau=" + mat_khau + ", phai=" + phai + ", dia_chi=" + dia_chi + ", ngay_sinh=" + ngay_sinh + ", dien_thoai=" + dien_thoai + ", email=" + email + '}';
    }

    
    
    
    
    
}
