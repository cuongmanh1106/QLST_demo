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
import model.m_loai_san_pham;
import model.m_loai_san_pham_cha;

/**
 *
 * @author Admin
 */
public class loai_san_pham_cha_query {
    private Connection conn;
    private ResultSet results;
    private m_loai_san_pham_cha l = new m_loai_san_pham_cha();
     public loai_san_pham_cha_query(){
        Properties props  = new Properties();
        InputStream instr = getClass().getResourceAsStream("dbConn.properties");//let me read content of a file 
        try {
            props.load(instr);
        } catch (IOException ex) {
            Logger.getLogger(loai_san_pham_cha_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            instr.close();
        } catch (IOException ex) {
            Logger.getLogger(loai_san_pham_cha_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        String driver = props.getProperty("driver.name");
        String url = props.getProperty("server.name");
        String username = props.getProperty("user.name");
        String password = props.getProperty("user.password");
        
        try {
            Class.forName(driver);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(loai_san_pham_cha_query.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            conn = (Connection) DriverManager.getConnection(url,username,password);
        } catch (SQLException ex) {
            Logger.getLogger(loai_san_pham_cha_query.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     public ArrayList<m_loai_san_pham_cha> Doc_loai_san_pham_cha() throws SQLException
     {
         String query ="select * from loai_san_pham_cha";
         PreparedStatement ps = conn.prepareStatement(query);
         this.results = ps.executeQuery();
         
         ArrayList<m_loai_san_pham_cha> list = new ArrayList<>();
         while(this.results.next())
         {
             m_loai_san_pham_cha mc = new m_loai_san_pham_cha();
             mc.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
             mc.setTen_loai(this.results.getString("ten_loai"));
             list.add(mc);
         }
         return list;
     }
     
     public ArrayList<m_loai_san_pham_cha> Doc_loai_san_pham_cha_phan_trang(int vt,int limit) throws SQLException
     {
         String query ="select * from loai_san_pham_cha limit ?,?";
         PreparedStatement ps = conn.prepareStatement(query);
         
         ps.setInt(1, vt);
         ps.setInt(2, limit);
         this.results = ps.executeQuery();
         
         ArrayList<m_loai_san_pham_cha> list = new ArrayList<>();
         while(this.results.next())
         {
             m_loai_san_pham_cha mc = new m_loai_san_pham_cha();
             mc.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
             mc.setTen_loai(this.results.getString("ten_loai"));
             list.add(mc);
         }
         return list;
     }
     
      public m_loai_san_pham_cha Doc_loai_san_pham_cha_phan_trang(int ma_loai_cha) throws SQLException
     {
         String query ="select * from loai_san_pham_cha where ma_loai_cha = ? ";
         PreparedStatement ps = conn.prepareStatement(query);
         
         ps.setInt(1, ma_loai_cha);
         
         this.results = ps.executeQuery();
         
        
         this.results.next();
         
        m_loai_san_pham_cha lc =  new m_loai_san_pham_cha();
        lc.setMa_loai_cha(this.results.getInt("ma_loai_cha"));
        lc.setTen_loai(this.results.getString("ten_loai"));
             
         
         return lc;
     }
     
      public int count_ma_san_pham_cha() throws SQLException
     {
         String query ="select count(ma_loai_cha) from loai_san_pham_cha";
         PreparedStatement ps = conn.prepareStatement(query);
         
         this.results = ps.executeQuery();
         
         ArrayList<m_loai_san_pham_cha> list = new ArrayList<>();
         int count = 0;
         while(this.results.next())
         {
             count = this.results.getInt("count(ma_loai_cha)");
         }
         return count;
     }
      
      public void Them_loai_san_pham_cha(m_loai_san_pham_cha mc) throws SQLException
      {
          String query = "insert into loai_san_pham_cha(ten_loai) values(?)";
          PreparedStatement ps = conn.prepareStatement(query);
          
          ps.setString(1, mc.getTen_loai());
          ps.executeUpdate();
      }
      
      public void Xoa_loai_san_pham_cha(int ma_loai_cha) throws SQLException
      {
          String query = "delete from loai_san_pham_cha where ma_loai_cha=?";
          PreparedStatement ps = conn.prepareStatement(query);
          
          ps.setInt(1, ma_loai_cha);
          
          ps.executeUpdate();
          
      }
     
     
     
     public static void main(String[] args) throws SQLException
     {
         loai_san_pham_cha_query lc = new loai_san_pham_cha_query();
         
         m_loai_san_pham_cha mc = new m_loai_san_pham_cha();
         //Doc all-------------------------------------------->
         
         /*
         ArrayList<m_loai_san_pham_cha> list = new ArrayList<>();
         
         list = lc.Doc_loai_san_pham_cha();
         
         for(m_loai_san_pham_cha m:list)
         {
             System.out.println(m.getTen_loai());
         }
        */
         
         //Doc limit-------------------------------------------->
         
        /* 
         ArrayList<m_loai_san_pham_cha> list = new ArrayList<>();
        
         list = lc.Doc_loai_san_pham_cha_phan_trang(1, 3);
         
         for(m_loai_san_pham_cha m:list)
         {
             System.out.println(m.getTen_loai());
         }
        */
         
         //Them--------------------------------------->
         
         /*
         mc.setTen_loai("do nam");
         lc.Them_loai_san_pham_cha(mc);
         */
         
         //Xoa---------------------------------->
         
         lc.Xoa_loai_san_pham_cha(4);
     }
     
    
}
