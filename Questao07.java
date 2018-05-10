import javax.swing.JOptionPane;

public class Questao07{

    public static void main(String[] args){

        String[] verificaCaracteres = new String[5];
        char[] vetorVogal = new char[20],vetorConsoante = new char[20],vetorEspecial = new char[20];
        String vogal="",consoante="",especial="";
        int qtdVogal=0,qtdConsoante=0,qtdEspecial=0;

        for (int i = 0; i < verificaCaracteres.length; i++) {
            verificaCaracteres[i]=JOptionPane.showInputDialog("Digite o "+(i+1)+"º caractere").toLowerCase();

            while(verificaCaracteres[i].length()!=1){
                verificaCaracteres[i]=JOptionPane.showInputDialog("Digite SOMENTE UM caractere").toLowerCase();
            }

            char caractere = verificaCaracteres[i].charAt(0);
            int numero = (int) caractere;

            if (numero==97||numero==101||numero==105||numero==111||numero==117) {
                vetorVogal[qtdVogal]=caractere;
                qtdVogal++;
            } else if(numero>97 && numero<123) {
                vetorConsoante[qtdConsoante]=caractere;
                qtdConsoante++;
            } else{
                vetorEspecial[qtdEspecial]=caractere;
                qtdEspecial++;
            }

        }

        for (int i = 0; i < qtdVogal; i++) {
            vogal+=(i<(qtdVogal-1)?vetorVogal[i]+", ":vetorVogal[i]+".");
        }
        for (int i = 0; i < qtdConsoante; i++) {
            consoante+=(i<(qtdConsoante-1)?vetorConsoante[i]+", ":vetorConsoante[i]+".");
        }
        for (int i = 0; i < qtdEspecial; i++) {
            especial+=(i<(qtdEspecial-1)?vetorEspecial[i]+", ":vetorEspecial[i]+".");
        }

        JOptionPane.showMessageDialog(null, 
            "Quantidade Vogais: "+qtdVogal
           +"\nQuantidade Consoantes: "+qtdConsoante
           +"\nQuantidade Especiais: "+qtdEspecial
           +"\nTipos Vogais: "+vogal
           +"\nTipos Consoantes: "+consoante
           +"\nTipos Especiais: "+especial
        
        );

    }

}