package dev.j3fftw.litexpansion.machine;

import dev.j3fftw.litexpansion.Items;
import dev.j3fftw.litexpansion.LiteXpansion;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.block.BlockFace;
import org.bukkit.inventory.ItemStack;

public class MetalForge extends CraftingMultiBlock {

    public static final RecipeType RECIPE_TYPE = new RecipeType(
        new NamespacedKey(LiteXpansion.getInstance(), "metal_forge"),
        Items.METAL_FORGE,
        "",
        "&7用於壓製金屬"
    );

    private static final ItemStack anvil = new ItemStack(Material.ANVIL);
    private static final ItemStack ironBlock = new ItemStack(Material.IRON_BLOCK);

    public MetalForge() {
        super(Items.LITEXPANSION, Items.METAL_FORGE, new ItemStack[] {
            anvil, new ItemStack(Material.STONE_BRICK_WALL), anvil,
            ironBlock, new ItemStack(Material.DISPENSER), ironBlock,
            null, new ItemStack(Material.DIAMOND_BLOCK), null
        }, new ItemStack[0], BlockFace.DOWN);
    }
}
