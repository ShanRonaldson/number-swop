/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Shannon Schrauwen
 */
public class Converter {
    private int givenNr;
    private int convertedNr;
    private String result;
    
    public int getNumber(){
        return givenNr;
    }
    
    public void setNumber(int givenNr){
        this.givenNr = givenNr;
    }
    
    public int getConvertedNr(){
        return convertedNr;
    }

    public String getResult(){
        return result;
    }
    
}
