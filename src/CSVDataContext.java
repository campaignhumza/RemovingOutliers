import com.sun.xml.internal.bind.v2.TODO;

import java.util.List;

public class CSVDataContext implements IDataContext {

    private String csvFilePath;

    public CSVDataContext(String csvFilePath) {
        this.csvFilePath = csvFilePath;
    }


    @Override
    public List<PricePoint> read() {
        //TO DO
        return null;

    }

    @Override
    public void write(List<PricePoint> dataSet) {
        //TO DO
    }
}
