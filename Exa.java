import javax.swing.JOptionPane;
public class Exa
{
    //Variable Global
    public static String salida="";
    public static void main(String args[])
    {
        String cadena=pedirCadena("Ingrese una Cadena mayor a 10 caracteres",10);
        
        salida="La cadena es: "+cadena+"\nTiene "+numero_caracteres(cadena)+
        " caracteres";
        invertir(cadena);
        ultima_letra(cadena);
        mensaje(salida);
    }
    public static String pedirCadena(String msg, int mayor)
    {
        String n="";
        boolean s=true;
        do
        {
            try
            {
               n=JOptionPane.showInputDialog(msg);
               if(n.length()>mayor)s=false;
            }
            catch(Exception exp)
            {
                mensaje("Error de Ingreso");
            }
        }
        while(s);
        return n;
    }
    public static void invertir(String c)
    {
        String inv="";
        
        int i=c.length()-1;
        
        while(i>=0)
        {
            char l=c.charAt(i);
            inv=inv+l;
            i--;
        }
       // mensaje("La invertida es: "+inv);
       salida= salida+"La invertida es: "+inv+"\n";
    }
    public static int numero_caracteres(String cadena)
    {
         return cadena.length();
    }
    public static void ultima_letra(String cadena)
    {
        int t=cadena.length();
        char l=cadena.charAt(t-1);
        //mensaje("La ultima letra es: "+l+"");
        salida=salida+"La ultima letra es: "+l+"";
    }
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
}