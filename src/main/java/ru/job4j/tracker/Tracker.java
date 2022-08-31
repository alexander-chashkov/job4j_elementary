package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @author alex_chashkov
 * @created 30/08/2022 - 21:40
 * @project job4j
 */
public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] result = new Item[size];
        int idx = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null && items[i].getName().equals(key)) {
                result[idx] = items[i];
                idx++;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    public boolean replace(int id, Item item) {
        for (int i = 0; i < size; i++) {
            if (items[i].getId() == id) {
                item.setId(id);
                items[i] = item;
                return true;
            }
        }
        return false;
    }
}
