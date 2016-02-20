package com.moge.Capt6;

public class FabricaCarro {
	private static int limiteFuncionario = 10; 
	private static FabricaCarro instance = null;
	private static Funcionario[] funcionarios = new Funcionario[FabricaCarro.limiteFuncionario];
	private static int adicionado = 0;
	
	FabricaCarro(){
		
	}
	
	
	private FabricaCarro getInstance(){
		if(instance == null){
			instance = new FabricaCarro();
			
		}
		
		return instance;
	}
	
	public boolean insertFuncionario(Funcionario f){
		
		if(this.canInsert()){
			FabricaCarro.addFuncionario(f);
			return true;
		}
		
		return false;
	}
	
	private boolean canInsert(){
		
		if(this.getTotalAdicionado() == FabricaCarro.getLimiteFuncionario()){
			return false;
		}
		
		return true;
	}
	
	private static void addFuncionario(Funcionario f){
		FabricaCarro.funcionarios[FabricaCarro.adicionado] = f;
		FabricaCarro.adicionado++;
	}
	
	public int getTotalAdicionado(){
		return this.adicionado;
	}
	
	private static int getLimiteFuncionario(){
		return FabricaCarro.limiteFuncionario;
	}
	
	public void mostraFuncionarios(){
		for(Funcionario f: this.funcionarios){
			System.out.println(f.getNome());
		}
	}
	
	public void mostraFuncionarios(int i){
		int limite = FabricaCarro.getLimiteFuncionario();
		if(i >= limite){
			
			System.out.println("Indice informado é maior que o permitido! Limite: " + limite);
		} else {
			
			System.out.println(this.getFuncionario(i).getNome());
		}
	}
	
	private Funcionario getFuncionario(int i){
		
		return this.funcionarios[i];
	}
	
}
