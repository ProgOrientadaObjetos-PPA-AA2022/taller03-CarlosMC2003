/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema1;
/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    public static void main (String[] args) {
        Terreno tr = new Terreno();
        
        tr.establecerAncho(23.15);

        tr.establecerLargo(43.23);

        tr.establecerValorMetroCuadrado(2.50);
        
        tr.calcularArea();
        tr.calcularCostoTerreno();
        
        System.out.printf("\nFactura Coste Terreno\n\n\tAncho del Terreno: %.2f\n"
                + "\tLargo del terreno: %.2f\n\tValor de los m2: %.2f\n"
                + "\tValor del area: %.2f\n" + "\tCosto del terreno: %.2f\n" , tr.obtenerAncho(),
                tr.obtenerLargo(), tr.obtenerValorMetroCuadrado(),
                tr.obtenerArea(), tr.obtenerCostoTerreno());
    }
}
