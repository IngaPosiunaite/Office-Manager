package officemanager;

public class Printer extends Machine {

	public Printer() {
		super();
		this.machineCode = "PRT";

	}

	@Override 
	public void processJob() {
		Job j = this.assignedJob;
		if (j != null) {
			String description = j.getDescription();
			System.out.println(description);
			this.assignedJob = null;
		}
	}
}
