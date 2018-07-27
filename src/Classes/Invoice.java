/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import Interface.InvoiceInterface;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author William Gonzalez
 */
public class Invoice implements InvoiceInterface {

    Scanner sc = new Scanner(System.in);
    int numberInvoice = 1;
    ArrayList<Object> products = new ArrayList<>();
    String date;

    @Override
    public Object GetElectronicData(Object product) {

        if (product instanceof Electronic) {
            int code = 0;
            ((Electronic) product).setCode(code + 1);
            ((Electronic) product).setType("Electronic");
            System.out.println("Enter the product name: ");
            System.out.println("Options: TV or Stereo");
            System.out.println("\n");
            String name = sc.next();
            ((Electronic) product).setName(name);
            System.out.println("Enter price: ");
            double precio = sc.nextDouble();
            ((Electronic) product).setPrice(precio);
            System.out.println("Enter presentation: ");
            String presentacion = sc.next();
            ((Electronic) product).setPresentation(presentacion);
            System.out.println("Enter Quantity: ");
            int cantidad = sc.nextInt();
            ((Electronic) product).setQuantity(cantidad);
            System.out.println("Enter the voltage: ");
            int voltaje = sc.nextInt();
            ((Electronic) product).setVoltage(voltaje);
            System.out.println("Cash Discount: ");
            double descuento = sc.nextDouble();
            ((Electronic) product).CalculateDiscount(descuento);
            return products.add(product);
        } else {
            return null;
        }
    }

    @Override
    public Object GetPCData(Object pc) {
        if (pc instanceof PC) {
            int code = 1;
            ((PC) pc).setCode(code);
            ((PC) pc).setType("PC");
            System.out.println("Enter the product name: ");
            System.out.println("Options: Laptop or Desktop");
            System.out.println("\n");
            String name = sc.next();
            ((PC) pc).setName(name);
            System.out.println("Enter specifications of the mother board: ");
            String tarjetaMadre = sc.next();
            ((PC) pc).setMotherBoard(tarjetaMadre);
            System.out.println("Enter CPU specifications: ");
            String CPU = sc.next();
            ((PC) pc).setCPU(CPU);
            System.out.println("Enter Memory: ");
            String memory = sc.next();
            ((PC) pc).setMemory(memory);
            System.out.println("Enter Price: ");
            double precio = sc.nextDouble();
            ((PC) pc).setPrice(precio);
            System.out.println("Presentation ");
            String presentacion = sc.next();
            ((PC) pc).setPresentation(presentacion);
            System.out.println("Quantity: ");
            int cantidad = sc.nextInt();
            ((PC) pc).setQuantity(cantidad);
            System.out.println("Voltage: ");
            int voltaje = sc.nextInt();
            ((PC) pc).setVoltage(voltaje);
            System.out.println("Cash Discount: ");
            double descuento = sc.nextDouble();
            ((PC) pc).CalculateDiscount(descuento);
            code++;
            return products.add(pc);
        } else {
            return null;
        }
    }

