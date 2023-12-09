package autonoma.ProyectoFinal.models;

/**
 * Objeto donde se sirve la comida
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 9/12/2023
 */

public abstract class Plato 
{
    
    private static int contadorPlato = 1;

    private long id;
    private String nombre;
    private double precioVenta;
    private double costoFabrica; 

    public Plato() {
        this.id = Plato.contadorPlato;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.costoFabrica = costoFabrica;
        contadorPlato++;
    }

    public Plato(String nombre, double precioVenta, double costoFabrica) {
        this.id = Plato.contadorPlato;
        this.nombre = nombre;
        this.precioVenta = precioVenta;
        this.costoFabrica = costoFabrica;
        contadorPlato++;
    }
    
    

    

    public Long getId() 
    {
        return id;
    }

    public void setId(Long id) 
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

  
    public abstract double calcularGanancia(double costoFabrica);
    
   /* public long calcularPrecioVenta()
    {
        double ganancia = calcularGanancia();
        double  precioSinIVA = costoFabrica + ganancia;
        return (long) (precioSinIVA * 1.19);
    }*/
}



