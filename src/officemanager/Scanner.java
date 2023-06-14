package officemanager;

public class Scanner extends Machine {

	public Scanner() {
		super();
		this.machineCode = "SCN";
	}

    @Override
	public void processJob() {
		Job j = this.getAssignedJob();
		if (j != null) {
			j.setOwner(this.getCode());
			j.setJobCode("PRT");
		}

	}

	public Job retrieveJob() {
		Job j = this.assignedJob;
		this.assignedJob = null;
		return j;

	}

}
