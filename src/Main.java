import java.util.List;

public class Main {

    public static void main(String[] args) {

        IDataContext dataContext = new CSVDataContext(args[1]);

        List<PricePoint> dataSet = dataContext.read();

        dataContext.write(OutlierProcessor.removeOutliers(dataSet,OutlierComputes::isOuterFencesOutlier));

    }
}
