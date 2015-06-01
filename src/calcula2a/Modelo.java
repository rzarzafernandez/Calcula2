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
public class Modelo {
  float num1;
    float num2;
    int operacion;
    float resultado;

    public Modelo(float num1, float num2, int operacion, float resultado) {
        this.num1 = num1;
        this.num2 = num2;
        this.operacion = operacion;
        this.resultado = resultado;
    }

    public Modelo() {
    }

    public float getNum1() {
        return num1;
    }

    public float getNum2() {
        return num2;
    }

    public int getOperacion() {
        return operacion;
    }

    public float getResultado() {
        return resultado;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public void setOperacion(int operacion) {
        this.operacion = operacion;
    }

    public void setResultado(float resultado) {
        this.resultado = resultado;
    }

    @Override
    public String toString() {
        return "Calculadora:" + "Primer número=" + num1 + "\nSegundo nuúmero=" + num2 + "\nOperacion=" +operacion + "\nResultado=" + resultado + '}';
    }
      
}