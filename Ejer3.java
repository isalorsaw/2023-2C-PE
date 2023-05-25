//Programa que promedie 4 notas introducidas por el usuario. CICLO
import javax.swing.JOptionPane;
public class Ejer3
{
    public static void main(String args[])
    {
        int nota=0;
        int prom=0;
        int suma=0;
        
        for(int i=0;i<4;i++)
        {
            String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
            nota=Integer.parseInt(entrada);  
            suma=suma+nota;//suma+=nota;
        }
        prom=suma/4;
        JOptionPane.showMessageDialog(null,"El Promedio es: "+prom);
        /*int i=0;
        while(i<4)
        {
            i++;
        }*/
    }
}