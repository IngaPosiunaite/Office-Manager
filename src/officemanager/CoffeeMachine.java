package officemanager;

public class CoffeeMachine extends Machine {

	public CoffeeMachine() {
		super();
		this.machineCode = "CFE";
	}

	@Override
	public void processJob() {
		Machine CoffeMachine = new CoffeeMachine();
		Job j = this.assignedJob;
		String owner = j.getOwner();
		CoffeMachine.acceptJobs(j);

		if (owner.substring(0) != "1")
			;
		System.out.println("10p has been taken out of your account");

		if (owner == "1")
			;

		System.out.println("Your Drink is Free!");

	}
	
}