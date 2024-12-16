import java.awt.Color;

/**
 * This program performs another striking visual effect: it morphs an image into its grescaled version. 
 * The program recieves two command-line arguments: a string representing the name
 * of the PPM file of an image, the number of morphing steps (an int). 
 * For example:
 * java Editor4 thor.ppm 50
 * This action transforms the colored Thor image into a black and white Thor image.
 */
public class Editor4 {

	public static void main (String[] args) {
		String filename = args[0];
		int n = Integer.parseInt(args[1]);
		Color[][] sourceImage = Runigram.read(filename);
        Color [][] targetImage = Runigram.grayScaled(sourceImage);
		Runigram.setCanvas(sourceImage);
		Runigram.morph(sourceImage, targetImage, n);
	}
}

