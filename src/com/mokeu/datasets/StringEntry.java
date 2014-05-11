package com.mokeu.datasets;

public class StringEntry implements DataEntry{
	private String mData="";
	public StringEntry(){
		this("");
	}
	public StringEntry(String data){
		this.mData=data;
	}
	public void setData(String data){
		this.mData=data;
	}
	@Override
	public String write() {
		return this.mData;
	}
	
}