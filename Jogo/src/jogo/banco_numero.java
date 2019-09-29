/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import javax.swing.*;

/**
 *
 * @author User
 */
public class banco_numero {
    
    ImageIcon icon_2 = new ImageIcon("2.png");
    ImageIcon icon_4 = new ImageIcon("4.png");
    ImageIcon icon_8 = new ImageIcon("8.png");
    ImageIcon icon_16 = new ImageIcon("16.png");
    ImageIcon icon_32= new ImageIcon("32.png");
    ImageIcon icon_64= new ImageIcon("64.png");
    ImageIcon icon_128= new ImageIcon("128.png");
    ImageIcon icon_256= new ImageIcon("256.png");
    ImageIcon icon_512= new ImageIcon("512.png");
    ImageIcon icon_1024= new ImageIcon("1024.png");
    ImageIcon icon_2048= new ImageIcon("2048.png");
    
    JLabel label_2 = new JLabel(icon_2);
    JLabel label_4 = new JLabel(icon_4);
    JLabel label_8 = new JLabel(icon_8);
    JLabel label_16 = new JLabel(icon_16);
    JLabel label_32= new JLabel(icon_32);
    JLabel label_64= new JLabel(icon_64);
    JLabel label_128= new JLabel(icon_128);
    JLabel label_256= new JLabel(icon_256);
    JLabel label_512= new JLabel(icon_512);
    JLabel label_1024= new JLabel(icon_1024);
    JLabel label_2048= new JLabel(icon_2048);

    public banco_numero() {
    }
    
    public ImageIcon getLabel(int valor_matriz){
        switch(valor_matriz){
            case 2:
                return this.icon_2;  
            case 4:
                return this.icon_4;
            case 8:
                return this.icon_8;
            case 16:
                return this.icon_16;
            case 32:
                return this.icon_32;
            case 64:
                return this.icon_64;
            case 128:
                return this.icon_128;
            case 256:
                return this.icon_256;
            case 512:
                return this.icon_512;
            case 1024:
                return this.icon_1024;    
        }
        return this.icon_2048;
    }
    public void test(){
        JFrame janela = new JFrame();
        janela.setLocationRelativeTo(null);
        janela.setResizable(false);
        janela.setSize(600,600);
        
        janela.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
        janela.setLayout(null); 
        janela.setVisible(true);
        int height = janela.getHeight();
        int width= janela.getWidth();
        ImageIcon back = new ImageIcon("Grid.png");
       JLabel mat[][]=new JLabel [4][4];
        
        int x=100,y=150;
       
        for(int i=0;i<4;i++){
            x=150;
            for(int j=0;j<4;j++){
                mat[i][j]=new JLabel(icon_2);
                janela.add(mat[i][j]);
                mat[i][j].setBounds(x,y,70,70);
                x=x+80;
            }
            y=y+80;
        }
        
        JLabel fundo = new JLabel(back);
        janela.add(fundo);
        fundo.setBounds(125,125,350,350);
        
        
    }
}
