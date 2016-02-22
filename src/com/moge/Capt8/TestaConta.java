package com.moge.Capt8;

public class TestaConta {
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setEspecial(1100);
		
		System.out.println(conta.limite());
		conta.saca(2300);
	}
}