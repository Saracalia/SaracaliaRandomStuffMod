// Model: WheelieBin
// Model Creator: 
// Created on: 10.01.2017 - 21:22:31
// Last changed on: 10.01.2017 - 21:22:31

package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;

public class ModelWheelieBin extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelWheelieBin() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[12];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 1, 17, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 73, 17, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 33, 1, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 41, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		bodyModel[10] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0
		bodyModel[11] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 0

		bodyModel[0].addShapeBox(0F, 0F, 0F, 7, 3, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[0].setRotationPoint(-2F, 7F, -5F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 10, 15, 10, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[1].setRotationPoint(-5F, -8F, -5F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[2].setRotationPoint(-6F, -9F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 12, 1, 12, 0F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, -2F, 0F, -2F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[3].setRotationPoint(-6F, -10F, -6F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 3, 3, 8, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[4].setRotationPoint(-5F, 7F, -4F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[5].setRotationPoint(-5F, 8F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 2, 2, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[6].setRotationPoint(-5F, 8F, 4F);

		bodyModel[7].addShapeBox(0F, 0F, 0F, 1, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[7].setRotationPoint(-7.5F, -9.5F, -6F);

		bodyModel[8].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[8].setRotationPoint(-7F, -9F, -6F);

		bodyModel[9].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[9].setRotationPoint(-7F, -9F, 5F);

		bodyModel[10].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[10].setRotationPoint(-7F, -9F, -2F);

		bodyModel[11].addShapeBox(0F, 0F, 0F, 1, 1, 1, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 0
		bodyModel[11].setRotationPoint(-7F, -9F, 1F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}