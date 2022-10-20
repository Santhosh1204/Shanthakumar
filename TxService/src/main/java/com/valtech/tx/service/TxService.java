package com.valtech.tx.service;

import java.util.List;

import com.valtech.tx.entity.Tx;

public interface TxService {

	Tx createTx(Tx tx);

	Tx getTxById(Long id);

	List<Tx> getTxByAll();

}