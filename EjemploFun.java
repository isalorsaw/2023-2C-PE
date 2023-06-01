import javax.swing.JOptionPane;
public class EjemploFun
{
    public static void main(String args[])
    {
        int n1=pedirNumero("Ingrese el Primer Numero");
        int n2=pedirNumero("Ingrese el 2do Numero");
        int suma=n1+n2;
        JOptionPane.showMessageDialog(null,"La Suma es: "+suma);
    }
    public static int pedirNumero(String msg)
    {
        boolean seguir=true;
        int n=0;
        do
        {
            try
            {
                n=Integer.parseInt(JOptionPane.showInputDialog(msg));
                seguir=false;
            }
            catch(Exception exp)
            {
                JOptionPane.showMessageDialog(null,"Erorr al Ingresar Numero");
            }
        }
        while(seguir);
        return n;
    }
}