package phoneticdragon.entropy;

import net.fabricmc.api.ModInitializer;

import phoneticdragon.entropy.item.ModItemGroups;
import phoneticdragon.entropy.item.ModItems;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Entropy implements ModInitializer {
    public static final String MOD_ID = "entropy";
    public static final Logger LOGGER = LoggerFactory.getLogger("entropy");

    @Override
    public void onInitialize() {
        ModItemGroups.registerItemGroups();
        ModItems.registerModItems();
    }
}
