/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import javax.swing.*; 	
import javax.swing.JFrame;
import static jogo.Jogo.quad1;


/**
 *
 * @author 18712919
 */
public class  Interface {
    
    JFrame janela = new JFrame();
    JLabel quad[][]= new JLabel [4][4];
    int matriz[][]= new int [4][4];
    Matriz teste =new Matriz(matriz);
   static int height;
  static int width;

    public Interface() {
    }
   
   
   
        
        
        
    //Inicializa o vetor de Jlabel com os valores da matriz1; 
    public Interface(JFrame janela, int matriz[][], JLabel quad[][]) {
        JButton botoes[] = new JButton [4]; 
        ButtonHandler handler = new ButtonHandler(botoes,quad1);
          
        int x,y;
       
        this.quad=quad;
        ImageIcon back = new ImageIcon("background.png");
        String mat[][]=new String [4][4];
        this.janela=janela;
        
        this.janela.setSize(600,600);
        height = this.janela.getHeight();
        width= this.janela.getWidth();
        for(int i=0;i<4;i++){
            botoes[i]=new JButton();
            botoes[i].addActionListener(handler);
            janela.add(botoes[i]);
          
        }
      botoes[0].setBounds(200,50,20,20);
      botoes[1].setBounds(190,330,20,20);
      botoes[2].setBounds(10,200,20,20);
      botoes[3].setBounds(350,200,20,20);
      y=height/2-165;
        for(int i=0;i<4;i++){
           x=height/2-115;
            for(int j=0;j<4;j++){
                  
                mat[i][j] = Integer.toString(matriz[i][j]);
                this.quad[i][j] = new JLabel(mat[i][j]);
              // this.quad[i][j].setText(mat[i][j]);
                this.quad[i][j].setBounds(x,y,100,100);
                 
                this.janela.add(quad[i][j]);
               x=x+75;
            
            }
            y=y+75;
        }
        
       // addKeyListener(this);
       JLabel fundo = new JLabel(back);
        
        
         
        fundo.setBounds(height/2-175,width/2-175,350,350);
        this.janela.add(fundo);
        this.janela.setVisible(true);
    }
    
    //atualiza o vetor de Jlabel com os valores da marteiz1
    public void executa(int matriz[][], JLabel quad[][]) {
         this.quad=quad;
        String mat[][]=new String [4][4];
        int x,y;
        y=height/2-165;
        for(int i=0;i<4;i++){
            x=height/2-115;
            for(int j=0;j<4;j++){
                mat[i][j] = Integer.toString(matriz[i][j]);
                this.quad[i][j].setBounds(x,y,100,100);
               this.quad[i][j].setText(mat[i][j]);
                x=x+75;
            
            }
            y=y+75;
        }
        
    }
   

}
