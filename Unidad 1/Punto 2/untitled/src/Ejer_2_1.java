import java.io.FileReader;
import java.io.IOException;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Ejer_2_1 {

    public static void main (String[]args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String nombre;
        System.out.println("Esribe el nombre del fichero a leer:");
        nombre = sc.nextLine();

        FileReader fr = new FileReader(nombre);


        while(fr.read() != -1){

            System.out.print((char)fr.read());

        }

        fr.close();

    }
}
