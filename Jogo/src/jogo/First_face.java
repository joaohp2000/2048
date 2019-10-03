/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import java.awt.event.ActionEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.ImageIcon;
import static jogo.Jogo.matriz1;
import static jogo.Jogo.quad1;

/**
 *
 * @author carlo
 */
public class First_face {
    
         
         JLabel Creditos = new JLabel("Creditos");
         ImageIcon gif = new ImageIcon("giff2.gif");
         ImageIcon black = new ImageIcon("fundo.jpg");
         ImageIcon start = new ImageIcon("start.png");
         ImageIcon neon = new ImageIcon("neon.png");
         JLabel Iniciar = new JLabel(start);
         JLabel fundo = new JLabel(gif);
         JLabel preto = new JLabel(black);
         JLabel capa = new JLabel(neon);
       // ImageIcon fundo = new ImageIcon("ERROR.png");
        //JLabel fundoI = new JLabel(fundo);
        
       //Pegando clique na label
    public void First_Face(){
        
        
            JFrame jf = new JFrame();
            
            
      Iniciar.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
             Interface jan = new Interface(matriz1,quad1,"2048");
             jf.setVisible(false);
        }
});
      
       Creditos.addMouseListener(new MouseAdapter(){
        public void mouseClicked(MouseEvent evento){
           System.out.println("Carlos Henrique Vieira Marques Ra:18720367");
            System.out.println("Joao Henrique Pereira Ra:187");
        }
});

    //label    
    jf.setFocusable(true);
    Iniciar.setBounds(450,450,100,100);
    capa.setBounds(200,-60,200,200);
    Creditos.setBounds(11,11,45,20);
    preto.setBounds(0,0,600,600);
    fundo.setBounds(0,0,600,600);
    
    jf.add(capa);
    jf.add(fundo);
    jf.add(Iniciar);
    jf.add(Creditos); 
    jf.add(preto);
   
      
      
       //jf.add(fundoI);
      // jf.setIconImage(fundo);
      //Janela
    jf.setTitle("MENU");
    jf.setSize(600,600);
    jf.setLocationRelativeTo(null);
    jf.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    jf.setVisible(true);
    
        }
}
   