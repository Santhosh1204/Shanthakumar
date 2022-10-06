package com.valtech.proj.training.day3;

import java.io.Reader;
import java.io.IOException;

public class Rot13Reader extends Reader{
	private Reader source;
	public Rot13Reader(Reader source) {
		// TODO Auto-generated constructor stub
		this.source=source;
	}
	@Override
	public int read(char[] cbuf, int off, int len) throws IOException {
		// TODO Auto-generated method stub
		char[] buffer=new char[cbuf.length];
		int i=source.read(buffer);
		System.out.println("Read"+i+" bytes"+" Read"+new String(buffer,0,i));
		if(i==-1) return -1;
		for(int j=0;j<i;j++) {
			
			cbuf[j]=Rot13Utility.rotate(buffer[j]);
			
		}
		return i;
	}

	@Override
	public void close() throws IOException {
		// TODO Auto-generated method stub
		source.close();
		
	}
	
}
