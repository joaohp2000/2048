/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package jogo;

import java.util.Random;

/**
 *
 * @author carlo
 */
public class Matriz {
    //Variaveis
     int i=0; int j=0; 
     int matriz[][] = new int [4][4];
     int contador=0; int num;
     Random random= new Random(); 
     public static  int pontuação=0;
    public Matriz(int matriz[][]) {
        this.matriz=matriz;
        
    }
    public void zera(int matriz[][]){
      for(i=0;i<4;i++){
        for(j=0;j<4;j++){
               matriz[i][j]=0;
           }
       }
      pontuação=0;
      inserir_matriz(matriz);
      inserir_matriz(matriz);
    }
   
    
     
     //Funcao gerar randomico 
     public void gerar_randomico(){
         
        double numero = random.nextDouble() *4 ;
            i=(int) numero;

        double numero2 = random.nextDouble() *4 ;
            j=(int) numero2;
        
        double numero3 = random.nextDouble() *4 ;
            num=(int) numero3;
     }
     
     
     //funcao inserir na matriz
     public void inserir_matriz(int matriz[][]){
         this.matriz=matriz;
         gerar_randomico();
         if(num==2)
         {
            if(matriz[i][j]==0)
            {
                matriz[i][j]=4;
            }
        
         }
         else
         {
             if(matriz[i][j]==0)
            {
                matriz[i][j]=2;
            }
             else
             {
                 inserir_matriz(this.matriz);

             }
        
         }
    
    
}     

    public static int getPontuação() {
        return pontuação;
    }
     
     //funcao printar matriz
  public void printar_matriz(int matriz[][]){ 
     this.matriz=matriz;
     System.out.println("");
    for(i=0;i<4;i++){
        for(j=0;j<4;j++){
            System.out.print(matriz[i][j]+" ");
                        }
                System.out.printf("\n");
                        }
    }
  int soma=0;
  public void _cima(int i){
      if(i==0) return;
      else{
          if(this.matriz[i-1][j]==this.matriz[i][j] ){
               this.matriz[i-1][j]=2*this.matriz[i][j];
                this.matriz[i][j]=0;   
              _cima(i-1);
          }
          if(this.matriz[i-1][j]==0){
              this.matriz[i-1][j]=this.matriz[i][j];
              this.matriz[i][j]=0;
              _cima(i-1);
          }
          _cima(i-1);
      }
  }
   public void _baixo(int i){
      if(i==3) return;
      else{
          if(this.matriz[i+1][j]==0){
              this.matriz[i+1][j]=this.matriz[i][j];
              this.matriz[i][j]=0;
              _baixo(i+1);
          }
          _baixo(i+1);
      }
  }
   public void _esquerda(int j){
       if(j==0) return;
      else{
          if(this.matriz[i][j-1]==0){
              this.matriz[i][j-1]=this.matriz[i][j];
              this.matriz[i][j]=0;
              _esquerda(j-1);
          }
          _esquerda(j-1);
      }
  }
   public void _direita(int j){
       if(j==3) return;
      else{
          if(this.matriz[i][j+1]==0){
              this.matriz[i][j+1]=this.matriz[i][j];
              this.matriz[i][j]=0;
              _direita(j+1);
          }
          _direita(j+1);
      }
  }
   
  //  desloca a matriz para cima e soma
   public void cima(int matriz[][]){
       this.matriz=matriz;
            
           for(j=0;j<4;j++){
               soma=0;
               // Desloca os valores para cima
               for(i=0;i<4;i++){
               _cima(i);
           }
       }
         
         
            for(j=0;j<4;j++){ // FAZ A SOMA DOS VALORES IGUAIS E COLOCA ZERO 
               for(i=0;i<3;i++){
               if(this.matriz[i][j]==this.matriz[i+1][j]){
                   this.matriz[i][j]=this.matriz[i+1][j]*2;
                   this.matriz[i+1][j]=0;
                   pontuação=pontuação+this.matriz[i][j];
                 //  printar_matriz(this.matriz);
               }
               
           }
       }
           for(j=0;j<4;j++){ // Desloca os valores para cima
               for(i=0;i<4;i++){
               _cima(i);
           }
       }

        
   } 
   //desloca a matriz para baixo e soma
   public void baixo(int matriz[][]){
       this.matriz=matriz;
           for(j=0;j<4;j++){
               for(i=3;i>=0;i--){
               _baixo(i);
                 //  printar_matriz(this.matriz);
               }
           }
 
            for(j=0;j<4;j++){
               for(i=3;i>0;i--){
               if(this.matriz[i][j]==this.matriz[i-1][j]){
                   this.matriz[i][j]=this.matriz[i-1][j]*2;
                   this.matriz[i-1][j]=0;
                   pontuação=pontuação+this.matriz[i][j];
                   
                 //  printar_matriz(this.matriz);
               }  
           }
       }
          for(j=0;j<4;j++){
               for(i=3;i>=0;i--){
               _baixo(i);
                 //  printar_matriz(this.matriz);
               }
           }
   } 
   //desloca matriz para direita e soma
   public void direita(int matriz[][]){
       this.matriz=matriz;
   
       for(i=0;i<4;i++){
           for(j=3;j>=0;j--){
              _direita(j);
           }
       }
           
            for(i=0;i<4;i++){
                for(j=3;j>0;j--){
               if(this.matriz[i][j]==this.matriz[i][j-1]){
                   this.matriz[i][j]=this.matriz[i][j]*2;
                   this.matriz[i][j-1]=0;
                   pontuação=pontuação+this.matriz[i][j];
                   
                 //  printar_matriz(this.matriz);
               }
           }
       }
          for(i=0;i<4;i++){
           for(j=3;j>=0;j--){
              _direita(j);
           }
       }
   } 
   // desoloca matriz para esquerda e soma
   public void esquerda(int matriz[][]){
       this.matriz=matriz;
       
       for(i=0;i<4;i++){
           for(j=0;j<4;j++){
               _esquerda(j);
                 //  printar_matriz(this.matriz);
               }
           }
            for(i=0;i<4;i++){
                for(j=0;j<3;j++){
               if(this.matriz[i][j]==this.matriz[i][j+1]){
                   this.matriz[i][j]=this.matriz[i][j]*2;
                   this.matriz[i][j+1]=0;
                   pontuação=pontuação+this.matriz[i][j];
                 //  printar_matriz(this.matriz);
               } 
           }
       }
    for(i=0;i<4;i++){
           for(j=0;j<4;j++){
               _esquerda(j);
                 //  printar_matriz(this.matriz);
               }
           }
   } 
   
}