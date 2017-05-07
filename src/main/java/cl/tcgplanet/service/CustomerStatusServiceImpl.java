package cl.tcgplanet.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cl.tcgplanet.domain.CodeName;
import cl.tcgplanet.persistence.CustomerStatusMapper;

@Service("customerStatusService")
public class CustomerStatusServiceImpl implements CustomerStatusService{
	
	@Autowired
	CustomerStatusMapper customerStatusMapper;

    public List<CodeName> getAllStatus(){
    	return customerStatusMapper.getAllStatus();
    }
}
