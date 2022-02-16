package com.silicateseer.placeholder.block;

import com.silicateseer.placeholder.Placeholder;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.block.AbstractBlock;
import net.minecraft.block.Block;
import net.minecraft.block.MapColor;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.sound.BlockSoundGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

public class BeholdersBlocks {

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItems(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(Placeholder.MODID, name), block);
    }
    private static Block registerBlockWithoutItem(String name, Block block) {
        return Registry.register(Registry.BLOCK, new Identifier(Placeholder.MODID, name), block);
    }
    private static Item registerBlockItems(String name, Block block, ItemGroup group) {
        return Registry.register(Registry.ITEM, new Identifier(Placeholder.MODID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerBeholdersBlocks() {
        Placeholder.LOGGER.info("Registering Placeholder Blocks");
    }
}
