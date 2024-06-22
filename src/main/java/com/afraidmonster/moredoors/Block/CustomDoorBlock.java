package com.afraidmonster.moredoors.Block;

import net.minecraft.world.level.block.DoorBlock;
import net.minecraft.world.level.block.state.properties.BlockSetType;

public class CustomDoorBlock extends DoorBlock {
    public CustomDoorBlock(Properties properties, BlockSetType blockSetType) {
        super(blockSetType, properties.noOcclusion());
    }
}