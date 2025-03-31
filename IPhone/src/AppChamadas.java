class AppChamadas extends iPhone {
    public AppChamadas(String modelo, int armazenamento) {
        super(modelo, armazenamento);
    }

    public void fazerChamada(String numero) {
        System.out.println("Chamando: " + numero);
    }

    public void encerrarChamada() {
        System.out.println("Chamada encerrada");
    }

    public void muteChamada() {
        System.out.println("Chamada silenciada");
    }
}