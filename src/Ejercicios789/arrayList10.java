package Ejercicios789;


import java.util.ArrayList;

public class arrayList10 {

    public static void main(String[] args) {

        ArrayList<Integer> informe=new ArrayList<>();

        for(int i=0;i<=9; i++){

            informe.add(i+1);
        }
        System.out.println(informe);

        for(int i=0; i< informe.size();i++){

            if(informe.get(i) % 2==0){
                informe.remove(i);
            }
        }
        System.out.println(informe);
    }
}
