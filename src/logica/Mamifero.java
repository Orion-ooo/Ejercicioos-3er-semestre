
package logica;

import java.util.Scanner;

public class Mamifero extends Animal implements Cuidable{
    private boolean tienePelo;
    private String tamanioRelativo;
    
    public Mamifero(){}
    
    public Mamifero(String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento, boolean tienePelo, String tamanioRelativo){
        super(nombre, edad, peso, esPeligroso, hambriento);
        this.tienePelo = tienePelo;
        this.tamanioRelativo = tamanioRelativo;
    }
    
    //Metodos
    
    @Override
    public void registrarAnimal(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del mamifero:");
        this.nombre = entrada.next();
        
        System.out.println("Ingrese la edad del mamifero");
        this.edad = entrada.nextInt();
        
        System.out.println("Ingrese el peso del mamifero");
        this.peso = entrada.nextDouble();
        
        System.out.println("¿Es peligroso? true (si) o false (no)");
        this.esPeligroso = entrada.nextBoolean();
        
        System.out.println("¿Está hambriento? true (si) o false (no)");
        this.hambriento = entrada.nextBoolean();
        
        System.out.println("¿tiene pelaje mamifero? true (si) o false (no)");
        this.tienePelo = entrada.nextBoolean();
        
        System.out.println("¿Este mamifero es pequeño, mediano o grande?");
        this.tamanioRelativo = entrada.next();
    }
    
     @Override
    public void hacerSonido() {
        System.out.println(nombre + " está rugiendo.");
    }

    @Override
    public void moverse() {
        System.out.println(nombre + " está caminando.");
    }

    @Override
    public void alimentar() {
        if(hambriento){
            System.out.println("Alimentando al mamífero " + nombre);
        }else{
            System.out.println("El mamifero " + nombre + " no tiene hambre");
        }
    }

    @Override
    public void jugar() {
        System.out.println("Jugando con el mamífero " + nombre);
    }
    
    @Override
    public void atacar(){
        if(esPeligroso){
            System.out.println(nombre + " puede atacar, tenga cuidado");
        }else {
            System.out.println(nombre + " no ataca");
        }
    }
    
    //Getters y Setters

    public boolean isTienePelo() {
        return tienePelo;
    }

    public void setTienePelo(boolean tienePelo) {
        this.tienePelo = tienePelo;
    }

    public String getTamanioRelativo() {
        return tamanioRelativo;
    }

    public void setTamanioRelativo(String tamanioRelativo) {
        this.tamanioRelativo = tamanioRelativo;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "tienePelo=" + tienePelo + ", tamanioRelativo=" + tamanioRelativo + '}';
    }
    
}

