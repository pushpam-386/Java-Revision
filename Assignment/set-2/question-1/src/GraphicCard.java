import java.io.Serializable;

public class GraphicCard implements Serializable {
    private String manufacturer;
    private String capacity;
    private String series;

    public GraphicCard() {
    }

    public GraphicCard(String manufacturer, String capacity, String series) {
        this.manufacturer = manufacturer;
        this.capacity = capacity;
        this.series = series;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getSeries() {
        return series;
    }

    public void setSeries(String series) {
        this.series = series;
    }
}
