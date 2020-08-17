package empresa;

public class Administrativo extends PessoaFisica{
	protected double bonificacao;
	
	public void demitirFuncionario(Funcionario func) {
		System.out.println("O funcionario " + func.getNome() + " foi demitido!");
	}
	
	public double getBonificacao() {
		return super.getSalario() * this.bonificacao;
	}
	
	@Override
	public double getHolerite() {
		return super.getSalario() + this.getBonificacao();
	}
}
