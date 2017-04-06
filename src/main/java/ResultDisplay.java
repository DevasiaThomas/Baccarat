
public class ResultDisplay {
	public void displayResults(float[] a) {
		System.out.format("banker wins: %.1f%%\nplayer wins: %.1f%%\ntie        : %.1f%%", a[0], a[1], a[2]);
	}

}
