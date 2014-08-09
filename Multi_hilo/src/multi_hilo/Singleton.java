/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package multi_hilo;

/**
 *
 * @author Trabajar
 */
public class Singleton {
  
private static Singleton INSTANCE = null;

  private Singleton(){};
  
/*
private static Singleton INSTANCE = new Singleton();

  
  public static Singleton getInstance(){
    return INSTANCE;
  }
  
  private synchronized  static void createInstance(){
    if (INSTANCE == null) 
      INSTANCE = new Singleton();
  }
*/
  
  public static Singleton getInstance(){
    if (INSTANCE == null) createInstance();
    return INSTANCE;
    }
    
  private static void createInstance(){
  if (INSTANCE == null){
  synchronized(Singleton.class){
  if (INSTANCE == null){
  INSTANCE = new Singleton();
}
}
}
}
}


  
  
