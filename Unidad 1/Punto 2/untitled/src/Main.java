import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {

        String nombre = "ejemplo.txt";
        String frase = "Disturbing the peace";

        FileWriter fw = new FileWriter(nombre);

        fw.write(frase);

        fw.close();


        FileReader fr = new FileReader("ejemplo.txt");

        int a;
        while( (a = fr.read()) != -1){

            a = fr.read();
            System.out.print((char)a);
        }
        fr.close();

    }
}