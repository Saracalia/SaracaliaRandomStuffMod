package saracalia.SaracaliaRandomStuffMod;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockBusStop;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockBusStopSign;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockCashRegister;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockCoffeeMaker;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockConstructionHut;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockDumpMaster;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockFuelPump;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockLanPhone;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockLargeGasTank;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockOfficePrinter;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockPhoneBox;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockStreetLight;
import saracalia.SaracaliaRandomStuffMod.blocks.BlockWheelieBin;
import saracalia.SaracaliaRandomStuffMod.proxy.Common;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;

@Mod(modid = Info.modid, name = Info.name, version = Info.version)

public class SaracaliaRandomStuffMod {
	
	@SidedProxy(clientSide = "saracalia.SaracaliaRandomStuffMod.proxy.Client", serverSide = "saracalia.SaracaliaRandomStuffMod.proxy.Common")
    public static Common proxy;

	@EventHandler
	public void preInit(FMLPreInitializationEvent event){
		
		BlockBusStopSign.register();
		BlockBusStop.register();
		BlockCashRegister.register();
		BlockCoffeeMaker.register();
		BlockConstructionHut.register();
		BlockDumpMaster.register();
		BlockFuelPump.register();
		BlockLanPhone.register();
		BlockLargeGasTank.register();
		BlockOfficePrinter.register();
		BlockPhoneBox.register();
		BlockStreetLight.register();
		BlockWheelieBin.register();
		RegistryContainer.register();
		
	}
	
	@EventHandler
	public void init(FMLInitializationEvent event){
		proxy.registerItemRenders();
		proxy.registerTileEntityRenders();
	}
	
	@EventHandler
	public void postInit(FMLPostInitializationEvent event){
		
	}
	
	public static CreativeTabs tabSRSM = new CreativeTabs("tabSRSM"){
		@Override
		public Item getTabIconItem(){
			return Item.getItemFromBlock(BlockPhoneBox.getBlock("PhoneBox"));
		}
	};
	

}
