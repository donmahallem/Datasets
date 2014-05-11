package com.mokeu.datasets;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

public class DataSet {
	private List<DataEntry> mData = new ArrayList<DataEntry>();
	private String mDatasetName=""+System.currentTimeMillis();
	public DataSet(String name){
		mDatasetName=name;
	}
	public synchronized void addData(DataEntry entry) {
		mData.add(entry);
	}

	/**
	 * Saves the Dataset under its name in the provided directory
	 * @param file 
	 * @throws IOException
	 */
	public void save(File file) throws IOException {
		if(!file.isDirectory()){
			try {
				throw new Exception("PLEASE PROVIDE DIRECTORY");
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		File outFile=new File(file,mDatasetName+".txt");
		OutputStream stream = new FileOutputStream(outFile);
		this.save(stream);
		stream.close();
	}

	/**
	 * Saves the dataset to the provided outputstream
	 * @param stream
	 * @throws IOException
	 */
	public synchronized void save(OutputStream stream) throws IOException {
		for (DataEntry data : mData) {
			stream.write((data.write()+"\n").getBytes(Charset.forName("UTF-8")));
		}
	}

	/**
	 * Adds an String to the data set
	 * @param data
	 */
	public synchronized void write(String data) {
		this.mData.add(new StringEntry(data));
	}

	/**
	 * Adds an Int to the data set
	 * @param data
	 */
	public synchronized void write(int data) {
		this.mData.add(new IntEntry(data));
	}

	/**
	 * Adds an Long to the data set
	 * @param data
	 */
	public synchronized void write(long data) {
		this.mData.add(new LongEntry(data));
	}
}