package com.scottkillen.mod.dendrology.content.fuel;

import com.scottkillen.mod.kore.tree.block.ModWoodSlabBlock;
import cpw.mods.fml.common.IFuelHandler;
import cpw.mods.fml.common.registry.GameRegistry;
import net.minecraft.item.ItemStack;

public enum FuelHandler implements IFuelHandler
{
    INSTANCE;

    public static void register()
    {
        GameRegistry.registerFuelHandler(INSTANCE);
    }

    @Override
    public int getBurnTime(ItemStack fuel)
    {
        if (ModWoodSlabBlock.isSingleSlab(fuel.getItem())) return 150;

        return 0;
    }
}