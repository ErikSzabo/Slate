package com.archyx.slate.lore.parser;

import com.archyx.slate.lore.LoreLine;
import com.archyx.slate.lore.type.ComponentLore;
import org.spongepowered.configurate.ConfigurationNode;
import org.spongepowered.configurate.serialize.SerializationException;

import java.util.Objects;

public class ComponentLoreParser implements LoreParser {

    @Override
    public LoreLine parse(ConfigurationNode config) throws SerializationException {
        // Single component
        if (!config.node("component").virtual()) {
            String component = Objects.requireNonNull(config.node("component").getString());
            return new ComponentLore(component);
        }
        throw new IllegalArgumentException("No key named component was found!");
    }
}
