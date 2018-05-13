import java.util.Random;

import javax.swing.JOptionPane;

public class DuplaAleatorio {

    public static void main(String[] args) {
        
        int[] numeros = new int[30];
        Random aleatorio = new Random();
        String texto = "Duplas Aleátorias: ";
        String[] nomesTurma = new String[30];
            nomesTurma[0]= "Allan";
            nomesTurma[1]= "Carlos";
            nomesTurma[2]= "Cidmar";
            nomesTurma[3]= "Crispim";
            nomesTurma[4]= "Daiana";
            nomesTurma[5]= "Dheniffer";
            nomesTurma[6]= "Gabriel Ferreira";
            nomesTurma[7]= "Gabriel Budke";
            nomesTurma[8]= "Guilherme";
            nomesTurma[9]= "Gustavo";
            nomesTurma[10]= "Henrique";
            nomesTurma[11]= "Jaqueline";
            nomesTurma[12]= "Joseph";
            nomesTurma[13]= "Kaio";
            nomesTurma[14]= "Leonardo Airam";
            nomesTurma[15]= "Leonardo Moreira";
            nomesTurma[16]= "Leticia";
            nomesTurma[17]= "Logan";
            nomesTurma[18]= "Lucas";
            nomesTurma[19]= "Marcio Pedro";
            nomesTurma[20]= "Marcio Schlosser";
            nomesTurma[21]= "Matheus";
            nomesTurma[22]= "Michele";
            nomesTurma[23]= "Nattana";
            nomesTurma[24]= "Patrick";
            nomesTurma[25]= "Rafael";
            nomesTurma[26]= "Ricardo";
            nomesTurma[27]= "Sara";
            nomesTurma[28]= "Thiago";
            nomesTurma[29]= "Wagner";


        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = aleatorio.nextInt(numeros.length);

            if(i!=0){
                for (int j = 0; j < i; j++) {
                        if (numeros[i]==numeros[j]) {
                            numeros[i]=aleatorio.nextInt(numeros.length);
                            j=-1;
                        }   
                }
            }    

        }
        
        for (int i = 0; i < numeros.length; i+=2) {
            texto+="\n"+nomesTurma[numeros[i]]+" e "+nomesTurma[numeros[i+1]];
        }

        JOptionPane.showMessageDialog(null, texto);

    }
    
}