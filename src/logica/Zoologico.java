
package logica;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Zoologico {
    private List<Animal> animales;
    private List<Cuidador> cuidadores;
    private List<Jaula> jaulas;
    
    public Zoologico(){
        this.animales = new ArrayList<>();
        this.cuidadores = new ArrayList<>();
        this.jaulas = new ArrayList<>();
    }
    
    public Zoologico(List<Animal> animales, List<Cuidador> cuidadores, List<Jaula> jaulas){
        this.animales = animales;
        this.cuidadores = cuidadores;
        this.jaulas = jaulas;
    }
    
    //Metodos
    
    public void agregarAnimal(Animal animal){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del animal:");
        String nombre = entrada.next();
        
        animal.setNombre(nombre);
        animales.add(animal);
    }
    
    public void agregarCuidador(Cuidador cuidador){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del cuidador:");
        cuidador.setNombre(nombre) = new Scanner(System.in);
        cuidadores.add(cuidador.setNombre(nombre));
    }
    
    //Getters y Setters

    public List<Animal> getAnimales() {
        return animales;
    }

    public void setAnimales(List<Animal> animales) {
        this.animales = animales;
    }

    public List<Cuidador> getCuidadores() {
        return cuidadores;
    }

    public void setCuidadores(List<Cuidador> cuidadores) {
        this.cuidadores = cuidadores;
    }

    public List<Jaula> getJaulas() {
        return jaulas;
    }

    public void setJaulas(List<Jaula> jaulas) {
        this.jaulas = jaulas;
    }

    @Override
    public String toString() {
        return "Zoologico{" + "animales=" + animales + ", cuidadores=" + cuidadores + ", jaulas=" + jaulas + '}';
    }
    
}
