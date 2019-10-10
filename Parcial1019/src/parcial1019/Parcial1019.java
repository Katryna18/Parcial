
package parcial1019;

import javax.swing.JOptionPane;

public class Parcial1019 {
    
      //Declaro variables
   private int id = 0;
   private String fecha = "";
  public String nombre= "";

    public void setId(int id) {
        this.id = 1;
    }

    

    public int getId() {
        return id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getFecha() {
        return fecha;
    }
    
  

    public static void commit() {
        JOptionPane.showMessageDialog(null,"Un commit es la acción de guardar o subir tus archivos a tu repositorio remoto");
    }

    public static void push() {
        JOptionPane.showMessageDialog(null, "Actualizar repositorio remoto");
    }

   public static void pull() {
       JOptionPane.showMessageDialog(null,"Actualizar repositorio local"); //To change body of generated methods, choose Tools | Templates.
    }

   public static void clase() {
         JOptionPane.showMessageDialog(null," Una clase es un modelo que define un conjunto de variables -el estado, y métodos apropiados para operar con dichos datos -el comportamiento."); //To change body of generated methods, choose Tools | Templates.
    }

    public static void objeto() {
         JOptionPane.showMessageDialog(null," Los objetos tienen características fundamentales que nos permiten conocerlos mediante la observación, identificación y el estudio posterior de su comportamiento; estas características son:\n" +
"\n" +
"Identidad\n" +
"Comportamiento\n" +
"Estado"); //To change body of generated methods, choose Tools | Templates.
    }

   

    
  
   
    
    
}
