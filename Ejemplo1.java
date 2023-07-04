/*
  Mostrar una Imagen Cualquiera en Java sobre un MessageDialog 
  iconarchive.com
  flaticon.es
*/
import javax.swing.JOptionPane;
import javax.swing.ImageIcon;
public class Ejemplo1
{
    public static void main(String args[])
    {
        ImageIcon icono=new ImageIcon(Ejemplo1.class.getResource("Imagenes/perro.png"));
        JOptionPane.showMessageDialog(null,"Inormacion de la Pregunta","Pregunta1",
        JOptionPane.INFORMATION_MESSAGE,icono);
    }
}