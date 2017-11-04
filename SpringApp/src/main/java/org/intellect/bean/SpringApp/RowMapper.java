package org.intellect.bean.SpringApp;

import com.fasterxml.jackson.databind.cfg.MapperConfig;

/*@Mapper(springModel="spring" )*/
public abstract class RowMapper {
	
	//EmployeeDTO INSTANCE = MapperConfig.getMapper(EmployeeDTO.class);
	abstract EmployeeMapperDTO toDTO(Emloyee emp);
	abstract EmployeeMapperDTO toEntity(EmployeeDTO empDTO);


}
