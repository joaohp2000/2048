/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WS;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
/**
 *
 * @author John
 */
public class Arquivo {
     String Caminho =new String("arq.txt");
 

    String Vari =new String();
    public Arquivo()
    {
    
    }
    public static String Read(){ //le o arquivo txt
        String conteudo = "";
        try {
            FileReader arq = new FileReader("arq.txt");
            BufferedReader lerArq = new BufferedReader(arq);
            String linha="";
            try {
                linha = lerArq.readLine();
                while(linha!=null){
                    conteudo += linha;
                    linha = lerArq.readLine();
                }
                arq.close();
                return conteudo;
            } catch (IOException ex) {
                System.out.println("Erro: Não foi possível ler o arquivo!");
                return "";
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Erro: Arquivo não encontrado!");
            return "";
        }
    }
    
    public static boolean Write(String Texto){ //escreve no arquivo txt
        try {
            FileWriter arq = new FileWriter("arq.txt");
            PrintWriter gravarArq = new PrintWriter(arq);
            gravarArq.println(Texto);
            gravarArq.close();
            return true;
        }catch(IOException e){
            System.out.println(e.getMessage());
            return false;
        }
    }
    
    public String getVari() {
        return Vari;
    }

    public void setVari(String Vari) {
        this.Vari = Vari;
    }

    
}
