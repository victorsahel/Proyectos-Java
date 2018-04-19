import java.util.Scanner;

public class Adivinanza {

    public static void main(String[] args)
    {
        Scanner entrada= new Scanner(System.in);
        boolean juegoactivo= true;
        System.out.println("Hola, ¿Cúal es tu nombre?");
        String nombre = entrada.nextLine();
        System.out.printf("Bienvenido %s, vamos a comenzar\n", nombre);
        while(juegoactivo)
        {
            int intentos =0;
            int min=0;
            int max=100;
            int numerojuego= (int)(Math.random()* ((max-min)+1));
            System.out.printf("%s, he escogido un número entre %d y %d, adivínalo", nombre , min , max );
            int numeroJugador;
            do {
                System.out.println("Escoge un número");
                numeroJugador = entrada.nextInt();
                if (numerojuego < numeroJugador) {
                    System.out.println("Muy alto, adivina otra vez");
                } else if (numerojuego > numeroJugador) {
                    System.out.println("Muy bajo, adivina otra vez");
                }
                intentos++;
            }while (numerojuego != numeroJugador);
            juegoactivo = false;
        }

    }

}
