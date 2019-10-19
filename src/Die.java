public class Die {
			
	private Face face;
	
	
	public Die() {
		face =  Face.getRandom();
	}

	
	
	public Face getFace() {
		return face;
	}

	
	
	public Face roll() {
		return Face.getRandom();
	}		
	
	
	
	public Face weightedRoll(Face pick) {
		return Face.getWeightedResult(pick);
	}	

	
	
	public String toString() {
		return face.toString();
	}
}
