package net.minecraft.init;

import com.google.common.collect.Sets;
import java.util.Set;
import javax.annotation.Nullable;
import net.minecraft.block.Block;
import net.minecraft.block.BlockBeacon;
import net.minecraft.block.BlockBush;
import net.minecraft.block.BlockCactus;
import net.minecraft.block.BlockCauldron;
import net.minecraft.block.BlockChest;
import net.minecraft.block.BlockDaylightDetector;
import net.minecraft.block.BlockDeadBush;
import net.minecraft.block.BlockDoor;
import net.minecraft.block.BlockDoublePlant;
import net.minecraft.block.BlockDynamicLiquid;
import net.minecraft.block.BlockFire;
import net.minecraft.block.BlockFlower;
import net.minecraft.block.BlockGrass;
import net.minecraft.block.BlockHopper;
import net.minecraft.block.BlockLeaves;
import net.minecraft.block.BlockMycelium;
import net.minecraft.block.BlockPistonBase;
import net.minecraft.block.BlockPistonExtension;
import net.minecraft.block.BlockPistonMoving;
import net.minecraft.block.BlockPortal;
import net.minecraft.block.BlockRedstoneComparator;
import net.minecraft.block.BlockRedstoneRepeater;
import net.minecraft.block.BlockRedstoneWire;
import net.minecraft.block.BlockReed;
import net.minecraft.block.BlockSand;
import net.minecraft.block.BlockSkull;
import net.minecraft.block.BlockSlab;
import net.minecraft.block.BlockStainedGlass;
import net.minecraft.block.BlockStainedGlassPane;
import net.minecraft.block.BlockStaticLiquid;
import net.minecraft.block.BlockTallGrass;
import net.minecraft.block.BlockTripWireHook;
import net.minecraft.util.ResourceLocation;

