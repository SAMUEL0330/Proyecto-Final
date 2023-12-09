/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package autonoma.ProyectoFinal.models;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Samuel Esteban Herrera Bedoya
 * @version 1.0.0
 * @since 9/12/2023
 */
public class EstadoFinanciero 
{
   
    private ArrayList<Plato> platosVendidos;

    public EstadoFinanciero(ArrayList<Plato> platosVendidos) {
        this.platosVendidos = platosVendidos;
    }
    
    
    
    
    public double calcularTotalEstadoFinanciero(ArrayList<Plato> platosvendidos){
        
      double sumartotal= 0;
      
      // Plato es el tipo del arraylist
      //p es el nombre de cada objeto del array list
      //platosvendidos es el nombre del arraylist
      for(Plato p : platosvendidos ){
          sumartotal=  p.getPrecioVenta()+ sumartotal;
      }  
      return sumartotal;
    }
    
    public String mostrarEstadoFinanciero(){
        String estadoFinanciero = "";
        for(int i=0;i<this.platosVendidos.size();i++){
            Plato p = this.platosVendidos.get(i);
            estadoFinanciero += p.toString()+"\n";
        }
        double total = calcularTotalEstadoFinanciero(platosVendidos);
        estadoFinanciero += "\n" + "Total Recaudado : " + total + "\n";
        estadoFinanciero += "Fecha Generacion Estado Financiero : " + new Date() + "\n";
        
        return estadoFinanciero;
    }
    
    
}
