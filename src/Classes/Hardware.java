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
public class Hardware extends PC{
    
    private String mouse;
    private String keyBoard;
    private String speakers;
    
     public Hardware(int volt, int code, String name, String type, int quantity, String Memory, double price, String presentation) {
        super(volt, code, name, type, quantity, Memory, price, presentation);
    }

    public Hardware(String mouse, String keyBoard, String speakers, String MotherBoard, String CPU, String Memory, int volt, int code, String name, String type, int quantity, double price, String presentation) {
        super(MotherBoard, CPU, Memory, volt, code, name, type, quantity, price, presentation);
        this.mouse = mouse;
        this.keyBoard = keyBoard;
        this.speakers = speakers;
    }

    public String getSpeakers() {
        return speakers;
    }

    public void setSpeakers(String speakers) {
        this.speakers = speakers;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getKeyBoard() {
        return keyBoard;
    }

    public void setKeyBoard(String keyBoard) {
        this.keyBoard = keyBoard;
    }

    @Override
    public String toString() {
        return "\nMause: " + mouse + "\nKeyBoard: " + keyBoard + "\nSpeakers: " + speakers + super.toString();
    }
    
}
