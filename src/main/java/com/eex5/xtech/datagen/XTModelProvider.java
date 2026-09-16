package com.eex5.xtech.datagen;

import com.eex5.xtech.XTech;
import com.eex5.xtech.block.XTBlocks;
import com.eex5.xtech.item.XTItems;
import net.minecraft.client.data.models.BlockModelGenerators;
import net.minecraft.client.data.models.ItemModelGenerators;
import net.minecraft.client.data.models.ModelProvider;
import net.minecraft.client.data.models.model.ModelTemplates;
import net.minecraft.data.PackOutput;

public class XTModelProvider extends ModelProvider {
    public XTModelProvider(PackOutput output) {
        super(output, XTech.MOD_ID);
    }

    @Override
    protected void registerModels(BlockModelGenerators blockModels, ItemModelGenerators itemModels) {
        /* ITEMS */
        //Circuit Microparts
        itemModels.generateFlatItem(XTItems.VACUUM_TUBE.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(XTItems.ELECTROLYTIC_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);
        itemModels.generateFlatItem(XTItems.CERAMIC_CAPACITOR.get(), ModelTemplates.FLAT_ITEM);

        //Circuits
        itemModels.generateFlatItem(XTItems.ANALOG_CIRCUIT.get(), ModelTemplates.FLAT_ITEM);

        /* BLOCKS */
        blockModels.createTrivialCube(XTBlocks.STACKED_WAFFLES.get());
    }
}
