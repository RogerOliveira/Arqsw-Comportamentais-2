package chainOfResponsibility_exercicio9_1;

public class Slot1Real implements Chain {

	private Chain nextInChain;

	@Override
	public void setNextChain(Chain nextChain) {
		this.nextInChain = nextChain;

	}

	@Override
	public void debita(ValorProduto valorProduto, ValorMoeda valorMoeda) {
		if (valorMoeda.getValorMoeda() == 1.0) {
			valorProduto.setValorAtual(valorProduto.getValorAtual() - 1.0);
			System.out.println("Valor:" + valorProduto.getValorAtual());

		} else {

			nextInChain.debita(valorProduto, valorMoeda);

		}
	}

}
