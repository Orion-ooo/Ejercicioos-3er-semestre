
package logica;

import java.util.List;

public class Jaula {
    private String nombre;
    private String estado;
    private int capacidadMaxima;
    private Cuidador cuidador;
    private List<Animal> animales;
    
    public Jaula(){}
    
    public Jaula(String nombre, String estado, int capacidadMaxima, Cuidador cuidador, List<Animal> animales){
        this.nombre = nombre;
        this.estado = estado;
        this.capacidadMaxima = capacidadMaxima;
        this.cuidador = cuidador;
        this.animales = animales;
    }
    
    //Metodos
    
    
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public void setCapacidadMaxima(int capacidadMaxima) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public Cuidador getCuidador() {
        return cuidador;
    }

    public void setCuidador(Cuidador cuidador) {
        this.cuidador = cuidador;
    }

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    @Override
    public String toString() {
        return "Jaula{" + "nombre=" + nombre + ", estado=" + estado + ", capacidadMaxima=" + capacidadMaxima + ", cuidador=" + cuidador + ", animales=" + animales + '}';
    }
    
    
}
