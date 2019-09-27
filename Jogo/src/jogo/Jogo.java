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
        char in;
        Scanner en = new Scanner(System.in);
       
  
        
        
        
       
        
       
        JFrame janela = new JFrame("2048");
        JPanel panel = new JPanel();
        panel.setSize(600,600);
        panel.setForeground(Color.yellow);
        janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janela.setLayout(null);  
        
        //janela.setSize(500,500);
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
       
        
      
      
 
   
  
 
//  cancela.addActionListener(handler);
  
  
         
    
        Interface jan = new Interface(janela,matriz1,quad1);
       //janela.add(panel);
        janela.setVisible(true);
        teste.printar_matriz(matriz1);
       
        while(true){
        in=en.next().charAt(0);
       // in=jan.getIn();
        switch(in){
            
            case 'w':
                teste.cima(matriz1);
                teste.printar_matriz(matriz1);
                jan.executa(matriz1,quad1);
                break;
            case 's':
                teste.baixo(matriz1);
                teste.printar_matriz(matriz1);
                //jan.executa(janela,matriz);
                break;
            case 'd':
                teste.direita(matriz1);
                teste.printar_matriz(matriz1);
           //     jan.executa(janela,matriz);
                break;
            case 'a':
                teste.esquerda(matriz1);
                teste.printar_matriz(matriz1);
                break;
        }
         teste.inserir_matriz(matriz1);
         //jan.executa(janela,matriz);
         teste.printar_matriz(matriz1);
        }
    }
}


