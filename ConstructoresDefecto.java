import org.omg.CORBA.SystemException;

import java.util.Spliterator;

public class ConstructoresDefecto
{
    public static void main(String[] args) {
        ConstructoresDefecto constructoresDefecto=new ConstructoresDefecto();
    }
    public ConstructoresDefecto()
    {
        System.out.println("Hola");
    }
    public ConstructoresDefecto(int parametro)
    {
        System.out.println("Hola"+parametro);
    }
}
