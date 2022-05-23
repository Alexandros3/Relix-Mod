package net.snooper.relixmod.items;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.snooper.relixmod.RelixMod;


public class ModItems {
    public static final Item ALEXANDRITE_CRYSTAL = registerItem("alexandrite-crystal",
            new Item(new FabricItemSettings().group(ItemGroup.MISC)));

    private static Item registerItem(String name, Item item){
        return Registry.register(Registry.ITEM, new Identifier(RelixMod.MOD_ID, name), item);
    }

    public static void registerModItems(){

        RelixMod.LOGGER.info("Registering Mod Items for "+RelixMod.MOD_ID);
    }
}
