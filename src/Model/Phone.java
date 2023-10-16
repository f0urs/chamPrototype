/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.awt.Color;



/**
 *
 * @author Chamara
 */
public abstract class Phone implements Cloneable{
    
     private String brand, model,color;
    
    private int storage, ram;
    private double display, camera, price;
    private boolean waterproof;

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public double getDisplay() {
        return display;
    }

    public void setDisplay(double display) {
        this.display = display;
    }

    public double getCamera() {
        return camera;
    }

    public void setCamera(double camera) {
        this.camera = camera;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isWaterproof() {
        return waterproof;
    }

    public void setWaterproof(boolean waterproof) {
        this.waterproof = waterproof;
    }

    @Override
    public String toString() {
        return "Phone : brand -"+ brand+"\r\n"+
                " model -"+ model+"\r\n"+
                " color -"+ color+"\r\n"+
                " storage -"+ storage+"\r\n"+
                " ram -"+ ram+"\r\n"+
                " display -"+ display+"\r\n"+
                " camera -"+ camera+"\r\n"+
                " price -"+ price+"\r\n"+
                " waterproof -"+ waterproof+"\r\n";
    }

   
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone(); //To change body of generated methods, choose Tools | Templates.
    }
   
    
    
}
