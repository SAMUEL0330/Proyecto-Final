package autonoma.ProyectoFinal.models;
import autonoma.ProyectoFinal.models.Plato;
import java.util.ArrayList;

/**
 * Carta que contiene información de sobre comida
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 9/12/2023
 */
public class Menu 
{
    private String nombreRepresentativo;
    private int anoCreacion;
    private ArrayList<Plato> platos;

    public Menu(String nombreRepresentativo, int anoCreacion, ArrayList<Plato> platos) {
        this.nombreRepresentativo = nombreRepresentativo;
        this.anoCreacion = anoCreacion;
        this.platos = platos;
    }
    
    
    public boolean agregarPlato(Plato plato)
    {
        return this.platos.add(plato);
    }
    
    public Plato buscarPlato(Plato plato)
    {
        for(int i=0;i<this.platos.size();i++){
            Plato p = this.platos.get(i);
            if(p.equals(plato))
            {
                return p;
            }
        }
        return null; 
    }
    
    public Plato buscarPlato(int id)
    {
        for(int i=0;i<this.platos.size();i++)
        {
            Plato p = this.platos.get(i);
            
            if(p.getId()==id)
            {
                return p;
            }
        }
        return null;
    }
    
    public int buscarIndicePlato(int id)
    {
        for(int i = 0; i<this.platos.size();i++)
        {
            Plato p=this.platos.get(i);
            
            if(p.getId()==id)
            {
                return i;
            }
        }
        return -1;
    }
    
    public Plato actualizarPlato(int id, Plato plato)
    {
        int index = this.buscarIndicePlato(id);
        
        if(index>=0)
        {
            return this.platos.set(index, plato);
        }else
        {
            return null;
        }
    }
    
    public Plato eliminarPlato(int id)
    {
        int index = this.buscarIndicePlato(id);
        
        if(index>=0)
        {
            return this.platos.remove(index);
        }else
        {
            return null;
        }
    }
    
    public String mostrarMenu()
    {
        String menu="";
        
        for(int i=0; i>this.platos.size(); i++)
        {
            Plato p = this.platos.get(i);
            menu +=p.toString()+"\n";
        }
        return menu;
    }

    public ArrayList<Plato> getPlatos() {
        return platos;
    }
}