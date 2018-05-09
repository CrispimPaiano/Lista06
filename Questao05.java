import javax.swing.JOptionPane;

public class Questao05 {

	public static void main(String[] args) {

		int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de jogos a serem cadastrados"));
		String[] nomeGames = new String[quantidade];
		int[] precoJogos = new int[quantidade];
		String texto="Nome e quantidade:";
		
		for (int i = 0; i < nomeGames.length; i++) {
			nomeGames[i] = JOptionPane.showInputDialog("Digite o nome do "+(i+1)+"º jogo:");
			precoJogos[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite a quantidade de estoque do jogo:"));
			
			texto+="\n"+nomeGames[i]+":  "+precoJogos[i];
		}

		JOptionPane.showMessageDialog(null, texto, "Estoque", JOptionPane.PLAIN_MESSAGE, null);;
		
	}

}
