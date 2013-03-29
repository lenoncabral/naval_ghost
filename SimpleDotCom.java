public class SimpleDotCom {

	int[] locationCells;
	int numOfHits = 0;
	
	public void setLocationCells(int[] locs) {
		locationCells = locs;
		
	}
	
	public String checkYourself (String stringGuess){
	int guess = Integer.parseInt (stringGuess);
	String result = "Errou!";
	for (int cell : locationCells) {
		if (guess == cell) {
			result = "Belo Tiro!";
			numOfHits++;
			break;
		}
	}
	
	if (numOfHits ==
	locationCells.length) {
		result = "Tango Down, He's Dead";
	}
	System.out.println(result);
	return result;
}
}