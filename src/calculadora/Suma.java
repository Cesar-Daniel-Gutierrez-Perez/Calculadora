/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

/**
 *
 * @author perez
 */
public class Suma implements Calculo{

    @Override
    public double calculo(double num1, double num2) {
        return num1+num2;
    }    
}
