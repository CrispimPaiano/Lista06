import javax.swing.JOptionPane;

public class Questao02 {

    public static void main(String[] args) {
        int idades[]=new int[7];
        String texto ="";
        for (int i = 0; i < idades.length; i++) {
            idades[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º idade:"));
            texto+= (i+1)+"º Idade: "+idades[i]+"\n";            
        }

        JOptionPane.showMessageDialog(null, texto);

    }
    
}