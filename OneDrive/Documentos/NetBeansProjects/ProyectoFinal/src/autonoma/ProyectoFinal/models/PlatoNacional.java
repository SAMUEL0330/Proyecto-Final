package autonoma.ProyectoFinal.models;

/**
 * Plato 
 * @author Samuel Esteban Herrera Bedoya
 */
public class PlatoNacional extends Plato 
{

    public PlatoNacional(int id, String nombre, double precioVenta, double costoFabrica) {
        super(id, nombre, precioVenta, costoFabrica);
    }

    
    
    @Override
    public double calcularGanancia(double costoFabrica)
    {
        return costoFabrica * 0.25;
    }
}

