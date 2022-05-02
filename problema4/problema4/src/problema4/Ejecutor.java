/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema4;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    public static void main(String[] args) {
        EquipoCelular cel = new EquipoCelular();
        
        cel.establecerSistemaOperativo("Android");
        cel.establecerTamanioPantalla(7.5);
        cel.establecerCostoInicial(1315.00);
        cel.establecerIva(12);
        cel.establecerDireccionMac("00:1e:c2:9e:28:6b");
        cel.establecerInformacionIMEI("010928/00/389023/3");
        
        cel.obtenerIva();
        System.out.println(cel.obtenerIva());
        cel.establecerIvaCostoFinal();
        
        System.out.printf("Sistema Operativo: %s\n" +
                "Tamaño de Pantalla: %.1f\n" +
                "Dirección Mac: %s\n" +
                "Información IMEI: %s\n" +
                "Costo Inicial: %.2f\n" +
                "----------------\n" +
                "COSTO FINAL en USD: %.2f\n",cel.obtenerSistemaOperativo(), cel.obtenerTamanioPantalla(),
                cel.obtenerDireccionMac(),cel.obtenerInformacionIMEI(),
                cel.obtenerCostoInicial(),cel.obtenerIvaCostoFinal());
    }
}
