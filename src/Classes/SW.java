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
public class SW extends Product{
    
    private String Aplicativo;
    private String OS;
    private String pointOfSale;
    
    public SW(int code, String name, String type, int quantity, double price, String presentation) {
        super(code, name, type, quantity, price, presentation);
    }

    public SW(String Aplicativo, String OS, String pointOfSale, int code, String name, String type, int quantity, double price, String presentation) {
        super(code, name, type, quantity, price, presentation);
        this.Aplicativo = Aplicativo;
        this.OS = OS;
        this.pointOfSale = pointOfSale;
    }

   
    public String getPointOfSale() {
        return pointOfSale;
    }

    public void setPointOfSale(String pointOfSale) {
        this.pointOfSale = pointOfSale;
    }

    public String getAplicativo() {
        return Aplicativo;
    }

    public void setAplicativo(String Aplicativo) {
        this.Aplicativo = Aplicativo;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    @Override
    public String toString() {
        return "\nAplicativo: " + Aplicativo + "\nOS: " + OS + "\nPoint Of Sale: " + pointOfSale + super.toString();
    }
    
    
}
        