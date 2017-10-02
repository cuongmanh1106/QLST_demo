/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbHelpers;

import com.mysql.jdbc.Connection;
import java.io.IOException;
import java.io.InputStream;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_khach_hang;
import model.m_san_pham;

/**
 *
 * @author Admin
 */
public class khach_hang_query {
    private Connection conn;
    private ResultSet results;
    private m_khach_hang kh = new m_khach_hang();
    
    public khach_hang_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(khach_hang_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(khach_hang_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(khach_hang_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(khach_hang_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<m_khach_hang> Doc_khach_hang() throws SQLException
    {
        String sql ="select * from khach_hang";
        PreparedStatement ps = conn.prepareStatement(sql);
        this.results = ps.executeQuery();
        
        ArrayList<m_khach_hang> list = new ArrayList<>();
        while(this.results.next())
        {
            m_khach_hang kh = new m_khach_hang();
            kh.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            kh.setTen_khach_hang(this.results.getString("ten_khach_hang"));
            kh.setEmail(this.results.getString("email"));
            kh.setMat_khau(this.results.getString("mat_khau"));
            kh.setDia_chi(this.results.getString("dia_chi"));
            kh.setDien_thoai(this.results.getString("dien_thoai"));
            
            list.add(kh);
        }
        return list;
    }
    
    public ArrayList<m_khach_hang> Doc_khach_hang_phan_trang(int vt , int limit) throws SQLException
    {
        String sql ="select * from khach_hang limit ?,?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, vt);
        ps.setInt(2, limit);
        this.results = ps.executeQuery();
        
        ArrayList<m_khach_hang> list = new ArrayList<>();
        while(this.results.next())
        {
            m_khach_hang kh = new m_khach_hang();
            kh.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            kh.setTen_khach_hang(this.results.getString("ten_khach_hang"));
            kh.setEmail(this.results.getString("email"));
            kh.setMat_khau(this.results.getString("mat_khau"));
            kh.setDia_chi(this.results.getString("dia_chi"));
            kh.setDien_thoai(this.results.getString("dien_thoai"));
            
            list.add(kh);
        }
        return list;
    }
    
    public int dem_khach_hang() throws SQLException
    {
        String sql = "select count(ma_khach_hang) from khach_hang";
        PreparedStatement ps = conn.prepareStatement(sql);
        this.results= ps.executeQuery();
        int count = 0;
        while(this.results.next())
        {
            count = this.results.getInt("count(ma_khach_hang)");
        }
        return count;
    }
    
    public void them_khach_hang(m_khach_hang kh) throws SQLException
    {
        String sql = "insert into khach_hang(ten_khach_hang,mat_khau,phai,ngay_sinh,dia_chi,dien_thoai,email) values(?,?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, kh.getTen_khach_hang());
        ps.setString(2, kh.getMat_khau());
        ps.setInt(3, kh.getPhai());
        ps.setString(4, kh.getNgay_sinh());
        ps.setString(5, kh.getDia_chi());
        ps.setString(6 , kh.getDien_thoai());
        ps.setString(7 , kh.getEmail());
        
        ps.executeUpdate();
    }
    public m_khach_hang dang_nhap_khach_hang(String email, String mat_khau) throws SQLException
    {
        String sql = "select * from khach_hang where email=? and mat_khau=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, email);
        ps.setString(2, mat_khau);
        
        this.results = ps.executeQuery();
        
        if(this.results.next())
        {
            m_khach_hang kh = new m_khach_hang();
            kh.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            kh.setTen_khach_hang(this.results.getString("ten_khach_hang"));
            kh.setEmail(this.results.getString("email"));
            kh.setDien_thoai(this.results.getString("dien_thoai"));
            return kh;
            
        }
        return null;
    }
    
     public m_khach_hang doc_khach_hang_theo_ma_khach_hang(int ma_khach_hang) throws SQLException
    {
        String sql = "select * from khach_hang where ma_khach_hang=?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ma_khach_hang);
        
        
        this.results = ps.executeQuery();
        
        if(this.results.next())
        {
            m_khach_hang kh = new m_khach_hang();
            kh.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            kh.setTen_khach_hang(this.results.getString("ten_khach_hang"));
            kh.setEmail(this.results.getString("email"));
            kh.setDien_thoai(this.results.getString("dien_thoai"));
            kh.setMat_khau(this.results.getString("mat_khau"));
            kh.setDia_chi(this.results.getString("dia_chi"));
            return kh;
            
        }
        return null;
    }
    
    public boolean check_mail(String email) throws SQLException
    {
        String sql = "select * from khach_hang where email = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, email);
        
        this.results = ps.executeQuery();
        while(this.results.next())
        {
            conn.close();
            return true;
        }
        return false;
    }
    
    
    public void  sua_khach_hang(m_khach_hang kh) throws SQLException
    {
        String query = "update khach_hang set ten_khach_hang = ?, dien_thoai=? where ma_khach_hang=?";
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setString(1, kh.getTen_khach_hang());
        ps.setString(2, kh.getDien_thoai());
        ps.setInt(3, kh.getMa_khach_hang());
        
        ps.executeUpdate();
    }
    
    public ArrayList<m_khach_hang> tim_khach_hang(String ten_khach_hang) throws SQLException
    {
        String query = "select * from khach_hang where ten_khach_hang like '%"+ten_khach_hang+"%' ";
        PreparedStatement ps = conn.prepareStatement(query);
        
        this.results = ps.executeQuery();
        
        ArrayList<m_khach_hang> list = new ArrayList<>();
        while(this.results.next())
        {
            m_khach_hang kh = new m_khach_hang();
            kh.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            kh.setTen_khach_hang(this.results.getString("ten_khach_hang"));
            kh.setEmail(this.results.getString("email"));
            kh.setMat_khau(this.results.getString("mat_khau"));
            kh.setDia_chi(this.results.getString("dia_chi"));
            kh.setDien_thoai(this.results.getString("dien_thoai"));
            
            list.add(kh);
        }
        return list;
    }
    
    
    public static void main(String[] args) throws SQLException
    {
        khach_hang_query kq = new khach_hang_query();
        
        m_khach_hang kh = new m_khach_hang();
        ArrayList<m_khach_hang> list = new ArrayList<>();
        //Get all ---------------------------------->
        /*
        ArrayList<m_khach_hang> list = new ArrayList<>();
        list = kq.Doc_khach_hang();
        for(m_khach_hang k:list)
        {
            System.out.println(k.getTen_khach_hang());
        }
                */
        //them kh-------------------------------------->
        
//        kh.setTen_khach_hang("MCuong");
//        kh.setMat_khau("123");
//        kh.setPhai(1);
//        kh.setNgay_sinh("1996-11-6");
//        kh.setDia_chi("Man Thien");
//        kh.setDien_thoai("01688868553");
//        kh.setEmail("mc@gmail.com");
//        
//        kq.them_khach_hang(kh);
        
        //System.out.print(kq.dem_khach_hang());
        
//        kh = kq.dang_nhap_khach_hang("mc@gmail.com", "202cb962ac59075b964b07152d234b70");
//        if(kh!=null)
//        {
//            System.out.print(kh.getTen_khach_hang());
//        }
//        else
//            System.out.print("dang nhap that bai");
        
//        if(kq.check_mail("m@gmail.com"))
//        {
//            System.out.print("dung");
//        }
//        else
//            System.out.print("sai");
        
        list = kq.tim_khach_hang("mc");
        for(m_khach_hang k:list)
        {
            System.out.println(kh.getTen_khach_hang());
        }
                
    }
    
}
