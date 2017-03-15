// Model: BusStopSign
// Model Creator: 
// Created on: 17.01.2017 - 17:13:46
// Last changed on: 17.01.2017 - 17:13:46

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelBusStopSign extends ModelVehicle //Same as Filename
{
	int textureX = 64;
	int textureY = 64;

	public ModelBusStopSign() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[3];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 2, 50, 2, 0F); // Box 0
		bodyModel[0].setRotationPoint(-1F, -40F, -1F);

		bodyModel[1].addBox(0F, 0F, 0F, 4, 14, 6, 0F); // Box 1
		bodyModel[1].setRotationPoint(-2F, -20F, -3F);

		bodyModel[2].addBox(0F, 0F, 0F, 2, 14, 8, 0F); // Box 1
		bodyModel[2].setRotationPoint(-1F, -54F, -4F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}