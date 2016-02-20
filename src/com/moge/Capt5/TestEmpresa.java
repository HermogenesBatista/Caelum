package com.moge.Capt5;

public class TestEmpresa {
	public static void main(String[] args){
		Empresa empresa = new Empresa();
		empresa.empregados = new Funcionario[5];
		
		for(int i=0; i < 26; i++){
			Funcionario funcionario = new Funcionario();
			funcionario.nome = "Hermogenes";
			funcionario.sobrenome = "Batista";
			funcionario.salario = 1800;
			
			empresa.adiciona(funcionario);
			System.out.println(empresa.returnFuncionario(i));
		}
	}
}
