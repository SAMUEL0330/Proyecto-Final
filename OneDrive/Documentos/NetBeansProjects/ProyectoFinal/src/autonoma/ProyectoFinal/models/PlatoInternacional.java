package autonoma.ProyectoFinal.models;

/**
 * Objeto donde se sirve comida de otros países diferentes al propio
 * @author Samuel Esteban Herrera Bedoya 
 * @version 1.0.0
 * @since 9/12/2023
 */
/*
public class PlatoInternacional extends Plato
{
    private String paisOrigen;

    public PlatoInternacional(String paisOrigen) 
    {
        this.paisOrigen = paisOrigen;
    }

    public String getPaisOrigen() 
    {
        return paisOrigen;
    }

    public void setPaisOrigen(String paisOrigen) 
    {
        this.paisOrigen = paisOrigen;
    }
    
    @Override
    public abstract void calcularPrecioVenta()
    {
        super(id, nombre, costoFabrica);
        this.paisOrigen = paisOrigen;
    }
}
*/

public class PlatoInternacional extends Plato 
{
    private String paisOrigen;

    public PlatoInternacional(String paisOrigen, int id, String nombre, double precioVenta, double costoFabrica) {
        super(id, nombre, precioVenta, costoFabrica);
        this.paisOrigen = paisOrigen;
    }


    @Override
    public double calcularGanancia(double costoFabrica) 
    {
        return costoFabrica * 0.30;
    }  
}

