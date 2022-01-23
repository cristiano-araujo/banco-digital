
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Cristiano");
		
		Conta cc = new ContaCorrente(venilton);
		cc.depositar(100); //deposito 100
		
		Conta poupanca = new ContaPoupanca(venilton);
		cc.transferir(50, poupanca); //transferencia de 50
		
		cc.imprimirExtrato();
		poupanca.imprimirExtrato(); 
	}

}
