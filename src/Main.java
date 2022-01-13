public class Main {

    public static void main (String[] args){

        Cliente Eduardo = new Cliente();
        Eduardo.setNome("Eduardo");
        IConta cc = new ContaCorrente(Eduardo);

        IConta poupança = new ContaPoupança(Eduardo);

        cc.depositar(100);
        cc.transferencia(15,poupança);

cc.imprimirExtrato();
poupança.imprimirExtrato();

    }

}
