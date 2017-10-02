/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Admin
 */
public class m_chi_tiet_hoa_don {
    
    private int stt;
    private int ma_hoa_don;
    private int ma_san_pham;
    private int so_luong;
    private int don_gia;

    public m_chi_tiet_hoa_don() {
    }

    public m_chi_tiet_hoa_don(int stt, int ma_hoa_don, int ma_san_pham, int so_luong, int don_gia) {
        this.stt = stt;
        this.ma_hoa_don = ma_hoa_don;
        this.ma_san_pham = ma_san_pham;
        this.so_luong = so_luong;
        this.don_gia = don_gia;
    }

    public int getStt() {
        return stt;
    }

    public void setStt(int stt) {
        this.stt = stt;
    }

    public int getMa_hoa_don() {
        return ma_hoa_don;
    }

    public void setMa_hoa_don(int ma_hoa_don) {
        this.ma_hoa_don = ma_hoa_don;
    }

    public int getMa_san_pham() {
        return ma_san_pham;
    }

    public void setMa_san_pham(int ma_san_pham) {
        this.ma_san_pham = ma_san_pham;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }

    @Override
    public String toString() {
        return "m_chi_tiet_hoa_don{" + "stt=" + stt + ", ma_hoa_don=" + ma_hoa_don + ", ma_san_pham=" + ma_san_pham + ", so_luong=" + so_luong + ", don_gia=" + don_gia + '}';
    }
    
    
    
}
