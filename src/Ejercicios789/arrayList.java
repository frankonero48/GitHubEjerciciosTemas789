package Ejercicios789;

import java.util.ArrayList;
import java.util.List;
import java.util.LinkedList;
import java.util.Arrays;
import java.util.stream.Collectors;


public class arrayList {

    public static void main(String[] args) {

        ArrayList<String> nombres =new ArrayList<>();

        nombres.add("Mariano");
        nombres.add("Antonio");
        nombres.add("Manolo");
        nombres.add("Rocío");
        System.out.println(nombres);

        List<String> linkedList = new LinkedList<>();
        linkedList.addAll(nombres);
        System.out.println(linkedList);

    }
}
