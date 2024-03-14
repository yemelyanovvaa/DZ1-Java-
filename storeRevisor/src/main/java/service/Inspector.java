package service;

import entity.Store;


public class Inspector {

    // Метод для закрытия магазина на основе определенного условия
    public void closeStore(Store store) {
        if (store.getName().equals("IKEA")) {
            store.setName(null);
        }
    }

    // Метод для смены бренда магазина
    public void rebrand(Store store) {
        if (store.getName().equals("MacDonalds")) {
            store.setName("Вкусно и точка");
        } else {
            String newName = store.getName().substring(1);
            store.setName(newName);
        }
    }
}


