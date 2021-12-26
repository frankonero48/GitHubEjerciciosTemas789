package Ejercicios789;

public class ArrayBidimensiona {

    public static void main(String[] args) {

        int arrayEnteros[][]= new int [3][3];
        arrayEnteros[0][0]=1;
        arrayEnteros[0][1]=2;
        arrayEnteros[0][2]=3;
        arrayEnteros[1][0]=4;
        arrayEnteros[1][1]=5;
        arrayEnteros[1][2]=6;
        arrayEnteros[2][0]=7;
        arrayEnteros[2][1]=8;
        arrayEnteros[2][2]=9;

        for(int i=0;i< arrayEnteros.length;i++){
            for(int j=0;j< arrayEnteros.length;j++){

                System.out.println("En la posición i= "+i+" y j= "+j);
                System.out.println("Esta el valor "+arrayEnteros[i][j]);

            }
        }
    }
}
