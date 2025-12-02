/*
Serialización: Es el proceso de convertir un objeto en un flujo de bytes para que su estado pueda ser guardado o transmitido.
 */
package Modelos;

import Exepciones.EnergiaIncorrecta;
import Exepciones.SerieInvalido;
import java.io.Serializable; //declaración en Java que importa la interfaz Serializable, la cual se utiliza para marcar una clase como serializable
public abstract class RobGeneral implements Serializable{
    //Atributos
   private String nombre;
   private int energia;
   private int serie;

    public RobGeneral(String nombre, int energia, int serie) {
        this.nombre = nombre;
        this.energia = energia;
        this.serie = serie;
    }

   
//Setters
    public void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100){
            this.energia = energia;
        } else{
            throw new EnergiaIncorrecta("El nivel de energía debe estar entre 0 y 100.");
        }
    }
    
   public void setSerie(int serie) {
        if (serie > 0){
            this.serie = serie;
        } else{
            throw new SerieInvalido("El número de serie debe ser positivo.");
        }
    }
   
   public void setNombre(String nombre) {
        this.nombre = nombre;
    }
//Getters
    public String getNombre() {
        return nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public int getSerie() {
        return serie;
    }

    
    public abstract String getTipo();
}
