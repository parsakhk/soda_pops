package net.parsa_pouriya.soda_pops.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class ModCreativeModeTab {
    public static final CreativeModeTab SODA_POPS_TAB = new CreativeModeTab("sodapopstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.APPLE_SODA_POP.get());
        }
    };

    public static final CreativeModeTab FRUITS_TAB = new CreativeModeTab("fruitstab") {
        @Override
        public ItemStack makeIcon() {
            return new ItemStack(ModItems.SODA_POP_CAN.get());
        }
    };
}
