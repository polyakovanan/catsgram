package ru.yandex.practicum.catsgram.util;

public enum SortOrder {
    ASCENDING, DESCENDING;

    // Преобразует строку в элемент перечисления
    public static SortOrder from(String order) {
        switch (order.toLowerCase()) {
            case "ascending","asc":
                return ASCENDING;
            case "descending","desc":
                return DESCENDING;
            default: return null;
        }
    }
}