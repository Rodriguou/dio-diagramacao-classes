import dispositivos.iPhone;

public class Main {
    public static void main(String[] args) {
        iPhone iphone = new iPhone();

        iphone.ligar("40028922");
        iphone.atender();
        iphone.iniciarCorreioVoz();

        iphone.exibirPagina("www.google.com");
        iphone.adicionarNovaAba();
        iphone.atualizarPagina();

        iphone.tocar();
        iphone.pausar();
        iphone.selecionarMusica("Hunting For Your Dream");
    }
}