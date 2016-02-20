package com.moge.Capt6;

public class TestaFabrica {
	
	public static void main(String[] args){
		FabricaCarro fabrica = new FabricaCarro();
		
		Funcionario funcionario = new Funcionario();
		funcionario.setNome("Hermogenes");
		
		fabrica.insertFuncionario(funcionario);
		
		FabricaCarro fb2 = new FabricaCarro();
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.setNome("Batista");
		
		fb2.insertFuncionario(funcionario2);
		
		fb2.mostraFuncionarios();
		
		fabrica.mostraFuncionarios(2);
	}
}
