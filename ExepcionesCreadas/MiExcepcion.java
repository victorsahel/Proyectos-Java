package ExepcionesCreadas;

public class MiExcepcion extends Exception
{
    public MiExcepcion()
    {
        super("Yo tengo un error y estoy en la clase MiExecpcion");
    };

    public String mensajeExcepcion()
    {
        return "Error provocado";
    }
    public String mensajeExcepcion2()
    {
        return "Error provocado 2";
    }
}
