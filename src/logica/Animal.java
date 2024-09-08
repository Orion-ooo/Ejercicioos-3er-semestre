
package logica;

public abstract class Animal {
    
    protected String nombre;
    protected int edad;
    protected double peso;
    protected boolean esPeligroso;
    protected boolean hambriento;


    public Animal() {
    }

    public Animal(String nombre, int edad, double peso, boolean esPeligroso, boolean hambriento) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
        this.esPeligroso = esPeligroso;
        this.hambriento = hambriento;
    }
    
    //Metodos
    
    public abstract void hacerSonido();

    public void moverse() {
        System.out.println(nombre + " está moviéndose.");
    }
    
    public void atacar(){
        System.out.println("El animal puede atacar");
    }
    
    public void hambre(Cuidador cuidador){
        if(hambriento){
            cuidador.alimentarAnimal(this);
        } else{
            System.out.println("El animal " + nombre + " no tiene hambre");
        }
    }
    
    //Getters y Setters

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    public boolean getEsPeligroso(){
        return esPeligroso;
    }
    
    public void setEsPeligroso(boolean esPeligroso){
        this.esPeligroso = esPeligroso;
    }
    
    public boolean getHmabriento(){
        return hambriento;
    }
    
    public void setHambriento(boolean hambriento){
        this.hambriento = hambriento;
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", edad=" + edad + ", peso=" + peso + ", esPeligroso=" + esPeligroso + ", hambriento=" + hambriento + '}';
    }
}
