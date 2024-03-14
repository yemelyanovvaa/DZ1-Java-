import entity.Store;
import service.Inspector;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Inspector inspector = new Inspector(); // Создание экземпляра класса Inspector для проведения проверок

        Scanner scanner = new Scanner(System.in); // Создание объекта Scanner для ввода данных

        System.out.println("Введите название магазина: "); // Вывод на экран приглашения ввести название магазина
        String storeName = scanner.nextLine(); // Считывание введенного пользователем названия магазина

        Store store = new Store(storeName); // Создание нового объекта магазина с указанным именем
        inspector.closeStore(store); // Выполнение метода закрытия магазина, если выполняется условие
        inspector.rebrand(store); // Выполнение метода изменения бренда магазина

        System.out.println(store.getName()); // Вывод на экран обновленного названия магазина
    }
}

