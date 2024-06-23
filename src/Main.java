import java.util.Scanner;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Jogador j1 = new Jogador("Bruna");
        Jogador j2 = new Jogador("Jogador Dois");
        Jogo jogo = new Jogo(j1,j2);

        while (!jogo.alguemGanhou()){
            InteracaoUsuario.mensagemEmbaralhando();
            jogo.baralho.embaralhar();
            jogo.distribuirCartas();
            while(!jogo.alguemPontuou()) {
                jogo.iniciarRodada();
            }
            InteracaoUsuario.exibirPlacar(j1.nome, jogo.pontuacaoA, j2.nome, jogo.pontuacaoB);
        }
    }
}