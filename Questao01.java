import javax.swing.JOptionPane;

public class Questao01 {

    public static void main(String[] args) {
        String nome[]=new String[25];
        for (int i = 0; i < nome.length; i++) {
            nome[i]=JOptionPane.showInputDialog("Digite o "+(i+1)+"º nome:");            
        }
    }
    
}