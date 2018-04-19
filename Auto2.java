public class Auto2
{
    byte cantidadPuertas=0;
    short cantidadCilindros=0;
    int cantidadCaballos=0; //inicialización por defecto cuando están a nivel de clase es 0
    long numeroCircuitos=0L;
    float cilindrajeMotor= 0.0f;
    double volumenTanque =0.0d;
    char tipoMotor='\u0000';
    boolean tieneSunroof=false;

    Byte WcantidadPuertas=0;
    Short WcantidadCilindros=0;
    Integer WcantidadCaballos=0; //inicialización por defecto cuando están a nivel de clase es 0
    Long WnumeroCircuitos=0L;
    Float WcilindrajeMotor= 0.0f;
    Double WvolumenTanque =0.0d;
    Character WtipoMotor='\u0000';
    Boolean WtieneSunroof=false;



    public static void main(String[] args) {
        String hola="hola";
        String hola1="hola";
        if(hola==hola1) System.out.printf("Te quiero Sofi");
        System.out.println(hola1);
        Auto2 miauto = new Auto2();
        System.out.println(miauto);
        System.out.println(miauto.volumenTanque);
        System.out.println(miauto.WvolumenTanque);
    }
}
