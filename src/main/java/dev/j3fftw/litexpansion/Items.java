package dev.j3fftw.litexpansion;

import dev.j3fftw.litexpansion.machine.AdvancedSolarPanel;
import dev.j3fftw.litexpansion.machine.MassFabricator;
import dev.j3fftw.litexpansion.machine.Recycler;
import dev.j3fftw.litexpansion.machine.RubberSynthesizer;
import dev.j3fftw.litexpansion.utils.Constants;
import dev.j3fftw.litexpansion.utils.LoreBuilderDynamic;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.utils.LoreBuilder;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import me.mrCookieSlime.Slimefun.cscorelib2.skull.SkullItem;
import org.bukkit.Color;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;

public final class Items {

    // Category
    public static final Category LITEXPANSION = new Category(
        new NamespacedKey(LiteXpansion.getInstance(), "litexpansion"),
        new CustomItem(SkullItem.fromHash("3f87fc5cbb233743a82fb0fa51fe739487f29bcc01c9026621ecefad197f4fb1"),
            "&7物理科技")
    );
    public static final SlimefunItemStack ELECTRIC_CHESTPLATE = new SlimefunItemStack(
        "ELECTRIC_CHESTPLATE",
        Material.LEATHER_CHESTPLATE, Color.TEAL,
        "&9電磁胸甲",
        "",
        "&8\u21E8 &7吸收所有傷害.",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 250 J"
    );

    // Armor
    public static final SlimefunItemStack NANO_BLADE = new SlimefunItemStack(
        "NANO_BLADE",
        Material.DIAMOND_SWORD,
        "&2奈米刀 &c(關閉)",
        "",
        "&f一項先進的技術可以",
        "&f輕鬆切開有機組織.",
        "",
        "&f切換: &a右鍵",
        "",
        "&8\u21E8 &7消耗 &e10J &7每次攻擊",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 500 J"
    );

    // Weapon
    // Tools
    public static final SlimefunItemStack WRENCH = new SlimefunItemStack(
        "WRENCH",
        Material.GOLDEN_HOE,
        "&6扳手",
        "",
        "&7點擊任何機器,發電機,電容,",
        "&7或物流節點來立即破壞!",
        ""
    );
    public static final SlimefunItemStack GLASS_CUTTER = new SlimefunItemStack(
        "GLASS_CUTTER",
        Material.GHAST_TEAR,
        "&b玻璃切割刀",
        "",
        "&7> &e左鍵 &7- 快速切割玻璃",
        "&7> &e右鍵 &7- 緩慢切割玻璃",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 300 J"
    );
    public static final SlimefunItemStack MINING_DRILL = new SlimefunItemStack(
        "MINING_DRILL",
        Material.IRON_SHOVEL,
        "&7採礦電鑽",
        "",
        "&7立即破壞石頭和其他石頭種類",
        "&7右鍵來緩慢破壞方塊",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 1000 J"
    );
    public static final SlimefunItemStack DIAMOND_DRILL = new SlimefunItemStack(
        "DIAMOND_DRILL",
        Material.DIAMOND_SHOVEL,
        "&b鑽石電鑽",
        "",
        "&7立即破壞黑曜石,石頭和其他石頭種類",
        "&7右鍵來緩慢破壞方塊",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 1000 J"
    );
    public static final SlimefunItemStack TREETAP = new SlimefunItemStack(
        "TREETAP",
        Material.WOODEN_HOE,
        "&7木龍頭"
    );
    public static final SlimefunItemStack CARGO_CONFIGURATOR = new SlimefunItemStack(
        "CARGO_CONFIGURATOR",
        Material.COMPASS,
        "&7物流配置器",
        "",
        "&7> &e右鍵 &7- 複製節點設定",
        "&7> &e左鍵  &7- 套用節點設定",
        "&7> &eShift+右鍵 &7- 清除節點設定"
    );
    // Items

    public static final SlimefunItemStack TIN_PLATE = new SlimefunItemStack(
        "TIN_PLATE",
        Material.WHITE_CARPET,
        "&7錫板"
    );

