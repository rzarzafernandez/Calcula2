/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcula2a;

/**
 *
 * @author rzarzafernandez
 */
import javax.swing.JOptionPane;


public class Vista {
  public static void imprimir(Modelo op){
      String tipoOP="";
      switch (op.getOperacion()) {
          case 1:
               tipoOP="Suma";
              break;
          case 2:
              tipoOP="Resta";
              break;
          case 3:
              tipoOP="Multiplicacion";
              break;
          case 4:
              tipoOP="Division";
              break;
      }
      
      
     
      JOptionPane.showMessageDialog(null,"Calculadora:" + "Primer número=" + op.getNum1() + "\nSegundo número=" + op.getNum2() + "\nOperacion=" +tipoOP + "\nResultado=" + op.getResultado());
  }
}