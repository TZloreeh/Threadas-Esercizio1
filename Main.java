class Main {
    public static void main(String[] args) {

        Thread th1 = new Thread(new contatore("contatore"));
        th1.start();
    }
}