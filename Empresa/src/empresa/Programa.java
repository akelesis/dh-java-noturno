package empresa;

import java.util.ArrayList;
import java.util.List;

public class Programa {
	public static void main(String[] args) {
		Gerente g1 = new Gerente();
		g1.setNome("Ruann");
		g1.setSalario(20000);
		
		PessoaFisica pf1 = new PessoaFisica();
		pf1.setNome("Diego");
		pf1.setSalario(2000);
		//System.out.println(pf1.getHolerite());
		
		PessoaJuridica pj1 = new PessoaJuridica();
		pj1.setNome("Mario Luz");
		
		pj1.setSalario(5000);
		
		
		//g1.demitirFuncionario(pf1);
		
		//System.out.println(g1.getHolerite());
		
		
		List<Funcionario> funcionarios = new ArrayList<>();
		
		funcionarios.add(g1);
		funcionarios.add(pf1);
		funcionarios.add(pj1);
		
		System.out.println(funcionarios);
		
		for (Funcionario funcionario : funcionarios) {
			System.out.println(funcionario.getNome() + " - R$" + funcionario.getSalario());
		}
	}
}
