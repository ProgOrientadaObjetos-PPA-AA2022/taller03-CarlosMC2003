/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author Carlos Morocho - PC
 */
public class EquipoCelular {
    private String sistemOp;
    private double tamanioPant;
    private double costoIni;
    private double Iva;
    private double IvaCosFin;
    private String dirMac;
    private String infoImei;
    
    public void establecerSistemaOperativo(String c){
        sistemOp = c;
    }
    
    public void establecerTamanioPantalla(double c){
        tamanioPant = c;
    }
    
    public void establecerCostoInicial(Double c){
        costoIni = c;
    }
    
    public void establecerIva(double c){
        Iva = c / 100;
    }
    
    
    public void establecerIvaCostoFinal(){
        IvaCosFin = (costoIni * Iva) + costoIni;
    }
    
    public void establecerDireccionMac(String c){
        dirMac = c;
    }
    
    public void establecerInformacionIMEI(String c){
        infoImei = c;
    }
    
    public String obtenerSistemaOperativo(){
        return sistemOp;
    }
    
    public double obtenerTamanioPantalla(){
        return tamanioPant;
    }
    
    public double obtenerCostoInicial(){
        return costoIni;
    }
    
    public double obtenerIva(){
        return Iva;
    }
    
    public double obtenerIvaCostoFinal(){
        return IvaCosFin;
    }
    
    public String obtenerDireccionMac(){
        return dirMac;
    }
    
    public String obtenerInformacionIMEI(){
        return infoImei;
    }
}
