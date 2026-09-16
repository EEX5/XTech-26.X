package com.eex5.xtech.item;

import com.eex5.xtech.XTech;
import net.minecraft.world.item.Item;
import net.neoforged.bus.api.IEventBus;
import net.neoforged.neoforge.registries.DeferredItem;
import net.neoforged.neoforge.registries.DeferredRegister;

public class XTItems {
    public static final DeferredRegister.Items ITEMS = DeferredRegister.createItems(XTech.MOD_ID);

    //Circuit Microparts
    public static final DeferredItem<Item> VACUUM_TUBE = ITEMS.registerSimpleItem("vacuum_tube");
    public static final DeferredItem<Item> ELECTROLYTIC_CAPACITOR = ITEMS.registerSimpleItem("capacitor_electrolytic");
    public static final DeferredItem<Item> CERAMIC_CAPACITOR = ITEMS.registerSimpleItem("capacitor_ceramic");

    //Circuits
    public static final DeferredItem<Item> ANALOG_CIRCUIT = ITEMS.registerSimpleItem("circuit_analog");

    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }

}
