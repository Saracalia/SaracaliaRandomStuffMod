package saracalia.SaracaliaRandomStuffMod.models; //Path where the model is located

import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelRendererTurbo;
import saracalia.SaracaliaRandomStuffMod.util.tmt.ModelVehicle;

public class ModelCoffeeMaker extends ModelVehicle //Same as Filename
{
	int textureX = 128;
	int textureY = 128;

	public ModelCoffeeMaker() //Same as Filename
	{
		bodyModel = new ModelRendererTurbo[10];
		bodyModel[0] = new ModelRendererTurbo(this, 1, 1, textureX, textureY); // Box 0
		bodyModel[1] = new ModelRendererTurbo(this, 9, 1, textureX, textureY); // Box 0
		bodyModel[2] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[3] = new ModelRendererTurbo(this, 25, 1, textureX, textureY); // Box 0
		bodyModel[4] = new ModelRendererTurbo(this, 17, 1, textureX, textureY); // Box 0
		bodyModel[5] = new ModelRendererTurbo(this, 65, 9, textureX, textureY); // Box 0
		bodyModel[6] = new ModelRendererTurbo(this, 1, 25, textureX, textureY); // Box 0
		bodyModel[7] = new ModelRendererTurbo(this, 65, 1, textureX, textureY); // Box 0
		bodyModel[8] = new ModelRendererTurbo(this, 73, 1, textureX, textureY); // Box 0
		bodyModel[9] = new ModelRendererTurbo(this, 81, 1, textureX, textureY); // Box 0

		bodyModel[0].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[0].setRotationPoint(6F, 9F, 7F);

		bodyModel[1].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[1].setRotationPoint(6F, 9F, -8F);

		bodyModel[2].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[2].setRotationPoint(-7F, 9F, 7F);

		bodyModel[3].addBox(0F, 0F, 0F, 1, 1, 1, 0F); // Box 0
		bodyModel[3].setRotationPoint(-7F, 9F, -8F);

		bodyModel[4].addBox(0F, 0F, 0F, 14, 1, 16, 0F); // Box 0
		bodyModel[4].setRotationPoint(-7F, 8.2F, -8F);

		bodyModel[5].addBox(0F, 0F, 0F, 9, 7, 16, 0F); // Box 0
		bodyModel[5].setRotationPoint(-2F, 1.2F, -8F);

		bodyModel[6].addBox(0F, 0F, 0F, 14, 3, 16, 0F); // Box 0
		bodyModel[6].setRotationPoint(-7F, -1.8F, -8F);

		bodyModel[7].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		bodyModel[7].setRotationPoint(-5F, 1F, -6F);

		bodyModel[8].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		bodyModel[8].setRotationPoint(-5F, 1F, 0F);

		bodyModel[9].addBox(0F, 0F, 0F, 1, 2, 1, 0F); // Box 0
		bodyModel[9].setRotationPoint(-5F, 1F, 6F);



		translateAll(0F, 0F, 0F);


		flipAll();
	}
}