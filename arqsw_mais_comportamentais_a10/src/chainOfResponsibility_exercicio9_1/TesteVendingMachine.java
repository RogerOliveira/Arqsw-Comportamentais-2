package chainOfResponsibility_exercicio9_1;

public class TesteVendingMachine {

	public static void main(String[] args) {
		Chain chain1centavo = new Slot1Centavo();
		Chain chain5centavos = new Slot5Centavos();
		Chain chain10centavos = new Slot10Centavos();
		Chain chain25centavos = new Slot25Centavos();
		Chain chain50centavos = new Slot50Centavos();
		Chain chain1real = new Slot1Real();
		Chain Troco = new Troco();

		chain1centavo.setNextChain(chain5centavos);
		chain5centavos.setNextChain(chain10centavos);
		chain10centavos.setNextChain(chain25centavos);
		chain25centavos.setNextChain(chain50centavos);
		chain50centavos.setNextChain(chain1real);
		chain1real.setNextChain(Troco);

		ValorProduto produto8 = new ValorProduto();
		produto8.setValorProduto(3.00);
		produto8.setValorAtual(3.00);
		produto8.setNomeProduto("Suco de Laranja");

		ValorMoeda moeda1 = new ValorMoeda();
		moeda1.setValorDaMoeda(0.05);
		ValorMoeda moeda2 = new ValorMoeda();
		moeda2.setValorDaMoeda(0.10);
		ValorMoeda moeda3 = new ValorMoeda();
		moeda3.setValorDaMoeda(0.50);
		ValorMoeda moeda4 = new ValorMoeda();
		moeda4.setValorDaMoeda(0.01);
		ValorMoeda moeda5 = new ValorMoeda();
		moeda5.setValorDaMoeda(1.0);

		ValorMoeda troco = new ValorMoeda();
		troco.setValorDaMoeda(0.0);

		chain1centavo.debita(produto8, moeda1);
		chain1centavo.debita(produto8, moeda2);
		chain1centavo.debita(produto8, moeda3);
		chain1centavo.debita(produto8, moeda4);
		chain1centavo.debita(produto8, moeda5);
		chain1centavo.debita(produto8, troco);	

	}
}
