package meteo;

public class Main {

    // Есть библиотека сбора данных от датчиков. Все они были куплены в комплекте с этой библиотекой.
    // Поступил новый датчик от другой компании, интерфейс которого отличается от предыдущих.
    // Надо включить этот датчик в систему.
    public static void main(String[] args) {
        meteo.MeteoStore meteoDb = new meteo.MeteoStore();

        meteo.MeteoSensor ms200_1 = new meteo.MS200(1);
        meteoDb.save(ms200_1);
        meteoDb.save(new meteo.AdapterST500Info(new meteo.ST500Info().getData()));
        // Здесь надо вызвать метод getData у класса ST500Info. Полученные данные отправить в метод save объекта meteoDb
    }
}