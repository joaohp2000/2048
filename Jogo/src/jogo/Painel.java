/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import javax.swing.JPanel;
import java.awt.Graphics;
/**
 *
 * @author 18712919
 */
public class Painel extends JPanel {
    public void paintComponent( Graphics g ){
    super.paintComponent( g );
        
   g.drawLine( 0, 0, getWidth(), getHeight() );
    g.drawLine( 0, getHeight(), getWidth(), 0 );
}
}
