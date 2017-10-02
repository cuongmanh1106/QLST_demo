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
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_nguoi_dung;

/**
 *
 * @author Admin
 */
public class nguoi_dung_query {
    
    private Connection conn;
    private ResultSet results;
   
    
    public nguoi_dung_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(nguoi_dung_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public  m_nguoi_dung dang_nhap_admin(String ten_dang_nhap, String mat_khau) throws SQLException
    {
        String sql = "select * from nguoi_dung where ten_dang_nhap = ? and mat_khau = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, ten_dang_nhap);
        ps.setString(2, mat_khau);
        
        this.results = ps.executeQuery();
        
        if(this.results.next())
        {
            m_nguoi_dung nd = new m_nguoi_dung();
            
            nd.setTen_dang_nhap(this.results.getString("ten_dang_nhap"));
            nd.setHo_ten(this.results.getString("ho_ten"));
            nd.setMat_khau(this.results.getString("mat_khau"));
            nd.setEmail(this.results.getString("email"));
            nd.setMa_nguoi_dung(this.results.getInt("ma_nguoi_dung"));
            return nd;
        }
        return null;
    }
    
    public ArrayList<m_nguoi_dung> Doc_nguoi_dung() throws SQLException
    {
        String sql = "select * from nguoi_dung";
        PreparedStatement ps = conn.prepareStatement(sql);
        this.results = ps.executeQuery();
        
        ArrayList<m_nguoi_dung> list = new ArrayList<>();
        
        while(this.results.next())
        {
            m_nguoi_dung nd = new m_nguoi_dung();
            
            nd.setMa_nguoi_dung(this.results.getInt("ma_nguoi_dung"));
            nd.setHo_ten(this.results.getString("ho_ten"));
            nd.setTen_dang_nhap(this.results.getString("ten_dang_nhap"));
            nd.setMat_khau(this.results.getString("mat_khau"));
            nd.setEmail(this.results.getString("email"));
            nd.setNgay_dang_nhap_cuoi(this.results.getString("ngay_dang_nhap_cuoi"));
            nd.setNgay_dang_ki(this.results.getString("ngay_dang_ki"));
            list.add(nd);
        }
        return list;
        
        
    }
    
    public  m_nguoi_dung Doc_nguoi_dung_theo_ma_nguoi_dung(int ma_nguoi_dung) throws SQLException
    {
        String sql = "select * from nguoi_dung where ma_nguoi_dung = ?";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ma_nguoi_dung);
        
        
        this.results = ps.executeQuery();
        
        if(this.results.next())
        {
            m_nguoi_dung nd = new m_nguoi_dung();
            
            nd.setTen_dang_nhap(this.results.getString("ten_dang_nhap"));
            nd.setHo_ten(this.results.getString("ho_ten"));
            nd.setMat_khau(this.results.getString("mat_khau"));
            nd.setEmail(this.results.getString("email"));
            nd.setMa_nguoi_dung(this.results.getInt("ma_nguoi_dung"));
            return nd;
        }
        return null;
    }
    
    public void Xoa_nguoi_dung(int ma_nguoi_dung) throws SQLException
    {
        String sql = "delete from nguoi_dung where ma_nguoi_dung=? ";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, ma_nguoi_dung);
        
        ps.executeUpdate();
    }
    
    public void Them_nguoi_dung(m_nguoi_dung nd) throws SQLException
    {
        String sql = "insert into nguoi_dung(ho_ten,ten_dang_nhap,mat_khau,email,ngay_dang_ki,ngay_dang_nhap_cuoi) values(?,?,?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, nd.getHo_ten());
        ps.setString(2, nd.getTen_dang_nhap());
        ps.setString(3, nd.getMat_khau());
        ps.setString(4, nd.getEmail());
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        ps.setString(5, ft.format(d));
        ps.setString(6, ft.format(d));
        
        ps.executeUpdate();
    }
    
    public void cap_nhat_nguoi_dung(m_nguoi_dung nd) throws SQLException
    {
        String sql = "update nguoi_dung set ho_ten=?,ten_dang_nhap=?,mat_khau=?,email=? where ma_nguoi_dung=?";
        
        PreparedStatement ps = conn.prepareStatement(sql);
        
        ps.setString(1, nd.getHo_ten());
        ps.setString(2, nd.getTen_dang_nhap());
        ps.setString(3, nd.getMat_khau());
        ps.setString(4, nd.getEmail());
        ps.setInt(5, nd.getMa_loai_nguoi_dung());
        
        ps.executeUpdate();
    }
    
    public static void main(String[] args) throws SQLException
    {
        m_nguoi_dung nd = new m_nguoi_dung();
        nguoi_dung_query nq = new nguoi_dung_query();
        
//        nd = nq.dang_nhap_admin("zc", "123");
//        
//        System.out.println(nd);
          
        nd = nq.Doc_nguoi_dung_theo_ma_nguoi_dung(1);
        System.out.println(nd.getHo_ten());
    }
    
}
