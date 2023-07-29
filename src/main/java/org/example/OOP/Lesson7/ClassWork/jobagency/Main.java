package jobagency;

public class Main {

    // Добавить нового наблюдателя, например Specialist, который будет наблюдать за Company
    public static void main(String[] args) {
        jobagency.Publisher jobAgency = new jobagency.JobAgency();
        jobagency.Company google = new jobagency.Company(jobAgency, "Google", 50);
        jobagency.Company geekBrains = new jobagency.Company(jobAgency, "GeekBrains", 100);
        jobagency.Student petrov = new jobagency.Student("Petrov");
        jobagency.Master ivanov = new jobagency.Master("Ivanov");
        jobagency.Junior sidorov = new jobagency.Junior("Sidorov");
        jobAgency.registerObserver(petrov);
        jobAgency.registerObserver(ivanov);
        jobAgency.registerObserver(sidorov);
        for (int i = 0; i < 2; i++) {
            google.needEmpoyee();
            geekBrains.needEmpoyee();
        }
    }
}
