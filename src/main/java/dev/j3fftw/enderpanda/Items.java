package dev.j3fftw.enderpanda;

import io.github.thebusybiscuit.slimefun4.api.items.ItemGroup;
import io.github.thebusybiscuit.slimefun4.api.items.SlimefunItemStack;
import io.github.thebusybiscuit.slimefun4.libraries.dough.items.CustomItemStack;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;

public final class Items {

    // Category
    public static final ItemGroup ENDER_PANDA_CATEGORY = new ItemGroup(
            new NamespacedKey(EnderPanda.getInstance(), "enderpanda"),
            new CustomItemStack(SkullUtil.getByHash(
                    "d188c980aacfa94cf33088512b1b9517ba826b154d4cafc262aff6977be8a"), "&8末地熊猫")
    );

    public static final SlimefunItemStack PANDA_FRAGMENT = new SlimefunItemStack(
            "PANDA_FRAGMENT",
            Material.PRISMARINE_SHARD,
            "&5熊猫精华",
            "",
            "&8在末地击杀熊猫掉落"
    );

    public static final SlimefunItemStack PANDA_HELMET = new SlimefunItemStack(
            "PANDA_HELMET",
            Material.DIAMOND_HELMET,
            "&5熊猫头盔",
            "",
            "&8可以与末影人对视"
    );

    public static final SlimefunItemStack PANDA_CHESTPLATE = new SlimefunItemStack(
            "PANDA_CHESTPLATE",
            Material.DIAMOND_CHESTPLATE,
            "&5熊猫胸甲"
    );

    public static final SlimefunItemStack PANDA_LEGGINGS = new SlimefunItemStack(
            "PANDA_LEGGINGS",
            Material.DIAMOND_LEGGINGS,
            "&5熊猫护腿"
    );

    public static final SlimefunItemStack PANDA_BOOTS = new SlimefunItemStack(
            "PANDA_BOOTS",
            Material.DIAMOND_BOOTS,
            "&5熊猫靴子"
    );

    public static final SlimefunItemStack SHULKER_HELMET = new SlimefunItemStack(
            "SHULKER_HELMET",
            Material.IRON_HELMET,
            "&5潜影贝头盔",
            "",
            "&8免疫漂浮"
    );

    public static final SlimefunItemStack ENDER_REPLACER = new SlimefunItemStack(
            "ENDER_REPLACER",
            new CustomItemStack(SkullUtil.getByHash("e5e8cc99bb42dda2aafbff457756776b28c8e34ee245cc553d2694e6b04b72"),
                    "末影人转换"),
            "&5末影人转换器",
            "",
            "&8将末影人转换成熊猫"
    );

    public static final SlimefunItemStack SPECIAL_BAMBOO = new SlimefunItemStack(
            "SPECIAL_BAMBOO",
            Material.BAMBOO,
            "&5特殊竹子",
            "",
            "&8末影人转换器的制作原料"
    );

    public static final SlimefunItemStack ENDER_GENERATOR = new SlimefunItemStack(
            "ENDER_GENERATOR",
            new CustomItemStack(SkullUtil.getByHash("38be8abd66d09a58ce12d377544d726d25cad7e979e8c2481866be94d3b32f"),
                    "末影珍珠发电"),
            "&5末影珍珠发电机",
            "",
            "&8使用末影珍珠发电"
    );

    private Items() {
    }
}
