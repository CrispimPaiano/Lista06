import javax.swing.JOptionPane;

public class Questao04 {

    public static void main(String[] args) {
    String[] tamanhoCamisa = new String[40];
    int camisaPP=0,camisaP=0,camisaM=0,camisaG=0,camisaGG=0,camisaXG=0,camisaXGG=0;

        for (int i = 0; i < 40; i++) {
            tamanhoCamisa[i] = JOptionPane.showInputDialog(null, 
                            "Selecione seu tamanho",
                            "Camisa",
                            JOptionPane.QUESTION_MESSAGE,
                            null,
                            new Object[]{
                                "PP","P","M","G","GG","XG","XGG"
                            },
                            ""
            ).toString();

            if (tamanhoCamisa[i]=="PP") {
                camisaPP++;
            } else if (tamanhoCamisa[i]=="P") {
                camisaP++;
            } else if (tamanhoCamisa[i]=="M") {
                camisaM++;
            } else if (tamanhoCamisa[i]=="G") {
                camisaG++;
            } else if (tamanhoCamisa[i]=="GG") {
                camisaGG++;
            } else if (tamanhoCamisa[i]=="XG") {
                camisaXG++;
            } else if (tamanhoCamisa[i]=="XGG") {
                camisaXGG++;
            }                     

        }  
        
        JOptionPane.showMessageDialog(null, 
            "Quantidade de camisas PP: "+camisaPP+
            "\nQuantidade de camisas P: "+camisaP+
            "\nQuantidade de camisas M: "+camisaM+
            "\nQuantidade de camisas G: "+camisaG+
            "\nQuantidade de camisas GG: "+camisaGG+
            "\nQuantidade de camisas XG: "+camisaXG+
            "\nQuantidade de camisas XGG: "+camisaXGG, 
            "Resultado das camisas", JOptionPane.PLAIN_MESSAGE
        );

    }                        
}
