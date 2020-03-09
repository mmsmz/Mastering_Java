package MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.fileprocessors;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class StockFileData {
	
	List<HashMap<String, Double>> data = new LinkedList<>();
	// this is a List of Maps
	public void printData(){
		System.out.println(data);
	}
	
	public void addData(List<HashMap<String, Double>> dataIn){
		data = dataIn;
	}
}
