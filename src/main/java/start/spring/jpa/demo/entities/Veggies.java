package start.spring.jpa.demo.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@SuppressWarnings("serial")
@Entity
@Table
public class Veggies implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer itemId;
	@Column
	private String itemName;
	@Column
	private String veggieType;
	@Column
	private Double unitCost;
	@Column
	private String prefferedUnit;
	
	public Veggies() {}

	public Veggies(Integer itemId, String itemName, String veggieType, Double unitCost, String prefferedUnit) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.veggieType = veggieType;
		this.unitCost = unitCost;
		this.prefferedUnit = prefferedUnit;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
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
		return "Veggies [itemId=" + itemId + ", itemName=" + itemName + ", veggieType=" + veggieType + ", unitCost="
				+ unitCost + ", prefferedUnit=" + prefferedUnit + "]";
	}
	
	
}
