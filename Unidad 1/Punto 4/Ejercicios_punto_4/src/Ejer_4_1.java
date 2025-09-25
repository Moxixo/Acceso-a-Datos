import java.io.BufferedWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Ejer_4_1 {
    public static void main(String[] args) throws IOException {

        int numlineas = 10;

        BufferedWriter bw = new BufferedWriter(new PrintWriter("ejer_1.txt"));

        for (int i = 0 ; i < numlineas; i++){

            bw.write("Esta es la linea " + i + "\n");
        }

        bw.close();

    }
}