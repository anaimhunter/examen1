
public class Estacionamiento
{
    private Vehiculo[] estacionamiento;
    private int costo;
    private int horaS;
    private int minS;
    public Estacionamiento()
    {
        estacionamiento= new Vehiculo[150];
        costo=15;
    }
    
    public void ingresarCarro(Vehiculo carro)
    {
       
        for(int i=0;i<estacionamiento.length;i++)
        {
            if(carro.dimePlaca() == estacionamiento[i].dimePlaca())
            {
                if(i<estacionamiento.length)
                {
                    estacionamiento[i]=carro;
                }
            }
        }
    }
    public void salirCarro(Vehiculo carro, int horaSa, int minSa )
    {
        for(int i=0;i<estacionamiento.length;i++)
        {
            if(carro.dimePlaca() == estacionamiento[i].dimePlaca())
            {
                horaS=horaSa;
                minS=minS;
            }
        }
    }
}
