/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Terreno {
    private double ancho;
    private double largo;
    private double area;
    private double valorMetro;
    private double costo;
    
    public void establecerAncho(Double c){
        ancho = c;
    }
    
    public void establecerLargo(double c){
        largo = c;
    }
    
    public void establecerValorMetroCuadrado(double c){
        valorMetro = c;
    }
    
    public void calcularArea(){
        area = ancho * largo;
    }
    
    public void calcularCostoTerreno(){
        costo = area * valorMetro;
    }
    
    public double obtenerAncho(){
        return ancho;
    }
    
    public double obtenerLargo(){
        return largo;
    }
    
    public double obtenerValorMetroCuadrado(){
        return valorMetro;
    }
    
    public double obtenerArea(){
        return area;
    }
    
    public double obtenerCostoTerreno(){
        return costo;
    }
}
