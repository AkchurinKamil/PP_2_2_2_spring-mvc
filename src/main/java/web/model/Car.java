package web.model;

public class Car {

    private String model;
    private String engine;
    private int series;

    public Car(String model, String engine, int series) {
        this.model = model;
        this.engine = engine;
        this.series = series;
    }

    public String getModel() {
        return model;
    }

    public String getEngine() {
        return engine;
    }

    public int getSeries() {
        return series;
    }

}
