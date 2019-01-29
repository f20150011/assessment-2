package com.sapient.service;

import com.sapient.dto.Data;
import com.sapient.repository.IRepository;
import com.sapient.repository.RepositoryMongoDBImpl;
import com.sapient.repository.RepositoryPSQLImpl;

/**
 * 
 * @author shrshrir
 *
 */
public class ServiceImpl implements IService {

	private IRepository repository;
	
	/* (non-Javadoc)
	 * @see com.sapient.service.IService#process(com.sapient.dto.Data)
	 */
	@Override
	public void process(Data data) {
		
		// choose implementation of IRepository
		// repository= new RepositoryMongoDBImpl();
		repository= new RepositoryPSQLImpl();
		
		// TODO: Add business logic here
		
		// passing on to repository layer
		repository.save(data);

	}
	
}
