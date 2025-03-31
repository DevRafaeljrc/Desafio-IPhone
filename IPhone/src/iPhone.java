class iPhone {
    private String modelo;
    private int armazenamento;

    public iPhone(String modelo, int armazenamento) {
        this.modelo = modelo;
        this.armazenamento = armazenamento;
    }

    public void mostrarDetalhes() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Armazenamento: " + armazenamento + "GB");
    }
}