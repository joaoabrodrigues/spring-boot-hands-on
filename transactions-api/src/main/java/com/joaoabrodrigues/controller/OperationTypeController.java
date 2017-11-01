package com.joaoabrodrigues.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.joaoabrodrigues.model.OperationType;
import com.joaoabrodrigues.service.OperationTypeService;

@RestController
@RequestMapping("/v1/operation")
public class OperationTypeController {
	
	@Autowired
	private OperationTypeService operationTypeService;
	
	@RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> addOperationType(@RequestBody OperationType operationType) {
		operationTypeService.saveOperationType(operationType);
		return ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.PATCH, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Void> updateAccountLimit(@PathVariable("id") String id, @RequestBody OperationType operationType) {
		operationTypeService.updateOperationType(operationType, id);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(path = "/{id}", method = RequestMethod.DELETE)
	public ResponseEntity<Void> deleteAccount(@PathVariable("id") String id) {
		operationTypeService.deleteOperationType(id);
		return ResponseEntity.ok().build();
	}
	
	@RequestMapping(path = "/limits", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public List<OperationType> getAccountsLimits() {
		return operationTypeService.getOperationTypes();
	}
}