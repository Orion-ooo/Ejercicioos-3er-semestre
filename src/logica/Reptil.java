
package logica;

import java.util.Scanner;

public class Reptil extends Animal implements Cuidable{
    private String tamanioRelativoReptil;
    private boolean esVenenoso;
    private boolean seArrastra;
    
    public Reptil(){}
    
    public Reptil(String tamanioRelativoReptil, boolean esVenenoso, boolean seArrastra, String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento){
        super(nombre,edad,peso, esPeligroso ,hambriento);
        this.tamanioRelativoReptil = tamanioRelativoReptil;
        this.esVenenoso = esVenenoso;
        this.seArrastra = seArrastra;
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
        
        System.out.println("¿Este reptil es venenoso? true (si) o false (no)");
        this.esVenenoso = entrada.nextBoolean();
        
        System.out.println("¿Este reptil es pequeño, mediano o grande?");
        this.tamanioRelativoReptil = entrada.next();
        
        System.out.println("¿Este reptil se arrastra? true (si) o false (no)");
        this.seArrastra = entrada.nextBoolean();
    }
    
    @Override
    public void hacerSonido(){
        System.out.println(nombre + " está siseando.");
    }
    
    @Override
    public void alimentar() {
        if(hambriento){
            System.out.println("Alimentando al reptil " + nombre);
        }else{
            System.out.println("El reptil " + nombre + " no tiene hambre");
        }    }

    @Override
    public void moverse() {
        if(seArrastra){
            System.out.println(nombre + " esta arrastrandose");
        }else{
            System.out.println(nombre + " esta caminando");
        }
    }
    
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

    public String getTamanioRelativoReptil() {
        return tamanioRelativoReptil;
    }

    public void setTamanioRelativoReptil(String tamanioRelativoReptil) {
        this.tamanioRelativoReptil = tamanioRelativoReptil;
    }

    public boolean getEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean getSeArrastra() {
        return seArrastra;
    }

    public void setSeArrastra(boolean seArrastra) {
        this.seArrastra = seArrastra;
    }

    @Override
    public String toString() {
        return "Reptil{" + "tamanioRelativoReptil=" + tamanioRelativoReptil + ", esVenenoso=" + esVenenoso + ", seArrastra=" + seArrastra + '}';
    }
    
}
