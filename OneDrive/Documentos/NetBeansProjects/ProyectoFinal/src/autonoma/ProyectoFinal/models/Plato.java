package autonoma.ProyectoFinal.models;

/**
 * Objeto donde se sirve la comida
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 9/12/2023
 */

public abstract class Plato 
{
    private int id;
    private String nombre;
    private double precioVenta;
    public double costoFabrica;
    String descripcion;

    public Plato(int id, String nombre, long costoFabrica, String descripcion) 
    {
        this.id = id;
        this.nombre = nombre;
        this.precioVenta = calcularPrecioVenta();
        this.costoFabrica = costoFabrica;
        this.descripcion = descripcion;
    }

    public int getId() 
    {
        return id;
    }

    public void setId(int id) 
    {
        this.id = id;
    }

    public String getNombre() 
    {
        return nombre;
    }

    public void setNombre(String nombre) 
    {
        this.nombre = nombre;
    }

    public double getPrecioVenta() 
    {
        return precioVenta;
    }

    public void setPrecioVenta(long precioVenta) 
    {
        this.precioVenta = precioVenta;
    }

    public double getCostoFabrica() 
    {
        return costoFabrica;
    }

    public void setCostoFabrica(long costoFabrica) 
    {
        this.costoFabrica = costoFabrica;
    }

    public String getDescripcion() 
    {
        return descripcion;
    }

    public void setDescripcion(String descripcion) 
    {
        this.descripcion = descripcion;
    }

    public abstract long calcularGanancia();
    
    public long calcularPrecioVenta()
    {
        double ganancia = calcularGanancia();
        double  precioSinIVA = costoFabrica + ganancia;
        return (long) (precioSinIVA * 1.19);
    }
}

