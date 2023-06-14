package officemanager;

public abstract class Machine {

	private boolean online;
	private boolean error;
	protected String machineCode;
	protected Job assignedJob;
	protected String code;

	public Machine() {
		this.online = true;
		this.error = false;
		this.machineCode = null;
		this.assignedJob = null;
	}

	public String getMachineCode() {
		return machineCode;
	}

	public void setMachineCode(String machineCode) {
		this.machineCode = machineCode;
	}

	public void acceptJobs(Job job) {
		if (online && !error)
			;
		this.assignedJob = job;

	}

	public boolean isOnline() {
		return online;
	}

	public void setOnline(boolean online) {
		this.online = online;
	}

	public boolean isError() {
		return error;

	}

	public void setError(boolean error) {
		this.error = error;
	}

	public Job getAssignedJob() {
		return assignedJob;
	}

	public void setAssignedJob(Job assignedJob) {
		this.assignedJob = assignedJob;
	}

	public String getCode() {
		return machineCode;
	}

	public abstract void processJob();
}