    public static final SlimefunItemStack TIN_ITEM_CASING = new SlimefunItemStack(
        "TIN_ITEM_CASING",
        Material.WHITE_CARPET,
        "&7錫質外殼"
    );

    public static final SlimefunItemStack UNINSULATED_TIN_CABLE = new SlimefunItemStack(
        "UNINSULATED_TIN_CABLE",
        Material.STRING,
        "&7非絕緣錫電線"
    );

    public static final SlimefunItemStack TIN_CABLE = new SlimefunItemStack(
        "TIN_CABLE",
        Material.STRING,
        "&7錫電線"
    );

    public static final SlimefunItemStack COPPER_PLATE = new SlimefunItemStack(
        "COPPER_PLATE",
        Material.ORANGE_CARPET,
        "&7銅板"
    );

    public static final SlimefunItemStack COPPER_ITEM_CASING = new SlimefunItemStack(
        "COPPER_ITEM_CASING",
        Material.ORANGE_CARPET,
        "&7銅質外殼"
    );

    public static final SlimefunItemStack FOOD_SYNTHESIZER = new SlimefunItemStack(
        "FOOD_SYNTHESIZER",
        new CustomItem(SkullItem.fromHash("a967efe969d264f635f2c201c34381ef59c72e16ec50af7692033121e22fba9c"),
            "Food Synthesizer"),
        "&d食品合成器",
        "",
        "&f持續飽受人造食物",
        "&f的滋味!",
        "",
        "&c&o&8\u21E8 &e\u26A1 &70 / 100 J"
    );
    public static final SlimefunItemStack MAG_THOR = new SlimefunItemStack(
        "MAG_THOR",
        Material.IRON_INGOT,
        "&b&l釷鎂合金",
        "",
        "&7&o一個極耐用的合金",
        "&7&o僅使用在最先進的機器中"
    );
    public static final SlimefunItemStack THORIUM = new SlimefunItemStack(
        "THORIUM",
        new CustomItem(SkullItem.fromHash("b87403257c0eaa518cf186deccde137d476556ccff146d503fb2e73956582f37"),
            "釷"),
        "&8釷",
        "",
        LoreBuilder.radioactive(Radioactivity.HIGH),
            "&8\u21E8 &4需要穿上防護套裝!"
    );
    public static final SlimefunItemStack SCRAP = new SlimefunItemStack(
        "SCRAP",
        Material.DEAD_BUSH,
        "&8廢料",
        "",
        "&7可以用於製造 &5UU-物質"
    );
    public static final SlimefunItemStack UU_MATTER = new SlimefunItemStack(
        "UU_MATTER",
        Material.PURPLE_DYE,
        "&5UU-物質",
        "",
        "&7可以用於創造物品或資源"
    );
    public static final SlimefunItemStack IRIDIUM = new SlimefunItemStack(
        "IRIDIUM",
        Material.WHITE_DYE,
        "&f銥"
    );
    public static final SlimefunItemStack IRIDIUM_PLATE = new SlimefunItemStack(
        "IRIDIUM_PLATE",
        Material.PAPER,
        "&f銥板",
        "",
        "&7用來製作銥裝備"
    );
    public static final SlimefunItemStack THORIUM_DUST = new SlimefunItemStack(
        "THORIUM_DUST",
        Material.BLACK_DYE,
        "&8釷粉"
    );
    public static final SlimefunItemStack REFINED_IRON = new SlimefunItemStack(
        "REFINED_IRON",
        Material.IRON_INGOT,
        "&7精煉鐵"
    );
    public static final SlimefunItemStack MACHINE_BLOCK = new SlimefunItemStack(
        "MACHINE_BLOCK",
        Material.IRON_BLOCK,
        "&7機械外殼"
    );
    public static final SlimefunItemStack UNINSULATED_COPPER_CABLE = new SlimefunItemStack(
        "UNINSULATED_COPPER_CABLE",
        Material.STRING,
        "&7非絕緣銅電線"
    );
    public static final SlimefunItemStack COPPER_CABLE = new SlimefunItemStack(
        "COPPER_CABLE",
        Material.STRING,
        "&7銅電線"
    );
    public static final SlimefunItemStack RUBBER = new SlimefunItemStack(
        "RUBBER",
        Material.INK_SAC,
        "&7橡膠"
    );
    public static final SlimefunItemStack ELECTRONIC_CIRCUIT = new SlimefunItemStack(
        "ELECTRONIC_CIRCUIT",
        Material.COBWEB,
        "&7電子電路"
    );
    public static final SlimefunItemStack ADVANCED_CIRCUIT = new SlimefunItemStack(
        "ADVANCED_CIRCUIT",
        Material.COBWEB,
        "&7高級電路"
    );
    ////////////////
    // CARBON CRAP
    public static final SlimefunItemStack COAL_DUST = new SlimefunItemStack(
        "COAL_DUST",
        Material.BLACK_DYE,
        "&7煤炭粉"
    );
    public static final SlimefunItemStack RAW_CARBON_FIBRE = new SlimefunItemStack(
        "RAW_CARBON_FIBRE",
        Material.BLACK_DYE,
        "&7碳纖維原料"
    );
    public static final SlimefunItemStack RAW_CARBON_MESH = new SlimefunItemStack(
        "RAW_CARBON_MESH",
        Material.BLACK_DYE,
        "&7碳纖維網"
    );
    public static final SlimefunItemStack CARBON_PLATE = new SlimefunItemStack(
        "CARBON_PLATE",
        Material.BLACK_CARPET,
        "&7碳板"
    );
    public static final SlimefunItemStack ADVANCED_ALLOY = new SlimefunItemStack(
        "ADVANCED_ALLOY",
        Material.PAPER,
        "&7高級合金"
    );
    /////////
    public static final SlimefunItemStack ADVANCED_MACHINE_BLOCK = new SlimefunItemStack(
        "ADVANCED_MACHINE_BLOCK",
        Material.DIAMOND_BLOCK,
        "&7高級機械外殼"
    );

