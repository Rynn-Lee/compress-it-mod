package dev.everrynn.compressit.item;

import dev.everrynn.compressit.CompressIt;
import net.fabricmc.fabric.api.client.itemgroup.FabricItemGroupBuilder;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.util.Identifier;

public class ModItemGroups {

    public static final ItemGroup COMPRESSIT_GROUP = FabricItemGroupBuilder.create(
                    new Identifier(CompressIt.MOD_ID, "tied_sticks"))
            .icon(() -> new ItemStack(ModItems.TIED_STICKS))
            .appendItems((stacks) -> {
                stacks.add(new ItemStack(ModItems.TIED_STICKS));
                stacks.add(new ItemStack(ModItems.TIED_BONES));
                stacks.add(new ItemStack(ModItems.TIED_BLAZE_RODS));
                stacks.add(new ItemStack(ModItems.TIED_KELP));
                stacks.add(new ItemStack(ModItems.TIED_NAME_TAGS));
                stacks.add(new ItemStack(ModItems.TIED_ROTTEN_FLESH));
                stacks.add(new ItemStack(ModItems.TIED_SUGAR_CANE));
                stacks.add(new ItemStack(ModItems.TIED_LEATHER));
                stacks.add(new ItemStack(ModItems.STACK_OF_PAPERS));
                stacks.add(new ItemStack(ModItems.BALL_OF_STRINGS));
                stacks.add(new ItemStack(ModItems.BAG_OF_FEATHERS));
                stacks.add(new ItemStack(ModItems.PACKED_EGGS));
                stacks.add(new ItemStack(ModItems.PACKED_GOLDEN_CARROTS));
                stacks.add(new ItemStack(ModItems.PACKED_CARROTS));
                stacks.add(new ItemStack(ModItems.PACKED_POTATOES));
                stacks.add(new ItemStack(ModItems.PACKED_ENDER_PEARLS));
                stacks.add(new ItemStack(ModItems.BAG_OF_GUNPOWDER));
                stacks.add(new ItemStack(ModItems.BAG_OF_FLINT));
                stacks.add(new ItemStack(ModItems.BAG_OF_CHERRY_SAPLINGS));
                stacks.add(new ItemStack(ModItems.BAG_OF_NETHER_WARTS));
                stacks.add(new ItemStack(ModItems.BAG_OF_MANGROVE_PROPAGULES));
                stacks.add(new ItemStack(ModItems.BAG_OF_BIRCH_SAPLINGS));
                stacks.add(new ItemStack(ModItems.BAG_OF_JUNGLE_SAPLINGS));
                stacks.add(new ItemStack(ModItems.BAG_OF_ACACIA_SAPLINGS));
                stacks.add(new ItemStack(ModItems.BAG_OF_OAK_SAPLINGS));
                stacks.add(new ItemStack(ModItems.BAG_OF_SPRUCE_SAPLINGS));
                stacks.add(new ItemStack(ModItems.BAG_OF_DARK_OAK_SAPLINGS));
                stacks.add(new ItemStack(ModItems.TIED_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_BLACK_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_BLUE_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_BROWN_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_CYAN_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_GRAY_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_GREEN_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_LIGHT_BLUE_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_LIGHT_GRAY_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_LIME_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_MAGENTA_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_ORANGE_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_PINK_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_PURPLE_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_RED_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_WHITE_CANDLES));
                stacks.add(new ItemStack(ModItems.TIED_YELLOW_CANDLES));
                stacks.add(new ItemStack(ModItems.ALLIUM_BOUQUET));
                stacks.add(new ItemStack(ModItems.AZURE_BLUET_BOUQUET));
                stacks.add(new ItemStack(ModItems.BLUE_ORCHID_BOUQUET));
                stacks.add(new ItemStack(ModItems.CORNFLOWER_BOUQUET));
                stacks.add(new ItemStack(ModItems.DANDELION_BOUQUET));
                stacks.add(new ItemStack(ModItems.LILAC_BOUQUET));
                stacks.add(new ItemStack(ModItems.LILY_OF_THE_VALLEY_BOUQUET));
                stacks.add(new ItemStack(ModItems.OXEYE_DAISY_BOUQUET));
                stacks.add(new ItemStack(ModItems.PEONY_BOUQUET));
                stacks.add(new ItemStack(ModItems.POPPY_BOUQUET));
                stacks.add(new ItemStack(ModItems.ROSE_BUSH_BOUQUET));
                stacks.add(new ItemStack(ModItems.SUNFLOWER_BOUQUET));
                stacks.add(new ItemStack(ModItems.WITHER_ROSE_BOUQUET));
                stacks.add(new ItemStack(ModItems.ORANGE_TULIP_BOUQUET));
                stacks.add(new ItemStack(ModItems.PINK_TULIP_BOUQUET));
                stacks.add(new ItemStack(ModItems.RED_TULIP_BOUQUET));
                stacks.add(new ItemStack(ModItems.WHITE_TULIP_BOUQUET));
            })
            .build();

    public static void registerItemGroups() {
        CompressIt.info("Registering item groups!");
    }
}
