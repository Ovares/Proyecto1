
package POO;

import javax.swing.JOptionPane;


public class PrincipalColaborador {
    public static void main (String[] args) {
        Colaboador datos= new  Colaboador(); 
        datos.setNombre(JOptionPane.showInputDialog("Digite el nombre del colaboador"));
       datos.setEdad(Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del colaboador")));
      datos.setGenero(JOptionPane.showInputDialog("Digite el genero M o F").charAt(0));
     datos.setSalario(Integer.parseInt(JOptionPane.showInputDialog("Digite el salario del colaboador")));
    datos.setPuesto(JOptionPane.showInputDialog("Digite el puesto del colaboador"));
   datos.setDepartamento(JOptionPane.showInputDialog("Digite el departamento  del colaboador"));
  datos.MostrarDatos(); 
    }
}
