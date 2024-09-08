
package logica;

public class Mamifero extends Animal implements Cuidable{
    private boolean tienePelo;
    private double tamanioRelativo;
    
    public Mamifero(){}
    
    public Mamifero(String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento, boolean tienePelo, double tamanioRelativo){
        super(nombre, edad, peso, esPeligroso, hambriento);
        this.tienePelo = tienePelo;
        this.tamanioRelativo = tamanioRelativo;
    }
    
    //Metodos
    
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

    public double getTamanioRelativo() {
        return tamanioRelativo;
    }

    public void setTamanioRelativo(double tamanioRelativo) {
        this.tamanioRelativo = tamanioRelativo;
    }

    @Override
    public String toString() {
        return "Mamifero{" + "tienePelo=" + tienePelo + ", tamanioRelativo=" + tamanioRelativo + '}';
    }
    
}

