package net.snooper.relixmod.block;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.fabricmc.fabric.api.object.builder.v1.block.FabricBlockSettings;
import net.minecraft.block.Block;
import net.minecraft.block.Material;
import net.minecraft.item.BlockItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.snooper.relixmod.RelixMod;
import net.snooper.relixmod.block.custom.AlexandriteOre;
import net.snooper.relixmod.items.ModItemGroup;


public class ModBlocks {

    public static  final Block ALEXANDRITE_ORE = registerBlock("alexandrite_ore",
            new AlexandriteOre(FabricBlockSettings.of(Material.STONE)
                    .strength(2f)
                    .requiresTool()), ModItemGroup.Relix);

    private static Block registerBlock(String name, Block block, ItemGroup group) {
        registerBlockItem(name, block, group);
        return Registry.register(Registry.BLOCK, new Identifier(RelixMod.MOD_ID, name), block);
    }

    private static Item registerBlockItem(String name, Block block, ItemGroup group){
        return Registry.register(Registry.ITEM, new Identifier(RelixMod.MOD_ID, name),
                new BlockItem(block, new FabricItemSettings().group(group)));
    }

    public static void registerModBlocks() {
        RelixMod.LOGGER.info("Registering ModBlocks for " + RelixMod.MOD_ID);
    }
}
