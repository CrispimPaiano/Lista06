import javax.swing.JOptionPane;

public class Questao10 {

    public static void main(String[] args) {
        
        String nomesDados[] = new String[10], maiorNome="",menorNome="";
        int minNome=Integer.MAX_VALUE, maxNome=Integer.MIN_VALUE;
        
        for (int i = 0; i < nomesDados.length; i++) {
            nomesDados[i]=JOptionPane.showInputDialog("Digite o "+(i+1)+"º nome:");    

            if(nomesDados[i].length()<minNome) {
                menorNome=nomesDados[i];
                minNome=nomesDados[i].length();
            } else if(nomesDados[i].length()<minNome) {
                menorNome=nomesDados[i];
                minNome=nomesDados[i].length();
            }
        }


    }
    
}