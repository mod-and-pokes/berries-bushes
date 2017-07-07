package bushesberries;

import bushesberries.proxy.CommonProxy;
import bushesberries.util.Logs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

/**
 * Created by Willi on 7/6/2017.
 */
@Mod(modid = Reference.MOD_ID, name = Reference.NAME, version = Reference.VERSION)
public class BushesBerries
{
	@Mod.Instance
	public static BushesBerries instance;

	@SidedProxy(clientSide = "bushesberries.proxy.ClientProxy", serverSide = "bushesberries.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.EventHandler
	public void PreInit(FMLPreInitializationEvent e)
	{
		Logs.getLogger().info(Reference.NAME + " is currently in preinit");
	}

	@Mod.EventHandler
	public void Init(FMLInitializationEvent e)
	{
		Logs.getLogger().info(Reference.NAME + " is currently in init");
	}

	@Mod.EventHandler
	public void PostInit(FMLPostInitializationEvent e)
	{
		Logs.getLogger().info(Reference.NAME + " is currently in postinit");
	}
}
