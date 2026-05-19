public class Principal {
    public static void main(String[] args) {
        Carteira minhCarteira = new Carteira("Henrique");
        minhCarteira.depositar(0.5);
        System.out.println("Saldo de Bitcoin: "+minhCarteira.saldoBitcoin);
    }
} 