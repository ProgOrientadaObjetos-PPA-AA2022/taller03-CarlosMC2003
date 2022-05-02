/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author Carlos Morocho - PC
 */
public class AdminInsti {
    private String nombre;
    private String tipoIns;
    private int numAlum;
    private int numDoc;
    private int numSede;
    private double gasto;
    private double presupuesto;
    
    public void establecerNombre(String c){
        nombre = c;
    }
    
    public void establecerTipoInstitucion(String c){
        tipoIns = c;
    }
    
    public void establecerNumAlum(int c){
        numAlum = c;
    }
    
    public void establecerNumDocentes(int c){
        numDoc = c;
    }
    
    public void establecerNumSede(int c){
        numSede = c;
    }
    
    public void establecerGastos(double c){
        gasto = c;
    }
    
    public void establecerPresupuesto(double c){
        presupuesto = c;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public String obtenerTipoInsti(){
        return tipoIns;
    }
    
    public int obtenerNumerosAlumnos(){
        return numAlum;
    }
    
    public int obtenerNumerosDocentes(){
        return numDoc;
    }
    
    public int obtenerNumeroSedes(){
        return numSede;
    }
    
    public double obtenerGastos(){
        return gasto;
    }
    
    public double obtenerPresupuesto(){
        return presupuesto;
    }
}
