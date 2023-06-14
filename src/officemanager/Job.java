package officemanager;

public class Job {
	
	private String jobCode;
	private String owner;
	private String description;

	public Job(String jobCode, String owner, String description) {
		this.jobCode = jobCode;
		this.owner = owner;
		this.description = description;
	}

	public String getJobCode() {
		return jobCode;
	}

	public void setJobCode(String jobCode) {
		this.jobCode = jobCode;
	}

	public String getOwner() {
		return owner;
	}

	public void setOwner(String owner) {
		this.owner = owner;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}
