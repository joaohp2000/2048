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
   
   //Botoes
    JLabel cima = new JLabel("cima");
    JLabel baixo = new JLabel("baixo");
    JLabel esq = new JLabel("esquerda");
    JLabel dir = new JLabel("direita");
    JLabel novo = new JLabel("Novo_Jogo"); 
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
         
       
       
 
        
        ImageIcon back = new ImageIcon("background.png");
        String mat[][]=new String [4][4];
        JLabel fundo = new JLabel(back);
     
        height = getHeight();
        width= getWidth();
        
        
        cima.setBounds(width/2,50,53,56);
        baixo.setBounds(width/2,500,20,20);
        esq.setBounds(50,height/2,20,20);
        dir.setBounds(500,height/2,20,20);
        novo.setBounds(10,10,100,20);
        
        add(baixo);
        add(esq);
        add(dir);       
        add(cima);
        add(novo);
        
        Color fund = new Color(0,0,0);
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
