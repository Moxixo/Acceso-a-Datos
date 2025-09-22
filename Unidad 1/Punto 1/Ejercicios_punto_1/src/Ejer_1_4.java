
import java.io.File;

public class Ejer_1_4 {

    public static void main (String[]args){

        File carpeta = new File("prueba");

        if(carpeta.exists() && carpeta.isDirectory()){

            System.out.println("La carpeta ya esiste");

        }
        else {
                carpeta.mkdir();

            System.out.println("Se ha creado la carpeta");
        }

    }

}
