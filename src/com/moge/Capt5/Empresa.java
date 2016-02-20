package com.moge.Capt5;

public class Empresa {
	int pos_atual = 0;
	Funcionario[] empregados;
	
	void adiciona(Funcionario funcionario){
		if(this.pos_atual == this.empregados.length){
			System.out.println("Extrapolou o limite atual: "+this.pos_atual);
			Funcionario[] extend_empregado = new Funcionario[this.pos_atual+10];
			
			for(int i=0; i < this.empregados.length; i++){
				extend_empregado[i] = this.empregados[i];
			}
			
			this.empregados = extend_empregado;
			
		}
		
		this.empregados[this.pos_atual] = funcionario;
		this.pos_atual++;		
	}
	
	Funcionario returnFuncionario(int pos){
		
		return this.empregados[pos];
	}
	
}
