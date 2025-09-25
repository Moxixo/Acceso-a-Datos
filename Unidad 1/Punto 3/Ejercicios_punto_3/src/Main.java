import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {

        File archivo = new File("escribir.txt");
        PrintWriter pw = new PrintWriter(archivo);

        pw.println(123);

        pw.close();



    }
}