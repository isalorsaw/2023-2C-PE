import javax.swing.JOptionPane;
public class Ejercicio2
{
    public static void main(String args[])
    {
        int a[]=new int[5];
        llenar(a,5);
        String s=imprimir(a);
        mensaje(s);
        
        llenarAleatorio(a,1,10);
        mensaje(imprimir(a));
        
        //JOptionPane.showMessageDialog(null,s);
    }
    public static String imprimir(int a[])
    {
        String salida="Informacion del Arreglo\n";
        for(int i=0;i<a.length;i++)
        {
            salida+=a[i]+" ";
        }
        return salida;
    }
    public static void llenar(int a[], int n)
    {
        for(int i=0;i<a.length;i++)
        {
            a[i]=n;
        }
    }
    public static void llenarAleatorio(int a[], int d,int h)
    {
         for(int i=0;i<a.length;i++)
        {
            a[i]=generaAleatorio(d,h);
        }
    }
    public static int generaAleatorio(int d, int h)
    {
        return (int)(Math.random()*(h-d+1)+d);
    }
    public static void mensaje(String m)
    {
        JOptionPane.showMessageDialog(null,m);
    }
}