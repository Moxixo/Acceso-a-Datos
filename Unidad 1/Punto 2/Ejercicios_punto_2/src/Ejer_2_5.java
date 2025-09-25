import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejer_2_5 {

    public static void main(String[] args) throws IOException {

        FileReader fr = new FileReader("hola.txt");

        FileWriter fw = new FileWriter("hola2.txt");

        int letra;
        while ((letra = fr.read()) != -1){

            System.out.print((char) letra);
            if (letra == '\t'){

                letra = ' ';
                fw.write(letra);

            }

            fw.write(letra);


        }

        fr.close();
        fw.close();

    }




}
