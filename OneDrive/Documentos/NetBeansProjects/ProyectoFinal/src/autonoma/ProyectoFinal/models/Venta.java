package autonoma.ProyectoFinal.models;

import autonoma.ProyectoFinal.models.Plato;
import java.util.ArrayList;
import java.util.Date;


/**
 * Intercambio de dos o más personas donde se intercambia un producto y/o servicio por un monto de dinero
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 9/12/2023
 */
public class Venta 
{
    private static int codigoActual = 1;
    private int codigo;
    private double valorTotal;
    private double valorGanancia;
    private Date fecha;
    private ArrayList<Plato> platosVendidos;
    private ArrayList<Venta> ventas;
    
    public Venta(double valorTotal, double valorGanancia, Date fecha, ArrayList<Plato> platosVendidos)
    {
        this.codigo = codigoActual++;
        this.valorTotal = valorTotal;
        this.valorGanancia = valorGanancia;
        this.fecha = new Date();
        this.platosVendidos = platosVendidos;
    }

    public static int getCodigoActual() 
    {
        return codigoActual;
    }

    public static void setCodigoActual(int codigoActual) 
    {
        Venta.codigoActual = codigoActual;
    }

    public int getCodigo() 
    {
        return codigo;
    }

    public void setCodigo(int codigo) 
    {
        this.codigo = codigo;
    }

    public double getValorTotal() 
    {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) 
    {
        this.valorTotal = valorTotal;
    }

    public double getValorGanancia() {
        return valorGanancia;
    }

    public void setValorGanancia(double valorGanancia) 
    {
        this.valorGanancia = valorGanancia;
    }

    public Date getFecha() 
    {
        return fecha;
    }

    public void setFecha(Date fecha) 
    {
        this.fecha = fecha;
    }

    public ArrayList<Plato> getPlatosVendidos() 
    {
        return platosVendidos;
    }

    public void setPlatosVendidos(ArrayList<Plato> platosVendidos) 
    {
        this.platosVendidos = platosVendidos;
    }

    public ArrayList<Venta> getVentas() 
    {
        return ventas;
    }

    public void setVentas(ArrayList<Venta> ventas) 
    {
        this.ventas = ventas;
    }

    public boolean agregarVenta(Venta venta)
    {
       return this.ventas.add(venta);
    }
    public Venta buscarVenta(Venta venta)
    {
        for(int i=0;i<this.ventas.size();i++)
        {
            Venta v= this.ventas.get(i);
            if(v.equals(venta))
            {
            return v;
            }
        }
      return null;
    }
    public Venta buscarVenta(int id)
    {
        for(int i=0;i<this.ventas.size();i++)
        {
            Venta v= this.ventas.get(i);
            
            if(v.getId()== id)
            {
                return v;
            }
        }
      return null;
    }
    
    private int buscarIndiceVenta(int id)
    {
        for(int i=0;i<this.ventas.size();i++)
        {
            Venta v= this.ventas.get(i);
            
            if(v.getId()== id)
            {
            return i;   
            }
        }
        return -1;
    }
   public Venta actualizarVenta(int id,Venta venta)
   {
        int index = this.buscarIndiceVenta(id);
        
        if(index>=0)
        {
            return this.ventas.set(index, venta);
        }else
        {
            return null;
        }
   } 
    public Venta eliminarVenta(int id)
    {
        int index = this.buscarIndiceVenta(id);
        
        if(index>=0)
        {
            return this.ventas.remove(index);
        }else
        {
          return null;
        }
    }
    
    public String mostrarVenta()
    {
         
        String menu="";
        for(int i=0;i<this.ventas.size();i++)
        {
            Venta v= this.ventas.get(i);
            menu +=v.toString()+"\n";
        }
         return menu;
    }

    private int getId() 
    {
        return 0;
    }
}
