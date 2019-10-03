/*

 * To change this license header, choose License Headers in Project Properties.

 * To change this template file, choose Tools | Templates

 * and open the template in the editor.

 */



package jogo;



import java.util.Random;
import javax.swing.*;


/**

 *

 * @author carlo

 */

public class Matriz {

    //Variaveis
   
     int i=0; int j=0; 
     JLabel quad[][] = new JLabel [4][4];
     int matriz[][] = new int [4][4];

     int contador=0; int num;

     Random random= new Random(); 
    
      int pontuação=0;

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

         

        int numero = random.nextInt(4) ;

            i= numero;



        int numero2 = random.nextInt(4);

            j=numero2;

        

        int numero3 = random.nextInt(8) ;

            num=numero3;

     }

     
     //funcao inserir na matriz

     public void inserir_matriz(int matriz[][]){

         this.matriz=matriz;
         if(verifica(this.matriz)==2048) System.out.println("Ganhou");
         if(verifica(this.matriz)==0){
         gerar_randomico();
         if(matriz[i][j]==0){
             if(num==4) matriz[i][j]=4;
             else matriz[i][j]=2;
         }
         else inserir_matriz(this.matriz);
         }
        }

    

    public int getPontuação() {

        return this.pontuação;

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

  public void _cima(int i){
      if(i==0) return;
      else{

          if(this.matriz[i-1][j]==0){
              this.matriz[i-1][j]=this.matriz[i][j];
              this.matriz[i][j]=0;
             // desliza.desliza_cima(icon, i);
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
       this.quad=quad;
               for(j=0;j<4;j++){
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
}}

   public int verifica(int matriz[][]){
        int aux[][] = new int [4][4];
        int pont = this.pontuação;
        int i =0,j=0, flag=0;
        for(i=0;i<4;i++){
            for(j=0;j<4;j++){
                aux[i][j]=matriz[i][j];
                if( matriz[i][j]==0) flag =1; 
                if( matriz[i][j]==2048) return 2048;
            }
            if(flag==1) return 0;
        }
           
               cima(aux);
               baixo(aux);
               esquerda(aux);
               direita(aux);
                if(pont==pontuação){
                    System.out.println("Perdeu!");
                    return 1;
                }
                else{
                    pontuação=pont;
                    return 0;
                }
           
           
   }
}



