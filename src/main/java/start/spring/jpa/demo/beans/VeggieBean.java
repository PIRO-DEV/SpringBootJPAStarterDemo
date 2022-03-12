package start.spring.jpa.demo.beans;

public class VeggieBean {
	
	private String veggieName;
	private String veggieType;
	private Double unitCost;
	private String prefferedUnit;
	
	public VeggieBean() {}

	public VeggieBean(String veggieName, String veggieType, Double unitCost, String prefferedUnit) {
		super();
		this.veggieName = veggieName;
		this.veggieType = veggieType;
		this.unitCost = unitCost;
		this.prefferedUnit = prefferedUnit;
	}

	public String getVeggieName() {
		return veggieName;
	}

	public void setVeggieName(String veggieName) {
		this.veggieName = veggieName;
	}

	public String getVeggieType() {
		return veggieType;
	}

	public void setVeggieType(String veggieType) {
		this.veggieType = veggieType;
	}

	public Double getUnitCost() {
		return unitCost;
	}

	public void setUnitCost(Double unitCost) {
		this.unitCost = unitCost;
	}

	public String getPrefferedUnit() {
		return prefferedUnit;
	}

	public void setPrefferedUnit(String prefferedUnit) {
		this.prefferedUnit = prefferedUnit;
	}

	@Override
	public String toString() {
		return "VeggieBean [veggieName=" + veggieName + ", veggieType=" + veggieType + ", unitCost=" + unitCost
				+ ", prefferedUnit=" + prefferedUnit + "]";
	}
	
	
	
}
