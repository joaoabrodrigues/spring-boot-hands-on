package com.joaoabrodrigues.model;

import org.springframework.data.annotation.Id;

public class OperationType {

	@Id
	private String operationTypeId;
	
	private String description;
	
	private Integer chargeOrder;
	
	public OperationType() { }
	
	public OperationType(String operationTypeId, String description, Integer chargeOrder) {
		this.operationTypeId = operationTypeId;
		this.description = description;
		this.chargeOrder = chargeOrder;
	}

	public String getOperationTypeId() {
		return operationTypeId;
	}

	public void setOperationTypeId(String operationTypeId) {
		this.operationTypeId = operationTypeId;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getChargeOrder() {
		return chargeOrder;
	}

	public void setChargeOrder(Integer chargeOrder) {
		this.chargeOrder = chargeOrder;
	}
}
