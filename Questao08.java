import javax.swing.JOptionPane;

public class Questao08 {

    public static void main(String[] args) {
        
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de números a serem digitados"));
        int[] numerosDigitados=new int[quantidade],numerosPares=new int[quantidade],numerosImpares= new int[quantidade];
        String texto="Números digitados: ", textoPar="\nNúmeros pares: ",textoImpar="\nNúmeros ímpares: ";
        int indexPar=0,indexImpar=0;

        for (int i = 0; i < quantidade; i++) {
            numerosDigitados[i]=Integer.parseInt(JOptionPane.showInputDialog("Digite o "+(i+1)+"º número"));
            texto+= (i==quantidade-1 ?numerosDigitados[i]:numerosDigitados[i]+", ");

            

            if (numerosDigitados[i]%2==0) {
                textoPar+=numerosDigitados[i]+", ";
                numerosPares[indexPar]=numerosDigitados[i];
                indexPar++;
            }else{
                textoImpar+=numerosDigitados[i]+", ";
                numerosImpares[indexImpar]=numerosDigitados[i];
                indexImpar++;
            }

        }

        JOptionPane.showMessageDialog(null, texto+textoPar+textoImpar);
        for (int i = 0; i < indexPar; i++) {
            System.out.println("número par: "+numerosPares[i]);
        }
        for (int i = 0; i < indexImpar; i++) {
            System.out.println("número impar: "+numerosImpares[i]);
        }

    }
    
}