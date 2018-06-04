package chainOfResponsibility_exercicio9_1;

public interface Chain {
	
	public void setNextChain(Chain nextChain);
	
	public void debita(ValorProduto valorProduto, ValorMoeda valorMoeda);

}
