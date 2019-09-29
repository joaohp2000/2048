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
   JLabel pontuação =new JLabel("Pontuação:");
   int matriz[][]= new int [4][4];
   Matriz teste =new Matriz(matriz);
   static int height;
   static int width;
   //ImageIcon N = new ImageIcon("n.jpg");
   JButton botao_cima = new JButton("");
   JButton botao_baixo = new JButton("");
   JButton botao_esq = new JButton("");
   JButton botao_dir = new JButton("");
   JButton novo_g = new JButton("Novo Jogo");

   banco_numero numero = new banco_numero();
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
 
        
        ImageIcon back = new ImageIcon("Grid.png");
        String mat[][]=new String [4][4];
        JLabel fundo = new JLabel(back);
     
        height = getHeight();
        width= getWidth();
        
        
        botao_cima.setBounds(width/2,50,20,20);
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
        
        Color fund = new Color(255,255,255);
        getContentPane().setBackground(fund);
        inicializa(this.matriz,this.quad);
        add(pontuação);
        pontuação.setBounds(400, 10,130,20);
        add(fundo);
        fundo.setBounds(125,125,350,350);
        
        
        
      
        
    }
    
    //atualiza o vetor de Jlabel com os valores da marteiz1
    public void executa(int matriz[][], JLabel quad[][]) {
         this.quad=quad;
         String pont = Integer.toString(Matriz.getPontuação());
         pont = "pontuação:"+pont;
         pontuação.setText(pont);
         
        
        int x1,y1=150;
        
        for(int i=0;i<4;i++){
            x1=150;
            for(int j=0;j<4;j++){
                this.quad[i][j].setIcon(null);
                this.quad[i][j].setBounds(x1,y1,70,70);
                 if(matriz[i][j]!=0){
                  this.quad[i][j].setIcon(numero.getLabel(matriz[i][j]));
                 }
 
                 x1=x1+79;
            }
            y1=y1+80;
        }
        
        //pont.pontua();
    }
   //Inicializa o vetor de Jlabel com os valores da matriz1; 
    public void inicializa(int matriz[][], JLabel quad[][]){
       String mat[][]=new String [4][4];
        this.quad=quad;
        int x,y, x1,y1=150;
        y=height/2-175;
        pontuação.setText("Pontuação:");
        for(int i=0;i<4;i++){
           x1=150;
           x=height/2-175;
            for(int j=0;j<4;j++){
                 if(matriz[i][j]!=0){
                  this.quad[i][j] = new JLabel(numero.getLabel(matriz[i][j]));
                 }
                 else{
                   this.quad[i][j] = new JLabel();
                 }
               // mat[i][j] = Integer.toString(matriz[i][j]);
                 //new JLabel(mat[i][j]);
              // this.quad[i][j].setText(mat[i][j]);
                this.quad[i][j].setBounds(x1,y1,70,70);
                add(quad[i][j]);
               x1=x1+80;

            }
            y1=y1+80;
        }
    }
}
