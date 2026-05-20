public class Principal {
    public static void main(String[] args) {
        Carteira minhCarteira = new Carteira("Henrique", "1234");
        minhCarteira.depositar(0.5);
        System.out.println("Saldo de Bitcoin: "+minhCarteira.saldoBitcoin);
        System.out.println("Senha de Acesso: "+minhCarteira.senhaAcesso);
    }
} 