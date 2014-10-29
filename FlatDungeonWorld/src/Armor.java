
public class Armor extends Wearable {

	Quality quality;
	Material material;
	String type;
	String element;
	int armorRating;
	
	public Armor(Quality qual, Material mat, String typ, String elmt, boolean known) {
		super(known);
		quality = qual;
		material = mat;
		type = typ;
		element = elmt;
		weight = material.getWeight();
		armorRating = (int)(material.getHardness() * quality.getValue());
		MAXDUR = (int)(material.getDurability() * quality.getValue());
		repair();
	}
	
	public String getName(){
		if(!identified){
			return "Mysterious " + type;
		}
		return quality.getName()+ " " + material.getName()+ " " + type;
	}

}
