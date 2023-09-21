package com.plr.minfalldistance;

import com.plr.minfalldistance.config.CommonConfig;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import net.fabricmc.api.ModInitializer;

public class MinFallDistance implements ModInitializer {
    private static CommonConfig cfg;

    @Override
    public void onInitialize() {
        AutoConfig.register(CommonConfig.class, JanksonConfigSerializer::new);
        cfg = AutoConfig.getConfigHolder(CommonConfig.class).getConfig();
    }

    public static float getMinFallDist() {
        return cfg.minFallDistance;
    }
}
