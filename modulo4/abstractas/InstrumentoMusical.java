package modulo4.abstractas;

public abstract class InstrumentoMusical
{
    private String tipoInstrumento;

    public String mostrarTipoInstrumento()
    {
        return tipoInstrumento;
    }
    public abstract void tocar();
}
