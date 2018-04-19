import java.util.Objects;

public class Auto
{
    private int numeroPuertas;
    private double largo;
    private double ancho;
    private String nroPlaca;

    public static void main(String [] args)
    {
        Auto auto1= new Auto();

        auto1.setNumeroPuertas(5);
        auto1.setAncho(1.5);
        auto1.setLargo(4.2);
        auto1.setNroPlaca("C5D-480");

        Auto auto2= new Auto();
        auto2.setNumeroPuertas(5);
        auto2.setAncho(1.6);
        auto2.setLargo(4.7);
        auto2.setNroPlaca("C5D-480");

        System.out.println(auto1.toString());

        System.out.println(auto2.toString());

        System.out.println("Son autos iguales? "+auto1.equals(auto2));

        System.out.println("Son autos iguales? "+auto1.hashCode());
        //hashCode() selecciona un número unico
        // auto.equals(auto1)= true ->auto.hascode()= auto1.hashCode()
        // auto.equals(auto1)= true ->auto.hascode()= auto1.hashCode() || =false -> auto.hascode()!= auto1.hashCode()

    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public String getNroPlaca() {
        return nroPlaca;
    }

    public void setNroPlaca(String nroPlaca) {
        this.nroPlaca = nroPlaca;
    }
    // override indica que se sobreescribira los métodos
    @Override
    public String toString() {
        return "Auto [numeroPuertas=" + numeroPuertas + ", largo=" + largo + ", ancho=" + ancho + ", nroPlaca="
                + nroPlaca + "]";
    }

    @Override
    public boolean equals(Object o) {
    Auto auto1= (Auto)o;//convierte objeto a auto
        if(getNroPlaca().equals(auto1.nroPlaca))
        {
            return true ;
        }
    return false;
    }


    @Override
    public int hashCode() {

        return Objects.hash(numeroPuertas, largo, ancho, nroPlaca);
    }
}
