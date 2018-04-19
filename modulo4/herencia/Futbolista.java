package modulo4.herencia;

public class Futbolista extends Persona
{
    private String equipo;
    private int dorsal;
    private String posicion;

    protected int estatura=180;

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    protected void correr()
    {
        System.out.println("Soy un Futbolista y estoy corriendo");
    }
}
