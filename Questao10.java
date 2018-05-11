import javax.swing.JOptionPane;

public class Questao10 {

    public static void main(String[] args) {
        
        String nomesDados[] = new String[10], maiorNome="",menorNome="",texto="Nomes digitados: ";
        int minNome=Integer.MAX_VALUE, maxNome=Integer.MIN_VALUE,nomesComS=0,nomesComA=0,silvas=0;
        
        for (int i = 0; i < nomesDados.length; i++) {
            nomesDados[i]=JOptionPane.showInputDialog("Digite o "+(i+1)+"º nome COMPLETO:").trim();
            String[] sobrenome = nomesDados[i].split(" ");
            char primeiraLetra = nomesDados[i].toLowerCase().charAt(0);   

            if(nomesDados[i].length()<minNome) {
                menorNome=nomesDados[i];
                minNome=nomesDados[i].length();
            } 
            if(nomesDados[i].length()>maxNome) {
                maiorNome=nomesDados[i];
                maxNome=nomesDados[i].length();
            }
            if (primeiraLetra=='a') {
                nomesComA++;
            }
            if (primeiraLetra=='s') {
                nomesComS++;
            }
            if (sobrenome[sobrenome.length-1].equalsIgnoreCase("Silva")) {
                silvas++;
            }
            
            texto+="\nnome: "+nomesDados[i];

        }

        JOptionPane.showMessageDialog(null, 
           texto
           +"\nMaior nome: "+maiorNome
           +"\nMenor nome: "+menorNome
           +"\nPessoas com inicial S: "+nomesComS
           +"\nPessoas com inicial A: "+nomesComA
           +"\nPessoas com sobrenome \"Silva\": "+silvas,
            "Nomes", JOptionPane.PLAIN_MESSAGE
        );

    }
    
}