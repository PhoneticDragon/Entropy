package phoneticdragon.entropy.item;

import net.fabricmc.fabric.api.item.v1.FabricItemSettings;
import net.minecraft.item.*;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.util.Identifier;
import phoneticdragon.entropy.Entropy;
import phoneticdragon.entropy.item.ModItemGroups;

public class ModItems {
    public static final Item ENTROPICSWORD = registerItem("entropic_sword",
            new SwordItem(ModToolMaterial.ENTROPIC, 5, -2.3f, new FabricItemSettings().maxCount(1)));


    private static Item registerItem(String name, Item item) {
        return Registry.register(Registries.ITEM, new Identifier(Entropy.MOD_ID, name), item);
    }

    public static void registerModItems() {
        Entropy.LOGGER.info("Registering Mod Items for " + Entropy.MOD_ID);
    }
}
