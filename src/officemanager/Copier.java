package officemanager;

public class Copier extends Machine {

	private int copies;

	public Copier() {
		super();
		this.machineCode = "CPY";
	}

	public int getCopies() {
		return copies;
	}

	public void setCopies(int copies) {
		this.copies = copies;
	}

	@Override
	public void processJob() {
		for (int i = 0; i < copies; i++) {
			System.out.println("Printed:" + i + "of" + copies + "copies");
			this.assignedJob = null;
		}

	}

}
