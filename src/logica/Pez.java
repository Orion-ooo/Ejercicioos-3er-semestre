
package logica;

import java.util.Scanner;

public class Pez extends Animal implements Cuidable{
    private boolean esVenenoso;
    private String tamanioRelativoPez;
    private boolean emiteSonido;
    
    public Pez(){}
    
    public Pez(boolean esVenenoso, String tamanioRelativoPez, boolean emiteSonido, String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento){
        super(nombre, edad, peso, esPeligroso, hambriento);
        this.esVenenoso = esVenenoso;
        this.tamanioRelativoPez = tamanioRelativoPez;
        this.emiteSonido = emiteSonido;
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
        
        System.out.println("¿Este pez es venenoso? true (si) o false (no)");
        this.esVenenoso = entrada.nextBoolean();
        
        System.out.println("¿Este mamifero es pequeño, mediano o grande?");
        this.tamanioRelativoPez = entrada.next();
        
        System.out.println("¿Este pez emite sonido? true (si) o false (no)");
        this.emiteSonido = entrada.nextBoolean();
    }
    
    @Override
    public void hacerSonido(){
        if(emiteSonido){
            System.out.println(nombre + " emite su sonido");
        }else {
            System.out.println(nombre + " no hace sonidos");
        }
    }
    
    @Override
    public void moverse(){
        System.out.println(nombre + " esta nadando");
    }
    
    @Override
    public void alimentar(){
        if(hambriento){
            System.out.println("Alimentando al pez " + nombre);
        }else{
            System.out.println("El pez " + nombre + " no tiene hambre");
        }    }
    
    @Override
    public void jugar(){
        System.out.println(nombre + " no juega");
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

    public boolean getEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public String getTamanioRelativoPez() {
        return tamanioRelativoPez;
    }

    public void setTamanioRelativoPez(String tamanioRelativoPez) {
        this.tamanioRelativoPez = tamanioRelativoPez;
    }

    public boolean getEmiteSonido() {
        return emiteSonido;
    }

    public void setEmiteSonido(boolean emiteSonido) {
        this.emiteSonido = emiteSonido;
    }

    @Override
    public String toString() {
        return "Pez{" + "esVenenoso=" + esVenenoso + ", tamanioRelativoPez=" + tamanioRelativoPez + ", emiteSonido=" + emiteSonido + '}';
    }
    
}
