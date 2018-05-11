import java.util.Random;

import javax.swing.JOptionPane;

public class DuplaAleatorio {

    public static void main(String[] args) {
        
        int[] numeros = new int[30];
        Random aleatorio = new Random();
        String texto = "";

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

            if (i%2!=0 && i!=0) {
                texto+=String.valueOf(numeros[i])+"\n";
            }else{
                texto+=String.valueOf(numeros[i])+", ";
            }

        }

        JOptionPane.showMessageDialog(null, texto);

    }
    
}