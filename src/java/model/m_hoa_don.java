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
public class m_hoa_don {
    
    private int ma_hoa_don;
    private String ngay_in;
    private int ma_khach_hang;
    private int tri_gia;
    private int tinh_trang;

    public m_hoa_don() {
    }

    public m_hoa_don(int ma_hoa_don, String ngay_in, int ma_khach_hang, int tri_gia, int tinh_trang) {
        this.ma_hoa_don = ma_hoa_don;
        this.ngay_in = ngay_in;
        this.ma_khach_hang = ma_khach_hang;
        this.tri_gia = tri_gia;
        this.tinh_trang = tinh_trang;
    }

    public int getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(int ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
    }

    public String getNgay_in() {
        return ngay_in;
    }

    public void setNgay_in(String ngay_in) {
        this.ngay_in = ngay_in;
    }

    public int getMa_khach_hang() {
        return ma_khach_hang;
    }

    public void setMa_khach_hang(int ma_khach_hang) {
        this.ma_khach_hang = ma_khach_hang;
    }

    public int getTri_gia() {
        return tri_gia;
    }

    public void setTri_gia(int tri_gia) {
        this.tri_gia = tri_gia;
    }

    public int getTinh_trang() {
        return tinh_trang;
    }

    public void setTinh_trang(int tinh_trang) {
        this.tinh_trang = tinh_trang;
    }

    @Override
    public String toString() {
        return "m_hoa_don{" + "ma_hoa_don=" + ma_hoa_don + ", ngay_in=" + ngay_in + ", ma_khach_hang=" + ma_khach_hang + ", tri_gia=" + tri_gia + ", tinh_trang=" + tinh_trang + '}';
    }

    
}