    public static final SlimefunItemStack LAPOTRON_CRYSTAL = new SlimefunItemStack(
        "LAPOTRON_CRYSTAL",
        Material.DIAMOND,
        "&7藍晶"
    );
    public static final SlimefunItemStack REINFORCED_STONE = new SlimefunItemStack(
        "REINFORCED_STONE",
        Material.STONE,
        "&7強化石頭"
    );
    public static final SlimefunItemStack REINFORCED_DOOR = new SlimefunItemStack(
        "REINFORCED_DOOR",
        Material.IRON_DOOR,
        "&7防爆門"
    );
    public static final SlimefunItemStack REINFORCED_GLASS = new SlimefunItemStack(
        "REINFORCED_GLASS",
        Material.GRAY_STAINED_GLASS,
        "&7防爆玻璃"
    );
    public static final SlimefunItemStack MIXED_METAL_INGOT = new SlimefunItemStack(
        "MIXED_METAL_INGOT",
        Material.IRON_INGOT,
        "&7混合金屬錠"
    );
    // Machines
    public static final SlimefunItemStack RECYCLER = new SlimefunItemStack(
        "SCRAP_MACHINE",
        Material.BLACK_CONCRETE,
        "&8物質回收機",
        "",
        "&f回收任何東西產生&8廢料",
        "",
        LoreBuilderDynamic.powerBuffer(Recycler.CAPACITY),
        LoreBuilderDynamic.powerPerTick(Recycler.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack MASS_FABRICATOR_MACHINE = new SlimefunItemStack(
        "MASS_FABRICATOR_MACHINE",
        Material.PURPLE_CONCRETE,
        "&5物質製作機",
        "",
        "&f將&8廢料&f轉化成&5UU-物質",
        "",
        LoreBuilderDynamic.powerBuffer(MassFabricator.CAPACITY),
        LoreBuilderDynamic.powerPerTick(MassFabricator.ENERGY_CONSUMPTION)
    );
    public static final SlimefunItemStack RUBBER_SYNTHESIZER_MACHINE = new SlimefunItemStack(
        "RUBBER_SYNTHESIZER",
        Material.ORANGE_CONCRETE,
        "&6橡膠合成機",
        "",
        "&f將石油轉化為&7橡膠",
        "",
        LoreBuilderDynamic.powerBuffer(RubberSynthesizer.CAPACITY),
        LoreBuilderDynamic.powerPerTick(RubberSynthesizer.ENERGY_CONSUMPTION)
    );
    //// Solar panels
    public static final SlimefunItemStack ADVANCED_SOLAR_PANEL = new SlimefunItemStack(
        "ADVANCED_SOLAR_PANEL",
        Material.BLACK_GLAZED_TERRACOTTA,
        "&7&l先進太陽能板",
        "&9可運作於夜間",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedSolarPanel.ADVANCED_STORAGE),
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ADVANCED_DAY_RATE) + " (日間)",
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ADVANCED_NIGHT_RATE) + " (夜間)"
    );
    public static final SlimefunItemStack HYBRID_SOLAR_PANEL = new SlimefunItemStack(
        "HYBRID_SOLAR_PANEL",
        Material.GRAY_GLAZED_TERRACOTTA,
        "&b&l混合太陽能板",
        "&9可運作於夜間",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedSolarPanel.HYBRID_STORAGE),
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.HYBRID_DAY_RATE) + " (日間 + 地獄)",
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.HYBRID_NIGHT_RATE) + " (夜間 + 終界)"
    );
    public static final SlimefunItemStack ULTIMATE_SOLAR_PANEL = new SlimefunItemStack(
        "ULTIMATE_SOLAR_PANEL",
        Material.PURPLE_GLAZED_TERRACOTTA,
        "&5&l終極太陽能板",
        "&9可運作於夜間",
        "",
        LoreBuilderDynamic.powerBuffer(AdvancedSolarPanel.ULTIMATE_STORAGE),
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ULTIMATE_DAY_RATE) + " (日間)",
        LoreBuilderDynamic.powerPerTick(AdvancedSolarPanel.ULTIMATE_NIGHT_RATE) + " (夜間)"
    );
    public static final SlimefunItemStack MULTI_FUNCTIONAL_ELECTRIC_STORAGE_UNIT = new SlimefunItemStack(
        "MULTI_FUNCTIONAL_ELECTRIC_STORAGE_UNIT",
        Material.IRON_BLOCK,
        "&7多功能蓄電裝置"
    );
    public static final SlimefunItemStack MULTI_FUNCTIONAL_STORAGE_UNIT = new SlimefunItemStack(
        "MULTI_FUNCTIONAL_STORAGE_UNIT",
        Material.DIAMOND_BLOCK,
        "&7多功能儲存單元"
    );
    public static final SlimefunItemStack GOLD_PLATE = new SlimefunItemStack(
        "GOLD_PLATE",
        Material.YELLOW_CARPET,
        "&7金板"
    );
    public static final SlimefunItemStack GOLD_ITEM_CASING = new SlimefunItemStack(
        "GOLD_ITEM_CASING",
        Material.YELLOW_CARPET,
        "&7金質外殼"
    );
    public static final SlimefunItemStack UNINSULATED_GOLD_CABLE = new SlimefunItemStack(
        "UNINSULATED_GOLD_CABLE",
        Material.STRING,
        "&7非絕緣金電線"
    );
    public static final SlimefunItemStack GOLD_CABLE = new SlimefunItemStack(
        "GOLD_CABLE",
        Material.STRING,
        "&7金電線"
    );
    //Basic Machines
    public static final SlimefunItemStack REFINED_SMELTERY = new SlimefunItemStack(
        "REFINED_SMELTERY",
        Material.BLAST_FURNACE,
        "&7精煉冶煉機"
    );

    public static final SlimefunItemStack METAL_FORGE = new SlimefunItemStack(
        "METAL_FORGE",
        Material.DISPENSER,
        "&7金屬樣板機"
    );

    public static final SlimefunItemStack MANUAL_MILL = new SlimefunItemStack(
        "MANUAL_MILL",
        Material.DISPENSER,
        "&7手動驅動機"
    );

    public static final SlimefunItemStack GENERATOR = new SlimefunItemStack(
        "GENERATOR",
        Material.IRON_BLOCK,
        "&7發電機"
    );

    public static final SlimefunItemStack RE_BATTERY = new SlimefunItemStack(
        "RE_BATTERY",
        Material.GLASS_BOTTLE,
        "&7稀土電池"
    );

    public static final SlimefunItemStack ADVANCED_SOLAR_HELMET = new SlimefunItemStack(
        "ADVANCED_SOLAR_HELMET",
        Material.IRON_HELMET,
        "&7高級太陽能頭盔"
    );

    public static final SlimefunItemStack CARBONADO_SOLAR_HELMET = new SlimefunItemStack(
        "CARBONADO_SOLAR_HELMET",
        Material.GOLDEN_HELMET,
        "&7黑鑽石太陽頭盔"
    );

    public static final SlimefunItemStack ENERGIZED_SOLAR_HELMET = new SlimefunItemStack(
        "ENERGIZED_SOLAR_HELMET",
        Material.GOLDEN_HELMET,
        "&7太陽能頭盔"
    );

    public static final SlimefunItemStack ADVANCEDLX_SOLAR_HELMET = new SlimefunItemStack(
        "ADVANCEDLX_SOLAR_HELMET",
        Material.DIAMOND_HELMET,
        "&7超級高級太陽頭盔"
    );

    public static final SlimefunItemStack HYBRID_SOLAR_HELMET = new SlimefunItemStack(
        "HYBRID_SOLAR_HELMET",
        Material.DIAMOND_HELMET,
        "&7混和太陽頭盔"
    );

    public static final SlimefunItemStack ULTIMATE_SOLAR_HELMET = new SlimefunItemStack(
        "ULTIMATE_SOLAR_HELMET",
        Material.DIAMOND_HELMET,
        "&7終極太陽頭盔"
    );

    public static final SlimefunItemStack IRON_PLATE = new SlimefunItemStack(
        "IRON_PLATE",
        Material.WHITE_CARPET,
        "&7鐵板"
    );

    public static final SlimefunItemStack DIAMOND_PLATE = new SlimefunItemStack(
        "DIAMOND_PLATE",
        Material.CYAN_CARPET,
        "&7鑽石板"
    );
    public static final SlimefunItemStack THORIUM_PLATE = new SlimefunItemStack(
        "THORIUM_PLATE",
        Material.GRAY_CARPET,
        "&7釷板"
    );

    public static final SlimefunItemStack POWER_UNIT = new SlimefunItemStack(
        "POWER_UNIT",
        Material.GOLDEN_HOE,
        "&7電動工具把手"
    );

    public static final SlimefunItemStack IRON_ITEM_CASING = new SlimefunItemStack(
        "IRON_ITEM_CASING",
        Material.GRAY_CARPET,
        "&7鐵質外殼"
    );

    private static final Enchantment glowEnchant = Enchantment.getByKey(Constants.GLOW_ENCHANT);

    static {
        ADVANCED_SOLAR_HELMET.addEnchantment(Enchantment.DURABILITY, 1);
        CARBONADO_SOLAR_HELMET.addEnchantment(Enchantment.DURABILITY, 2);
        ENERGIZED_SOLAR_HELMET.addEnchantment(Enchantment.DURABILITY, 3);
        ADVANCEDLX_SOLAR_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 4);
        HYBRID_SOLAR_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 5);
        ULTIMATE_SOLAR_HELMET.addUnsafeEnchantment(Enchantment.DURABILITY, 6);
        ADVANCED_CIRCUIT.addEnchantment(glowEnchant, 1);
        GLASS_CUTTER.addEnchantment(glowEnchant, 1);

        DIAMOND_DRILL.addEnchantment(glowEnchant, 1);
        LAPOTRON_CRYSTAL.addEnchantment(glowEnchant, 1);
        ADVANCEDLX_SOLAR_HELMET.addEnchantment(glowEnchant, 1);
        HYBRID_SOLAR_HELMET.addEnchantment(glowEnchant, 1);
        ULTIMATE_SOLAR_HELMET.addEnchantment(glowEnchant, 1);
    }

    private Items() {}
}
