class contatore implements Runnable {
    private String nome;

    public contatore(String nome) {
        this.nome = nome;
    }
    @Override
    public void run() {
        for (int i = 10; i >= 0; i--) {
            System.out.println(i);
        }
    }
}