import javax.swing.JOptionPane;

public class Questao11 {

    public static void main(String[] args) {
        
        String nomes[] = new String[5], texto="";

        for (int i = 0; i < nomes.length; i++) {
            nomes[i]=JOptionPane.showInputDialog("Digite o seu "+(i+1)+"º nome:");

            if (i==(nomes.length-1)) {
                texto+=nomes[i]+".";
            }else if (i==(nomes.length-2)) {
                texto+=nomes[i]+" e ";
            }else{
                texto+=nomes[i]+", ";
            }

        }

        System.out.println(texto);

    }
    
}