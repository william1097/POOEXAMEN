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
public class Electronic extends Product{
    
    private int voltage;

    public Electronic(int voltage, int code, String name, String type, int quantity, double price, String presentation) {
        super(code, name, type, quantity, price, presentation);
        this.voltage = voltage;
    }

    public int getVoltage() {
        return voltage;
    }

    public void setVoltage(int volt) {
        this.voltage = voltage;
    }

    @Override
    public String toString() {
        return "\nVoltage: " + this.voltage + super.toString();
    }


}
