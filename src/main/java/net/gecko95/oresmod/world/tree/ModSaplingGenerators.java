package net.gecko95.oresmod.world.tree;

import net.gecko95.oresmod.world.ModConfiguredFeatures;
import net.minecraft.block.SaplingGenerator;

import java.util.Optional;

public class ModSaplingGenerators {
    public static final SaplingGenerator STONEBARK =
            new SaplingGenerator("stonebark", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.STONEBARK_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    public static final SaplingGenerator DEEPBARK =
            new SaplingGenerator("deepbark", 0f, Optional.empty(),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.DEEPBARK_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());

    public static final SaplingGenerator LEAFITE =
            new SaplingGenerator("leafite", 0f, Optional.of(ModConfiguredFeatures.BIG_LEAFITE_TREE_KEY),
                    Optional.empty(),
                    Optional.of(ModConfiguredFeatures.LEAFITE_TREE_KEY),
                    Optional.empty(),
                    Optional.empty(),
                    Optional.empty());
}
