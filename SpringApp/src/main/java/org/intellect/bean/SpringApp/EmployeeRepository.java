package org.intellect.bean.SpringApp;
import org.springframework.stereotype.Repository;

//using Spring data JPA, by adding dependencies in pom
@Repository
public abstract class EmployeeRepository<Employee> implements Repository{

	public  void delete() {
		// TODO Auto-generated method stub
		
	}

	public Emloyee save(EmployeeDTO empDTO) {
		// TODO Auto-generated method stub
		return null;
	}

	public Emloyee flush(Emloyee emp) {
		// TODO Auto-generated method stub
		return null;
	}

	public Emloyee findOne(String id) {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
