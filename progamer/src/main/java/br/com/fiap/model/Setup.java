package br.com.fiap.model;

import java.math.BigDecimal;

public class Setup {
	private String description = "Descrição do setup";
	private String name = "Meu Setup";
	private BigDecimal price = new BigDecimal(2000);

	@Override
	public String toString() {
		return "Setup [description= " + description + ", name= " + name + ", price=" + price + "]";
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getPrice() {
		return price;
	}

	public void setPrice(BigDecimal price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
