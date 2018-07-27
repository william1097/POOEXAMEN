/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

/**
 *
 * @author William Gonzalez
 */
public class Product {
    
    private int code;
    private String name;
    private String type;
    private int quantity;
    private double price;
    private String presentation;
    private double discount;

    public Product(int code, String name, String type, int quantity, double price, String presentation) {
        this.code = code;
        this.name = name;
        this.type = type;
        this.quantity = quantity;
        this.price = price;
        this.presentation = presentation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
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

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getPresentation() {
        return presentation;
    }

    public void setPresentation(String presentation) {
        this.presentation = presentation;
    }
    
    public double getDiscount() {
        return discount;
    }

    public void setDiscount(double discount) {
        this.discount = discount;
    }

    @Override
    public String toString() {
        return "\nCode: " + code + "\nName: " + name + "\nType: " + type + "\nQuantity: " + quantity + "\nPrice: " + price + "\nPresentation: " + presentation 
                + "\nDiscount: " + this.discount + "\nTotal: " + CalculateTotal();
    }
    
       public double CalculateDiscount(double discount){
       this.discount = (this.price * this.quantity) * (discount / 100) ;
       return this.discount;
   }
       
     public double CalculateTotal(){
        return (this.price * this.quantity) - this.discount;
         
     }

}
