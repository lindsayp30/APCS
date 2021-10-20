public class StatsDriver {
	public static void main(String[] args) {
		Stats test = new Stats();
		System.out.println("mean: " + test.mean(2, 48)); //Should return 25
		System.out.println("mean (double): " + test.mean(2.5, 2.7); //Should return 2.6
		System.out.println("mean (same number): " + test.mean(7, 7); //Should return 7
		System.out.println("mean (double same number): " + test.mean(7.00000, 7.000)); //Should return 7.0

		System.out.println("max: " + test.max(50, 51)); //Should return 51
		System.out.println("max (double): " + test.max(1.6, 1.9)); //Should return 1.9
		System.out.println("max (double): " + test.max(3.7, 2.4)); //Should return 3.7
		System.out.println("max (same number): " + test.max(19, 19); //Should create error
		
		System.out.println("geoMean: " + test.geoMean(4, 9)); //Should return 6
		System.out.println("geoMean (double): " + test.geoMean(2.5, 2.5)); //Should return 2.5
		System.out.println("geoMean (same number): " + test.geoMean(13, 0); //Should return 0
		System.out.println("geoMean (negative number): " + test.geoMean(-4, 8); //Should create error		
		System.out.println("geoMean (negative numbers): " + test.geoMean(-13, -6); //Should create error		
	}
}


