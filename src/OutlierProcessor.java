import java.util.List;
import java.util.function.BiPredicate;

public class OutlierProcessor {


    public static List<PricePoint> removeOutliers(List<PricePoint> dataSet, BiPredicate<PricePoint,List<PricePoint>> biPredicate) {

        List<PricePoint> removedOutliersDataSet = dataSet;

        for(int i = 2; i < dataSet.size(); i++) {
            if(biPredicate.test(dataSet.get(i),dataSet.subList(0,i))) {
                removedOutliersDataSet.remove(i);
            }
        }

        return removedOutliersDataSet;
    }

}

