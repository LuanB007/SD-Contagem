package com.ifpb.edu.quest2;
/**
 *
 * @author luan
 */
public class Quest2 {
    public static void main (String[] args){
     
    char consoante[] = {'B', 'C', 'D', 'F', 'G', 'H', 'J', 'K', 'L', 'M', 'N', 'P', 'Q', 'R', 'S', 'T', 'V', 'W', 'X', 'Y', 'Z'};
    char vogal[] = {'A', 'E', 'I', 'O', 'U'};
    int cont = 0;
    
    for(int i = 0; i < consoante.length; i++){
        for(int j = 0; j < vogal.length; j++){
            for(int k = 0; k < consoante.length; k++){
                for(int l = 0; l < vogal.length; l++){
                    if((consoante[i] != consoante[k]) | (vogal[j] != vogal[l])){
                        System.out.println("Palavra: " + consoante[i] + vogal[j] + consoante[k] + vogal[l]);
                        cont ++;
                    }
                }    
            }
        }
    }
        System.out.println("Quantidade  de palavras: " + cont);
    }
}
