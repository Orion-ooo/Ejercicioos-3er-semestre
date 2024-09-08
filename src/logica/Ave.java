
package logica;

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
    
}
