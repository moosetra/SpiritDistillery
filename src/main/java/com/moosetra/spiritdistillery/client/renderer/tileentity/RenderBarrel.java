package com.moosetra.spiritdistillery.client.renderer.tileentity;

import com.moosetra.spiritdistillery.client.renderer.model.ModelBarrel;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import org.lwjgl.opengl.GL11;

public class RenderBarrel extends TileEntitySpecialRenderer
{
    private ModelBarrel model;
    private ResourceLocation texture = new ResourceLocation("spiritdistillery:textures/blocks/barrel.png");

    public RenderBarrel()
    {
        model = new ModelBarrel();
    }

    @Override
    public void renderTileEntityAt(TileEntity tile, double x, double y, double z, float scale)
    {
        GL11.glPushMatrix();
            GL11.glTranslated(x + 0.5, y + 1.5, z + 0.5);
            GL11.glRotated(180, 0, 0, 1);
        this.bindTexture(texture);
        GL11.glPopMatrix();
    }
}
