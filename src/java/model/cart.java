/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Admin
 */
public class cart {
    
    private HashMap<Integer, Item> cartItems;

    public HashMap<Integer, Item> getCartItems() {
        return cartItems;
    }

    public void setCartItems(HashMap<Integer, Item> cartItems) {
        this.cartItems = cartItems;
    }

    public cart() {
        cartItems = new HashMap<>();
    }
    
    //insert to cart
    public void plusToCart(Integer key, Item item)
    {
        boolean check = cartItems.containsKey(key);
        if(check)
        {
            int so_luong_cu = item.getSo_luong();
            item.setSo_luong(so_luong_cu + 1);
            cartItems.put(key, item);
        }
        else
        {
            cartItems.put(key, item);
        }
    }
    //subtocart
    
    public void subToCart(Integer key, Item item)
    {
        boolean check = cartItems.containsKey(key);
        if(check)
        {
            int so_luong_cu = item.getSo_luong();
            if(so_luong_cu<=1)
            {
                cartItems.remove(key);
            }
            else
            {
                item.setSo_luong(so_luong_cu - 1);
                cartItems.put(key, item);
            }
            
        }
        
    }
    
    //remove to cart
    public void removeToCart(Integer key)
    {
        boolean check = cartItems.containsKey(key);
        if(check)
        {
            cartItems.remove(key);
        }
    }
    
    //count
    public int countItem()
    {
        return cartItems.size();
    }
    
    //sum total
    
    public double totalCart()
    {
        double count = 0;
        for(Map.Entry<Integer , Item> list: cartItems.entrySet())
        {
            count += list.getValue().getSp().getDon_gia() * list.getValue().getSo_luong();
        }
        return count;
    }
    
    
}
