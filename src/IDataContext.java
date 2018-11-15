import java.util.List;

public interface IDataContext {

    List<PricePoint> read();

    void write(List<PricePoint> dataSet);
}
