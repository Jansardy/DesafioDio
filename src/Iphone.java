import Funcao.AparelhoTelefonico;
import Funcao.NavegadorInternet;
import Funcao.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet {

    //Aparelho Telefônico
    @Override
    public void ligar(String numero) {
        System.out.printf("Você está ligando para o número %s\n", numero);
    }

    @Override
    public void atender() {
        System.out.println("Atendendo Chamada...");
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando correio de voz...");
    }


    //Navegador na Internet
    @Override
    public void exibirPagina(String url) {
        System.out.printf("Exibindo página: %s\n", url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Nova aba adicionada.");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Página atualizada.");
    }

    //Reprodutor Musical
    @Override
    public void tocar() {
        System.out.println("Tocando música...");
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada.");
    }

    @Override
    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
}
