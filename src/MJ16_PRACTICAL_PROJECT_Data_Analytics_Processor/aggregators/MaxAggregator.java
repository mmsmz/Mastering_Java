package MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators;

import MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators.Aggregator;

import java.util.List;

public class MaxAggregator extends Aggregator {
	

	@Override
	public double calculate() {
		double max = numbers.get(0);
		for(double number : numbers){
			if(number > max){
				max = number;
			}
		}
		return max;
	}

	@Override
	public List<Double> getValues() {
		return numbers;
	}
	
}
