
package logica;

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
    
}
