package com.archyx.slate.util;

import net.kyori.adventure.text.Component;
import net.kyori.adventure.text.serializer.legacy.LegacyComponentSerializer;
import org.bukkit.inventory.meta.ItemMeta;

public class PaperUtil {

    private static final boolean isPaper = init();

    private static boolean init() {
        return hasClass("com.destroystokyo.paper.PaperConfig") || hasClass("io.papermc.paper.configuration.Configuration");
    }

    private static boolean hasClass(String className) {
        try {
            Class.forName(className);
            return true;
        } catch (ClassNotFoundException e) {
            return false;
        }
    }

    @SuppressWarnings("deprecation")
    public static void setDisplayName(ItemMeta meta, Component component) {
        if (isPaper) {
            meta.displayName(component);
        } else {
            meta.setDisplayName(LegacyComponentSerializer.legacySection().serialize(component));
        }
    }

}
