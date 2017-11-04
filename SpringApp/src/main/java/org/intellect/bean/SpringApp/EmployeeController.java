package org.intellect.bean.SpringApp;

import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

import org.intellect.bean.SpringApp.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeeController {
	
	@Autowired
	EmployeeService employeeService;
	
	
	@GetMapping
	public List<EmployeeService> getAll(){
		return employeeService.get();
			
	}
	
	@PostMapping
	public ResponseBody post(EmployeeDTO empDTO){
		Emloyee emp = employeeService.add(empDTO);
		return ResponseEntity(null);
	}
	
	private ResponseBody ResponseEntity(Object object) {
		// TODO Auto-generated method stub
		return null;
	}

	@PutMapping
	public Emloyee put(Emloyee empDTO){
		Emloyee emp = employeeService.update(empDTO);
		return emp; 
	}
	
	@DeleteMapping
	public void delete(EmployeeDTO empDTO){
		employeeService.remove(empDTO);
	}

}
