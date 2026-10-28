package com.jcraftexpansion.fabric.datagen;

import com.jcraftexpansion.fabric.datagen.movesets.ExampleStandMoveSetProvider;
import net.fabricmc.fabric.api.datagen.v1.DataGeneratorEntrypoint;
import net.fabricmc.fabric.api.datagen.v1.FabricDataGenerator;

public class JCraftExpansionDataGen implements DataGeneratorEntrypoint {
    @Override
    public void onInitializeDataGenerator(FabricDataGenerator dataGen) {
        FabricDataGenerator.Pack pack = dataGen.createPack();
        pack.addProvider(ExampleStandMoveSetProvider::new);
        pack.addProvider(JCraftExpansionStandDataProvider::new);
    }
}
