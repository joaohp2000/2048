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
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.*; 	
import javax.swing.JFrame;
import static jogo.Jogo.matriz1;
import static jogo.Jogo.quad1;
import javax.swing.ImageIcon;

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
   
   //Imagens
   ImageIcon N = new ImageIcon("n.png");
   ImageIcon S = new ImageIcon("s.png");
   ImageIcon W = new ImageIcon("w.png");
   ImageIcon E = new ImageIcon("e.png");
   ImageIcon rosa = new ImageIcon("ros.png");
   
   ImageIcon fundo2 = new ImageIcon("fundo3.jpg");
   JLabel fundo2I = new JLabel(fundo2);
   JLabel symbol = new JLabel(rosa);
   
  
   //Botoes
    JLabel cima = new JLabel(N);
    JLabel baixo = new JLabel(S);
    JLabel esq = new JLabel(W);
    JLabel dir = new JLabel(E);
    JLabel novo = new JLabel("Novo_Jogo"); 
    
    //colocando imagem nos numeros
     banco_numero numero = new banco_numero();
    public Interface() {
    }
   
   //evento teclado e incializa a frame do jogo
    public  Interface(int matriz[][], JLabel quad[][],String title) throws HeadlessException{
        super(title);
        this.quad=quad;
        this.matriz=matriz;
        
       //Usando mouse
         //Comandos do Mouse
          cima.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
             teste.cima(matriz1);
            executa(matriz1,quad);
            teste.inserir_matriz(matriz1);
            executa(matriz1,quad);
        }
});
           baixo.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
                teste.baixo(matriz1);
                executa(matriz1,quad);
                teste.inserir_matriz(matriz1);
                executa(matriz1,quad);
        }
});
          esq.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
                teste.esquerda(matriz1);
                executa(matriz1,quad);
                teste.inserir_matriz(matriz1);
                executa(matriz1,quad);
        }
});
          dir.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
                teste.direita(matriz1);
                executa(matriz1,quad);
                teste.inserir_matriz(matriz1);
                executa(matriz1,quad);
        }
});
          novo.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
                teste.zera(matriz1);
                executa(matriz1,quad);
                teste.inserir_matriz(matriz1);
                executa(matriz1,quad);
        }
}); 
       
        //Usando teclado
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
         
       
       
 
        
        ImageIcon back = new ImageIcon("gridw2.png");
        String mat[][]=new String [4][4];
        JLabel fundo = new JLabel(back);
     
        height = getHeight();
        width= getWidth();
        
        
        cima.setBounds(54,387,53,56);
        baixo.setBounds(71,537,20,20);
        dir.setBounds(137,471,20,20);
        esq.setBounds(2,467,20,20);
        novo.setBounds(10,10,100,20);
        symbol.setBounds(-20,380,200,200);
        fundo2I.setBounds(0,0,600,600);
        
        
        add(baixo);
        add(esq);
        add(dir);       
        add(cima);
        add(novo);
        add(symbol);
        
        
        Color fund = new Color(250,250,250);
        getContentPane().setBackground(fund);
        inicializa(this.matriz,this.quad);
        
        add(fundo);
        fundo.setBounds(height/2-175,width/2-175,350,350);
        
        add(fundo2I);
        
      
        
    }
    
   //atualiza o vetor de Jlabel com os valores da marteiz1
    public void executa(int matriz[][], JLabel quad[][]) {
         this.quad=quad;
         String pont = Integer.toString(Matriz.getPontuação());
         pont = "pontuação:"+pont;
         pontuação.setText(pont);
         
        
        int x1,y1=147;
        
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
        int x,y, x1,y1=147;
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
                this.quad[i][j].setBounds(x1,y1,74,70);
                add(quad[i][j]);
               x1=x1+80;

            }
            y1=y1+80;
        }
    }
}
