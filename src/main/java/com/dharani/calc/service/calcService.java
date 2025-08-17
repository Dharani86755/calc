package com.dharani.calc.service;

import org.springframework.stereotype.Service;

@Service
public class calcService {

	public int add(int a, int b) {
		return a+b;
		
	}

    public int sub(int a, int b) {

        return a-b;
    }

	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}
}
