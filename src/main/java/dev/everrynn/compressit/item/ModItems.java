package dev.everrynn.compressit.item;

import dev.everrynn.compressit.CompressIt;
import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ModItems {

    public static final Item TIED_STICKS = registerItem("tied_sticks", new Item(new FabricItemSettings()), "minecraft:sticks", 8);
    public static final Item TIED_BONES = registerItem("tied_bones", new Item(new FabricItemSettings()), "minecraft:bones", 8);
    public static final Item TIED_BLAZE_RODS = registerItem("tied_blaze_rods", new Item(new FabricItemSettings()), "minecraft:blaze_rod", 8);
    public static final Item TIED_KELP = registerItem("tied_kelp", new Item(new FabricItemSettings()), "minecraft:kelp", 8);
    public static final Item TIED_NAME_TAGS = registerItem("tied_name_tags", new Item(new FabricItemSettings()), "minecraft:name_tag", 8);
    public static final Item TIED_ROTTEN_FLESH = registerItem("tied_rotten_flesh", new Item(new FabricItemSettings()), "minecraft:rotten_flesh", 8);
    public static final Item TIED_SUGAR_CANE = registerItem("tied_sugar_cane", new Item(new FabricItemSettings()), "minecraft:sugar_cane", 8);
    public static final Item TIED_LEATHER = registerItem("tied_leather", new Item(new FabricItemSettings()), "minecraft:leather", 8);
    public static final Item STACK_OF_PAPERS = registerItem("stack_of_papers", new Item(new FabricItemSettings()), "minecraft:paper", 8);
    public static final Item BALL_OF_STRINGS = registerItem("ball_of_strings", new Item(new FabricItemSettings()), "minecraft:string", 8);
    public static final Item BAG_OF_FEATHERS = registerItem("bag_of_feathers", new Item(new FabricItemSettings()), "minecraft:feather", 8);
    public static final Item PACKED_EGGS = registerItem("packed_eggs", new Item(new FabricItemSettings()), "minecraft:egg", 8);
    public static final Item PACKED_GOLDEN_CARROTS = registerItem("packed_golden_carrots", new Item(new FabricItemSettings()), "minecraft:golden_carrot", 8);
    public static final Item PACKED_CARROTS = registerItem("packed_carrots", new Item(new FabricItemSettings()), "minecraft:carrot", 8);
    public static final Item PACKED_POTATOES = registerItem("packed_potatoes", new Item(new FabricItemSettings()), "minecraft:potato", 8);
    public static final Item PACKED_ENDER_PEARLS = registerItem("packed_ender_pearls", new Item(new FabricItemSettings()), "minecraft:ender_pearl", 8);
    public static final Item BAG_OF_GUNPOWDER = registerItem("bag_of_gunpowder", new Item(new FabricItemSettings()), "minecraft:gunpowder", 8);
    public static final Item BAG_OF_FLINT = registerItem("bag_of_flint", new Item(new FabricItemSettings()), "minecraft:flint", 8);
    public static final Item BAG_OF_NETHER_WARTS = registerItem("bag_of_nether_warts", new Item(new FabricItemSettings()), "minecraft:nether_wart", 8);
    public static final Item BAG_OF_OAK_SAPLINGS = registerItem("bag_of_oak_saplings", new Item(new FabricItemSettings()), "minecraft:oak_sapling", 8);
    public static final Item BAG_OF_MANGROVE_PROPAGULES = registerItem("bag_of_mangrove_propagules", new Item(new FabricItemSettings()), "minecraft:mangrove_propagule", 8);
    public static final Item BAG_OF_SPRUCE_SAPLINGS = registerItem("bag_of_spruce_saplings", new Item(new FabricItemSettings()), "minecraft:spruce_sapling", 8);
    public static final Item BAG_OF_JUNGLE_SAPLINGS = registerItem("bag_of_jungle_saplings", new Item(new FabricItemSettings()), "minecraft:jungle_sapling", 8);
    public static final Item BAG_OF_DARK_OAK_SAPLINGS = registerItem("bag_of_dark_oak_saplings", new Item(new FabricItemSettings()), "minecraft:dark_oak_sapling", 8);
    public static final Item BAG_OF_BIRCH_SAPLINGS = registerItem("bag_of_birch_saplings", new Item(new FabricItemSettings()), "minecraft:birch_sapling", 8);
    public static final Item BAG_OF_CHERRY_SAPLINGS = registerItem("bag_of_cherry_saplings", new Item(new FabricItemSettings()), "minecraft:cherry_sapling", 8);
    public static final Item BAG_OF_ACACIA_SAPLINGS = registerItem("bag_of_acacia_saplings", new Item(new FabricItemSettings()), "minecraft:acacia_sapling", 8);
    public static final Item TIED_CANDLES = registerItem("tied_candles", new Item(new FabricItemSettings()), "minecraft:candle", 8);
    public static final Item TIED_BLACK_CANDLES = registerItem("tied_black_candles", new Item(new FabricItemSettings()), "minecraft:black_candle", 8);
    public static final Item TIED_BLUE_CANDLES = registerItem("tied_blue_candles", new Item(new FabricItemSettings()), "minecraft:blue_candle", 8);
    public static final Item TIED_BROWN_CANDLES = registerItem("tied_brown_candles", new Item(new FabricItemSettings()), "minecraft:brown_candle", 8);
    public static final Item TIED_CYAN_CANDLES = registerItem("tied_cyan_candles", new Item(new FabricItemSettings()), "minecraft:cyan_candle", 8);
    public static final Item TIED_GRAY_CANDLES = registerItem("tied_gray_candles", new Item(new FabricItemSettings()), "minecraft:gray_candle", 8);
    public static final Item TIED_GREEN_CANDLES = registerItem("tied_green_candles", new Item(new FabricItemSettings()), "minecraft:green_candle", 8);
    public static final Item TIED_LIGHT_BLUE_CANDLES = registerItem("tied_light_blue_candles", new Item(new FabricItemSettings()), "minecraft:light_blue_candle", 8);
    public static final Item TIED_LIGHT_GRAY_CANDLES = registerItem("tied_light_gray_candles", new Item(new FabricItemSettings()), "minecraft:light_gray_candle", 8);
    public static final Item TIED_LIME_CANDLES = registerItem("tied_lime_candles", new Item(new FabricItemSettings()), "minecraft:lime_candle", 8);
    public static final Item TIED_MAGENTA_CANDLES = registerItem("tied_magenta_candles", new Item(new FabricItemSettings()), "minecraft:magenta_candle", 8);
    public static final Item TIED_ORANGE_CANDLES = registerItem("tied_orange_candles", new Item(new FabricItemSettings()), "minecraft:orange_candle", 8);
    public static final Item TIED_PINK_CANDLES = registerItem("tied_pink_candles", new Item(new FabricItemSettings()), "minecraft:pink_candle", 8);
    public static final Item TIED_PURPLE_CANDLES = registerItem("tied_purple_candles", new Item(new FabricItemSettings()), "minecraft:purple_candle", 8);
    public static final Item TIED_RED_CANDLES = registerItem("tied_red_candles", new Item(new FabricItemSettings()), "minecraft:red_candle", 8);
    public static final Item TIED_WHITE_CANDLES = registerItem("tied_white_candles", new Item(new FabricItemSettings()), "minecraft:white_candle", 8);
    public static final Item TIED_YELLOW_CANDLES = registerItem("tied_yellow_candles", new Item(new FabricItemSettings()), "minecraft:yellow_candle", 8);
    public static final Item ALLIUM_BOUQUET = registerItem("allium_bouquet", new Item(new FabricItemSettings()), "minecraft:allium", 8);
    public static final Item AZURE_BLUET_BOUQUET = registerItem("azure_bluet_bouquet", new Item(new FabricItemSettings()), "minecraft:azure_bluet", 8);
    public static final Item BLUE_ORCHID_BOUQUET = registerItem("blue_orchid_bouquet", new Item(new FabricItemSettings()), "minecraft:blue_orchid", 8);
    public static final Item CORNFLOWER_BOUQUET = registerItem("cornflower_bouquet", new Item(new FabricItemSettings()), "minecraft:cornflower", 8);
    public static final Item DANDELION_BOUQUET = registerItem("dandelion_bouquet", new Item(new FabricItemSettings()), "minecraft:dandelion", 8);
    public static final Item LILAC_BOUQUET = registerItem("lilac_bouquet", new Item(new FabricItemSettings()), "minecraft:lilac", 8);
    public static final Item LILY_OF_THE_VALLEY_BOUQUET = registerItem("lily_of_the_valley_bouquet", new Item(new FabricItemSettings()), "minecraft:lily_of_the_valley", 8);
    public static final Item OXEYE_DAISY_BOUQUET = registerItem("oxeye_daisy_bouquet", new Item(new FabricItemSettings()), "minecraft:daisy", 8);
    public static final Item PEONY_BOUQUET = registerItem("peony_bouquet", new Item(new FabricItemSettings()), "minecraft:peony", 8);
    public static final Item POPPY_BOUQUET = registerItem("poppy_bouquet", new Item(new FabricItemSettings()), "minecraft:poppy", 8);
    public static final Item ROSE_BUSH_BOUQUET = registerItem("rose_bush_bouquet", new Item(new FabricItemSettings()), "minecraft:rose_bush", 8);
    public static final Item SUNFLOWER_BOUQUET = registerItem("sunflower_bouquet", new Item(new FabricItemSettings()), "minecraft:sunflower", 8);
    public static final Item WITHER_ROSE_BOUQUET = registerItem("wither_rose_bouquet", new Item(new FabricItemSettings()), "minecraft:wither_rose", 8);
    public static final Item ORANGE_TULIP_BOUQUET = registerItem("orange_tulip_bouquet", new Item(new FabricItemSettings()), "minecraft:orange_tulip", 8);
    public static final Item PINK_TULIP_BOUQUET = registerItem("pink_tulip_bouquet", new Item(new FabricItemSettings()), "minecraft:pink_tulip", 8);
    public static final Item RED_TULIP_BOUQUET = registerItem("red_tulip_bouquet", new Item(new FabricItemSettings()), "minecraft:red_tulip", 8);
    public static final Item WHITE_TULIP_BOUQUET = registerItem("white_tulip_bouquet", new Item(new FabricItemSettings()), "minecraft:tulip", 8);

    private static Item registerItem(String name, Item item, String material, int count) {
        // Register the item
        Item registeredItem = Registry.register(Registry.ITEM, new Identifier(CompressIt.MOD_ID, name), item);

        boolean doGenRecipes = false;
        if(doGenRecipes){
            // Generate crafting recipes
            try {
                CompressIt.info("Generating Recipe JSON files!");
                generateShapedRecipe(name, material);
                generateUnpackingRecipe(name, material, count);
            } catch (IOException e) {
                CompressIt.LOGGER.error("Error generating recipe for item: " + name, e);
            }

        }

        return registeredItem;
    }

    // Method to generate shaped recipe JSON for packing items
    private static void generateShapedRecipe(String itemName, String material) throws IOException {
        Map<String, Object> recipe = new HashMap<>();
        recipe.put("type", "minecraft:crafting_shaped");
        recipe.put("pattern", new String[]{"MMM", "MMM", "MMM"});

        Map<String, Object> key = new HashMap<>();
        key.put("M", Map.of("item", material));
        recipe.put("key", key);

        Map<String, Object> result = new HashMap<>();
        result.put("item", "compressit:" + itemName);
        result.put("count", 1);
        recipe.put("result", result);

        // Write JSON to file
        writeJsonToFile(recipe, itemName + ".json");
    }

    // Method to generate shapeless recipe JSON for unpacking items
    private static void generateUnpackingRecipe(String itemName, String material, int count) throws IOException {
        Map<String, Object> recipe = new HashMap<>();
        recipe.put("type", "minecraft:crafting_shapeless");

        recipe.put("ingredients", new Object[]{Map.of("item", "compressit:" + itemName)});

        Map<String, Object> result = new HashMap<>();
        result.put("item", material);
        result.put("count", count);
        recipe.put("result", result);

        // Write JSON to file
        writeJsonToFile(recipe, "unpack_" + itemName + ".json");
    }

    // Helper method to write JSON to file
    private static void writeJsonToFile(Map<String, Object> jsonData, String fileName) throws IOException {
        String outputDir = "./generated_recipes/";
        java.io.File directory = new java.io.File(outputDir);

        // Check if the directory exists, if not, create it
        if (!directory.exists()) {
            directory.mkdirs(); // Creates the directory and any necessary parent directories
        }

        // Write the JSON file to the directory
        try (FileWriter file = new FileWriter(outputDir + fileName)) {
            file.write(new com.google.gson.GsonBuilder().setPrettyPrinting().create().toJson(jsonData));
        }
    }



    private static Item registerItem(String name, Item item) {
        return Registry.register(Registry.ITEM, new Identifier(CompressIt.MOD_ID, name), item);
    }

    public static void registerModItems() {
        CompressIt.info("Registering items!");
    }
}
