/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;
import javax.swing.*;
/**
 *
 * @author 18712919
 */
public class Animação {
    public void desliza_cima(JLabel icon,int x){
        for(int i=0;i<80;i++){
            icon.setLocation(x, i);
        }
    }
}
