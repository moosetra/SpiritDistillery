package com.moosetra.spiritdistillery.client.renderer.tileentity;

import com.moosetra.spiritdistillery.client.renderer.model.ModelAgingBarrel;
import com.moosetra.spiritdistillery.client.renderer.model.ModelBarrel;
import com.moosetra.spiritdistillery.reference.Textures;
import com.moosetra.spiritdistillery.tileentity.TileEntityAgingBarrel;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.client.renderer.tileentity.TileEntitySpecialRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.item.ItemBlock;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.IItemRenderer;
import net.minecraftforge.common.util.ForgeDirection;
import org.lwjgl.opengl.GL11;

@SideOnly(Side.CLIENT)
public class RenderAgingBarrel extends TileEntitySpecialRenderer implements IItemRenderer
{
    public ModelAgingBarrel model;
    private final ModelAgingBarrel modelAgingBarrel = new ModelAgingBarrel();
    public RenderAgingBarrel()
    {
        model = new ModelAgingBarrel();
    }

    @Override
    public boolean handleRenderType(ItemStack item, ItemRenderType type) {
        return false;
    }

    @Override
    public boolean shouldUseRenderHelper(ItemRenderType type, ItemStack item, ItemRendererHelper helper) {
        return false;
    }

    @Override
    public void renderItem(ItemRenderType type, ItemStack item, Object... data) {

    }
    @Override
    public void renderTileEntityAt(TileEntity tileEntity, double x, double y, double z, float tick)
    {
        if (tileEntity instanceof TileEntityAgingBarrel)
        {
            TileEntityAgingBarrel tileEntityAgingBarrel = (TileEntityAgingBarrel) tileEntity;

            GL11.glPushMatrix();

            // Scale, Translate, Rotate
            scaleTranslateRotate(x, y, z, tileEntityAgingBarrel.getOrientation());

            // Bind texture
            this.bindTexture(Textures.Model.AGINGBARREL);

            // Render
            modelAgingBarrel.render();

            GL11.glPopMatrix();
        }
    }

    private void scaleTranslateRotate(double x, double y, double z, ForgeDirection orientation)
    {
        if (orientation == ForgeDirection.NORTH)
        {
            GL11.glTranslated(x + 1, y, z);
            GL11.glRotatef(180F, 0F, 1F, 0F);
            GL11.glRotatef(-90F, 1F, 0F, 0F);
        }
        else if (orientation == ForgeDirection.EAST)
        {
            GL11.glTranslated(x + 1, y, z + 1);
            GL11.glRotatef(90F, 0F, 1F, 0F);
            GL11.glRotatef(-90F, 1F, 0F, 0F);
        }
        else if (orientation == ForgeDirection.SOUTH)
        {
            GL11.glTranslated(x, y, z + 1);
            GL11.glRotatef(0F, 0F, 1F, 0F);
            GL11.glRotatef(-90F, 1F, 0F, 0F);
        }
        else if (orientation == ForgeDirection.WEST)
        {
            GL11.glTranslated(x, y, z);
            GL11.glRotatef(-90F, 0F, 1F, 0F);
            GL11.glRotatef(-90F, 1F, 0F, 0F);
        }
    }

    private float getGhostItemScaleFactor(ItemStack itemStack)
    {
        float scaleFactor = 1.0F;

        if (itemStack != null)
        {
            byte numBlocks = 1;
            if (itemStack.stackSize > 1)
            {
                numBlocks = 2;
            }
            else if (itemStack.stackSize > 5)
            {
                numBlocks = 3;
            }
            else if (itemStack.stackSize > 20)
            {
                numBlocks = 4;
            }
            else if (itemStack.stackSize > 40)
            {
                numBlocks = 5;
            }

            if (itemStack.getItem() instanceof ItemBlock)
            {
                switch (numBlocks)
                {
                    case 1:
                        return 0.90F;
                    case 2:
                        return 0.90F;
                    case 3:
                        return 0.90F;
                    case 4:
                        return 0.90F;
                    case 5:
                        return 0.80F;
                    default:
                        return 0.90F;
                }
            }
            else
            {
                switch (numBlocks)
                {
                    case 1:
                        return 0.65F;
                    case 2:
                        return 0.65F;
                    case 3:
                        return 0.65F;
                    case 4:
                        return 0.65F;
                    default:
                        return 0.65F;
                }
            }
        }

        return scaleFactor;
    }
}
