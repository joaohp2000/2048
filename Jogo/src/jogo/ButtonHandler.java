/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jogo;

/**
 *
 * @author 18712919
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;

import static jogo.Jogo.matriz1;

public class ButtonHandler implements ActionListener{
 private JButton ok, cancela ,cima, baixo, esq, dir;
 Matriz teste = new Matriz(matriz1);
 Interface janela = new Interface();
 JLabel quad[][]= new JLabel [4][4];
 char in;
public ButtonHandler(JButton cima, JButton baixo, JButton esq, JButton dir ,JLabel quad[][]) {
        this.quad=quad;
        this.cima = cima;
        this.baixo = baixo;
        this.esq = esq;
        this.dir = dir;
    }
 
 

 @Override
 public void actionPerformed(ActionEvent evento) {
  if(evento.getSource() == cima){
    teste.cima(matriz1);
    janela.executa(matriz1,quad);
    System.out.append("cima");
  }
  if(evento.getSource() == baixo)
   teste.baixo(matriz1);
    janela.executa(matriz1,quad);
 
 if(evento.getSource() == esq){
   teste.esquerda(matriz1);
    janela.executa(matriz1,quad);
 }
if(evento.getSource() == dir){
   teste.direita(matriz1);
    janela.executa(matriz1,quad);
 }
teste.inserir_matriz(matriz1);
janela.executa(matriz1,quad);
 }
}

