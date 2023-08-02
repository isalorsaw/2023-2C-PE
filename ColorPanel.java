import javax.swing.UIManager;
import javax.swing.JOptionPane;
import java.awt.Color;
public class ColorPanel
{
    public static void main(String args[])
    {
        UIManager UI = new UIManager(); //Uso de la libreria
        UI.put("OptionPane.background", new Color(239,113,13));//Fondo de JOptionPane
        UI.put("Panel.background", new Color(255,255,255));//Fondo del Panel Interno
        UI.put("Button.background", new Color(74,157,206));//Fondo de Botones
        
        JOptionPane.showMessageDialog(null,"Titulo","Ventana",0);
        
        //Se cambia Size al numero que desee para aumentar el tamaño
        JOptionPane.showMessageDialog(null,"<html><font size=10>Bienvenidos</font></html>","Ventana",0);
    }
}