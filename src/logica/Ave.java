
package logica;

import java.util.Scanner;

public class Ave extends Animal implements Cuidable{
    private String color;
    private String tamanioRelativoAve;
    private boolean puedeVolar;
    
    public Ave(){}

    public Ave(String color, String tamanioRelativoAve, boolean puedeVolar, String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento) {
        super(nombre, edad, peso, esPeligroso, hambriento);
        this.puedeVolar = puedeVolar;
        this.color = color;
        this.tamanioRelativoAve = tamanioRelativoAve;
    }
    
    
    //Metodos
    
    @Override
    public void registrarAnimal(){
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el nombre del ave:");
        this.nombre = entrada.next();
        
        System.out.println("Ingrese la edad del ave");
        this.edad = entrada.nextInt();
        
        System.out.println("Ingrese el peso del ave");
        this.peso = entrada.nextDouble();
        
        System.out.println("¿Es peligroso? true (si) o false (no)");
        this.esPeligroso = entrada.nextBoolean();
        
        System.out.println("¿Está hambriento? true (si) o false (no)");
        this.hambriento = entrada.nextBoolean();
        
        System.out.println("¿De que color es el plumaje del ave?");
        this.color = entrada.next();
        
        System.out.println("¿Esta ave es pequeña, mediana o grande?");
        this.tamanioRelativoAve = entrada.next();
    }
    
        @Override
    public void hacerSonido() {
        System.out.println(nombre + " está cantando.");
    }

    @Override
    public void moverse() {
        if (puedeVolar) {
            System.out.println(nombre + " está volando.");
        } else {
            System.out.println(nombre + " está caminando.");
        }
    }

    @Override
    public void alimentar() {
        if(hambriento){
            System.out.println("Alimentando al ave " + nombre);
        }else{
            System.out.println("El ave " + nombre + " no tiene hambre");
        }
    }

    @Override
    public void jugar() {
        System.out.println("Jugando con el ave " + nombre);
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTamanioRelativoAve() {
        return tamanioRelativoAve;
    }

    public void setTamanioRelativoAve(String tamanioRelativoAve) {
        this.tamanioRelativoAve = tamanioRelativoAve;
    }

    public boolean isPuedeVolar() {
        return puedeVolar;
    }

    public void setPuedeVolar(boolean puedeVolar) {
        this.puedeVolar = puedeVolar;
    }

    @Override
    public String toString() {
        return "Ave{" + "color=" + color + ", tamanioRelativoAve=" + tamanioRelativoAve + ", puedeVolar=" + puedeVolar + '}';
    }
    
}