    @Override
    public Object GetHardwareData(Object product) {
        if (product instanceof Hardware) {
            int option2 = 0;
            while (option2 < 4) {
                option2 = 0;
                int code = 1;
                ((Hardware) product).setCode(code);
                ((Hardware) product).setType("Hardware");
                System.out.println("Choose:"
                        + "\n1.PC "
                        + "\n2.Mouse"
                        + "\n3.Keyboard"
                        + "\n4.Speakers");
                option2 = sc.nextInt();
                if (option2 == 1) {
                    System.out.println("Enter the product name: ");
                    String name = sc.next();
                    ((Hardware) product).setName(name);
                    System.out.println("Enter the specifications of the mother board: ");
                    String tarjetaMadre = sc.next();
                    ((Hardware) product).setMotherBoard(tarjetaMadre);
                    System.out.println("Enter the specificatios of CPU: ");
                    String CPU = sc.next();
                    ((Hardware) product).setCPU(CPU);
                    System.out.println("Enter Memory: ");
                    String Memory = sc.next();
                    ((Hardware) product).setMemory(Memory);
                    System.out.println("Enter price: ");
                    double precio = sc.nextDouble();
                    ((Hardware) product).setPrice(precio);
                    System.out.println("Presentation: ");
                    String presentacion = sc.next();
                    ((Hardware) product).setPresentation(presentacion);
                    System.out.println("Quantity: ");
                    int cantidad = sc.nextInt();
                    ((Hardware) product).setQuantity(cantidad);
                    System.out.println("Enter Voltage: ");
                    int voltaje = sc.nextInt();
                    ((Hardware) product).setVoltage(voltaje);
                    System.out.println("Cash Discount: ");
                    double descuento = sc.nextDouble();
                    ((Hardware) product).CalculateDiscount(descuento);
                    return products.add(product);
                }
                if (option2 == 2) {
                    System.out.println("Enter the product name: ");
                    String name = sc.next();
                    ((Hardware) product).setMouse(name);
                    System.out.println("Enter the price: ");
                    double precio = sc.nextDouble();
                    ((Hardware) product).setPrice(precio);
                    System.out.println("Presentation: ");
                    String presentacion = sc.next();
                    ((Hardware) product).setPresentation(presentacion);
                    System.out.println("Quantity: ");
                    int cantidad = sc.nextInt();
                    ((Hardware) product).setQuantity(cantidad);
                    System.out.println("Enter the voltage: ");
                    int voltaje = sc.nextInt();
                    ((Hardware) product).setVoltage(voltaje);
                    System.out.println("Cash Discount: ");
                    double descuento = sc.nextDouble();
                    ((Hardware) product).CalculateDiscount(descuento);
                    return products.add(product);
                }
                if (option2 == 3) {
                    System.out.println("Enter the product name: ");
                    String name = sc.next();
                    ((Hardware) product).setKeyBoard(name);
                    System.out.println("Enter the specifications of the keyboard: ");
                    double precio = sc.nextDouble();
                    ((Hardware) product).setPrice(precio);
                    System.out.println("Enter the price: ");
                    String presentacion = sc.next();
                    ((Hardware) product).setPresentation(presentacion);
                    System.out.println("Quantity: ");
                    int cantidad = sc.nextInt();
                    ((Hardware) product).setQuantity(cantidad);
                    System.out.println("Enter the Voltage: ");
                    int voltaje = sc.nextInt();
                    ((Hardware) product).setVoltage(voltaje);
                    System.out.println("Cash Discount: ");
                    double descuento = sc.nextDouble();
                    ((Hardware) product).CalculateDiscount(descuento);
                    return products.add(product);
                }
                if (option2 == 4) {
                    System.out.println("Enter the product name: ");
                    String name = sc.next();
                    ((Hardware) product).setKeyBoard(name);
                    System.out.println("Enter price: ");
                    double precio = sc.nextDouble();
                    ((Hardware) product).setPrice(precio);
                    System.out.println("Enter the price: ");
                    String presentacion = sc.next();
                    ((Hardware) product).setPresentation(presentacion);
                    System.out.println("Quantity: ");
                    int cantidad = sc.nextInt();
                    ((Hardware) product).setQuantity(cantidad);
                    System.out.println("Enter the Voltage: ");
                    int voltaje = sc.nextInt();
                    ((Hardware) product).setVoltage(voltaje);
                    System.out.println("Cash Discount: ");
                    double descuento = sc.nextDouble();
                    ((Hardware) product).CalculateDiscount(descuento);
                    return products.add(product);
                }
                code++;
            }
            return products.add(product);
        } else {
            return null;
        }
    }

    public Object GetSWData(Object product) {
        if (product instanceof SW) {
            int code = 1;
            ((SW) product).setCode(code);
            ((SW) product).setType("Software");
            System.out.println("Enter the product name: ");
            String name = sc.next();
            ((SW) product).setName(name);
            System.out.println("Enter the price: ");
            double precio = sc.nextDouble();
            ((SW) product).setPrice(precio);
            System.out.println("Presentation: ");
            String presentacion = sc.next();
            ((SW) product).setPresentation(presentacion);
            System.out.println("Quantity: ");
            int cantidad = sc.nextInt();
            ((SW) product).setQuantity(cantidad);
            System.out.println("Cash Discount: ");
            double descuento = sc.nextDouble();
            ((SW) product).CalculateDiscount(descuento);
            code++;
            return products.add(product);
        } else {
            return 0;
        }
    }

    public void ViewData() {

        products.stream().map((product) -> {
            System.out.println("Invoice");
            return product;
        }).map((product) -> {
            System.out.println("------------------");
            return product;
        }).map((product) -> {
            System.out.println("Invoice Number: " + this.numberInvoice);
            return product;
        }).map((product) -> {
            System.out.println(product.toString());
            return product;
        }).forEachOrdered((item) -> {
            System.out.println("------------------");
        });
        this.numberInvoice++;
        Menu();
    }

    public void Menu() {
        @SuppressWarnings("UnusedAssignment")
        int option = 0;
        do {
            option = 0;
            System.out.println("What do you want to invoice? "
                    + "\n1.Electronic"
                    + "\n2.Hardware"
                    + "\n3.Software"
                    + "\n4.Computers"
                    + "\n5.Exit"
                    + "\n");
            option = sc.nextInt();
            if (option == 1) {
                Electronic electronic = new Electronic(0, 0, "test", "test", 0, 0, "test");
                GetElectronicData(electronic);
                ViewData();
            }
            if (option == 2) {
                Hardware hardware = new Hardware(0, 0, "test", "test", 0, "test", 0, "test");
                GetHardwareData(products);
                ViewData();
            }
            if (option == 3) {
                SW sw = new SW("", "", "", 0, "test", "test", 0, 0, "test");
                GetSWData(sw);
                ViewData();
            }
            if (option == 4) {
                PC pc = new PC(0, 0, "test", "test", 0, "test", 0, "test");
                GetPCData(pc);
                ViewData();
            } else {
                System.exit(0);
            }

        } while (option < 4);

        System.out.println("¡Thanks!");
    }

    @Override
    public Object GetSoftwareData(Object sw) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
