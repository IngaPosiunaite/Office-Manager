package officemanager;

public class VendingMachine extends Machine {

	public VendingMachine() {
		super();
		this.machineCode = "VND";
	}

	@Override
	public void processJob() {
		Machine VendingMachine = new VendingMachine();
		Job j = this.assignedJob;
		String owner = j.getOwner();
		VendingMachine.acceptJobs(j);
		if (owner.substring(0) != "1")
			;
		System.out.println("10p has been taken out of your account");

		System.out.println("Your Chocolate is Free!");

	}
}