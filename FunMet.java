import javax.swing.JOptionPane;
public class FunMet
{
    public static void main(String args[])
    {
       main2(); 
    }
    //Main2======================================================================
    public static void main2()
    {
        String mensaje="Ingrese una Cadena";
        String c=pedirCadena(mensaje);
        //mensaje(c);
        
        char pl=primLetra(c);
        char ul=ultLetra(c);
        
        //mensaje(""+contarNumeros(c));
        //mensaje(""+siHayNumeros(c));
        String invertido=invertir(c);
        mensaje(""+invertido);
        
        String salida="La Cadena es: "+c+"\nLa Primera Letra es: "+pl+
        "\n Ultima Letra es: "+ul;
        mensaje(salida);
        
        //int p=posLetra("CASA",'A');
        /*String cadena="CASA";
        char l='S';
        int p=posLetra(cadena,l);
        mensaje(""+p);
        
        String c1="UNo";
        String c2="Dos";
        String u=unir(c1,c2);
        mensaje(u);*/
    }
    //Funcion PedirEntero========================================================
    public static int pedirEntero(String msg)
    {
        int n=0;
        boolean s=true;
        do
        {
            try
            {
               String e=JOptionPane.showInputDialog(msg);
               n=Integer.parseInt(e);
               s=false;
            }
            catch(Exception exp)
            {
                mensaje("Error de Ingreso");
            }
        }
        while(s);
        return n;
    }
    //Metodo de Mensaje========================================================
    public static void mensaje(String msg)
    {
        JOptionPane.showMessageDialog(null,msg);
    }
    //Funcion PedirCadena======================================================
    public static String pedirCadena(String m)
    {//Validar que la cadena no este vacia. Hacer con boolean seguir y do while. PREG DE EXAMEN
        String c=JOptionPane.showInputDialog(m);
        return c;
    }
    //Retornar Primera Letra===================================================
    public static char primLetra(String c)
    {
        return c.charAt(0);
    }
    //Retornar Ultima Letra====================================================
    public static char ultLetra(String c)
    {
        //return c.charAt(tamanio(c)-1);
        int t=c.length();
        char l=c.charAt(t-1);
        return l;
    }
    //Retornar Tamano de Cadena=================================================
    public static int tamanio(String c)
    {
        return c.length();
    }
    //Retornar V/F si hay numeros o no
    public static boolean siHayNumeros(String c)
    {
        if(contarNumeros(c)>0)return true;
        else return false;
        //return (contarNumeros(c)>0)?true:false;
    }
    //Retornar cuantos numeros hay===========================================
    public static int contarNumeros(String c)
    {
        int cont=0;
        for(int i=0;i<c.length();i++)
        {
            int l=c.charAt(i);
            if(l>=48&&l<=57)cont++;
        }
        return cont;
    }
    //Retornar la Cadena Vacia==============================================
    public static String invertir(String c)
    {
        String inv="";
        
        int i=c.length()-1;
        
        while(i>=0)
        {
            char l=c.charAt(i);
            inv=inv+l;
            i--;
        }
        return inv;
    }
    //Funcion que pida letra=================================================
    public static char pedirLetra(String c)
    {
        char l=' ';
        //Trabajen aqui
        return l;
    }
    //Funcion que retornar letra de enmedio, si no hay retornar vacio ' '
    public static char letraMedio(String c)
    {
        char em=' ';
        //Trabajen aqui
        return em;
    }
    //Metodo que imprime Letra x Letra
    public static void printLetraXLetra(String c)
    {
        
    }
    //Boolean si existe letra en cadena
    public static boolean siExisteLetra(String c, char l)
    {
        boolean si=true;
        
        return si;
    }
    //Retornar cuantos vocales hay===========================================
    public static int contarVocales(String c)
    {
        int cont=0;
        for(int i=0;i<c.length();i++)
        {
            int l=c.charAt(i);
            //if(l>=48&&l<=57)cont++;
        }
        return cont;
    }
    //Retornar la posicion de la letra
    public static int posLetra(String c)
    {
        int p=0;
        //Trabajar aqui
        return p;
    }
    //Retornar la union de dos cadenas===============================
    public static String unir(String c1, String c2)
    {
        return "";
    }
}