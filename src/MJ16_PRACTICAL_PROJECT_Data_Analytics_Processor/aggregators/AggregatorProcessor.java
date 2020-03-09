package MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators;
import MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.aggregators.Aggregator;
import MJ16_PRACTICAL_PROJECT_Data_Analytics_Processor.fileprocessors.StockFileReader;

import java.io.IOException;
import java.util.List;

public class AggregatorProcessor<T extends Aggregator> {

    T aggregator;
    String file;

    public AggregatorProcessor(T aggregator, String file) {
        super();
        this.aggregator = aggregator;
        this.file = file;
    }

    public double runAggregator(int colIdx) throws IOException {
        StockFileReader stockFileReader = new StockFileReader(file);
        List<String> lines = stockFileReader.readFileData();
        colIdx--;
        for (String line : lines) {
            String numbers[] = line.split(",");
//            Number value = Double.parseDouble(numbers[colIdx]);
//            aggregator.add(value.doubleValue());
            double value = Double.parseDouble(numbers[colIdx]);
            aggregator.add(value);
        }
        double number = aggregator.calculate();
        return number;
    }
}
