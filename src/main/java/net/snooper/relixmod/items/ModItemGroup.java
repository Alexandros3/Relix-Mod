package net.snooper.relixmod.items;

import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;
import net.snooper.relixmod.RelixMod;

public class ModItemGroup {
    public static final ItemGroup Relix = FabricItemGroupBuilder.build(new Identifier(RelixMod.MOD_ID, "relix"),
            () -> new ItemStack(ModItems.ALEXANDRITE_CRYSTAL));
}
