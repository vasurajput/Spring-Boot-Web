package com.vasu.springbatch;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;

public class Reader implements ItemReader<String> {

	private String[] names = {"Vasu","Vishu", "Ayush","Sushmita","konika"};
	private int count;
	
	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		System.out.println("Inside Read Method");
		if(count < names.length) {
			return names[count++];
		}else {
			count = 0;
		}
		return null;
	}

}
