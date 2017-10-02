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
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_hoa_don;

/**
 *
 * @author Admin
 */
public class hoa_don_query {
    
    
     private Connection conn;
    private ResultSet results;
    private m_hoa_don l = new m_hoa_don();
    
    public hoa_don_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(hoa_don_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public int them_hoa_don(m_hoa_don hd) throws SQLException
    {
        String query = "insert into hoa_don(ngay_in,ma_khach_hang,tri_gia,tinh_trang) values(?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);//get last_id when insert
        
        Date d = new Date();
        SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
        ps.setString(1, ft.format(d));
        ps.setInt(2, hd.getMa_khach_hang());
        ps.setInt(3, hd.getTri_gia());
        ps.setInt(4, 1);
        
        ps.executeUpdate();
        this.results = ps.getGeneratedKeys();
        int key = 0;
        if(this.results.next())
        {
            key = this.results.getInt(1);
        }
        return key;
        
        
    }
    
    public ArrayList<m_hoa_don> Doc_hoa_don() throws SQLException
    {
        String query = "select * from hoa_don";
        PreparedStatement ps = conn.prepareStatement(query);
        
        this.results = ps.executeQuery();
        
        ArrayList<m_hoa_don> list  = new ArrayList<>();
        while(this.results.next())
        {
            m_hoa_don hd = new m_hoa_don();
            
            hd.setMa_hoa_don(this.results.getInt("ma_hoa_don"));
            hd.setNgay_in(this.results.getString("ngay_in"));
            hd.setTri_gia(this.results.getInt("tri_gia"));
            hd.setTinh_trang(this.results.getInt("tinh_trang"));
            hd.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            list.add(hd);
        }
        return list;
    }
    
    public ArrayList<m_hoa_don> Doc_hoa_don_pt(int vt, int limit) throws SQLException
    {
        String query = "select * from hoa_don  order by  tinh_trang DESC, ngay_in DESC limit ?,? ";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, vt);
        ps.setInt(2, limit);
        this.results = ps.executeQuery();
        
        ArrayList<m_hoa_don> list  = new ArrayList<>();
        while(this.results.next())
        {
            m_hoa_don hd = new m_hoa_don();
            
            hd.setMa_hoa_don(this.results.getInt("ma_hoa_don"));
            hd.setNgay_in(this.results.getString("ngay_in"));
            hd.setTri_gia(this.results.getInt("tri_gia"));
            hd.setTinh_trang(this.results.getInt("tinh_trang"));
            hd.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            list.add(hd);
        }
        return list;
    }
    
    public ArrayList<m_hoa_don> tim_hoa_don(String tim) throws SQLException
    {
        String query = "SELECT ma_hoa_don,ngay_in,hd.ma_khach_hang,tri_gia,tinh_trang FROM hoa_don hd inner JOIN khach_hang kh ON hd.ma_khach_hang = kh.ma_khach_hang WHERE ten_khach_hang like '%"+tim+"%' ";
        PreparedStatement ps = conn.prepareStatement(query);
         ArrayList<m_hoa_don> list = new ArrayList<>();
        this.results = ps.executeQuery();
        while(this.results.next())
        {
            m_hoa_don hd = new m_hoa_don();
            
            hd.setMa_hoa_don(this.results.getInt("ma_hoa_don"));
            hd.setNgay_in(this.results.getString("ngay_in"));
            hd.setMa_khach_hang(this.results.getInt("ma_khach_hang"));
            hd.setTri_gia(this.results.getInt("tri_gia"));
            hd.setTinh_trang(this.results.getInt("tinh_trang"));
            
            list.add(hd);
        }
        return list;
    }
    
    public int hoa_don_chua_xem() throws SQLException
    {
        String query = "select count(tinh_trang) from hoa_don where tinh_trang = 1";
        PreparedStatement ps = conn.prepareStatement(query);
        
        this.results = ps.executeQuery();
        
        this.results.next();
        
        int count = this.results.getInt("count(tinh_trang)");
        
        return count;
    }
    
    public void cap_nhat_tinh_trang(int ma_hoa_don) throws SQLException
    {
        String query = "update hoa_don set tinh_trang = 0 where ma_hoa_don=?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, ma_hoa_don);
        ps.executeUpdate();
    }
    
    public static void main (String[] args) throws SQLException
    {
        hoa_don_query cq = new hoa_don_query();
        m_hoa_don ct = new m_hoa_don();
        ArrayList<m_hoa_don> list  = new ArrayList<>();
//        ct.setMa_khach_hang(1);
//        ct.setTri_gia(50);
        
        
//        list = cq.Doc_hoa_don();
//        for(m_hoa_don hd:list)
//        {
//            System.out.println(hd.getMa_hoa_don());
//        }
        
//        list = cq.tim_hoa_don("mc");
//        for(m_hoa_don hd:list)
//        {
//            System.out.println(hd.getMa_hoa_don());
//        }
        
//        System.out.print(cq.hoa_don_chua_xem());
        
//        ct.setMa_khach_hang(2);
//        ct.setTri_gia(20);
//        int a = cq.them_hoa_don(ct);
//        System.out.print(a);
    }
    
}
