package net.morimori.yjsnpimod.tileentity;

import net.minecraft.tileentity.TileEntityType;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.registries.IForgeRegistry;
import net.minecraftforge.registries.ObjectHolder;
import net.morimori.yjsnpimod.YJSNPIMOD;
import net.morimori.yjsnpimod.block.YJBlocks;
import red.felnull.otyacraftengine.util.IKSGRegistryUtil;

public class YJTileEntityTypes {

    @ObjectHolder(YJSNPIMOD.MODID + ":" + "toilet")
    public static TileEntityType<ToiletTileEntity> TOILET;

    @ObjectHolder(YJSNPIMOD.MODID + ":" + "big_pillow")
    public static TileEntityType<BigPillowTileEntity> BIG_PILLOW;

    public static void registerTileEntityType(IForgeRegistry<TileEntityType<?>> r) {
        IKSGRegistryUtil.registedTileEntityType(r, ToiletTileEntity::new, TOILET, new ResourceLocation(YJSNPIMOD.MODID, "toilet"), YJBlocks.TOILET);
        IKSGRegistryUtil.registedTileEntityType(r, BigPillowTileEntity::new, BIG_PILLOW, new ResourceLocation(YJSNPIMOD.MODID, "big_pillow"), YJBlocks.BIG_PILLOW);
    }

}