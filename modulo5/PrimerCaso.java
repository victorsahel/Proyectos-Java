package modulo5;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class PrimerCaso
{
    public static void main(String[] args)
    {
        PrimerCaso objeto= new PrimerCaso();
        objeto.disparandoExcepcion();
    }

    private void disparandoExcepcion()
    {
        try
        {
            FileInputStream fis = new FileInputStream("c:/text.txt");
        }catch(FileNotFoundException e){
            System.out.println("Archivo no encontrado");
        }





    }
}
