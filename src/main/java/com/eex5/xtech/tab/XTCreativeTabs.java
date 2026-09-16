package com.eex5.xtech.tab;

import com.eex5.xtech.XTech;
import com.eex5.xtech.item.XTItems;
import net.minecraft.core.registries.Registries;
import net.minecraft.network.chat.Component;
import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredRegister;

import java.util.function.Supplier;

public class XTCreativeTabs {
    public static final DeferredRegister<CreativeModeTab> CREATIVE_MODE_TABS =
            DeferredRegister.create(Registries.CREATIVE_MODE_TAB, XTech.MOD_ID);

    public static final Supplier<CreativeModeTab> CIRCUITS_TAB = CREATIVE_MODE_TABS.register("circuits_tab",
            () -> CreativeModeTab.builder().icon(() -> new ItemStack(XTItems.ANALOG_CIRCUIT.get()))
                    .title(Component.translatable("creativetab.xtech.circuits_tab"))
                    .displayItems((itemDisplayParameters, output) -> {
                        output.accept(XTItems.ANALOG_CIRCUIT);

                        output.accept(XTItems.VACUUM_TUBE);
                        output.accept(XTItems.ELECTROLYTIC_CAPACITOR);
                        output.accept(XTItems.CERAMIC_CAPACITOR);
                    }).build());

    public static void register(IEventBus eventBus) {
        CREATIVE_MODE_TABS.register(eventBus);
    }
}
