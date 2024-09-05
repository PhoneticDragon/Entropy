package phoneticdragon.entropy.item;

import net.fabricmc.fabric.api.itemgroup.v1.FabricItemGroup;
import phoneticdragon.entropy.Entropy;
import phoneticdragon.entropy.item.ModItems;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.Registries;
import net.minecraft.registry.Registry;
import net.minecraft.text.Text;
import net.minecraft.util.Identifier;

public class ModItemGroups {
    public static final ItemGroup ENTROPICITEMGROUP = Registry.register(Registries.ITEM_GROUP,
            new Identifier(Entropy.MOD_ID, "entropy"),
            FabricItemGroup.builder().displayName(Text.translatable("itemgroup.entropy"))
                    .icon(() -> new ItemStack(ModItems.ENTROPICSWORD)).entries((displayContext, entries) -> {
                        entries.add(ModItems.ENTROPICSWORD);


                    }).build());


    public static void registerItemGroups() {
        Entropy.LOGGER.info("Registering Item Groups for " + Entropy.MOD_ID);
    }
}


