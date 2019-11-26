
public class Company {
	//Attributes
	private String name;
	private double budget;
	
	//Constructor
	public Company() {
		this.name="";
		this.budget= 10000000.5;
	}

	//Overloaded constructor
	public Company(String name, double budget) {
		this.name = name;
		this.budget = budget;
	}
	
	public Company(String name) {
		this.name = name;
		this.budget = 1000;
	}

	//Setters and Getter
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}
	
	public boolean equals(Object other) {
		if(this == other)
			return true;
		if(other instanceof Company)
		{
			Company otherCompany =(Company)other;
			if(this.name == otherCompany.name) {
				if(this.budget == otherCompany.budget)
					return true;
			}
		}
		return false;
	}

	@Override
	public String toString() {
		return "Company name=" + getName() + ", budget=" + getBudget() + "";
	}
	

}
