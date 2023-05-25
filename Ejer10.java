//Escribir un programa que diga si 3 lados introducidos por el usuario 
//forman un triángulo equilátero.
import javax.swing.JOptionPane;
public class Ejer10
{
  public static void main(String args[])
  {
      int lado1=0;
      int lado2=0;
      int lado3=0;
      
      String entrada=JOptionPane.showInputDialog("Ingrese el Primer Lado");
      lado1=Integer.parseInt(entrada);
      entrada=JOptionPane.showInputDialog("Ingrese el Segundo Lado");
      lado2=Integer.parseInt(entrada);
      entrada=JOptionPane.showInputDialog("Ingrese el Tercer Lado");
      lado3=Integer.parseInt(entrada);
      
      if(lado1==lado2&&lado2==lado3)
      JOptionPane.showMessageDialog(null,"Si es un Triangulo Equilatero");   
      
      else JOptionPane.showMessageDialog(null,"NO es un Triangulo Equilatero");   

    }
}