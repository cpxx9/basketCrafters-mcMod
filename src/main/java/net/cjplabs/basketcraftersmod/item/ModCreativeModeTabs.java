package net.cjplabs.basketcraftersmod.item;

import net.cjplabs.basketcraftersmod.BasketCraftersMod;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.RegistryObject;

public class ModCreativeModeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, BasketCraftersMod.MOD_ID);

    public static final RegistryObject<CreativeModeTab> BASKETCRAFTERS_TAB = CREATIVE_MODE_TABS.register("basketcrafters_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(ModItems.BASKETBALL.get()))
                    .title(Component.translatable("creativetab.basketcrafters_tab"))
                    .displayItems((pParameters, pOutput) -> {
                        pOutput.accept(ModItems.BASKETBALL.get());
                        pOutput.accept(ModItems.HOOP.get());
                    })
                    .build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register((eventBus));
    }
}
