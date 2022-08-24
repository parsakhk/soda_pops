package net.parsa_pouriya.soda_pops.item;

import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.world.effect.MobEffects;
import net.minecraft.world.food.FoodProperties;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import net.parsa_pouriya.soda_pops.SodaPops;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, SodaPops.MOD_ID);

    public static final RegistryObject<Item> SODA_POP_CAN = ITEMS.register("soda_pop_can",
            () -> new Item(new Item.Properties().stacksTo(8).tab(ModCreativeModeTab.SODA_POPS_TAB)));

    public static final RegistryObject<Item> APPLE_SODA_POP = ITEMS.register("apple_soda_pop",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SODA_POPS_TAB)
                    .food(new FoodProperties.Builder()
                            .effect(new MobEffectInstance(MobEffects.MOVEMENT_SPEED, 500, 0), 0.16f).nutrition(2).build())));

    public static final RegistryObject<Item> SODA_WATER_BOTTLE = ITEMS.register("soda_water_bottle",
            () -> new Item(new Item.Properties().stacksTo(1).tab(ModCreativeModeTab.SODA_POPS_TAB)));



    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
