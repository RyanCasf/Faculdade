package br.com.fj.exercicio;

import java.math.BigDecimal;
import java.util.Date;

public class Exercicio07 {
	public static void main(String[] args) {
		
	}
	
	interface Contar {
		// Sacar para retirar um valor do saldo
		BigDecimal sabar();
		
		// Depositar	para adicionar um valor ao	saldo
		boolean depositar(BigDecimal valor);
		
		// Calcula Rendimento para	devolver o ganho
		BigDecimal calcularRendimento();
	}
	
	static class Conta implements Contar {
		private String titular;
		private long numero;
		private String agencia;
		private BigDecimal saldo;
		private Date abertura;
		
		Conta() { }
		Conta(String titular, long numero, String agencia, BigDecimal saldo, Date abertura) {
			setTitular(titular);
			setNumero(numero);
			setAgencia(agencia);
			setSaldo(saldo);
			setAbertura(abertura);
		}
		
		@Override
		public BigDecimal sabar() {
			return null;
		}

		@Override
		public boolean depositar(BigDecimal valor) {
			return false;
		}
		
		@Override
		public BigDecimal calcularRendimento() {
			return null;
		}

		public String getTitular() {
			return titular;
		}

		public void setTitular(String titular) {
			this.titular = titular;
		}

		public long getNumero() {
			return numero;
		}

		public void setNumero(long numero) {
			this.numero = numero;
		}

		public String getAgencia() {
			return agencia;
		}

		public void setAgencia(String agencia) {
			this.agencia = agencia;
		}

		public BigDecimal getSaldo() {
			return saldo;
		}

		public void setSaldo(BigDecimal saldo) {
			this.saldo = saldo;
		}

		public Date getAbertura() {
			return abertura;
		}

		public void setAbertura(Date abertura) {
			this.abertura = abertura;
		}
	}
}