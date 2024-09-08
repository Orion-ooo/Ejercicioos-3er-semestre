
package logica;

import java.util.List;

public class Cuidador {
    private String nombre;
    private int edad;
    private String experiencia;
    private List <Jaula> jaulas;
    
    public Cuidador(){}
    
    public Cuidador(String nombre, int edad, String experiencia, List<Jaula> jaulas){
        this.nombre = nombre;
        this.edad = edad;
        this.experiencia = experiencia;
        this.jaulas = jaulas;
    }
    
    public void alimentarAnimal(Animal animal){
        System.out.println(this.nombre + " esta alimentando al animal " + animal.getNombre());
        
    }
    
    public void jugarConAnimal(Cuidable animal) {
        System.out.println(nombre + " está jugando con el animal.");
        animal.jugar();
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

    public String getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(String experiencia) {
        this.experiencia = experiencia;
    }

    public List<Jaula> getJaulas() {
        return jaulas;
    }

    public void setJaulas(List<Jaula> jaulas) {
        this.jaulas = jaulas;
    }
    
}
