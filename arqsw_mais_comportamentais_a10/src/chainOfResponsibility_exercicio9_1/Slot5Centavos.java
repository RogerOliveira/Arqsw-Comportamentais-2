package chainOfResponsibility_exercicio9_1;

public class Slot5Centavos implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public void debita(ValorProduto valorProduto, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorMoeda() == 0.05) {
			valorProduto.setValorAtual(valorProduto.getValorAtual() - 0.05);
			System.out.println("Valor:" + valorProduto.getValorAtual());

		} else {

			nextInChain.debita(valorProduto, valorMoeda);

		}
	}

}
