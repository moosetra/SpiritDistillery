package com.moosetra.spiritdistillery.reference;

import com.moosetra.spiritdistillery.util.ResourceLocationHelper;
import net.minecraft.util.ResourceLocation;

public class Textures
{
    public static final String RESOURCE_PREFIX = Reference.MOD_ID + ":";

    public static final class Model {
        private static final String MODEL_TEXTURE_LOCATION = "textures/models/";
        public static final ResourceLocation AGINGBARREL = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "agingBarrel.png");
        public static final ResourceLocation BARREL = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "barrel.png");
        public static final ResourceLocation CARBONITETANK = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "carboniteTank.png");
        public static final ResourceLocation CASK = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "cask.png");
        public static final ResourceLocation FERMENTER = ResourceLocationHelper.getResourceLocation(MODEL_TEXTURE_LOCATION + "fermenter.png");
    }

}
