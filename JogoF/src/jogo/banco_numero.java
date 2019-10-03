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
    
    ImageIcon gif_2 = new ImageIcon("2.gif");
    ImageIcon gif_4 = new ImageIcon("4.gif");
    ImageIcon gif_8 = new ImageIcon("8.gif");
    ImageIcon gif_16 = new ImageIcon("16.gif");
    ImageIcon gif_32= new ImageIcon("32.gif");
    ImageIcon gif_64= new ImageIcon("64.gif");
    ImageIcon gif_128= new ImageIcon("128.gif");
    ImageIcon gif_256= new ImageIcon("256.gif");
    ImageIcon gif_512= new ImageIcon("512.gif");
    ImageIcon gif_1024= new ImageIcon("1024.gif");
    ImageIcon gif_2048= new ImageIcon("2048.gif");
    
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
    
    public String getGif(int valor_matriz){
        switch(valor_matriz){
            case 2:
                this.gif_2.getImage().flush();
                return "2.gif";  
            case 4:
                this.gif_4.getImage().flush();
                return "4.gif";
            case 8:
                this.gif_8.getImage().flush();
                return "8.gif";
            case 16:
                this.gif_16.getImage().flush();
                return "16.gif";
            case 32:
                this.gif_32.getImage().flush();
                return "32.gif";
            case 64:
                this.gif_64.getImage().flush();
                return "64.gif";
            case 128:
                this.gif_128.getImage().flush();
                return "128.gif";
            case 256:
                this.gif_256.getImage().flush();
                return "256.gif";
            case 512:
                this.gif_512.getImage().flush();
                return "512.gif";
            case 1024:
                this.gif_2.getImage().flush();
                return "1024.gif";    
        }
        return "2048.gif";
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
  
}
