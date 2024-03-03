package com.archyx.slate.fill;

import com.archyx.slate.Slate;
import com.archyx.slate.item.parser.MenuItemParser;
import org.spongepowered.configurate.ConfigurationNode;

public class FillItemParser extends MenuItemParser {

    public FillItemParser(Slate slate) {
        super(slate);
    }

    @Override
    public FillItem parse(ConfigurationNode section, String menuName) {
        if (!section.node("material").virtual()) {
            return new FillItem(slate, itemParser.parseBaseItem(section));
        } else {
            return null;
        }
    }
}
