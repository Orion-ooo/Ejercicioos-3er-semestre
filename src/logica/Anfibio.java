
package logica;

public class Anfibio extends Animal implements Cuidable{
    private boolean salta;
    private boolean esVenenoso;
    
    public Anfibio(){}
    
    public Anfibio(boolean salta, boolean esVenenoso, String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento){
        super(nombre, edad, peso, esPeligroso, hambriento);
        this.salta = salta;
        this.esVenenoso = esVenenoso;
    }
    
    //Metodos
    @Override
    public void hacerSonido(){
        System.out.println(nombre +" esta croando");
    }
    
    @Override
    public void moverse(){
        if(salta){
            System.out.println( nombre + " esta saltando");
        }else{
            System.out.println(nombre + " esta caminando");
        }
    }
    
    @Override
    public void atacar(){
        if(esPeligroso){
            System.out.println(nombre + " puede atacar, tenga cuidado");
        }else {
            System.out.println(nombre + " no ataca");
            
        if(esVenenoso){
            System.out.println(nombre + " es venenoso, tenga cuidado");
        }
        System.out.println(nombre + " no esta atacando");
        }
    }
    
    @Override
    public void alimentar() {
        if(hambriento){
            System.out.println("Alimentando al anfibio " + nombre);
        }else{
            System.out.println("El anfibio " + nombre + " no tiene hambre");
        }    }
    
    @Override
    public void jugar(){
        System.out.println(nombre + " no juega");
    }
    
    //Getters y Setters

    public boolean getSalta() {
        return salta;
    }

    public void setSalta(boolean salta) {
        this.salta = salta;
    }
    
    public boolean getEsVenenoso(){
        return esVenenoso;
    }
    
    public void setEsVenenoso(boolean esVenenoso){
        this.esVenenoso = esVenenoso;
    }
}
