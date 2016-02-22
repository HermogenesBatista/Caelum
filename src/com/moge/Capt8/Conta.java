package com.moge.Capt8;

public class Conta {
	private int numConta;
	private int digit;
	private double saldo;
	private double especial;
	
	public void atualiza(double new_value){
		this.saldo += new_value;
	}
	
	public double limite(){
		return this.saldo + this.especial;
	}
	
	public boolean saca(double sacar){
		double tmp_saca = this.limite() - sacar;
		System.out.println(tmp_saca);
		if(tmp_saca < (-this.limite())){
			System.out.println("Não permitido sacar! Limite ultrapassado: -" + this.limite());
			return false;
		} else {
			this.atualiza(-sacar);
			return true;
		}
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public void setEspecial(double especial){
		this.especial= especial;
	}
}
