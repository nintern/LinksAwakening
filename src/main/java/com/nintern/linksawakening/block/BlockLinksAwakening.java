package com.nintern.linksawakening.block;

import com.nintern.linksawakening.creativetab.CreativeTabLinksAwakening;
import com.nintern.linksawakening.reference.Reference;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.client.renderer.texture.IIconRegister;

public class BlockLinksAwakening extends Block
{
	public BlockLinksAwakening(Material material)
	{
		super(material);
		this.setCreativeTab(CreativeTabLinksAwakening.LinksAwakening_Tab);
	}
	
	public BlockLinksAwakening()
	{
		this(Material.rock);
	}
	
	@Override
	public String getUnlocalizedName()
	{
		return String.format("tile.%s%s", Reference.MOD_ID.toLowerCase() + ":", getUnwrappedUnlocalizedName(super.getUnlocalizedName())); 
	}
	
	@Override
	@SideOnly(Side.CLIENT)
	public void registerBlockIcons(IIconRegister iconRegister)
	{
		blockIcon = iconRegister.registerIcon(String.format("%s", getUnwrappedUnlocalizedName(this.getUnlocalizedName())));
	}
	
	protected String getUnwrappedUnlocalizedName(String unlocalizedName)
	{
		return unlocalizedName.substring(unlocalizedName.indexOf(".") + 1);
	}
}
