//Ejemplo JOptionPane.
import javax.swing.JOptionPane;
public class EjemploJOP
{
    public static void main(String args[])
    {
        String entrada=JOptionPane.showInputDialog("Mensaje para el Usuario");
        //Input es para Entrada de Datos
        
        int numero=Integer.parseInt(entrada);
        
        JOptionPane.showMessageDialog(null,"Mensaje");
        JOptionPane.showMessageDialog(null,"El numero que ingresamos es "+numero);
        //MessageDialog es para una Salida
        
    }
}