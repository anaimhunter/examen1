
public class Vehiculo
{
    private String placa;
    private int hora;
    private int min;
    
    public Vehiculo(String placaI,int horaI, int minI)
    {
        placa=placaI;
        hora=horaI;
        min=minI;
    }
    
    public String dimePlaca()
    {
        return placa;      
    }
    
    public int dimeHora()
    {
        return hora;      
    }
    
    public int dimeMin()
    {
        return min;      
    }
    
    
}
