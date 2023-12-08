package autonoma.ProyectoFinal.main;

import autonoma.ProyectoFinal.models.Menu;
import autonoma.ProyectoFinal.models.PlatoInternacional;
import autonoma.ProyectoFinal.models.PlatoNacional;
import autonoma.ProyectoFinal.models.Restaurante;
import autonoma.ProyectoFinal.models.Venta;
import autonoma.ProyectoFinal.views.VentanaPrincipal;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 */
public class RestauranteControl {
    public static void main(String[] args) {
        Restaurante restaurante = new Restaurante("El buen sabor", "Carrera 9a #55c25", "8844444");

        // Crear una venta
        VentanaPrincipal ventana =  new VentanaPrincipal();
        ventana.setVisible(true);
    }
}

