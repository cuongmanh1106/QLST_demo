/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class m_nguoi_dung {
    private int ma_nguoi_dung,ma_loai_nguoi_dung;
    private String ho_ten,ten_dang_nhap,mat_khau,email,ngay_dang_ki,ngay_dang_nhap_cuoi;

    public m_nguoi_dung() {
    }

    public m_nguoi_dung(int ma_nguoi_dung, int ma_loai_nguoi_dung, String ho_ten, String ten_dang_nhap, String mat_khau, String email, String ngay_dang_ki, String ngay_dang_nhap_cuoi) {
        this.ma_nguoi_dung = ma_nguoi_dung;
        this.ma_loai_nguoi_dung = ma_loai_nguoi_dung;
        this.ho_ten = ho_ten;
        this.ten_dang_nhap = ten_dang_nhap;
        this.mat_khau = mat_khau;
        this.email = email;
        this.ngay_dang_ki = ngay_dang_ki;
        this.ngay_dang_nhap_cuoi = ngay_dang_nhap_cuoi;
    }

    public int getMa_nguoi_dung() {
        return ma_nguoi_dung;
    }

    public void setMa_nguoi_dung(int ma_nguoi_dung) {
        this.ma_nguoi_dung = ma_nguoi_dung;
    }

    public int getMa_loai_nguoi_dung() {
        return ma_loai_nguoi_dung;
    }

    public void setMa_loai_nguoi_dung(int ma_loai_nguoi_dung) {
        this.ma_loai_nguoi_dung = ma_loai_nguoi_dung;
    }

    public String getHo_ten() {
        return ho_ten;
    }

    public void setHo_ten(String ho_ten) {
        this.ho_ten = ho_ten;
    }

    public String getTen_dang_nhap() {
        return ten_dang_nhap;
    }

    public void setTen_dang_nhap(String ten_dang_nhap) {
        this.ten_dang_nhap = ten_dang_nhap;
    }

    public String getMat_khau() {
        return mat_khau;
    }

    public void setMat_khau(String mat_khau) {
        this.mat_khau = mat_khau;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNgay_dang_ki() {
        return ngay_dang_ki;
    }

    public void setNgay_dang_ki(String ngay_dang_ki) {
        this.ngay_dang_ki = ngay_dang_ki;
    }

    public String getNgay_dang_nhap_cuoi() {
        return ngay_dang_nhap_cuoi;
    }

    public void setNgay_dang_nhap_cuoi(String ngay_dang_nhap_cuoi) {
        this.ngay_dang_nhap_cuoi = ngay_dang_nhap_cuoi;
    }
    
    
    
    
    
}
