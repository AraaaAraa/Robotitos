/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

/**
 *
 * @author Arai
 */
public class Domesticos extends RobGeneral {
    
    private int tareasDomesticas;

    public Domesticos(int tareasDomesticas, String nombre, int energia, int serie) {
        super(nombre, energia, serie);
        this.tareasDomesticas = tareasDomesticas;
    }

    public int getTareasDomesticas() {
        return tareasDomesticas;
    }

    public void setTareasDomesticas(int tareasDomesticas) {
        this.tareasDomesticas = tareasDomesticas;
    }
    
    
}
