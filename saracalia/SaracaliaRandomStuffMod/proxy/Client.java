package saracalia.SaracaliaRandomStuffMod.proxy;

import net.minecraft.client.Minecraft;
import net.minecraft.client.renderer.RenderItem;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.fml.client.registry.ClientRegistry;
import saracalia.SaracaliaRandomStuffMod.Info;
import saracalia.SaracaliaRandomStuffMod.register.RegistryContainer;
import saracalia.SaracaliaRandomStuffMod.util.SRSMRenderer;

public class Client extends Common{
	
	@Override
	public void registerItemRenders(){
		RenderItem ri = Minecraft.getMinecraft().getRenderItem();
		for(String blockname : RegistryContainer.getNameList()){
			ri.getItemModelMesher().register(Item.getItemFromBlock(RegistryContainer.getBlock(blockname)), 0, new ModelResourceLocation(Info.modid + ":" + blockname, "inventory"));
		}
	}
	
	@Override
	public void registerTileEntityRenders(){
		for(String string : RegistryContainer.getNameList()){
			ClientRegistry.bindTileEntitySpecialRenderer(RegistryContainer.getTilEntityClass(string), new SRSMRenderer(RegistryContainer.getModel(string), string, RegistryContainer.getY(string)));
		}
	}
	
}
