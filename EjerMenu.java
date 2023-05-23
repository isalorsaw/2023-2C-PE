//Primer Ejercicio
import javax.swing.JOptionPane;
public class EjerMenu
{
    public static void main(String args[])
    {
        int opcion=0;
        String menu="Menu\n1. Sumar dos numeros\n2. Resta dos numeros\n3. Salir";
        do
        {
            opcion=Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcion)
            {
                case 1:
                    int n1=Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese el Primer Numero"));
                    int n2=Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese el Segundo Numero"));
                    int s=n1+n2;
                    JOptionPane.showMessageDialog(null,"La suma es: "+s);
                break;
                
                case 2:
                    n1=Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese el Primer Numero"));
                    n2=Integer.parseInt(JOptionPane.showInputDialog(
                    "Ingrese el Segundo Numero"));
                    s=n1-n2;
                    JOptionPane.showMessageDialog(null,"La Resta es: "+s);
                break;
                
                case 3:
                    JOptionPane.showMessageDialog(null,"Adios ");
                break;
                
                default:
                JOptionPane.showMessageDialog(null,"Opcion no Valida");
            }
        }
        while(opcion!=3);
    }
}