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
   ImageIcon perdeu = new ImageIcon("mission.png");//msg de losee
   
   ImageIcon vit1 = new ImageIcon("los.png");//gasla
  
   
   //Labels
   JLabel fundoo = new JLabel(fundo);//Fundo de chuva
   
   JLabel capa = new JLabel(perdeu);//gif de lose
   JLabel botao = new JLabel(vit1);//gif auxiliar
   
 
   
  
   //label pontuação
   ImageIcon pontos = new ImageIcon("pontos.png");
   JLabel pontuaçãomsg =new JLabel(pontos);
   JLabel pontoo =new JLabel();
   

   
  
    
    public void Perdeu(int pontuacao) {
              
       Interface face = new Interface();
       setResizable(false);
       setSize(600,600);
       setLocationRelativeTo(null);
       setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
       setLayout(null); 
       setVisible(true);
       
       
       botao.setBounds(450,450,100,100);
      // gasla.setBorder(BorderFactory.createLineBorder(Color.white));
       fundoo.setBounds(0,0,600,600);
       capa.setBounds(200,0,200,200);
       pontuaçãomsg.setBounds(10,425,200,200);
   
       //Pintando
       //Color numero= new Color(250,250,250);
       pontoo.setBounds(200,425,200,200);
       pontoo.setForeground(Color.WHITE);
       
        //Calculando Pontuacao
        pontoo.setText(Integer.toString(pontuacao));
        pontoo.setFont(new Font("Times new Roman", Font.BOLD, 30));
       


        //clique do mouse
           botao.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
            face.zerando();
            setVisible(false);
        }
});
     
        
      
       add(capa);
        add(botao);
        add(pontoo);
        add(pontuaçãomsg);
        add(fundoo);
        
        
        
       
    }
       

}