package com.archyx.slate.menu;

import com.archyx.slate.item.MenuItem;

import java.util.Map;

public class ConfigurableMenu {

    private final String name;
    private final String title;
    private final int size;
    private final Map<String, MenuItem> items;
    private final MenuProvider provider;

    public ConfigurableMenu(String name, String title, int size, Map<String, MenuItem> items, MenuProvider provider) {
        this.name = name;
        this.title = title;
        this.size = size;
        this.items = items;
        this.provider = provider;
    }

    public String getName() {
        return name;
    }

    public String getTitle() {
        return title;
    }

    public int getSize() {
        return size;
    }

    public Map<String, MenuItem> getItems() {
        return items;
    }

    public MenuProvider getProvider() {
        return provider;
    }

}
