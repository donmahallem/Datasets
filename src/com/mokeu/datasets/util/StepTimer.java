package com.mokeu.datasets.util;

import java.util.ArrayList;
import java.util.List;

public class StepTimer extends Timer{
	private List<Long> mTimes=new ArrayList<Long>();
	public long step(){
		long time=this.stop();
		this.start();
		mTimes.add(time);
		return time;
	}
	@Override
	public String write() {
		String ret="";
		for(int i=0;i<mTimes.size();i++){
			ret+=""+i+": "+mTimes.get(i);
			if(i<mTimes.size()-1){
				ret+="\n";
			}
		}
		return ret;
	}
}