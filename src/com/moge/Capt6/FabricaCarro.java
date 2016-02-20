package com.moge.Capt6;

public class FabricaCarro {
	private static int limiteFuncionario = 10; 
	private static FabricaCarro instance = null;
	private static Funcionario[] funcionarios = new Funcionario[FabricaCarro.limiteFuncionario];
	private static int adicionado = 0;
	
	protected FabricaCarro(){
	}
	
	public static FabricaCarro getInstance(){
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
		
		if(FabricaCarro.getTotalAdicionado() == FabricaCarro.getLimiteFuncionario()){
			return false;
		}
		
		return true;
	}
	
	private static void addFuncionario(Funcionario f){
		FabricaCarro.funcionarios[FabricaCarro.adicionado] = f;
		FabricaCarro.adicionado++;
	}
	
	public static int getTotalAdicionado(){
		return FabricaCarro.adicionado;
	}
	
	private static int getLimiteFuncionario(){
		return FabricaCarro.limiteFuncionario;
	}
	
	public void mostraFuncionarios(){
		for(int i=0; i < FabricaCarro.getTotalAdicionado(); i++){
			System.out.println(this.getFuncionario(i).getNome());
		}
	}
	
	public void mostraFuncionarios(int i){
		int limite = FabricaCarro.getLimiteFuncionario();
		int adicionados = FabricaCarro.getTotalAdicionado();
		System.out.println(limite);
		if(i >= limite){
			
			System.out.println("Indice informado é maior que o permitido! Limite: " + limite);
		} else if (i > adicionados -1){
			
			System.out.println("Indice informado é maior que o permitido! Limite: " + (adicionados-1));
		}else {
			
			System.out.println(this.getFuncionario(i).getNome());
		}
	}
	
	private Funcionario getFuncionario(int i){
		
		return this.funcionarios[i];
	}
	
}
