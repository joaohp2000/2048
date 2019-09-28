/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

import java.awt.Color;
import java.awt.HeadlessException;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.*; 	
import javax.swing.JFrame;
import static jogo.Jogo.matriz1;
import static jogo.Jogo.quad1;


/**
 *
 * @author 18712919
 */
public class  Interface extends JFrame {
    
     
        
   //Teclado2 janela = new Teclado2();
   JLabel quad[][]= new JLabel [4][4];
   JLabel pontuação =new JLabel();
   int matriz[][]= new int [4][4];
   Matriz teste =new Matriz(matriz);
   static int height;
   static int width;
   ImageIcon N = new ImageIcon("n.jpg");
   JButton botao_cima = new JButton(N);
   JButton botao_baixo = new JButton("");
   JButton botao_esq = new JButton("");
   JButton botao_dir = new JButton("");
   JButton novo_g = new JButton("Novo Jogo");

    public Interface() {
    }

    
  
   
  
   //evento teclado e incializa a frame do jogo
    public  Interface(int matriz[][], JLabel quad[][],String title) throws HeadlessException{
        super(title);
        this.quad=quad;
        this.matriz=matriz;
        
       addKeyListener(new KeyAdapter(){
            
           
            @Override
            public void keyPressed(KeyEvent teclado){
                
                char tecla = teclado.getKeyChar();
                switch(tecla){
                    case 'w':
                        teste.cima(matriz1);
                       executa(matriz1,quad);
                        System.out.println("cima");
                        break;
                    case 's':
                        teste.baixo(matriz1);
                       executa(matriz1,quad);
                        System.out.println("baixo");
                        break;
                    case 'd':
                       teste.direita(matriz1);
                       executa(matriz1,quad);
                        System.out.println("direita");
                        break;
                    case 'a':
                       teste.esquerda(matriz1);
                       executa(matriz1,quad);
                        System.out.println("esquerda");
                        break;
                }
                teste.inserir_matriz(matriz1);
               executa(matriz1,quad);
                
                
            }
        });
        
        setFocusable(true);
        setLocationRelativeTo(null);
        setResizable(false);
        setSize(600,600);
        
        setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        setLayout(null); 
        setVisible(true);
        //pontuação pont = new pontuação(janela, pontuação);
         
       
        ButtonHandler handler = new ButtonHandler(botao_cima, botao_baixo, botao_esq,botao_dir,novo_g,quad1);
 
        
        ImageIcon back = new ImageIcon("background.png");
        String mat[][]=new String [4][4];
        JLabel fundo = new JLabel(back);
     
        height = getHeight();
        width= getWidth();
        
        
        botao_cima.setBounds(width/2,50,53,56);
        botao_baixo.setBounds(width/2,500,20,20);
        botao_esq.setBounds(50,height/2,20,20);
        botao_dir.setBounds(500,height/2,20,20);
       
        novo_g.setBounds(10,10,100,20);
        
        
        botao_cima.setBorderPainted(true);
        botao_cima.addActionListener(handler);
        botao_baixo.addActionListener(handler);
        botao_esq.addActionListener(handler);
        botao_dir.addActionListener(handler);
        novo_g.addActionListener(handler);
        
        add(botao_baixo);
        add(botao_esq);
        add(botao_dir);       
        add(botao_cima);
        add(novo_g);
        
        Color fund = new Color(226,179,107);
        getContentPane().setBackground(fund);
        inicializa(this.matriz,this.quad);
        
        add(fundo);
        fundo.setBounds(height/2-175,width/2-175,350,350);
        
        
        
      
        
    }
    
    //atualiza o vetor de Jlabel com os valores da marteiz1
    public void executa(int matriz[][], JLabel quad[][]) {
         this.quad=quad;
         //pontuação pont =new pontuação(pontuação);
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
        //pont.pontua();
    }
   //Inicializa o vetor de Jlabel com os valores da matriz1; 
    private void inicializa(int matriz[][], JLabel quad[][]){
       String mat[][]=new String [4][4];
        this.quad=quad;
        int x,y;
        y=height/2-165;
        for(int i=0;i<4;i++){
           x=height/2-115;
            for(int j=0;j<4;j++){
                  
                mat[i][j] = Integer.toString(matriz[i][j]);
                this.quad[i][j] = new JLabel(mat[i][j]);
              // this.quad[i][j].setText(mat[i][j]);
                this.quad[i][j].setBounds(x,y,100,100);
                add(quad[i][j]);
               x=x+75;

            }
            y=y+75;
        }
    }
}
