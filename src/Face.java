import java.util.Arrays;
import java.util.ArrayList;
import java.util.Random;

public enum Face {
    FISH("Fish"), 
    PRAWN("Prawn"), 
    CRAB("Crab"), 
    ROOSTER("Rooster"), 
    GOURD("Gourd"), 
    STAG("Stag");

    
    private static Random random = new Random();
    
    private final String name;

    
    
    private Face(String name) {
        this.name = name;
    }
 
    
    
    public static Face getByIndex(int index) {
        Face[] faces = Face.values();
        Face face = faces[index];
        return face;
    }

    
    
    public static Face getRandom() {
        Face[] faces = Face.values();
        int len = faces.length - 1;
        int rand = random.nextInt(len);
        int index = rand % len;
        Face face = faces[index];
        return face;
    }
    
    
    
    public static Face getWeightedResult(Face selectedFace) {
    	//get a random double the multiply then divide to round to two decimal places
        double rand = random.nextDouble() * 100d/100d;
        // if rand is less than or equal to the probabilty of the selected symbol (1/6)
        // then return the selected face
        if (rand <= 0.166) {
        	return selectedFace;
        }
        //otherwise pick one of the other faces to return
        ArrayList<Face> faces = new ArrayList(Arrays.asList(Face.values()));
        faces.remove(selectedFace);		
        faces.trimToSize();
        int index = random.nextInt(faces.size());
		return faces.get(index);
    }

    
    
    String getName() {
        return name;
    }

    
    
    public String toString() {
        return name;
    }
}
