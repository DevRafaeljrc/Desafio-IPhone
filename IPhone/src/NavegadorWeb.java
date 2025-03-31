class NavegadorWeb extends iPhone {
    public NavegadorWeb(String modelo, int armazenamento) {
        super(modelo, armazenamento);
    }

    public void abrirURL(String url) {
        System.out.println("Abrindo URL: " + url);
    }

    public void atualizarPagina() {
        System.out.println("Atualizando página...");
    }

    public void voltarPagina() {
        System.out.println("Voltando para página anterior");
    }
}