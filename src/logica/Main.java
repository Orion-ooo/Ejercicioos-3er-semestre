
package logica;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        limpiarTerminal();
        System.out.println("|Hola, bienvenido al|");
        System.out.println("|    Zoologico      |");
        System.out.println("");
        System.out.println("¿Usuario o administrador?");
        System.out.println("Elige una opción");
        System.out.println("Usuario: true      Admin: false");
        boolean opcion = entrada.nextBoolean();
        
        if(opcion){
            
            }else if (opcion){
                System.out.println("Que desea registrar");
                System.out.println("1: Animal");
                System.out.println("2: Cuidador");
                System.out.println("3: Jaula");
                int opcion2 = entrada.nextInt();
                switch (opcion2) {
                    case 1:
                        
                        break;
                    case 2:
                        
                        break;
                    default:
                            System.out.println("Opcion incorrecta... vuelva a intentarlo");
                }
            }else{
            System.out.println("Opcion incorrecta... vuelva a intentarlo");
            }
        }

    public static void limpiarTerminal() {
        try {
            ProcessBuilder pb = new ProcessBuilder("cmd", "/c", "cls");
            Process startProcess = pb.inheritIO().start();
            startProcess.waitFor();
        } catch (IOException | InterruptedException e) {
            System.out.println("");
                }
        
    }
    
}
