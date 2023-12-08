
package autonoma.ProyectoFinal.models;
import java.util.ArrayList;
import autonoma.ProyectoFinal.models.Menu;
import java.util.List;
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
    private List<Venta> ventas;

    public Restaurante(String nombre, String direccion, String telefono) 
    {
        this.nombre = "El buen sabor";
        this.direccion = "Carrera 9a #55c25";
        this.telefono = "8844444";
        this.menu = new Menu("Menú predeterminado", 2023);
        this.ventas = new ArrayList<>();
    }
    
    public Plato buscarPlato(Plato plato)
    {
        return this.menu.buscarPlato(plato);
    }
    
    public Plato buscarPlato(int id)
    {
        return this.menu.buscarPlato(id);
    }
    
    public boolean agregarPlato(Plato plato)
    {
        return this.menu.agregarPlato(plato);
    }
    
    public Plato actualizarPlato(int id, Plato plato)
    {
        return this.menu.actualizarPlato(id, plato);
    }
    
    public Plato eliminarPlato(int id)
    {
        return this.menu.eliminarPlato(id);
    }
    
        public String mostrarMenu()
    {
        return this.menu.mostrarMenu();
    }
    
    public void generarEstadoFinanciero()
    {
        
    }
}
