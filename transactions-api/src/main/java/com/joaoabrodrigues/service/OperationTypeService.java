package com.joaoabrodrigues.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.joaoabrodrigues.model.OperationType;
import com.joaoabrodrigues.repository.OperationTypeRepository;

@Service
public class OperationTypeService {
	
	@Autowired
	private OperationTypeRepository operationTypeRepository;
	
	public void saveOperationType(OperationType operationType) {
		operationTypeRepository.save(operationType);
	}
	
	public void updateOperationType(OperationType operationType, String id) {
		operationType.setOperationTypeId(id);
		saveOperationType(operationType);
	}
	
	public List<OperationType> getOperationTypes() {
		return operationTypeRepository.findAll();
	}
	
	public void deleteOperationType(String id) {
		operationTypeRepository.delete(id);
	}

}
