/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import java.awt.Color;
import java.util.Scanner;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.SwingConstants;

/**

 * @author 18712919
 */
public class Jogo {
        public static int matriz1[][] = new int [4][4];
        public static JLabel quad1[][]= new JLabel [4][4];
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Matriz teste = new Matriz(matriz1);
        teste.inserir_matriz(matriz1);
        teste.inserir_matriz(matriz1);
        
    
        Interface jan = new Interface(matriz1,quad1,"2048");
        
       
    }
}


