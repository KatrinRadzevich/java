package meteo;

import java.time.LocalDateTime;

public class AdapterST500Info implements meteo.MeteoSensor {

    private meteo.SensorTemperature adapter;

    public AdapterST500Info(meteo.SensorTemperature data) {
        this.adapter = data;
    }

    @Override
    public int getId() {
        return adapter.identifier();
    }

    @Override
    public Float getTemperature() {
        return (float) adapter.temperature();
    }

    @Override
    public Float getHumidity() {
        return null;
    }

    @Override
    public Float getPressure() {
        return null;
    }

    @Override
    public LocalDateTime getDateTime() {
        LocalDateTime result = LocalDateTime.of(adapter.year(), 1, 1, 0, 0);
        result.plusDays(adapter.day() - 1);
        result.plusSeconds(adapter.second());
        return result;
    }
}
