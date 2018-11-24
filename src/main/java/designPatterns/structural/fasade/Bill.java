package designPatterns.structural.fasade;

public class Bill {
	private Integer amount;

	public Bill(Integer amount) {
		this.amount = amount;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

}
