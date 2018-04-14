package Objects;

public class Algorithm {
	private double populationW;
	private double compactnessW;
	private double racialW;
	private double partisanW;
	
	public void setPopulationW(double weight) {
		this.populationW = weight;
	}
	
	public void setcompactnessW(double weight) {
		this.compactnessW = weight;
	}
	
	public void setracialW(double weight) {
		this.racialW = weight;
	}
	
	public void setpartisanW(double weight) {
		this.partisanW = weight;
	}
	
	public double calculateCDGoodness(CongressionalDistrict CD) {
		double goodness = 0.0;
		State state = CD.state;
		int avgPopulation = state.getTotalPopulation()/state.getCongressionalDistrict().size();
		int CDPopulation = CD.getTotalPopulation();
		int populationScore = 1 - Math.abs(avgPopulation - CDPopulation)/avgPopulation;
		
		return 0.0;
	}
}