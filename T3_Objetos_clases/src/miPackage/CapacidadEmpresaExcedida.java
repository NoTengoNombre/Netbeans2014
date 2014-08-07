/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package miPackage;

/**
 *
 * @author Trabajar
 */
public class CapacidadEmpresaExcedida extends Exception{
 CapacidadEmpresaExcedida(String nombre){
   super("no es posible añadir el empleado "+nombre);
 } 
}
  