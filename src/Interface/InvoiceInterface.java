/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author William Gonzalez
 */
public interface InvoiceInterface {
    
   public Object GetElectronicData(Object electronic);
   public Object GetPCData(Object pc);
   public Object GetHardwareData(Object hw);
   public Object GetSoftwareData(Object sw);
    
}
