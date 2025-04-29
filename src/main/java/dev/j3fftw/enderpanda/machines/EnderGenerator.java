package dev.j3fftw.enderpanda.machines;

import dev.j3fftw.enderpanda.Items;
import io.github.thebusybiscuit.slimefun4.api.recipes.RecipeType;
import io.github.thebusybiscuit.slimefun4.implementation.SlimefunItems;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.AGenerator;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.abstractItems.MachineFuel;
import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;

public class EnderGenerator extends AGenerator {

    public EnderGenerator() {
        super(Items.ENDER_PANDA_CATEGORY, Items.ENDER_GENERATOR, RecipeType.ENHANCED_CRAFTING_TABLE, new ItemStack[]{
                        SlimefunItems.ENDER_RUNE, SlimefunItems.STEEL_PLATE, SlimefunItems.ENDER_RUNE,
                        SlimefunItems.STEEL_PLATE, SlimefunItems.ADVANCED_CIRCUIT_BOARD, SlimefunItems.STEEL_PLATE,
                        SlimefunItems.ENDER_RUNE, SlimefunItems.STEEL_PLATE, SlimefunItems.ENDER_RUNE
                }
        );
    }

    @Override
    public String getInventoryTitle() {
        return "&C末影珍珠发电机";
    }

    @Override
    public ItemStack getProgressBar() {
        return new ItemStack(Material.ENDER_PEARL);
    }

    @Override
    public int getEnergyProduction() {
        return 16;
    }

    @Override
    protected void registerDefaultFuelTypes() {
        registerFuel(new MachineFuel(16,
                new ItemStack(Material.ENDER_PEARL)));
    }

    @Override
    public int getCapacity() {
        return 64;
    }
}
