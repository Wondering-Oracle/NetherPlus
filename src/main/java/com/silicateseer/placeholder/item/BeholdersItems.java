package com.silicateseer.placeholder.item;

import com.silicateseer.placeholder.Placeholder;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeholdersItems {

    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(Placeholder.MODID, name), item);
    }

    public static void registerBeholdersItems() {
        Placeholder.LOGGER.info("Registering Placeholder Items");
    }
}
