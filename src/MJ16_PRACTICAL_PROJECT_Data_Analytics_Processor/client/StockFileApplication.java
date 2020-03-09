package MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.client;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import MJ14_PRACTICAL_PROJECT_StockMarketData.fileprocessors.StockFileData;
import MJ14_PRACTICAL_PROJECT_StockMarketData.fileprocessors.StockFileReader;

public class StockFileApplication {
	
//	public static void main(String args[]) throws IOException{
//		StockFileReader fr = new StockFileReader("src/MJ14_PRACTICAL_PROJECT_StockMarketData/table.csv");
//
//		List<HashMap<String, Double>> dataResult = populateStockFileData(fr.getHeaders(), fr.readFileData());
//		StockFileData fileData = new StockFileData();
//		fileData.addData(dataResult);
//		fileData.printData();
//		System.out.println(dataResult.size());
//	}
//	/**
//	 * Complete the method body so that it returns the given structure needed to
//	 * populate the data field in the StockFileData class.
//	 * @param headers
//	 * @param lines
//	 * @return List
//	 */
//	public static List<HashMap<String, Double>> populateStockFileData(List<String> headers, List<String> lines){
//		List<HashMap<String, Double>> dataResult = new ArrayList<>();
//		// Insert your code here.. 2nd code
//         for(String line : lines){
//            String values[] = line.split(",");
//            int cnt = 0;
//            HashMap<String, Double> headerValueMap = new HashMap<>();
//
//             for (String value : values) {
//                 // convert the String to Double
//                 double dval = Double.parseDouble(value);
//                 headerValueMap.put(headers.get(cnt), dval);
//                 cnt++;
//
//             }
//             dataResult.add(headerValueMap);
//         }
//
//		return dataResult;
//	}
	
	
}
