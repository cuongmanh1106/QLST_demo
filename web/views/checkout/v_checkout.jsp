 <%@page import="java.util.Map"%>
<%@page import="model.Item"%>
<%@page import="model.m_khach_hang"%>
<%@page import="model.cart"%>


<%
        cart c = (cart)session.getAttribute("cart");
        m_khach_hang k = (m_khach_hang)session.getAttribute("kh");
        
        if(c==null)
            response.sendRedirect("/QL_SieuThi/index.jsp");
        %>
        <h1>Chao,<%= k.getTen_khach_hang()%></h1>
        
        <table border="1" width="100%" style="font-size: 20px;">
            <tr>
                <td>Ten san pham</td>
                <td>Don gia</td>
                <td>So luong</td>
                <td>Tong</td>
            </tr>
            <%for(Map.Entry<Integer , Item> list: c.getCartItems().entrySet() ){%>
            <tr>
                <td><%= list.getValue().getSp().getTen_san_pham()%></td>
                <td><%= list.getValue().getSp().getDon_gia()%></td>
                <td>1</td>
                <td><%= (list.getValue().getSp().getDon_gia()*1)%></td>
            </tr>
            <%}%>
        </table>
        
        Tong tien: <%= c.totalCart()%>
        
        <hr>
        <a href="dat_hang.jsp" class="btn btn-success btn-circle">Dat hang</a>
        <a href="index.jsp" class="btn btn-success btn-circle">Mua tiep</a>