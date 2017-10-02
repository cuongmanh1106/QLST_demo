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
public class m_san_pham {
    
    private int ma_san_pham;
    private String ten_san_pham;
    private int ma_loai;
    private String mo_ta_tom_tat,mo_ta_chi_tiet;
    private int don_gia;
    private String hinh;
    private int san_pham_moi;
    private int so_lan_xem;
    private String ngay_tao;

    public m_san_pham() {
    }

    public m_san_pham(int ma_san_pham, String ten_san_pham, int ma_loai, String mo_ta_tom_tat, String mo_ta_chi_tiet, int don_gia, String hinh, int san_pham_moi, int so_lan_xem, String ngay_tao) {
        this.ma_san_pham = ma_san_pham;
        this.ten_san_pham = ten_san_pham;
        this.ma_loai = ma_loai;
        this.mo_ta_tom_tat = mo_ta_tom_tat;
        this.mo_ta_chi_tiet = mo_ta_chi_tiet;
        this.don_gia = don_gia;
        this.hinh = hinh;
        this.san_pham_moi = san_pham_moi;
        this.so_lan_xem = so_lan_xem;
        this.ngay_tao = ngay_tao;
    }

    @Override
    public String toString() {
        return "m_san_pham{" + "ma_san_pham=" + ma_san_pham + ", ten_san_pham=" + ten_san_pham + ", ma_loai=" + ma_loai + ", mo_ta_tom_tat=" + mo_ta_tom_tat + ", mo_ta_chi_tiet=" + mo_ta_chi_tiet + ", don_gia=" + don_gia + ", hinh=" + hinh + ", san_pham_moi=" + san_pham_moi + ", so_lan_xem=" + so_lan_xem + ", ngay_tao=" + ngay_tao + '}';
    }

    public int getMa_san_pham() {
        return ma_san_pham;
    }

    public void setMa_san_pham(int ma_san_pham) {
        this.ma_san_pham = ma_san_pham;
    }

    public String getTen_san_pham() {
        return ten_san_pham;
    }

    public void setTen_san_pham(String ten_san_pham) {
        this.ten_san_pham = ten_san_pham;
    }

    public int getMa_loai() {
        return ma_loai;
    }

    public void setMa_loai(int ma_loai) {
        this.ma_loai = ma_loai;
    }

    public String getMo_ta_tom_tat() {
        return mo_ta_tom_tat;
    }

    public void setMo_ta_tom_tat(String mo_ta_tom_tat) {
        this.mo_ta_tom_tat = mo_ta_tom_tat;
    }

    public String getMo_ta_chi_tiet() {
        return mo_ta_chi_tiet;
    }

    public void setMo_ta_chi_tiet(String mo_ta_chi_tiet) {
        this.mo_ta_chi_tiet = mo_ta_chi_tiet;
    }

    public int getDon_gia() {
        return don_gia;
    }

    public void setDon_gia(int don_gia) {
        this.don_gia = don_gia;
    }

    public String getHinh() {
        return hinh;
    }

    public void setHinh(String hinh) {
        this.hinh = hinh;
    }

    public int getSan_pham_moi() {
        return san_pham_moi;
    }

    public void setSan_pham_moi(int san_pham_moi) {
        this.san_pham_moi = san_pham_moi;
    }

    public int getSo_lan_xem() {
        return so_lan_xem;
    }

    public void setSo_lan_xem(int so_lan_xem) {
        this.so_lan_xem = so_lan_xem;
    }

    public String getNgay_tao() {
        return ngay_tao;
    }

    public void setNgay_tao(String ngay_tao) {
        this.ngay_tao = ngay_tao;
    }

   
    
    
    
    
    
    
}
