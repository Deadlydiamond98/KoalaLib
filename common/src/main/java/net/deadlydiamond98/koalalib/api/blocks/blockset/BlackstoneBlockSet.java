package net.deadlydiamond98.koalalib.api.blocks.blockset;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.WallBlock;
import net.minecraft.world.level.block.state.BlockBehaviour;

import java.util.function.Supplier;

public class BlackstoneBlockSet extends IncludesRedstoneBlockSet {

    public BlackstoneBlockSet(String modID, String baseName, String typeName, BlockBehaviour.Properties properties) {
        super(modID, baseName, typeName, properties);
    }

    @Override
    protected void registerBlocks() {
        super.registerBlocks();
        this.wall.setLeft(register(this.baseName + "_wall", () -> new WallBlock(this.properties)));
    }

    public final Supplier<Block> getWall() {
        return getOrThrow(this.wall);
    }
}
