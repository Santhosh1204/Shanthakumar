package com.valtech.tx.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.valtech.tx.entity.Tx;
import com.valtech.tx.repository.TxRepository;

@Service
public class TxServiceImpl implements TxService {
	@Autowired
   private TxRepository txRepository;
	
	    @Override
		public Tx createTx(Tx tx) {

	        return txRepository.save(tx) ;
	    }

	    @Override
		public Tx getTxById(Long id) {
	       
	        return txRepository.findById(id).get();
	    }

	   
	    @Override
		public List<Tx> getTxByAll() {
	   
	        return txRepository.findAll();
	    }

}
