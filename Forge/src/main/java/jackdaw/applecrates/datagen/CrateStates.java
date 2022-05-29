package jackdaw.applecrates.datagen;

import jackdaw.applecrates.AppleCrates;
import jackdaw.applecrates.registry.GeneralRegistry;
import net.minecraft.data.DataGenerator;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.client.model.generators.BlockStateProvider;
import net.minecraftforge.client.model.generators.ModelFile;
import net.minecraftforge.common.data.ExistingFileHelper;

public class CrateStates extends BlockStateProvider {
    public CrateStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, AppleCrates.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        GeneralRegistry.BLOCK_MAP.forEach((woodType, blockRegistryObject) ->
                simpleBlock(blockRegistryObject.get(), modelFile -> {

                    return new net.minecraftforge.client.model.generators.ConfiguredModel[0];
                }));
    }
}