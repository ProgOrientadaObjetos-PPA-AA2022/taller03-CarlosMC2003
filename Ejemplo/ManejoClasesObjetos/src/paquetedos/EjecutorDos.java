/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquetedos;
import paqueteuno.FacturaTelefono;
/**
 *
 * @author Carlos Morocho - PC
 */
public class EjecutorDos {
    public static void main(String[] args) {
        FacturaTelefono telefono = new FacturaTelefono();
        telefono.establecerNumeroTelefono("09921234214");
        telefono.establecerMinutosMes(2.30);
        telefono.establecerValorMinuto(0.25);
        
        System.out.printf("Factura de Teléfono\n\n\tNúmero de teléfono: %s\n"
                + "\tMinutos mensuales: %.2f\n\tValor por minuto: %.2f\n"
                + "\tValor a cancelar: %.2f\n", telefono.obtenerNumeroTelefono(),
                telefono.obtenerMinutosMes(), telefono.obtenerValorMinuto(),
                telefono.obtenerValorFactura());
    }
}
