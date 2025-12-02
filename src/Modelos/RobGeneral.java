/*
Serialización: Es el proceso de convertir un objeto en un flujo de bytes para que su estado pueda ser guardado o transmitido.
 */
package Modelos;

import Exepciones.EnergiaIncorrecta;
import Exepciones.SerieInvalido;
import java.io.Serializable; //declaración en Java que importa la interfaz Serializable, la cual se utiliza para marcar una clase como serializable
import java.util.Objects;

public abstract class RobGeneral implements Serializable{
    //Atributos
   private static final long serialVersionUID = 1L;
   private String nombre;
   private int energia;
   private int serie;

    public RobGeneral(String nombre, int energia, int serie) {
        setNombre(nombre);
        setEnergia(energia);
        setSerie(serie);
    }

   
//Setters
    public final void setEnergia(int energia) {
        if (energia >= 0 && energia <= 100){
            this.energia = energia;
        } else{
            throw new EnergiaIncorrecta("El nivel de energía debe estar entre 0 y 100.");
        }
    }
    
   public final void setSerie(int serie) {
        if (serie > 0){
            this.serie = serie;
        } else{
            throw new SerieInvalido("El número de serie debe ser positivo.");
        }
    }
   
   public final void setNombre(String nombre) {
        if (nombre == null || nombre.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre no puede ser nulo o vacío.");
        }
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

    @Override
    public String toString() {
        return getClass().getSimpleName() + "{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", serie=" + serie +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RobGeneral that = (RobGeneral) o;
        return energia == that.energia &&
               serie == that.serie &&
               Objects.equals(nombre, that.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre, energia, serie);
    }

    
    public abstract String getTipo();
}
