package zTNFCResources;

import cpw.mods.fml.common.Mod;
import cpw.mods.fml.common.Mod.EventHandler;
import cpw.mods.fml.common.Mod.Instance;
import cpw.mods.fml.common.SidedProxy;
import cpw.mods.fml.common.event.FMLInitializationEvent;
import cpw.mods.fml.common.event.FMLPostInitializationEvent;
import cpw.mods.fml.common.event.FMLPreInitializationEvent;

import zTNFCResources.core.ModCommonProxy;
import zTNFCResources.core.ModDetails;



@Mod(modid = ModDetails.ModID, name = ModDetails.ModName, version = ModDetails.ModVersion, dependencies = ModDetails.ModDependencies)
public class zTNFCResources
{
	@Instance(ModDetails.ModID)
	public static zTNFCResources instance;

	@SidedProxy(clientSide = ModDetails.CLIENT_PROXY_CLASS, serverSide = ModDetails.SERVER_PROXY_CLASS)
	public static ModCommonProxy proxy;
	
	@EventHandler
	public void preInitialize(FMLPreInitializationEvent e)
	{
		
	}

	@EventHandler
	public void initialize(FMLInitializationEvent e)
	{

	}

	@EventHandler
	public void postInitialize(FMLPostInitializationEvent e)
	{
	}
}
