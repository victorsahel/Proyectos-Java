package ExepcionesCreadas;

public class Principal
{
    public static void main(String[] args)
    {
        try {
            throw new MiExcepcion();

        }catch(MiExcepcion e){
            System.out.println(e.getMessage());
            //no tenemos este metodo pero lo heredamos de Exeption porque pusimos super();
        }

        catch(Exception e){
            System.out.println(e.getMessage());
        }

        finally {
            System.out.println("Todo bien");
        }

    }
}
