package com.jcraftexpansion.fabric.datagen.movesets;

import com.jcraftexpansion.common.register.StandTypeRegistry;
import com.jcraftexpansion.common.stand.ExampleStandEntity;
import net.arna.jcraft.api.attack.MoveMap;
import net.arna.jcraft.api.attack.MoveSet;
import net.arna.jcraft.api.datagen.JCraftMoveSetProvider;
import net.fabricmc.fabric.api.datagen.v1.FabricDataOutput;

import java.util.function.Consumer;

public class ExampleStandMoveSetProvider extends JCraftMoveSetProvider<ExampleStandEntity, ExampleStandEntity.State> {
    public ExampleStandMoveSetProvider(FabricDataOutput dataOutput) {
        super(dataOutput, MoveMap.Entry.codecFor(ExampleStandEntity.State.class), StandTypeRegistry.EXAMPLE_STAND.getId());
    }

    @Override
    protected void configureMoveSets(Consumer<MoveSet<ExampleStandEntity, ExampleStandEntity.State>> provider) {
        provider.accept(ExampleStandEntity.MOVE_SET);
    }
}
