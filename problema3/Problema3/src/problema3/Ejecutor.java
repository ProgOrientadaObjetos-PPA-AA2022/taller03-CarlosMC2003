/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema3;

/**
 *
 * @author Carlos Morocho - PC
 */
public class Ejecutor {
    public static void main(String[] args) {
        AdminInsti admin = new AdminInsti();
        
        admin.establecerNombre("APC");
        admin.establecerTipoInstitucion("Privada");
        admin.establecerNumAlum(350);
        admin.establecerNumDocentes(12);
        admin.establecerNumSede(3);
        admin.establecerGastos(13050.75);
        admin.establecerPresupuesto(100000.00);
        
        System.out.printf("Nombre de la Institución: %s\n" +
                "Tipo de Institución: %s\n" +
                "Numero de Alumnos: %d\n" +
                "Numero de Docentes: %d\n" +
                "Numero de Sedes: %d\n" +
                "Gastos Proyectados: %.2f\n" +
                "Presupuesto: %,.2f\n", admin.obtenerNombre(),admin.obtenerTipoInsti(),
                admin.obtenerNumerosAlumnos(),admin.obtenerNumerosDocentes(),
                admin.obtenerNumeroSedes(),admin.obtenerGastos(),admin.obtenerPresupuesto());
    }
}