public class Blocks
{
    private static final Set<Block> CACHE;
    public static final Block AIR;
    public static final Block STONE;
    public static final BlockGrass GRASS;
    public static final Block DIRT;
    public static final Block COBBLESTONE;
    public static final Block PLANKS;
    public static final Block SAPLING;
    public static final Block BEDROCK;
    public static final BlockDynamicLiquid FLOWING_WATER;
    public static final BlockStaticLiquid WATER;
    public static final BlockDynamicLiquid FLOWING_LAVA;
    public static final BlockStaticLiquid LAVA;
    public static final BlockSand SAND;
    public static final Block GRAVEL;
    public static final Block GOLD_ORE;
    public static final Block IRON_ORE;
    public static final Block COAL_ORE;
    public static final Block LOG;
    public static final Block LOG2;
    public static final BlockLeaves LEAVES;
    public static final BlockLeaves LEAVES2;
    public static final Block SPONGE;
    public static final Block GLASS;
    public static final Block LAPIS_ORE;
    public static final Block LAPIS_BLOCK;
    public static final Block DISPENSER;
    public static final Block SANDSTONE;
    public static final Block NOTEBLOCK;
    public static final Block BED;
    public static final Block GOLDEN_RAIL;
    public static final Block DETECTOR_RAIL;
    public static final BlockPistonBase STICKY_PISTON;
    public static final Block WEB;
    public static final BlockTallGrass TALLGRASS;
    public static final BlockDeadBush DEADBUSH;
    public static final BlockPistonBase PISTON;
    public static final BlockPistonExtension PISTON_HEAD;
    public static final Block WOOL;
    public static final BlockPistonMoving PISTON_EXTENSION;
    public static final BlockFlower YELLOW_FLOWER;
    public static final BlockFlower RED_FLOWER;
    public static final BlockBush BROWN_MUSHROOM;
    public static final BlockBush RED_MUSHROOM;
    public static final Block GOLD_BLOCK;
    public static final Block IRON_BLOCK;
    public static final BlockSlab DOUBLE_STONE_SLAB;
    public static final BlockSlab STONE_SLAB;
    public static final Block BRICK_BLOCK;
    public static final Block TNT;
    public static final Block BOOKSHELF;
    public static final Block MOSSY_COBBLESTONE;
    public static final Block OBSIDIAN;
    public static final Block TORCH;
    public static final BlockFire FIRE;
    public static final Block MOB_SPAWNER;
    public static final Block OAK_STAIRS;
    public static final BlockChest CHEST;
    public static final BlockRedstoneWire REDSTONE_WIRE;
    public static final Block DIAMOND_ORE;
    public static final Block DIAMOND_BLOCK;
    public static final Block CRAFTING_TABLE;
    public static final Block WHEAT;
    public static final Block FARMLAND;
    public static final Block FURNACE;
    public static final Block LIT_FURNACE;
    public static final Block STANDING_SIGN;
    public static final BlockDoor OAK_DOOR;
    public static final BlockDoor SPRUCE_DOOR;
    public static final BlockDoor BIRCH_DOOR;
    public static final BlockDoor JUNGLE_DOOR;
    public static final BlockDoor ACACIA_DOOR;
    public static final BlockDoor DARK_OAK_DOOR;
    public static final Block LADDER;
    public static final Block RAIL;
    public static final Block STONE_STAIRS;
    public static final Block WALL_SIGN;
    public static final Block LEVER;
    public static final Block STONE_PRESSURE_PLATE;
    public static final BlockDoor IRON_DOOR;
    public static final Block WOODEN_PRESSURE_PLATE;
    public static final Block REDSTONE_ORE;
    public static final Block LIT_REDSTONE_ORE;
    public static final Block UNLIT_REDSTONE_TORCH;
    public static final Block REDSTONE_TORCH;
    public static final Block STONE_BUTTON;
    public static final Block SNOW_LAYER;
    public static final Block ICE;
    public static final Block SNOW;
    public static final BlockCactus CACTUS;
    public static final Block CLAY;
    public static final BlockReed REEDS;
    public static final Block JUKEBOX;
    public static final Block OAK_FENCE;
    public static final Block SPRUCE_FENCE;
    public static final Block BIRCH_FENCE;
    public static final Block JUNGLE_FENCE;
    public static final Block DARK_OAK_FENCE;
    public static final Block ACACIA_FENCE;
    public static final Block PUMPKIN;
    public static final Block NETHERRACK;
    public static final Block SOUL_SAND;
    public static final Block GLOWSTONE;
    public static final BlockPortal PORTAL;
    public static final Block LIT_PUMPKIN;
    public static final Block CAKE;
    public static final BlockRedstoneRepeater UNPOWERED_REPEATER;
    public static final BlockRedstoneRepeater POWERED_REPEATER;
    public static final Block TRAPDOOR;
    public static final Block MONSTER_EGG;
    public static final Block STONEBRICK;
    public static final Block BROWN_MUSHROOM_BLOCK;
    public static final Block RED_MUSHROOM_BLOCK;
    public static final Block IRON_BARS;
    public static final Block GLASS_PANE;
    public static final Block MELON_BLOCK;
    public static final Block PUMPKIN_STEM;
    public static final Block MELON_STEM;
    public static final Block VINE;
    public static final Block OAK_FENCE_GATE;
    public static final Block SPRUCE_FENCE_GATE;
    public static final Block BIRCH_FENCE_GATE;
    public static final Block JUNGLE_FENCE_GATE;
    public static final Block DARK_OAK_FENCE_GATE;
    public static final Block ACACIA_FENCE_GATE;
    public static final Block BRICK_STAIRS;
    public static final Block STONE_BRICK_STAIRS;
    public static final BlockMycelium MYCELIUM;
    public static final Block WATERLILY;
    public static final Block NETHER_BRICK;
    public static final Block NETHER_BRICK_FENCE;
    public static final Block NETHER_BRICK_STAIRS;
    public static final Block NETHER_WART;
    public static final Block ENCHANTING_TABLE;
    public static final Block BREWING_STAND;
    public static final BlockCauldron CAULDRON;
    public static final Block END_PORTAL;
    public static final Block END_PORTAL_FRAME;
    public static final Block END_STONE;
    public static final Block DRAGON_EGG;
    public static final Block REDSTONE_LAMP;
    public static final Block LIT_REDSTONE_LAMP;
    public static final BlockSlab DOUBLE_WOODEN_SLAB;
    public static final BlockSlab WOODEN_SLAB;
    public static final Block COCOA;
    public static final Block SANDSTONE_STAIRS;
    public static final Block EMERALD_ORE;
    public static final Block ENDER_CHEST;
    public static final BlockTripWireHook TRIPWIRE_HOOK;
    public static final Block TRIPWIRE;
    public static final Block EMERALD_BLOCK;
    public static final Block SPRUCE_STAIRS;
    public static final Block BIRCH_STAIRS;
    public static final Block JUNGLE_STAIRS;
    public static final Block COMMAND_BLOCK;
    public static final BlockBeacon BEACON;
    public static final Block COBBLESTONE_WALL;
    public static final Block FLOWER_POT;
    public static final Block CARROTS;
    public static final Block POTATOES;
    public static final Block WOODEN_BUTTON;
    public static final BlockSkull SKULL;
    public static final Block ANVIL;
    public static final Block TRAPPED_CHEST;
    public static final Block LIGHT_WEIGHTED_PRESSURE_PLATE;
    public static final Block HEAVY_WEIGHTED_PRESSURE_PLATE;
    public static final BlockRedstoneComparator UNPOWERED_COMPARATOR;
    public static final BlockRedstoneComparator POWERED_COMPARATOR;
    public static final BlockDaylightDetector DAYLIGHT_DETECTOR;
    public static final BlockDaylightDetector DAYLIGHT_DETECTOR_INVERTED;
    public static final Block REDSTONE_BLOCK;
    public static final Block QUARTZ_ORE;
    public static final BlockHopper HOPPER;
    public static final Block QUARTZ_BLOCK;
    public static final Block QUARTZ_STAIRS;
    public static final Block ACTIVATOR_RAIL;
    public static final Block DROPPER;
    public static final Block STAINED_HARDENED_CLAY;
    public static final Block BARRIER;
    public static final Block IRON_TRAPDOOR;
    public static final Block HAY_BLOCK;
    public static final Block CARPET;
    public static final Block HARDENED_CLAY;
    public static final Block COAL_BLOCK;
    public static final Block PACKED_ICE;
    public static final Block ACACIA_STAIRS;
    public static final Block DARK_OAK_STAIRS;
    public static final Block SLIME_BLOCK;
    public static final BlockDoublePlant DOUBLE_PLANT;
    public static final BlockStainedGlass STAINED_GLASS;
    public static final BlockStainedGlassPane STAINED_GLASS_PANE;
    public static final Block PRISMARINE;
    public static final Block SEA_LANTERN;
    public static final Block STANDING_BANNER;
    public static final Block WALL_BANNER;
    public static final Block RED_SANDSTONE;
    public static final Block RED_SANDSTONE_STAIRS;
    public static final BlockSlab DOUBLE_STONE_SLAB2;
    public static final BlockSlab STONE_SLAB2;
    public static final Block END_ROD;
    public static final Block CHORUS_PLANT;
    public static final Block CHORUS_FLOWER;
    public static final Block PURPUR_BLOCK;
    public static final Block PURPUR_PILLAR;
    public static final Block PURPUR_STAIRS;
    public static final BlockSlab PURPUR_DOUBLE_SLAB;
    public static final BlockSlab PURPUR_SLAB;
    public static final Block END_BRICKS;
    public static final Block BEETROOTS;
    public static final Block GRASS_PATH;
    public static final Block END_GATEWAY;
    public static final Block REPEATING_COMMAND_BLOCK;
    public static final Block CHAIN_COMMAND_BLOCK;
    public static final Block FROSTED_ICE;
    public static final Block field_189877_df;
    public static final Block field_189878_dg;
    public static final Block field_189879_dh;
    public static final Block field_189880_di;
    public static final Block field_189881_dj;
    public static final Block STRUCTURE_BLOCK;
    // Begin Awaken Dreams code
    public static final Block JADE_ORE;
    public static final Block AMBER_ORE;
    public static final Block TANZANITE_ORE;
    public static final Block PERMANENT_DIRT;
    public static final Block AMETHYST_ORE;
    public static final Block RUBY_ORE;
    public static final Block ONYX_ORE;
    public static final Block MOONSTONE_ORE;
    public static final Block MINAS_MORGUL_GLOWSTONE;
    public static final Block ARGONATH_STONE;
    public static final Block MITHRIL_BLOCK;
    public static final Block CRYSTAL_ORE;
    public static final Block DESERT_ROAD_BLOCK;
    public static final Block DIRT_ROAD_BLOCK;
    public static final Block LIGHT_BLUE_GLOWSTONE;
    public static final Block BLACK_IRON;
    public static final Block MORIA_PILLAR_STONE;
    public static final Block RUSTY_IRON;
    public static final Block ELF_FLOOR;
    public static final Block GONDORIAN_FLOOR;
    public static final Block STONE_FLOOR;
    public static final Block SILK_STONE;
    public static final Block CRACKED_SILK_STONE;
    public static final Block STRAW;
    public static final Block CRACKED_EARTH;
    public static final Block BAG_END_FLOOR;
    public static final Block BAG_END_WALL;
    public static final Block BROWN_STONE;
    public static final Block MORDOR_STONE;
    public static final Block CLIFF_BLOCK;
    public static final Block SPIDER_EGG;
    public static final Block GONDORIAN_STONE;
    public static final Block GONDORIAN_BRICK_STONE;
    public static final Block CRACKED_GONDORIAN_BRICK_STONE;
    public static final Block SALT_ORE;
    public static final Block DARK_METAL;
    public static final Block RIVENDELL_WOOD;
    public static final Block MOSS;
    public static final Block GONDORIAN_ROOF;
    public static final Block RIVENDELL_ROOF;
    public static final Block MOSSY_GONDORIAN_BRICK_STONE;
    public static final Block ROHAN_BRICKS;
    public static final Block MORDOR_BRICK_STONE;
    public static final Block MITHRIL_ORE;
    public static final Block NUMENOREAN;
    public static final Block DWARF_INNER_WALL_DECORATION;
    public static final Block DALE_STONE;
    public static final Block DWARF_INNER_WALL_STONE;
    public static final Block RED_LAPIS;
    public static final Block PURPLE_LAPIS;
    public static final Block LIGHT_BLUE_LAPIS;
    public static final Block GREEN_LAPIS;
    public static final Block DWARF_WALL;
    public static final Block BROWN_LAPIS;
    public static final Block DWARF_FLOOR;
    public static final Block DWARVEN_HALL_FLOOR;
    public static final Block DWARF_STONE;
    public static final Block DWARVEN_GOLD;
    public static final Block ROHAN_IRON;
    public static final Block DARK_DWARF_STONE;
    public static final Block MEDIUM_DARK_DWARF_STONE;
    public static final Block OLD_TREE;
    public static final Block CROSS_HAY;
    public static final Block LIGHT_GREY_CIRCLE_STONE;
    public static final Block LOSSARNARCH_DECORATION_STONE;
    public static final Block ELVEN_STONE_FLOOR;
    public static final Block ANCIENT_STONE;
    public static final Block BREE_STONE_BRICKS;
    public static final Block CRACKED_BREE_STONE_BRICKS;
    public static final Block MOSSY_BREE_STONE_BRICKS;
    public static final Block SHIRE_HAY;
    public static final Block SHIRE_PATH;
    public static final Block BREE_FLOOR;
    public static final Block ARNOR_FLOOR;
    public static final Block CARDOLAN_BRICK_STONE;
    public static final Block ELVEN_SANDSTONE_FLOOR;
    public static final Block DEAD_LAVA;
    public static final Block CHISELED_GONDORIAN_STONE;
    public static final Block NEEDLES;
    public static final Block RHUN_FLOOR;
    public static final Block KHAND_FLOOR;
    public static final Block RIVENDELL_FLOOR;
    public static final Block COLUMN;
    public static final Block DWARF_BRICKS;
    public static final Block DWARF_FLOOR2;
    public static final Block DWARF_FLOOR3;
    public static final Block DWARF_FLOOR4;
    public static final Block DWARF_FLOOR5;
    public static final Block DWARF_FLOOR6;
    public static final Block DWARF_FLOOR7;
    public static final Block DWARF_FLOOR8;
    public static final Block DWARF_FLOOR9;
    public static final Block DWARF_KING_STONE;
    public static final Block DWARVEN_KING_FLOOR;
    public static final Block DWARVEN_KING_FLOOR2;
    public static final Block DWARVEN_PILLAR_DECORATION;
    public static final Block DWARVEN_STEEL;
    public static final Block EREBOR_FLOOR;
    public static final Block EREBOR_FLOOR2;
    public static final Block ERED_LUIN_STONE;
    public static final Block IRON_HILLS_FLOOR;
    public static final Block SMOOTH_GOLD;
    public static final Block RIVENDELL_WALL;
    public static final Block SINDAR_STONE;
    public static final Block SINDAR_FLOOR;
    public static final Block SINDAR_FLOOR2;
    public static final Block SINDAR_DECORATION_STONE;
    public static final Block NOLDOR_FLOOR;
    // End Awaken Dreams code

