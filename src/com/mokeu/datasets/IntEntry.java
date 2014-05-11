package com.mokeu.datasets;

public class IntEntry implements DataEntry{
	private int mData=0;
	public IntEntry(){
		this(0);
	}
	public IntEntry(int data){
		this.mData=data;
	}
	public void setData(int data){
		this.mData=data;
	}
	@Override
	public String write() {
		return ""+this.mData;
	}
	
}