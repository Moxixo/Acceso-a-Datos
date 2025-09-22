
import java.io.File;

public class Ejer_1_5 {

    public static void main (String[]args){

        File archivo = new File("DISTURBING THE PEACE");

        if(archivo.exists()){

            archivo.delete();
        }
        else {

            System.out.println("No existe el archivo");
        }

    }
}
