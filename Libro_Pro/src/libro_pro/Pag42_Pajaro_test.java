/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package libro_pro;

/**
 *
 * @author Trabajar
 */
public class Pag42_Pajaro_test {

  public static void main(String[] args) {

    Pag42_Pajaro p = new Pag42_Pajaro();
    p.set_edad(5);
    p.ver_edad();
    p.color1 = 'v';
    p.fijar_color1();
    p.color1 = 'a';
    p.fijar_color1();
    p.color1 = 0x2;
    p.fijar_color1();
  }
}
