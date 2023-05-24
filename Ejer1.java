//Programa que sume tres números introducidos por el usuario. CICLO
import javax.swing.JOptionPane;
public class Ejer1
{
    public static void main(String args[])
    {
        int numero=0;
        int suma=0;
        
        for(int i=0;i<3;i++)
        {
            String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
            numero=Integer.parseInt(entrada);
            suma=suma+numero;//suma+=numero;
        }
        JOptionPane.showMessageDialog(null,"La Suma es: "+suma);
    }
}