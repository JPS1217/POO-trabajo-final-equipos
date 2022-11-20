/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package universidadnacional;

/**
 *
 * @author jps12
 */
public class Ohm {
    
    public static double calcularVoltage(double corriente, double resistencia){
        double voltage;
        voltage = corriente*resistencia;
        return voltage;
    }
    
    public static double calcularCorriente(double voltage, double resistencia){
        double corriente;
        corriente = voltage/resistencia;
        return corriente;
    }
    
}
