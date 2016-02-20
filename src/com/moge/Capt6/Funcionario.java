package com.moge.Capt6;

public class Funcionario {
	private static int total;
	private int id;
	private double salario;
	private String nome;
	private String cpf;
	
	Funcionario(){
		Funcionario.total++;
		this.id = Funcionario.totalFuncionarios();
	}
	
	Funcionario(String nome){
		this();
		this.nome = nome;
	}
	
	public int getId(){
		return this.id;
	}
	
	public static int totalFuncionarios(){
		return Funcionario.total;
	}
	
	public void setNome(String nome){
		this.nome = nome;
	}
	
	public String getNome(){
		return this.nome;
	}
}
