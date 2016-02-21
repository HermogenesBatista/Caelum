package com.moge.Capt7;

public class Gerente extends Funcionario {
	private int senha;
	private int subordinados;
	
	Gerente(String cpf){
		
		super(cpf);
	}
	
	public int getSenha(){
		return this.senha;
	}
	
	public void setSenha(int senha){
		this.senha = senha;
	}
	
	public int getSubordinados(){
		return this.subordinados;
	}
	
	public void setSubordinados(int qtd){
		this.subordinados = qtd;
	}
	
	
	public void mostraDados(){
		super.mostraDados();
		System.out.println("Quantidade de Funcionarios Gerenciados: "+ this.getSubordinados());
		
	}

}
