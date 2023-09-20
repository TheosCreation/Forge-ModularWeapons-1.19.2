package net.theocreates.modularweapons.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.RegistryObject;
import net.theocreates.modularweapons.ModularWeapons;
import net.minecraft.world.item.Item;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, ModularWeapons.MOD_ID);

    public static final RegistryObject<Item> MAGAZINE = ITEMS.register(
            "magazine",
            () -> new Item(new Item.Properties().tab(ModCreativeModeTab.WEAPONS_TAB)));
    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
