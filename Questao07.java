import javax.swing.JOptionPane;

public class Questao07{

    public static void main(String[] args){

        char[] verificaCaracteres = new char[20];

        for (int i = 0; i < 20; i++) {
            verificaCaracteres[i]=(JOptionPane.showInputDialog("Digite o "+(i+1)+"º Caractere")).charAt(0);
        }

        for (int j = 0; j < 20; j++) {
            System.out.println(verificaCaracteres[j]);
        }

    }

}