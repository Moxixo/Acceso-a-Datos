import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejer_2_3 {

    public static void main (String[]args) throws IOException {

        Scanner sc = new Scanner(System.in);
        FileWriter fw;

        String nombre;

        System.out.println("Cuantos ficheros quieres crear?");
        int num = sc.nextInt();

        for (int i = 0; i < num; i++){

            nombre = "nombre" + i + ".txt";

            File x = new File(nombre);

            fw = new FileWriter(x);

            fw.write("Este es el fichero " + nombre);

            fw.close();
        }

    }

}
