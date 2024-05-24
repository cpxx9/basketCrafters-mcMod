package net.cjplabs.basketcraftersmod.item;

import net.cjplabs.basketcraftersmod.BasketCraftersMod;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;

public class ModItems {
    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, BasketCraftersMod.MOD_ID);

   public static final RegistryObject<Item> BASKETBALL = ITEMS.register("basketball",
           () -> new Item(new Item.Properties()));

    public static final RegistryObject<Item> HOOP = ITEMS.register("hoop",
            () -> new Item(new Item.Properties()));

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
