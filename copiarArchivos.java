package EjercicioLibreTemas789;

import java.io.*;

public class copiarArchivos {

    public static void main(String[] args) throws IOException {

        File origen = new File("C:/titulos peliculas.txt");
        File destino = new File("destino.txt");

        BufferedReader bf = new BufferedReader(new FileReader("C:/titulos peliculas.txt"));
        String sCadena;
        while ((sCadena = bf.readLine())!=null) {
            System.out.println(sCadena);
        }


        InputStream in = new FileInputStream(origen);
        OutputStream out = new FileOutputStream(destino);


        byte[] buf = new byte[1024];
        int len;

        while ((len = in.read(buf)) > 0) {
            out.write(buf, 0, len);
        }


    }
}
