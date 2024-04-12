
package EjercicioEnclase;

import javax.swing.JOptionPane;


public class Principal {

   
    public static void main(String[] args) {
       
        String opciones = JOptionPane.showInputDialog("SELECCIONE LA OPCION DESEADA \n"  +
                                                    "1. Agregar empleado.  \n"+
                                                    "2. Agregar cliente \n"+
                                                    "3. Salir del programa");
  
         
        int aux = Integer.parseInt(opciones);
        
        switch (aux) {
            case 1:
              String nombre1= JOptionPane.showInputDialog("Ingrese su nombre: ");
              String aux1 = JOptionPane.showInputDialog("Ingrese su edad: ");
              int edad1 = Integer.parseInt(aux1);
              String aux2 = JOptionPane.showInputDialog("Ingrese su salario: ");
              double salario = Double.parseDouble(aux2);
              
               Empleado empleado1 = new Empleado(salario, nombre1, edad1);
               empleado1.mostrarEmpleado();
              
              
                break;
            case 2:
                String nombre2 = JOptionPane.showInputDialog("Ingrese su nombre ");
                String aux3 = JOptionPane.showInputDialog("Ingrese su edad: ");
                int edad2 = Integer.parseInt(aux3);
                String direccion = JOptionPane.showInputDialog("Ingrese su direccion: ");
                
                Cliente cliente1 = new Cliente(direccion, nombre2, edad2);
                cliente1.mostrarCliente();
                
                break;
                
                
                
            case 3:
                break;
        }
        
    }
    
}
