package jobagency;

import java.util.ArrayList;
import java.util.List;

// Реализация рассылки сообщений
public class JobAgency implements jobagency.Publisher {

    // список наблюдателей
    List<jobagency.Observer> observers = new ArrayList<>();

    @Override
    public void registerObserver(jobagency.Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(jobagency.Observer observer) {
        observers.remove(observer);
    }

    // Разослать предложения
    @Override
    public void sendOffer(String nameCompany, int salary) {
        for (jobagency.Observer observer : observers) {
            observer.receiveOffer(nameCompany, salary);
        }
    }
}
