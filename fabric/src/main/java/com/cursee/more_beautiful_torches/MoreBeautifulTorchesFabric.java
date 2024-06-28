package com.cursee.more_beautiful_torches;

import com.cursee.monolib.core.sailing.Sailing;
import com.cursee.more_beautiful_torches.core.ModBlocksFabric;
import com.cursee.more_beautiful_torches.core.ModCreativeModeTabFabric;
import net.fabricmc.api.ModInitializer;

public class MoreBeautifulTorchesFabric implements ModInitializer {
    
    @Override
    public void onInitialize() {
        
        MoreBeautifulTorches.init();
        Sailing.register(Constants.MOD_NAME, Constants.MOD_ID, Constants.MOD_VERSION, Constants.MC_VERSION_RAW, Constants.PUBLISHER_AUTHOR, Constants.PRIMARY_CURSEFORGE_MODRINTH);

        ModBlocksFabric.register();
        ModCreativeModeTabFabric.register();
    }
}
