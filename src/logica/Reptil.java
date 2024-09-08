
package logica;

public class Reptil extends Animal implements Cuidable{
    private double tamanioRelativoReptil;
    private boolean esVenenoso;
    private boolean seArrastra;
    
    public Reptil(){}
    
    public Reptil(double tamanioRelativoReptil, boolean esVenenoso, boolean seArrastra, String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento){
        super(nombre,edad,peso, esPeligroso ,hambriento);
        this.tamanioRelativoReptil = tamanioRelativoReptil;
        this.esVenenoso = esVenenoso;
        this.seArrastra = seArrastra;
    }
    
    //Metodos
    
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

    public double getTamanioRelativoReptil() {
        return tamanioRelativoReptil;
    }

    public void setTamanioRelativoReptil(double tamanioRelativoReptil) {
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
    
}
