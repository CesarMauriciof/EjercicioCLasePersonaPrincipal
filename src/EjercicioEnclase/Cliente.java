
package EjercicioEnclase;

import javax.swing.JOptionPane;


public class Cliente extends Persona {
    
    private String direccion;

    public Cliente(String direccion, String nombre, int edad) {
        super(nombre, edad);
        this.direccion = direccion;
    }

    public String getDireccion() {
        return direccion;
    }
    
    public void mostrarCliente (){
    
        JOptionPane.showMessageDialog(null,"El nombre es: "+getNombre()+
                                         "\nLa edad es: "+getEdad()+
                                         "\nLa direccion es: "+getDireccion());
    
    }
    
}
