//Ejemplo de String
import javax.swing.JOptionPane;
public class EjemploCadena
{
    public static void main(String args[])
    {
        String menu="Menu\n1. Ingresar Cadena\n2.Tamaño\n3. Primera Letra"+
        "\n4. Ultima Letra\n5.Contar Numeros\n6.Mostrar Cadena\n0.Salir";
        int opcion=0;
        String cadena="";
        
        do
        {
            String entrada=JOptionPane.showInputDialog(menu);
            opcion=Integer.parseInt(entrada);
            
            if(opcion==1)
            {
                cadena=JOptionPane.showInputDialog("Ingrese una Cadena");
            }
            else if(opcion==2)
            {
                int tam=cadena.length();
                JOptionPane.showMessageDialog(null,"El Tamanio de la Cadena es "+tam);
            }
            else if(opcion==3)
            {
                char pl=cadena.charAt(0);
                JOptionPane.showMessageDialog(null,"La primera letra de la cadena es "+pl);
            }
            else if(opcion==6)
            {
                JOptionPane.showMessageDialog(null,"La Cadena ingresada es "+cadena);
            }
            
        }while(opcion!=0);
    }
}