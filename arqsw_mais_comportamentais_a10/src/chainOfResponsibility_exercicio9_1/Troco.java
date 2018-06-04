package chainOfResponsibility_exercicio9_1;

public class Troco implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public void debita(ValorProduto valorProduto, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorMoeda() == 0) {
			valorProduto.setValorAtual(valorProduto.getValorAtual() - 0);
			System.out.println("Valor do produto:" + valorProduto.getValorAtual());

		}
		if (valorProduto.getValorAtual() <= 0) {
			System.out.println("");
			System.out.println("PRODUTO: " + valorProduto.getNomeProduto() + " ENTREGUE.");
			System.out.println("TROCO: " + valorProduto.getValorAtual() * -1);
		} else {
			System.out.println("FALTA: " + valorProduto.getValorAtual() + " PARA: " + valorProduto.getNomeProduto());

		}

	}
}
