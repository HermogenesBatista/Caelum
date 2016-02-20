package com.moge.Capt6;

public class TestaFuncionario {
	public static void main(String[] args){
		for(int i = 0; i < 15; i++){
			Funcionario f = new Funcionario();
			System.out.println(f.getId());
		}
		
		int total = Funcionario.totalFuncionarios();
		System.out.println(total);
	}
	
}
