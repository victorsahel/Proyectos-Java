package modulo4.Interfaces;

public class Circulo implements Figura
{
    @Override
    public void calcularArea() {
        System.out.println("PI x R x R");
        System.out.println(PI);
        System.out.println(Figura.PI);
    }
}
