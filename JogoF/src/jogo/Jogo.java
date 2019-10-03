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
        
      //Chamando primeiro Menu 
   First_face inicio= new First_face();
    inicio.First_Face();
    
       /*JFrame teste_ = new JFrame();
        ImageIcon icon_2 = new ImageIcon("4.gif");
        JLabel label_2 = new JLabel(icon_2);
        
        teste_.setFocusable(true);
        
        Animação aum = new Animação();
        teste_.setResizable(false);
        teste_.setSize(600,600);
        teste_.setLocationRelativeTo(null);
        teste_.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        teste_.setLayout(null); 
        teste_.setVisible(true);
        ImageIcon back = new ImageIcon("gridw2.png");
        JLabel fundo = new JLabel(back);
         teste_.add(label_2);
         label_2.setBounds(100,100,82,82);
         
         
        teste_.add(fundo);
        fundo.setBounds(512/2-175,512/2-175,350 ,350);
      
       */
      
       
    }
}


