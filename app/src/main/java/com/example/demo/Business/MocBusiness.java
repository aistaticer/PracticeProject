package com.example.demo.Business;

import org.springframework.stereotype.Service;

@Service
public class MocBusiness implements IBusiness{

	@Override
	public int ExchangeSize(int size){
		size = 190;
		return size;
	}
}
