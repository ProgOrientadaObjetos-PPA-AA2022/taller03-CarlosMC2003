/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema2;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    public static void main (String[] args) {
        EquivalenteHora eq = new EquivalenteHora();
        
        eq.establecerHoras(72);
        eq.establecerDias();
        eq.establecerMinutos();
        eq.establecerSegundos();
        
        System.out.printf("Horas: %d" + "\nSegundos: %d" 
                + "\nMinutos: %d" + "\nDias: %d\n", 
                eq.obtenerHora(),eq.obtenerSegundos(),eq.obtenerMinutos(),eq.obtenerDias());
    }
}
