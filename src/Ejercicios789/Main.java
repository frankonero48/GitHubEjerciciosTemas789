package Ejercicios789;

import java.util.Vector;


public class Main {

    public static void main(String[] args) {

        Vector<String> apellidos =new Vector();

        apellidos.add("Pérez");
        apellidos.add("sanz");
        apellidos.add("Duarte");
        apellidos.add("García");
        apellidos.add("Rodríguez");

        System.out.println("Los elementos del vector son "+apellidos);

        apellidos.remove(2);
        apellidos.remove(2);

        System.out.println("Los elementos del vector son "+apellidos);
    }
}
