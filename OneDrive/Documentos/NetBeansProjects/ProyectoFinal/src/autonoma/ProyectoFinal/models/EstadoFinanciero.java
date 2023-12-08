/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.ProyectoFinal.models;

import java.util.Date;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 9/12/2023
 */
public class EstadoFinanciero 
{
    private Date fechaGeneracion;
    private double valorTotalActual;
    private double valorGanancia;
    
    public EstadoFinanciero(Date fechaGeneracion, double totalRecaudado, double totalGanancias) 
    {
       this.fechaGeneracion = fechaGeneracion;
       this.valorTotalActual = totalRecaudado;
       this.valorGanancia = totalGanancias;
    }
}
