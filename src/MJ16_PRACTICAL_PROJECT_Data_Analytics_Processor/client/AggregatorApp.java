package MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.client;
import MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators.AggregatorProcessor;
import MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators.MaxAggregator;

import java.io.IOException;

public class AggregatorApp {
    public static void main(String[] args) throws IOException {
        MaxAggregator agg = new MaxAggregator();
        AggregatorProcessor<MaxAggregator> agggsProcessor = new AggregatorProcessor<> (agg,"src/MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor/table.csv");
        double value = agggsProcessor.runAggregator(1);
        System.out.println(value);
    }
}
