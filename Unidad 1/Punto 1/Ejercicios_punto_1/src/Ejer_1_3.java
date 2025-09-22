import java.util.Scanner;
import java.io.File;
import java.io.IOException;

public class Ejer_1_3 {

    public static void main (String[]args){

        Scanner teclado = new Scanner (System.in);
        String nombre;
        System.out.println("Escribe el nombre del archivo que buscas:");
        nombre = teclado.nextLine();

        File archivo = new File(nombre);

        if(!archivo.exists()){

            System.out.println("Escribe un nombre para el archivo");
            nombre = teclado.nextLine();

            try {
                archivo.createNewFile();
            }
            catch (IOException e){}
        }
        else {

            System.out.println("El archivo ya existe");
        }

    }
}
