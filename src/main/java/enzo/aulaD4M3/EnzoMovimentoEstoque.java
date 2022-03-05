package enzo.aulaD4M3;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Date;

public class EnzoMovimentoEstoque {
	private EnzoTipoMovimentoEstoque tipo;
	private Date data;
	private BigDecimal quantidade;
	private BigDecimal valorUnitário;

	public EnzoMovimentoEstoque(EnzoTipoMovimentoEstoque tipo, Date data, BigDecimal quantidade, BigDecimal valorUnitário) {
		this.tipo = tipo;
		this.data = data;
		this.quantidade = quantidade;
		this.valorUnitário = valorUnitário;
	}
	
	public EnzoTipoMovimentoEstoque getTipo() {
		return tipo;
	}
	public Date getData() {
		return data;
	}
	public BigDecimal getQuantidade() {
		return quantidade.setScale(2,RoundingMode.HALF_DOWN);
	}
	public BigDecimal getValorUnitário() {
		return valorUnitário.setScale(2,RoundingMode.HALF_DOWN);
	}
	
}
