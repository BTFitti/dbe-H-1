package br.com.fiap.loja.desconto;

import java.math.BigDecimal;
import java.math.RoundingMode;

import br.com.fiap.loja.Pedido;

public abstract class Desconto {
	
	protected Desconto proximo;

	public Desconto(Desconto proximo) {
		super();
		this.proximo = proximo;
	}
	
	public final BigDecimal calcular(Pedido pedido) {
		if ( deveAplicar(pedido) ) {
			return aplicarDesconto(pedido);
		}
		
		return proximo.calcular(pedido).setScale(2, RoundingMode.HALF_UP);
	}

	protected abstract BigDecimal aplicarDesconto(Pedido pedido);
	protected abstract boolean deveAplicar(Pedido pedido);
	
	

}
