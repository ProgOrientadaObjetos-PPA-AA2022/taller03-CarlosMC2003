/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class EquivalenteHora {
    private int horas;
    private int minutos;
    private int seg;
    private int dias;
    
    public void establecerHoras(int c){
        horas = c;
    }
    
    public void establecerMinutos(){
        minutos = horas * 60;
    }
    
    public void establecerSegundos(){
        seg = horas * 3600;
    }
    
    public void establecerDias(){
        dias = horas / 24;
    }
    
    public int obtenerHora(){
        return horas;
    }
    
    public int obtenerMinutos(){
        return minutos;
    }
    
    public int obtenerSegundos(){
        return seg;
    }
    
    public int obtenerDias(){
        return dias;
    }
}
