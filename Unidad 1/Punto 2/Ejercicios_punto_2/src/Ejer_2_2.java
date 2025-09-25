import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejer_2_2 {

    public static void main (String[]args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int contador = 0;
        char vocal;

        System.out.println("Escribe la vocal que quieres buscar:");
        vocal = sc.next().charAt(0);

        FileReader fr = new FileReader("ejemplo.txt");


        while (fr.read() != -1){

            if(vocal == (char) fr.read()){

                contador++;

            }
        }
        System.out.println("Hay: " + contador);
        fr.close();


    }
}
