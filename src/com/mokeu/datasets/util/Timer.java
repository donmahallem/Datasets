package com.mokeu.datasets.util;

import com.mokeu.datasets.DataEntry;

public class Timer implements DataEntry{
	private long mInterval=-1;
	private long mLastTime=0;
	public void start(){
		mLastTime=System.currentTimeMillis();
	}
	public long stop(){
		mInterval=System.currentTimeMillis()-mLastTime;
		return mInterval;
	}
	@Override
	public String write() {
		return ""+mInterval+"ms";
	}
}