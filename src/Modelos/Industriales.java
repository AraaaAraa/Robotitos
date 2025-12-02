/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Arai
 */
public class Industriales extends RobGeneral {
    private int capacidadMax;

    public Industriales(int capacidadMax, String nombre, int energia, int serie) {
        super(nombre, energia, serie);
        this.capacidadMax = capacidadMax;
    }

    public int getCapacidadMax() {
        return capacidadMax;
    }

    public void setCapacidadMax(int capacidadMax) {
        this.capacidadMax = capacidadMax;
    }
    
    
   
    
}
