package com.mokeu.datasets;

public class LongEntry implements DataEntry{
	private long mData=0;
	public LongEntry(){
		this(0);
	}
	public LongEntry(long data){
		this.mData=data;
	}
	public void setData(long data){
		this.mData=data;
	}
	@Override
	public String write() {
		return ""+this.mData;
	}
	
}