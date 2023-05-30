import javax.swing.JOptionPane;
public class EjemploTryCatch
{
    public static void main(String args[])
    {
        int num=0;
        boolean seguir=true;
        
        do{
            try
            {
                //String entrada=javax.swing.JOptionPane.showInputDialog("Ingrese un Numero");
                String entrada=JOptionPane.showInputDialog("Ingrese un Numero");
                num=Integer.parseInt(entrada);
                seguir=false;
            }
            catch(Exception exp)
            {
                //JOptionPane.showMessageDialog(null,exp);
                JOptionPane.showMessageDialog(null,"Hubo un error al ingresar numero");
            }
        }while(seguir==true);   
    }
}