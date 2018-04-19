public class ConstructoresPadre
{
    public static void main(String[] args) {
        ConstructoresHijo cs= new ConstructoresHijo();
    }
    public  ConstructoresPadre() {
        System.out.println("Hola, soy el constructor Padre");
    }
}

    class ConstructoresHijo extends ConstructoresPadre
    {
        public ConstructoresHijo()
        {

            System.out.println("Hola, soy el constructor Hijo");
        }


    }


