/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.model;

/**
 *
 * @author kj760
 */
public class Order {
   private int orderId;
   private String itemName;
   private int price;
   private int ammount;
   private int bill;
   private int userId;
   private String address;
   private String payment;

    public Order(int orderId, String itemName, int price, int ammount, int bill, int userId, String address, String payment) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
        this.userId = userId;
        this.address = address;
        this.payment = payment;
    }

    public Order(String itemName, int price, int ammount, int bill, int userId, String address, String payment) {
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
        this.userId = userId;
        this.address = address;
        this.payment = payment;
    }

    public Order(String itemName, int price, int ammount, int bill, String address, String payment) {
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
        this.address = address;
        this.payment = payment;
    }
   
   
   
    public Order(String itemName, int price, int ammount, int bill) {
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
    }

    public Order(String itemName, int price, int ammount, int bill, int userId, String address) {
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
        this.userId = userId;
        this.address = address;
    }

    public Order(int orderId, String itemName, int price, int ammount, int bill, int userId, String address) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
        this.userId = userId;
        this.address = address;
    }

    public Order(String ItemName, int price, int ammount, int bill, String address) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
   
   
    
   
   
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
   
   
    public Order(String itemName, int price, int ammount, int bill, int userId) {
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
        this.userId = userId;
    }

    public Order(int orderId, String itemName, int price, int ammount, int bill, int userId) {
        this.orderId = orderId;
        this.itemName = itemName;
        this.price = price;
        this.ammount = ammount;
        this.bill = bill;
        this.userId = userId;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getAmmount() {
        return ammount;
    }

    public void setAmmount(int ammount) {
        this.ammount = ammount;
    }

    public int getBill() {
        return bill;
    }

    public void setBill(int bill) {
        this.bill = bill;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }
   
   
}
