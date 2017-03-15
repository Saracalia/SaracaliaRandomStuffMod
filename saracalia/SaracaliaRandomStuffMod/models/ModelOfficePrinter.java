package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;

public class ModelOfficePrinter extends ModelVehicle
{
	int textureX = 128;
	int textureY = 128;

	public ModelOfficePrinter() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[7];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 1
		bodyModel[2] = new ModelRendererTurbo(this, 49, 25, textureX, textureY); // Box 1
		bodyModel[3] = new ModelRendererTurbo(this, 1, 33, textureX, textureY); // Box 1
		bodyModel[4] = new ModelRendererTurbo(this, 89, 1, textureX, textureY); // Box 1
		bodyModel[5] = new ModelRendererTurbo(this, 89, 9, textureX, textureY); // Box 1
		bodyModel[6] = new ModelRendererTurbo(this, 89, 33, textureX, textureY); // Box 1

		bodyModel[0].addBox(0F, 0F, 0F, 14, 16, 14, 0F); // Box 0
		bodyModel[0].setRotationPoint(-6F, -6F, -6F);

		bodyModel[1].addShapeBox(0F, 0F, 0F, 3, 2, 14, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[1].setRotationPoint(-6F, -8F, -6F);

		bodyModel[2].addShapeBox(0F, 0F, 0F, 11, 2, 14, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[2].setRotationPoint(-3F, -8F, -6F);

		bodyModel[3].addShapeBox(0F, 0F, 0F, 9, 1, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[3].setRotationPoint(-2F, -8.5F, -5F);

		bodyModel[4].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[4].setRotationPoint(-5F, -3F, -9F);

		bodyModel[5].addShapeBox(0F, 0F, 0F, 1, 6, 12, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F); // Box 1
		bodyModel[5].setRotationPoint(-6.5F, -5F, -5F);

		bodyModel[6].addShapeBox(0F, 0F, 0F, 12, 1, 3, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 1F, 0F, 0F, 1F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, 0F, -1F, 0F, 0F, -1F, 0F); // Box 1
		bodyModel[6].setRotationPoint(-5F, -3F, 8F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}