    @Nullable

    /**
     * Returns the Block in the blockRegistry with the specified name.
     */
    private static Block getRegisteredBlock(String blockName)
    {
        Block block = (Block)Block.REGISTRY.getObject(new ResourceLocation(blockName));

        if (!CACHE.add(block))
        {
            throw new IllegalStateException("Invalid Block requested: " + blockName);
        }
        else
        {
            return block;
        }
    }

    static
    {
        if (!Bootstrap.isRegistered())
        {
            throw new RuntimeException("Accessed Blocks before Bootstrap!");
        }
        else
        {
            CACHE = Sets.<Block>newHashSet();
            AIR = getRegisteredBlock("air");
            STONE = getRegisteredBlock("stone");
            GRASS = (BlockGrass)getRegisteredBlock("grass");
            DIRT = getRegisteredBlock("dirt");
            COBBLESTONE = getRegisteredBlock("cobblestone");
            PLANKS = getRegisteredBlock("planks");
            SAPLING = getRegisteredBlock("sapling");
            BEDROCK = getRegisteredBlock("bedrock");
            FLOWING_WATER = (BlockDynamicLiquid)getRegisteredBlock("flowing_water");
            WATER = (BlockStaticLiquid)getRegisteredBlock("water");
            FLOWING_LAVA = (BlockDynamicLiquid)getRegisteredBlock("flowing_lava");
            LAVA = (BlockStaticLiquid)getRegisteredBlock("lava");
            SAND = (BlockSand)getRegisteredBlock("sand");
            GRAVEL = getRegisteredBlock("gravel");
            GOLD_ORE = getRegisteredBlock("gold_ore");
            IRON_ORE = getRegisteredBlock("iron_ore");
            COAL_ORE = getRegisteredBlock("coal_ore");
            LOG = getRegisteredBlock("log");
            LOG2 = getRegisteredBlock("log2");
            LEAVES = (BlockLeaves)getRegisteredBlock("leaves");
            LEAVES2 = (BlockLeaves)getRegisteredBlock("leaves2");
            SPONGE = getRegisteredBlock("sponge");
            GLASS = getRegisteredBlock("glass");
            LAPIS_ORE = getRegisteredBlock("lapis_ore");
            LAPIS_BLOCK = getRegisteredBlock("lapis_block");
            DISPENSER = getRegisteredBlock("dispenser");
            SANDSTONE = getRegisteredBlock("sandstone");
            NOTEBLOCK = getRegisteredBlock("noteblock");
            BED = getRegisteredBlock("bed");
            GOLDEN_RAIL = getRegisteredBlock("golden_rail");
            DETECTOR_RAIL = getRegisteredBlock("detector_rail");
            STICKY_PISTON = (BlockPistonBase)getRegisteredBlock("sticky_piston");
            WEB = getRegisteredBlock("web");
            TALLGRASS = (BlockTallGrass)getRegisteredBlock("tallgrass");
            DEADBUSH = (BlockDeadBush)getRegisteredBlock("deadbush");
            PISTON = (BlockPistonBase)getRegisteredBlock("piston");
            PISTON_HEAD = (BlockPistonExtension)getRegisteredBlock("piston_head");
            WOOL = getRegisteredBlock("wool");
            PISTON_EXTENSION = (BlockPistonMoving)getRegisteredBlock("piston_extension");
            YELLOW_FLOWER = (BlockFlower)getRegisteredBlock("yellow_flower");
            RED_FLOWER = (BlockFlower)getRegisteredBlock("red_flower");
            BROWN_MUSHROOM = (BlockBush)getRegisteredBlock("brown_mushroom");
            RED_MUSHROOM = (BlockBush)getRegisteredBlock("red_mushroom");
            GOLD_BLOCK = getRegisteredBlock("gold_block");
            IRON_BLOCK = getRegisteredBlock("iron_block");
            DOUBLE_STONE_SLAB = (BlockSlab)getRegisteredBlock("double_stone_slab");
            STONE_SLAB = (BlockSlab)getRegisteredBlock("stone_slab");
            BRICK_BLOCK = getRegisteredBlock("brick_block");
            TNT = getRegisteredBlock("tnt");
            BOOKSHELF = getRegisteredBlock("bookshelf");
            MOSSY_COBBLESTONE = getRegisteredBlock("mossy_cobblestone");
            OBSIDIAN = getRegisteredBlock("obsidian");
            TORCH = getRegisteredBlock("torch");
            FIRE = (BlockFire)getRegisteredBlock("fire");
            MOB_SPAWNER = getRegisteredBlock("mob_spawner");
            OAK_STAIRS = getRegisteredBlock("oak_stairs");
            CHEST = (BlockChest)getRegisteredBlock("chest");
            REDSTONE_WIRE = (BlockRedstoneWire)getRegisteredBlock("redstone_wire");
            DIAMOND_ORE = getRegisteredBlock("diamond_ore");
            DIAMOND_BLOCK = getRegisteredBlock("diamond_block");
            CRAFTING_TABLE = getRegisteredBlock("crafting_table");
            WHEAT = getRegisteredBlock("wheat");
            FARMLAND = getRegisteredBlock("farmland");
            FURNACE = getRegisteredBlock("furnace");
            LIT_FURNACE = getRegisteredBlock("lit_furnace");
            STANDING_SIGN = getRegisteredBlock("standing_sign");
            OAK_DOOR = (BlockDoor)getRegisteredBlock("wooden_door");
            SPRUCE_DOOR = (BlockDoor)getRegisteredBlock("spruce_door");
            BIRCH_DOOR = (BlockDoor)getRegisteredBlock("birch_door");
            JUNGLE_DOOR = (BlockDoor)getRegisteredBlock("jungle_door");
            ACACIA_DOOR = (BlockDoor)getRegisteredBlock("acacia_door");
            DARK_OAK_DOOR = (BlockDoor)getRegisteredBlock("dark_oak_door");
            LADDER = getRegisteredBlock("ladder");
            RAIL = getRegisteredBlock("rail");
            STONE_STAIRS = getRegisteredBlock("stone_stairs");
            WALL_SIGN = getRegisteredBlock("wall_sign");
            LEVER = getRegisteredBlock("lever");
            STONE_PRESSURE_PLATE = getRegisteredBlock("stone_pressure_plate");
            IRON_DOOR = (BlockDoor)getRegisteredBlock("iron_door");
            WOODEN_PRESSURE_PLATE = getRegisteredBlock("wooden_pressure_plate");
            REDSTONE_ORE = getRegisteredBlock("redstone_ore");
            LIT_REDSTONE_ORE = getRegisteredBlock("lit_redstone_ore");
            UNLIT_REDSTONE_TORCH = getRegisteredBlock("unlit_redstone_torch");
            REDSTONE_TORCH = getRegisteredBlock("redstone_torch");
            STONE_BUTTON = getRegisteredBlock("stone_button");
            SNOW_LAYER = getRegisteredBlock("snow_layer");
            ICE = getRegisteredBlock("ice");
            SNOW = getRegisteredBlock("snow");
            CACTUS = (BlockCactus)getRegisteredBlock("cactus");
            CLAY = getRegisteredBlock("clay");
            REEDS = (BlockReed)getRegisteredBlock("reeds");
            JUKEBOX = getRegisteredBlock("jukebox");
            OAK_FENCE = getRegisteredBlock("fence");
            SPRUCE_FENCE = getRegisteredBlock("spruce_fence");
            BIRCH_FENCE = getRegisteredBlock("birch_fence");
            JUNGLE_FENCE = getRegisteredBlock("jungle_fence");
            DARK_OAK_FENCE = getRegisteredBlock("dark_oak_fence");
            ACACIA_FENCE = getRegisteredBlock("acacia_fence");
            PUMPKIN = getRegisteredBlock("pumpkin");
            NETHERRACK = getRegisteredBlock("netherrack");
            SOUL_SAND = getRegisteredBlock("soul_sand");
            GLOWSTONE = getRegisteredBlock("glowstone");
            PORTAL = (BlockPortal)getRegisteredBlock("portal");
            LIT_PUMPKIN = getRegisteredBlock("lit_pumpkin");
            CAKE = getRegisteredBlock("cake");
            UNPOWERED_REPEATER = (BlockRedstoneRepeater)getRegisteredBlock("unpowered_repeater");
            POWERED_REPEATER = (BlockRedstoneRepeater)getRegisteredBlock("powered_repeater");
            TRAPDOOR = getRegisteredBlock("trapdoor");
            MONSTER_EGG = getRegisteredBlock("monster_egg");
            STONEBRICK = getRegisteredBlock("stonebrick");
            BROWN_MUSHROOM_BLOCK = getRegisteredBlock("brown_mushroom_block");
            RED_MUSHROOM_BLOCK = getRegisteredBlock("red_mushroom_block");
            IRON_BARS = getRegisteredBlock("iron_bars");
            GLASS_PANE = getRegisteredBlock("glass_pane");
            MELON_BLOCK = getRegisteredBlock("melon_block");
            PUMPKIN_STEM = getRegisteredBlock("pumpkin_stem");
            MELON_STEM = getRegisteredBlock("melon_stem");
            VINE = getRegisteredBlock("vine");
            OAK_FENCE_GATE = getRegisteredBlock("fence_gate");
            SPRUCE_FENCE_GATE = getRegisteredBlock("spruce_fence_gate");
            BIRCH_FENCE_GATE = getRegisteredBlock("birch_fence_gate");
            JUNGLE_FENCE_GATE = getRegisteredBlock("jungle_fence_gate");
            DARK_OAK_FENCE_GATE = getRegisteredBlock("dark_oak_fence_gate");
            ACACIA_FENCE_GATE = getRegisteredBlock("acacia_fence_gate");
            BRICK_STAIRS = getRegisteredBlock("brick_stairs");
            STONE_BRICK_STAIRS = getRegisteredBlock("stone_brick_stairs");
            MYCELIUM = (BlockMycelium)getRegisteredBlock("mycelium");
            WATERLILY = getRegisteredBlock("waterlily");
            NETHER_BRICK = getRegisteredBlock("nether_brick");
            NETHER_BRICK_FENCE = getRegisteredBlock("nether_brick_fence");
            NETHER_BRICK_STAIRS = getRegisteredBlock("nether_brick_stairs");
            NETHER_WART = getRegisteredBlock("nether_wart");
            ENCHANTING_TABLE = getRegisteredBlock("enchanting_table");
            BREWING_STAND = getRegisteredBlock("brewing_stand");
            CAULDRON = (BlockCauldron)getRegisteredBlock("cauldron");
            END_PORTAL = getRegisteredBlock("end_portal");
            END_PORTAL_FRAME = getRegisteredBlock("end_portal_frame");
            END_STONE = getRegisteredBlock("end_stone");
            DRAGON_EGG = getRegisteredBlock("dragon_egg");
            REDSTONE_LAMP = getRegisteredBlock("redstone_lamp");
            LIT_REDSTONE_LAMP = getRegisteredBlock("lit_redstone_lamp");
            DOUBLE_WOODEN_SLAB = (BlockSlab)getRegisteredBlock("double_wooden_slab");
            WOODEN_SLAB = (BlockSlab)getRegisteredBlock("wooden_slab");
            COCOA = getRegisteredBlock("cocoa");
            SANDSTONE_STAIRS = getRegisteredBlock("sandstone_stairs");
            EMERALD_ORE = getRegisteredBlock("emerald_ore");
            ENDER_CHEST = getRegisteredBlock("ender_chest");
            TRIPWIRE_HOOK = (BlockTripWireHook)getRegisteredBlock("tripwire_hook");
            TRIPWIRE = getRegisteredBlock("tripwire");
            EMERALD_BLOCK = getRegisteredBlock("emerald_block");
            SPRUCE_STAIRS = getRegisteredBlock("spruce_stairs");
            BIRCH_STAIRS = getRegisteredBlock("birch_stairs");
            JUNGLE_STAIRS = getRegisteredBlock("jungle_stairs");
            COMMAND_BLOCK = getRegisteredBlock("command_block");
            BEACON = (BlockBeacon)getRegisteredBlock("beacon");
            COBBLESTONE_WALL = getRegisteredBlock("cobblestone_wall");
            FLOWER_POT = getRegisteredBlock("flower_pot");
            CARROTS = getRegisteredBlock("carrots");
            POTATOES = getRegisteredBlock("potatoes");
            WOODEN_BUTTON = getRegisteredBlock("wooden_button");
            SKULL = (BlockSkull)getRegisteredBlock("skull");
            ANVIL = getRegisteredBlock("anvil");
            TRAPPED_CHEST = getRegisteredBlock("trapped_chest");
            LIGHT_WEIGHTED_PRESSURE_PLATE = getRegisteredBlock("light_weighted_pressure_plate");
            HEAVY_WEIGHTED_PRESSURE_PLATE = getRegisteredBlock("heavy_weighted_pressure_plate");
            UNPOWERED_COMPARATOR = (BlockRedstoneComparator)getRegisteredBlock("unpowered_comparator");
            POWERED_COMPARATOR = (BlockRedstoneComparator)getRegisteredBlock("powered_comparator");
            DAYLIGHT_DETECTOR = (BlockDaylightDetector)getRegisteredBlock("daylight_detector");
            DAYLIGHT_DETECTOR_INVERTED = (BlockDaylightDetector)getRegisteredBlock("daylight_detector_inverted");
            REDSTONE_BLOCK = getRegisteredBlock("redstone_block");
            QUARTZ_ORE = getRegisteredBlock("quartz_ore");
            HOPPER = (BlockHopper)getRegisteredBlock("hopper");
            QUARTZ_BLOCK = getRegisteredBlock("quartz_block");
            QUARTZ_STAIRS = getRegisteredBlock("quartz_stairs");
            ACTIVATOR_RAIL = getRegisteredBlock("activator_rail");
            DROPPER = getRegisteredBlock("dropper");
            STAINED_HARDENED_CLAY = getRegisteredBlock("stained_hardened_clay");
            BARRIER = getRegisteredBlock("barrier");
            IRON_TRAPDOOR = getRegisteredBlock("iron_trapdoor");
            HAY_BLOCK = getRegisteredBlock("hay_block");
            CARPET = getRegisteredBlock("carpet");
            HARDENED_CLAY = getRegisteredBlock("hardened_clay");
            COAL_BLOCK = getRegisteredBlock("coal_block");
            PACKED_ICE = getRegisteredBlock("packed_ice");
            ACACIA_STAIRS = getRegisteredBlock("acacia_stairs");
            DARK_OAK_STAIRS = getRegisteredBlock("dark_oak_stairs");
            SLIME_BLOCK = getRegisteredBlock("slime");
            DOUBLE_PLANT = (BlockDoublePlant)getRegisteredBlock("double_plant");
            STAINED_GLASS = (BlockStainedGlass)getRegisteredBlock("stained_glass");
            STAINED_GLASS_PANE = (BlockStainedGlassPane)getRegisteredBlock("stained_glass_pane");
            PRISMARINE = getRegisteredBlock("prismarine");
            SEA_LANTERN = getRegisteredBlock("sea_lantern");
            STANDING_BANNER = getRegisteredBlock("standing_banner");
            WALL_BANNER = getRegisteredBlock("wall_banner");
            RED_SANDSTONE = getRegisteredBlock("red_sandstone");
            RED_SANDSTONE_STAIRS = getRegisteredBlock("red_sandstone_stairs");
            DOUBLE_STONE_SLAB2 = (BlockSlab)getRegisteredBlock("double_stone_slab2");
            STONE_SLAB2 = (BlockSlab)getRegisteredBlock("stone_slab2");
            END_ROD = getRegisteredBlock("end_rod");
            CHORUS_PLANT = getRegisteredBlock("chorus_plant");
            CHORUS_FLOWER = getRegisteredBlock("chorus_flower");
            PURPUR_BLOCK = getRegisteredBlock("purpur_block");
            PURPUR_PILLAR = getRegisteredBlock("purpur_pillar");
            PURPUR_STAIRS = getRegisteredBlock("purpur_stairs");
            PURPUR_DOUBLE_SLAB = (BlockSlab)getRegisteredBlock("purpur_double_slab");
            PURPUR_SLAB = (BlockSlab)getRegisteredBlock("purpur_slab");
            END_BRICKS = getRegisteredBlock("end_bricks");
            BEETROOTS = getRegisteredBlock("beetroots");
            GRASS_PATH = getRegisteredBlock("grass_path");
            END_GATEWAY = getRegisteredBlock("end_gateway");
            REPEATING_COMMAND_BLOCK = getRegisteredBlock("repeating_command_block");
            CHAIN_COMMAND_BLOCK = getRegisteredBlock("chain_command_block");
            FROSTED_ICE = getRegisteredBlock("frosted_ice");
            field_189877_df = getRegisteredBlock("magma");
            field_189878_dg = getRegisteredBlock("nether_wart_block");
            field_189879_dh = getRegisteredBlock("red_nether_brick");
            field_189880_di = getRegisteredBlock("bone_block");
            field_189881_dj = getRegisteredBlock("structure_void");
            STRUCTURE_BLOCK = getRegisteredBlock("structure_block");
            // Begin Awaken Dreams code
            JADE_ORE = getRegisteredBlock("jade_ore");
            AMBER_ORE = getRegisteredBlock("amber_ore");
            TANZANITE_ORE = getRegisteredBlock("tanzanite_ore");
            PERMANENT_DIRT = getRegisteredBlock("permanent_dirt");
            AMETHYST_ORE = getRegisteredBlock("amethyst_ore");
            RUBY_ORE = getRegisteredBlock("ruby_ore");
            ONYX_ORE = getRegisteredBlock("onyx_ore");
            MOONSTONE_ORE = getRegisteredBlock("moonstone_ore");
            MINAS_MORGUL_GLOWSTONE = getRegisteredBlock("minas_morgul_glowstone");
            ARGONATH_STONE = getRegisteredBlock("argonath_stone");
            MITHRIL_BLOCK = getRegisteredBlock("mithril_block");
            CRYSTAL_ORE = getRegisteredBlock("crystal_ore");
            DESERT_ROAD_BLOCK = getRegisteredBlock("desert_road_block");
            DIRT_ROAD_BLOCK = getRegisteredBlock("dirt_road_block");
            LIGHT_BLUE_GLOWSTONE = getRegisteredBlock("light_blue_glowstone");
            BLACK_IRON = getRegisteredBlock("black_iron");
            MORIA_PILLAR_STONE = getRegisteredBlock("moria_pillar_stone");
            RUSTY_IRON = getRegisteredBlock("rusty_iron");
            ELF_FLOOR = getRegisteredBlock("elf_floor");
            GONDORIAN_FLOOR = getRegisteredBlock("gondorian_floor");
            STONE_FLOOR = getRegisteredBlock("stone_floor");
            SILK_STONE = getRegisteredBlock("silk_stone");
            CRACKED_SILK_STONE = getRegisteredBlock("cracked_silk_stone");
            STRAW = getRegisteredBlock("straw");
            CRACKED_EARTH = getRegisteredBlock("cracked_earth");
            BAG_END_FLOOR = getRegisteredBlock("bag_end_floor");
            BAG_END_WALL = getRegisteredBlock("bag_end_wall");
            BROWN_STONE = getRegisteredBlock("brown_stone");
            MORDOR_STONE = getRegisteredBlock("mordor_stone");
            CLIFF_BLOCK = getRegisteredBlock("cliff_block");
            SPIDER_EGG = getRegisteredBlock("spider_egg");
            GONDORIAN_STONE = getRegisteredBlock("gondorian_stone");
            GONDORIAN_BRICK_STONE = getRegisteredBlock("gondorian_brick_stone");
            CRACKED_GONDORIAN_BRICK_STONE = getRegisteredBlock("cracked_gondorian_brick_stone");
            SALT_ORE = getRegisteredBlock("salt_ore");
            DARK_METAL = getRegisteredBlock("dark_metal");
            RIVENDELL_WOOD = getRegisteredBlock("rivendell_wood");
            MOSS = getRegisteredBlock("moss");
            GONDORIAN_ROOF = getRegisteredBlock("gondorian_roof");
            RIVENDELL_ROOF = getRegisteredBlock("rivendell_roof");
            MOSSY_GONDORIAN_BRICK_STONE = getRegisteredBlock("mossy_gondorian_brick_stone");
            ROHAN_BRICKS = getRegisteredBlock("rohan_bricks");
            MORDOR_BRICK_STONE = getRegisteredBlock("mordor_brick_stone");
            MITHRIL_ORE = getRegisteredBlock("mithril_ore");
            NUMENOREAN = getRegisteredBlock("numenorean");
            DWARF_INNER_WALL_DECORATION = getRegisteredBlock("dwarf_inner_wall_decoration");
            DALE_STONE = getRegisteredBlock("dale_stone");
            DWARF_INNER_WALL_STONE = getRegisteredBlock("dwarf_inner_wall_stone");
            RED_LAPIS = getRegisteredBlock("red_lapis");
            PURPLE_LAPIS = getRegisteredBlock("purple_lapis");
            LIGHT_BLUE_LAPIS = getRegisteredBlock("light_blue_lapis");
            GREEN_LAPIS = getRegisteredBlock("green_lapis");
            DWARF_WALL = getRegisteredBlock("dwarf_wall");
            BROWN_LAPIS = getRegisteredBlock("brown_lapis");
            DWARF_FLOOR = getRegisteredBlock("dwarf_floor");
            DWARVEN_HALL_FLOOR = getRegisteredBlock("dwarven_hall_floor");
            DWARF_STONE = getRegisteredBlock("dwarf_stone");
            DWARVEN_GOLD = getRegisteredBlock("dwarven_gold");
            ROHAN_IRON = getRegisteredBlock("rohan_iron");
            DARK_DWARF_STONE = getRegisteredBlock("dark_dwarf_stone");
            MEDIUM_DARK_DWARF_STONE = getRegisteredBlock("medium_dark_dwarf_stone");
            OLD_TREE = getRegisteredBlock("old_tree");
            CROSS_HAY = getRegisteredBlock("cross_hay");
            LIGHT_GREY_CIRCLE_STONE = getRegisteredBlock("light_grey_circle_stone");
            LOSSARNARCH_DECORATION_STONE = getRegisteredBlock("lossarnarch_decoration_stone");
            ELVEN_STONE_FLOOR = getRegisteredBlock("elven_stone_floor");
            ANCIENT_STONE = getRegisteredBlock("ancient_stone");
            BREE_STONE_BRICKS = getRegisteredBlock("bree_stone_bricks");
            CRACKED_BREE_STONE_BRICKS = getRegisteredBlock("cracked_bree_stone_bricks");
            MOSSY_BREE_STONE_BRICKS = getRegisteredBlock("mossy_bree_stone_bricks");
            SHIRE_HAY = getRegisteredBlock("shire_hay");
            SHIRE_PATH = getRegisteredBlock("shire_path");
            BREE_FLOOR = getRegisteredBlock("bree_floor");
            ARNOR_FLOOR = getRegisteredBlock("arnor_floor");
            CARDOLAN_BRICK_STONE = getRegisteredBlock("cardolan_brick_stone");
            ELVEN_SANDSTONE_FLOOR = getRegisteredBlock("elven_sandstone_floor");
            DEAD_LAVA = getRegisteredBlock("dead_lava");
            CHISELED_GONDORIAN_STONE = getRegisteredBlock("chiseled_gondorian_stone");
            NEEDLES = getRegisteredBlock("needles");
            RHUN_FLOOR = getRegisteredBlock("rhun_floor");
            KHAND_FLOOR = getRegisteredBlock("khand_floor");
            RIVENDELL_FLOOR = getRegisteredBlock("rivendell_floor");
            COLUMN = getRegisteredBlock("column");
            DWARF_BRICKS = getRegisteredBlock("dwarf_bricks");
            DWARF_FLOOR2 = getRegisteredBlock("dwarf_floor2");
            DWARF_FLOOR3 = getRegisteredBlock("dwarf_floor3");
            DWARF_FLOOR4 = getRegisteredBlock("dwarf_floor4");
            DWARF_FLOOR5 = getRegisteredBlock("dwarf_floor5");
            DWARF_FLOOR6 = getRegisteredBlock("dwarf_floor6");
            DWARF_FLOOR7 = getRegisteredBlock("dwarf_floor7");
            DWARF_FLOOR8 = getRegisteredBlock("dwarf_floor8");
            DWARF_FLOOR9 = getRegisteredBlock("dwarf_floor9");
            DWARF_KING_STONE = getRegisteredBlock("dwarf_king_stone");
            DWARVEN_KING_FLOOR = getRegisteredBlock("dwarven_king_floor");
            DWARVEN_KING_FLOOR2 = getRegisteredBlock("dwarven_king_floor2");
            DWARVEN_PILLAR_DECORATION = getRegisteredBlock("dwarven_pillar_decoration");
            DWARVEN_STEEL = getRegisteredBlock("dwarven_steel");
            EREBOR_FLOOR = getRegisteredBlock("erebor_floor");
            EREBOR_FLOOR2 = getRegisteredBlock("erebor_floor2");
            ERED_LUIN_STONE = getRegisteredBlock("ered_luin_stone");
            IRON_HILLS_FLOOR = getRegisteredBlock("iron_hills_floor");
            SMOOTH_GOLD = getRegisteredBlock("smooth_gold");
            RIVENDELL_WALL = getRegisteredBlock("rivendell_wall");
            SINDAR_STONE = getRegisteredBlock("sindar_stone");
            SINDAR_FLOOR = getRegisteredBlock("sindar_floor");
            SINDAR_FLOOR2 = getRegisteredBlock("sindar_floor2");
            SINDAR_DECORATION_STONE = getRegisteredBlock("sindar_decoration_stone");
            NOLDOR_FLOOR = getRegisteredBlock("noldor_floor");
            // End Awaken Dreams code
            CACHE.clear();
        }
    }
}
