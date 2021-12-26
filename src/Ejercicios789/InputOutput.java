package Ejercicios789;

import java.io.*;

public class InputOutput {

    public static void main(String[] args) throws IOException {
        try {
            InputStream fileIn = new FileInputStream("C:\\AVScanner.ini");
            byte[] datos = fileIn.readAllBytes();
            fileIn.close();

            try (PrintStream fileout = new PrintStream("C:\\destino.txt")) {
                fileout.write(datos);
                fileout.close();
            }

        }catch (Exception e){
            System.out.println("Excepción: "+ e.getMessage());
        }
    }
}
