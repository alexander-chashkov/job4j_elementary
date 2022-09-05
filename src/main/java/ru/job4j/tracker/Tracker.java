package ru.job4j.tracker;

import java.util.Arrays;

/**
 * @author alex_chashkov
 * @created 30/08/2022 - 21:40
 * @project job4j
 * fix2
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
        for (int i = 0; i < size; i++) {
            if (items[i].getName().equals(key)) {
                result[idx] = items[i];
                idx++;
            }
        }
        return Arrays.copyOf(result, idx);
    }

    private int indexOf(int id) {
        int rsl = -1;
        for (int index = 0; index < size; index++) {
            if (items[index].getId() == id) {
                rsl = index;
                break;
            }
        }
        return rsl;
    }

    public boolean replace(int id, Item item) {
        int idx = indexOf(id);
        boolean rsl = idx != -1;
        if (rsl) {
            item.setId(id);
            items[idx] = item;
        }
        return rsl;
    }

    public boolean delete(int id) {
        int idx = indexOf(id);
        boolean rsl = idx != -1;
        if (rsl) {
            System.arraycopy(items, idx + 1, items, idx, size - idx - 1);
            items[size - 1] = null;
            size--;
        }
        return true;
    }
}
