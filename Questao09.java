import javax.swing.JOptionPane;

public class Questao09 {

    public static void main(String[] args) {
        
        double notas[]= new double[4], mediaNotas=0;
        String nomeDisciplina = JOptionPane.showInputDialog("Digite o nome da disciplina: "),
        texto="Notas digitadas:";

        for (int i = 0; i < notas.length; i++) {
            notas[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite a "+(i+1)+"º nota"));
            mediaNotas+=notas[i];
            texto+="\n"+(i+1)+"º Nota:"+notas[i];
        }

        mediaNotas/=notas.length;
        texto+="\nMédia: "+mediaNotas;

        JOptionPane.showMessageDialog(null, texto, nomeDisciplina, JOptionPane.INFORMATION_MESSAGE);

    }
    
}