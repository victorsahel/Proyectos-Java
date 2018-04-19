package modulo4.polimorfismo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Polimorfismo
{
    public static void main(String[] args)
    {
        EsProfesional es= new EsProfesional();
        Abogado abo = new Abogado();
        Ingeniero ing = new Ingeniero();
        Medico med= new Medico();



        abo.mostrarProfesion(abo.getTipo());

    }
}
