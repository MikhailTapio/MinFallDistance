package com.plr.minfalldistance.config;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "minfalldistance")
public class CommonConfig implements ConfigData {
    @Comment("Min fall distance that hurts a LivingEntity")
    public float minFallDistance = 3.95F;
}
