package Ejercicios789;

public class DividePorCero {
    
    public static void main(String[] args) {

        int num1 = 0;
        int num2 = 0;
        try {
            divide(5,0);
            int resultado = 0;
            System.out.println(resultado);

        }catch (Exception e){
            System.out.println("Esto no puede hacerse " +e.getClass());

        }finally {
            System.out.println("Esto es una Demo de Código");
        }
    }

    public static int divide(int num1, int num2) {
        return num1/num2;
        
    }
}
