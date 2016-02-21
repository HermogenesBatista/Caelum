package com.moge.Capt7;

public class TestGerente {
	
	public static void main(String[] args){
		Funcionario f = new Funcionario("07723870442");
		f.setSalario(1800);
		f.mostraDados();
		
		Funcionario f2 = new Funcionario("7172836139182");
		f2.setSalario(2000);
		f2.mostraDados();
		
		Gerente g = new Gerente("878123125");
		g.setSubordinados(10);
		g.setSalario(3000);
		g.mostraDados();
	}

}
