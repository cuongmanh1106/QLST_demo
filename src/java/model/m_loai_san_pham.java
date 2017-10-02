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
public class m_loai_san_pham {
    private int ma_loai;
    private int ma_loai_cha;
    private String ten_loai;

    public m_loai_san_pham() {
    }

    public m_loai_san_pham(int ma_loai, int ma_loai_cha, String ten_loai) {
        this.ma_loai = ma_loai;
        this.ma_loai_cha = ma_loai_cha;
        this.ten_loai = ten_loai;
    }

    public int getMa_loai() {
        return ma_loai;
    }

    public void setMa_loai(int ma_loai) {
        this.ma_loai = ma_loai;
    }

    public int getMa_loai_cha() {
        return ma_loai_cha;
    }

    public void setMa_loai_cha(int ma_loai_cha) {
        this.ma_loai_cha = ma_loai_cha;
    }

    public String getTen_loai() {
        return ten_loai;
    }

    public void setTen_loai(String ten_loai) {
        this.ten_loai = ten_loai;
    }

    @Override
    public String toString() {
        return "m_loai_san_pham{" + "ma_loai=" + ma_loai + ", ma_loai_cha=" + ma_loai_cha + ", ten_loai=" + ten_loai + '}';
    }
    
    
    
}
