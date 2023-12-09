package autonoma.ProyectoFinal.main;

import autonoma.ProyectoFinal.models.Menu;
import autonoma.ProyectoFinal.models.Plato;
import autonoma.ProyectoFinal.models.PlatoInternacional;
import autonoma.ProyectoFinal.models.PlatoNacional;
import autonoma.ProyectoFinal.models.Restaurante;
import autonoma.ProyectoFinal.models.Venta;
import autonoma.ProyectoFinal.views.VentanaPrincipal;
import java.util.ArrayList;
import java.util.Date;

/**
 * 
 * @author Samuel Esteban Herrera Bedoya
 */
public class RestauranteMain 
{
    public static void main(String[] args) 
    {
        //No se puede tener objetos en null en java
        //inicializamos array de platos para enviar a objeto menu
        ArrayList<Plato> platos = new ArrayList<Plato>();
        
        //inicializamos menu
        Menu menu = new Menu("Well Taste", 2020, platos);
        
        //Inicializamos array venta
        ArrayList<Venta> ventas = new ArrayList<Venta>();
        
        Restaurante restaurante = new Restaurante("El buen sabor", "Carrera 9a #55c25", "8844444", menu, ventas);
       
        VentanaPrincipal ventana =  new VentanaPrincipal(restaurante);
        ventana.setVisible(true);
    }
}

