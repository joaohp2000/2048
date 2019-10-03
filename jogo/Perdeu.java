/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import javax.swing.JFrame;
import javax.swing.*; 
import java.awt.Color;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import static jogo.Jogo.matriz1;
import static jogo.Jogo.quad1;

/**
 *
 * @author carlo
 */
public class Perdeu extends JFrame {
    //criando matriz
     Matriz teste =new Matriz();
    
   //Carregando Imagens
   ImageIcon fundo = new ImageIcon("gameover.gif");//gif chuva
   ImageIcon perdeu = new ImageIcon("los.png");//msg de losee
   ImageIcon conft= new ImageIcon("confete.gif");//confete
   
   ImageIcon vit1 = new ImageIcon("botao2.jpg");//gasla
   ImageIcon fundo2= new ImageIcon("gif.gif");//gordao
   
   //Labels
   JLabel Chuvaa = new JLabel(fundo);//Fundo de chuva
   JLabel confetes = new JLabel(conft);//gif auxiliar confetes
   JLabel msg = new JLabel(perdeu);//gif de lose
   JLabel botao = new JLabel(vit1);//gif auxiliar
   
   JLabel gifprincipal = new JLabel(fundo2);//gif no meio
   
  
   //label pontuação
   ImageIcon pontos = new ImageIcon("pontos.png");
   JLabel pontuaçãomsg =new JLabel(pontos);
   JLabel pontuação =new JLabel();
   

   
  
    
    public void Perdeu() {
        Interface face = new Interface();
        face.setVisible(false);
        
        
       setResizable(false);
       setSize(600,600);
       setLocationRelativeTo(null);
       setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       setLayout(null); 
       setVisible(true);
       
       
       botao.setBounds(200,200,600,600);
      // gasla.setBorder(BorderFactory.createLineBorder(Color.white));
       Chuvaa.setBounds(0,0,600,600);
       msg.setBounds(50,-150,500,500);
       confetes.setBounds(0,0,600,600);
       gifprincipal.setBounds(-50,-50,700,700);
       pontuaçãomsg.setBounds(10,425,200,200);
   
       //Pintando
       //Color numero= new Color(250,250,250);
       pontuação.setBounds(200,425,200,200);
       pontuação.setForeground(Color.WHITE);
         
        getContentPane().setBackground(Color.black);
       
         String pont = Integer.toString(teste.getPontuação());
         pontuação.setText(pont);
         pontuação.setFont(new Font("Times new Roman", Font.BOLD, 30));
         
       //clique do mouse
           botao.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
             teste.zera(matriz1);
            face.executa(matriz1, quad1);
              setVisible(false);
        }
});
     
        //add(centro);
        add(msg);
        //add(confetes);
        add(botao);
        add(pontuação);
        add(pontuaçãomsg);
        add(Chuvaa);
        
        
       
    }
       

}