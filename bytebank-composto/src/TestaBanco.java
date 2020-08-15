public class TestaBanco {
	
	public void main(String[] args) {
		Cliente paulo = new Cliente();
		paulo.nome = "Paulo Siveira";
		paulo.cpf = "222.222.222.22";
		paulo.profissao = "Programador";
		
		Conta contaDoPaulo = new Conta();
		contaDoPaulo.deposita(100);
		
		contaDoPaulo.titular = paulo;
		System.out.println(contaDoPaulo.titular.nome);
		System.out.println(contaDoPaulo.titular);
	}
}
