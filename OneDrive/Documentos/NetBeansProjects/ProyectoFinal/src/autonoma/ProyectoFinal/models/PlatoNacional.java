package autonoma.ProyectoFinal.models;

/**
 * Plato 
 * @author Samuel Esteban Herrera Bedoya
 */
public class PlatoNacional extends Plato 
{

    public PlatoNacional(int id, String nombre, long costoFabrica, String descripcion) {
        super(id, nombre, costoFabrica, descripcion);
    }
    
    @Override
    public long calcularGanancia()
    {
        return (long) (getCostoFabrica() * 0.25);
    }
}

