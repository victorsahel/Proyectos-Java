
import java.util.Scanner;

public class Ciclos {
    public static void main(String[] args) {
        Scanner entrada = new Scanner (System.in);
        System.out.printf("Cuantós números quiere procesar 5? ");
        int cantidad= entrada.nextInt();

        System.out.printf("Ingresa %d datos: \n ", cantidad);
        System.out.printf("\n");
        //este es el ciclo for
        //  for (int i=1;i<=cantidad; i++)
        //{
        //  System.out.printf("Dato %d :", i);

        //int num = entrada.nextInt();
        //int resultado= num*2;
        //System.out.printf("Dato %d procesado : %d \n",  i, resultado);
        //System.out.printf("\n");
        //}
        //este es el ciclo while
        int c=1;
        while(c<=cantidad)
        {
            System.out.printf("Dato %d :", c);

            int num = entrada.nextInt();
            int resultado= num*2;
            System.out.printf("Dato %d procesado : %d \n",  c, resultado);
            System.out.printf("\n");
            c++;
        }

    }
}
