/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.asd.model;

/**
 *
 * @author Piseth
 */
public class Product {
    private String name;
    private String type;
    private String unitPrice;
    private String description;
    private String quantity;

    public Product(String name, String type, String unitPrice, String description, String quantity) {
        this.name = name;
        this.type = type;
        this.unitPrice= unitPrice;
        this.description = description; 
        this.quantity= quantity;
    }

    public Product(String name, String type, String price, String decription) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }
    
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity (String quantity) {
        this.quantity = quantity;
    }
}

