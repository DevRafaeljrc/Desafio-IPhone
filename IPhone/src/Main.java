public class Main {
    public static void main(String[] args) {
        TocadorMP3 player = new TocadorMP3("iPhone 15", 256);
        NavegadorWeb navegador = new NavegadorWeb("iPhone 15 Pro", 512);
        AppChamadas telefone = new AppChamadas("iPhone 15 Plus", 128);

        System.out.println("=== Tocador MP3 ===");
        player.mostrarDetalhes();
        player.tocarMusica();
        player.selecionarMusica("Bohemian Rhapsody");
        player.pausarMusica();

        System.out.println("\n=== Navegador Web ===");
        navegador.mostrarDetalhes();
        navegador.abrirURL("https://www.example.com");
        navegador.atualizarPagina();

        System.out.println("\n=== App de Chamadas ===");
        telefone.mostrarDetalhes();
        telefone.fazerChamada("+55 11 98765-4321");
        telefone.muteChamada();
        telefone.encerrarChamada();
    }
}