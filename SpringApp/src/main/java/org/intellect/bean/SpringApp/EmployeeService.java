package org.intellect.bean.SpringApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Service;

import java.util.Collection;
import java.util.List;

import org.intellect.bean.SpringApp.*;
@Service
public class EmployeeService {
	
	
	@Autowired
	EmployeeRepository employeeRepository;
	
	@Autowired
	RowMapper mapper;
	
	public void EmployeeService(EmployeeRepository employeeRepository, RowMapper mapper){
		this.employeeRepository = employeeRepository;
		this.mapper = mapper;
	}
	public Emloyee add(EmployeeDTO empDTO){
		Emloyee emp = null;
		emp = employeeRepository.save(empDTO);
		return (emp);
		
	}
	@SuppressWarnings("rawtypes")
	public void remove(){
		employeeRepository.delete();
		
	}
	public Emloyee update(Emloyee dto){
		Emloyee emp = employeeRepository.findOne(dto.getId());
		//setting fields from dto to model
		emp.setfName(dto.getfName());
		emp.setLName(dto.getLName());
		return emp;	
	}
	
	
	public List<EmployeeService> get() {
		// TODO Auto-generated method stub
		return null;
	}
	
	public void remove(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		
	}
	

}
