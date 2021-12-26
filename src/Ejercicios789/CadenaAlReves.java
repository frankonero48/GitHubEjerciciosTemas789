package Ejercicios789;


public class CadenaAlReves {


    public static void main(String[] args) {

        String texto="hola mundo";
        String invertida = "";

        for (int i = texto.length() - 1; i >= 0; i--) {

            invertida += texto.charAt(i);

        }
        System.out.println("El texto original es: " + texto);
        System.out.println("El texto invertido es: " + invertida);









    }





}
