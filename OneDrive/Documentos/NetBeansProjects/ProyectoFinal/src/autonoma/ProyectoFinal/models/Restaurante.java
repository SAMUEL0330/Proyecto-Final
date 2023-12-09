
package autonoma.ProyectoFinal.models;
import java.util.ArrayList;
import autonoma.ProyectoFinal.models.Menu;
import autonoma.ProyectoFinal.models.Plato;
import java.util.Date;
/**
 * 
 * @author Samuel Esteban Herrera Bedoya
 */
public class Restaurante 
{
    
    private String nombre;
    private String direccion;
    private String telefono;
    private Menu menu;
    private ArrayList<Venta> ventas;



    public Restaurante(String nombre, String direccion, String telefono, Menu menu, ArrayList<Venta> ventas) 
    {
        this.nombre = nombre;
        this.direccion = direccion;
        this.telefono = telefono;
        this.menu = menu;
        this.ventas = ventas;
    } 

    
    public Plato buscarPlato(Plato plato)
    {
        return this.menu.buscarPlato(plato);
    }
    
    public Plato buscarPlato(String nombre)
    {
        return this.menu.buscarPlato(nombre);
    }
    
    public Plato buscarPlato(int id)
    {
        return this.menu.buscarPlato(id);
    }
    
    public boolean agregarPlato(Plato plato)
    {
        return this.menu.agregarPlato(plato);
    }
    
    public Plato actualizarPlato(long id, Plato plato)
    {
        return this.menu.actualizarPlato(id, plato);
    }
    
    public Plato eliminarPlato(long id)
    {
        return this.menu.eliminarPlato(id);
    }
    
        public String mostrarMenu()
    {
        return this.menu.mostrarMenu();
    }
    
       public ArrayList<Plato> obtenerTodosPlatos(){
        return this.menu.getPlatos();
    }

    public ArrayList<Venta> getVentas() {
        return ventas;
    }
       
     
    
}
