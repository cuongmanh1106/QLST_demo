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
import java.util.AbstractList;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.m_loai_san_pham;


/**
 *
 * @author Admin
 */
public class loai_san_pham_query {
     private Connection conn;
    private ResultSet results;
    private m_loai_san_pham l = new m_loai_san_pham();
    
    public loai_san_pham_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(loai_san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(loai_san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loai_san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(loai_san_pham_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public ArrayList<m_loai_san_pham> Doc_loai_san_pham() throws SQLException{
        
        String query = "select * from loai_san_pham";
        PreparedStatement ps = conn.prepareStatement(query);
        this.results = ps.executeQuery();
        ArrayList<m_loai_san_pham> list = new ArrayList<>();
        
        while(this.results.next())
        {
           m_loai_san_pham ml = new m_loai_san_pham();
           ml.setMa_loai(this.results.getInt("ma_loai"));
           ml.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
           ml.setTen_loai(this.results.getString("ten_loai"));
           list.add(ml);
        }
        
        return list;
       
    }
    
    public ArrayList<m_loai_san_pham> Doc_loai_san_pham_phan_trang(int vt, int limit) throws SQLException{
        
        String query = "select * from loai_san_pham limit ?,?";
        PreparedStatement ps = conn.prepareStatement(query);
        ps.setInt(1, vt);
        ps.setInt(2, limit);
        this.results = ps.executeQuery();
        ArrayList<m_loai_san_pham> list = new ArrayList<>();
        
        while(this.results.next())
        {
           m_loai_san_pham ml = new m_loai_san_pham();
           ml.setMa_loai(this.results.getInt("ma_loai"));
           ml.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
           ml.setTen_loai(this.results.getString("ten_loai"));
           list.add(ml);
        }
        
        return list;
       
    }
    
    public m_loai_san_pham Doc_loai_san_pham_theo_ma_loai(int ma_loai) throws SQLException
    {
        String query = "select * from loai_san_pham where ma_loai=?";
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setInt(1, ma_loai);
        
        this.results = ps.executeQuery();
        
        if(this.results.next()){
        
            m_loai_san_pham ml = new m_loai_san_pham();

            ml.setMa_loai(this.results.getInt("ma_loai"));
            ml.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
            ml.setTen_loai(this.results.getString("ten_loai"));
            return ml;
        }
        return null;
    }
    
    public ArrayList<m_loai_san_pham> Doc_loai_san_pham_theo_ma_loai_cha(int ma_loai_cha) throws SQLException
    {
        String query = "select * from loai_san_pham where ma_loai_cha=?";
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setInt(1, ma_loai_cha);
        
        this.results = ps.executeQuery();
        
        ArrayList<m_loai_san_pham> list = new ArrayList<>();
        
        while(this.results.next())
        {
           m_loai_san_pham ml = new m_loai_san_pham();
           ml.setMa_loai(this.results.getInt("ma_loai"));
           ml.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
           ml.setTen_loai(this.results.getString("ten_loai"));
           list.add(ml);
        }
        
        return list;
    }
    
    public int dem_loai_san_pham() throws SQLException
    {
        String query = "select count(ma_loai) from loai_san_pham";
        PreparedStatement ps = conn.prepareStatement(query);
        this.results = ps.executeQuery();
        int count = 0;
        while(this.results.next())
        {
            count = this.results.getInt("count(ma_loai)");
        }
        return count;
        
    }
    
    public void Them_loai_san_pham(m_loai_san_pham ml) throws SQLException
    {
        String query =  "insert into loai_san_pham(ma_loai_cha,ten_loai) values(?,?)";
        PreparedStatement ps = conn.prepareStatement(query);
        
        ps.setInt(1, ml.getMa_loai_cha());
        ps.setString(2, ml.getTen_loai());
        
        ps.executeUpdate();
    }
    
     public void Xoa_loai_san_pham(int ma_loai) throws SQLException
    {
        String Query = "delete from loai_san_pham where ma_loai=?";

        PreparedStatement ps = conn.prepareStatement(Query);

        ps.setInt(1, ma_loai);

        ps.executeUpdate();
        
    }
     
     public void Update_loai_san_pham(m_loai_san_pham ml) throws SQLException
     {
         String query = "update loai_san_pham set ma_loai_cha = ? , ten_loai=? where ma_loai=?";
         PreparedStatement ps = conn.prepareStatement(query);
         
         ps.setInt(1, ml.getMa_loai_cha());
         ps.setString(2, ml.getTen_loai());
         ps.setInt(3, ml.getMa_loai());
         
         ps.executeUpdate();
     }
    
    
    public static void main(String[] args) throws SQLException
    {
        loai_san_pham_query lq = new loai_san_pham_query();
        m_loai_san_pham ml = new m_loai_san_pham();
        
        //System.out.println(lq.dem_loai_san_pham());
        
        //show all-------------------------------->
        
//        ArrayList<m_loai_san_pham> list = new ArrayList<>();
//        
//        list = lq.Doc_loai_san_pham();
//        
//        for(m_loai_san_pham l:list)
//        {
//            System.out.println(l.getMa_loai());
//        }
        
        
        //phan trang---------------------------------->
//        ArrayList<m_loai_san_pham> list = new ArrayList<>();
//        
//        list = lq.Doc_loai_san_pham_phan_trang(0,2);
//        
//        for(m_loai_san_pham l:list)
//        {
//            System.out.println(l.getMa_loai());
//        }
        
        //Them-------------------------->
        
        /*
        ml.setMa_loai_cha(1);
        ml.setTen_loai("shoes");
        
        lq.Them_loai_san_pham(ml);
        */
        
        //Xoa------------------------>
//        lq.Xoa_loai_san_pham(6);
        
        //Doc 1 loai sp
        /*
        ml = lq.Doc_loai_san_pham_theo_ma_loai(1);
        System.out.print(ml.getTen_loai());
        */
        
//        ml = lq.Doc_loai_san_pham_theo_ma_loai(5);
//        System.out.print(ml);
        
    }
    
}
