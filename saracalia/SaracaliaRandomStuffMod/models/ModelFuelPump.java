// Model: FuelPump
// Model Creator: Saracalia
// Created on: 29.12.2016 - 16:01:46
// Last changed on: 29.12.2016 - 16:01:46

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelFuelPump extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelFuelPump() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[3];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 49, 33, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 12, 16, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, -6F, -8F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 12, 14, 16, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-6F, -20F, -8F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 4, 16, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-6F, -24F, -8F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}