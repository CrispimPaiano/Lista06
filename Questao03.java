import javax.swing.JOptionPane;

public class Questao03 {

    public static void main(String[] args) {
        int quantidadeRegistros = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de registro"));
        double precosRegistro[] = new double[quantidadeRegistros], totalRegistro=0;
        String texto = "";

        for (int i = 0; i < quantidadeRegistros; i++) {
            precosRegistro[i]=Double.parseDouble(JOptionPane.showInputDialog("Digite o "+(i+1)+"º preço"));
            totalRegistro+=precosRegistro[i];
            texto+=(i+1)+"º preço é :"+precosRegistro[i]+"\n";
        }

        texto+="Soma total é: "+totalRegistro;

        JOptionPane.showMessageDialog(null, texto);

    }
    
}