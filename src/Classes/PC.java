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
public class PC extends Electronic {
    
    private String MotherBoard;
    private String CPU;
    String Memory;

    public PC(int volt, int code, String name, String type, int quantity, String Memory, double price, String presentation) {
        super(volt, code, name, type, quantity, price, presentation);
    }

    public String getMotherBoard() {
        return MotherBoard;
    }

    public void setMotherBoard(String MotherBoard) {
        this.MotherBoard = MotherBoard;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getMemory() {
        return Memory;
    }

    public void setMemory(String Memory) {
        this.Memory = Memory;
    }

    public PC(String MotherBoard, String CPU, String Memory, int volt, int code, String name, String type, int quantity, double price, String presentation) {
        super(volt, code, name, type, quantity, price, presentation);
        this.MotherBoard = MotherBoard;
        this.CPU = CPU;
        this.Memory = Memory;
    }



}
