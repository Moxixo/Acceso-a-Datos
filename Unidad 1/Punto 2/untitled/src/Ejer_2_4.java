import java.io.*;
import java.util.Scanner;

public class Ejer_2_4 {

    public static void main (String [] args) throws IOException {

        Scanner sc = new Scanner(System.in);
        String frase;
        BufferedWriter bw = new BufferedWriter(new FileWriter("24.txt"));
        BufferedReader br = new BufferedReader(new FileReader("24.txt"));
        do{

            System.out.println("Escribe una frase:");
            frase = sc.nextLine();

            bw.write(frase);
            bw.write("\n");



        } while (!frase.equals("fin"));

        bw.close();
0
        while(br.read() != -1){

            System.out.println(br.readLine());

        }
        br.close();

    }

}
