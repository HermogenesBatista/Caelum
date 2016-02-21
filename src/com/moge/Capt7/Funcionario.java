package com.moge.Capt7;

public class Funcionario {
	private static int id = 0;
	private int identify;
	private String nome;
	private String cpf;
	private double salario;
	
	Funcionario(String cpf){
		this.setCpf(cpf);
		this.setIdentify();
	}
	
	public void setCpf(String cpf){
		
		this.cpf = cpf;
	}
	
	public String getCpf(){
		
		return this.cpf;
	}
	
	public void setNome(String nome){
		
		this.nome = nome;
	}
	
	public String getNome(){
		
		return this.nome;
	}
	
	public void setSalario(double salario){
		
		this.salario = salario;
	}
	
	public double getSalario(){
		return this.salario;
	}
	
	private void setIdentify(){
		
		this.identify = Funcionario.getNextId();
		Funcionario.id++;
	}
	
	public int getIdentify(){
		return this.identify;
	}
	
	public static int getNextId(){
		
		return Funcionario.id+1;
	}
	
	public void mostraDados(){
		System.out.println("\nId: "+ this.getIdentify());
		System.out.println("Nome: "+ this.getNome());
		System.out.println("Salario: "+ this.getSalario());
		System.out.println("Cpf: "+ this.getCpf());
	}
}
