public class TocadorMP3 extends iPhone {
    public TocadorMP3(String modelo, int armazenamento) {
        super(modelo, armazenamento);
    }

    public void tocarMusica() {
        System.out.println("Tocando música...");
    }

    public void pausarMusica() {
        System.out.println("Música pausada");
    }

    public void selecionarMusica(String musica) {
        System.out.println("Selecionando música: " + musica);
    }
} 


