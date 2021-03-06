package mho.block.build;

import mho.Mho;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IconRegister;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockInvisible extends Block {

	public BlockInvisible(int ID, String name) {
		super(ID, Material.rock); //The ID and material (The material defines what tools are better on it)
		this.setHardness(300000.0F); //How hard the block is to break
		this.setResistance(300000.0F); //How well the block resists explosions
		this.setCreativeTab(Mho.tabMhoBlocks); //The tab it appears in
		this.setStepSound(super.soundGlassFootstep); //The sound the block makes when you walk on it as well as place or break it
		this.setLightOpacity(0);
		this.setUnlocalizedName("MHO"+name);
		this.setTextureName(name);
	}
	
	@SideOnly(Side.CLIENT)
	public void registerIcons(IconRegister par1IconRegister)
    {
        this.blockIcon = par1IconRegister.registerIcon(Mho.modid + ":" + this.getTextureName());
    }
	
	public boolean renderAsNormalBlock()
    {
        return false;
    }
	public boolean isOpaqueCube()
    {
        return false;
    }
}
