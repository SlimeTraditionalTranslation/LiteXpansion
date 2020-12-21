package dev.j3fftw.litexpansion.items;

import dev.j3fftw.litexpansion.Items;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactive;
import io.github.thebusybiscuit.slimefun4.core.attributes.Radioactivity;
import io.github.thebusybiscuit.slimefun4.implementation.items.blocks.UnplaceableBlock;
import javax.annotation.Nonnull;
import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.cscorelib2.item.CustomItem;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class Thorium extends UnplaceableBlock implements Radioactive {

    private static final ItemStack thorium = new CustomItem(Material.PAPER, "&fHint!",
        "&a&o請確保對開採的區塊進行GEO-掃描", "&a&o來發現釷!");

    public Thorium() {
        super(Items.LITEXPANSION, Items.THORIUM, RecipeType.GEO_MINER, new ItemStack[] {
                null, null, null,
                null, thorium, null,
                null, null, null
            }
        );
    }

    @Nonnull
    @Override
    public Radioactivity getRadioactivity() {
        return Radioactivity.HIGH;
    }
}
