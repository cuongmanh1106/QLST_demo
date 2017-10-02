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
public class Item {
    private m_san_pham sp;
    private int so_luong;

    public Item(m_san_pham sp, int so_luong) {
        this.sp = sp;
        this.so_luong = so_luong;
    }

    public Item() {
    }

    public m_san_pham getSp() {
        return sp;
    }

    public void setSp(m_san_pham sp) {
        this.sp = sp;
    }

    public int getSo_luong() {
        return so_luong;
    }

    public void setSo_luong(int so_luong) {
        this.so_luong = so_luong;
    }

    @Override
    public String toString() {
        return "Iteam{" + "sp=" + sp + ", so_luong=" + so_luong + '}';
    }
    
    
    
}
