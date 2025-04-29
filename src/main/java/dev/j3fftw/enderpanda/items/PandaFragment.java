package dev.j3fftw.enderpanda.items;

import dev.j3fftw.enderpanda.Items;
import dev.j3fftw.enderpanda.SkullUtil;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItem;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.inventory.ItemStack;

public class PandaFragment extends SlimefunItem {

    private static final ItemStack panda = new CustomItemStack(SkullUtil.getByHash(
            "d188c980aacfa94cf33088512b1b9517ba826b154d4cafc262aff6977be8a"), "&8panda");

    public PandaFragment() {
        super(Items.ENDER_PANDA_CATEGORY, Items.PANDA_FRAGMENT, RecipeType.MOB_DROP, new ItemStack[]{
                null, null, null,
                null, panda, null,
                null, null, null
        });
    }
}
