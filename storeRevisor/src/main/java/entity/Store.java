package entity;


public class Store {
    private String name; // Приватное поле для хранения названия магазина

    // Конструктор для инициализации магазина с указанным именем
    public Store(String name) {
        this.name = name;
    }

    // Геттер для получения названия магазина
    public String getName() {
        return name;
    }

    // Сеттер для обновления названия магазина
    public void setName(String name) {
        this.name = name;
    }
}