package MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators;

import MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators.Aggregator;

import java.util.List;

public class MeanAggregator extends Aggregator {
	
	public double calculate() {
		double result = 0;
		if(!numbers.isEmpty()){
			double value = 0.00;
			for(Number number : numbers){
				value+=number.doubleValue();
			}
			result = value/numbers.size();
		}
		return result;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}

}
