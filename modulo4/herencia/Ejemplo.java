package modulo4.herencia;

public class Ejemplo
{
    public static void main(String[] args) {
        Futbolista futbolista= new Futbolista();
        System.out.println(futbolista.estatura);

        Persona per= new Persona();
        System.out.println(per.estatura);

        Persona persona= new Futbolista();
        // referencia a clase persona, pero estamos creando un objeto de la clase futbolista
        persona.correr();
        System.out.println(persona.estatura);

    }
}
