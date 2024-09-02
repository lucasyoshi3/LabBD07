package model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EntradaSaida {
	private int id;
	private int codigoProduto;
	private int quantidade;
	private Double valorTotal;
}
