package officemanager;

import java.util.ArrayList;

public class Manager {

	private String currentMachine;
	private ArrayList<Job> availabilityJ;
	private ArrayList<Machine> machines;

	public Manager() {
		currentMachine = null;
		availabilityJ = new ArrayList<Job>();
		machines = new ArrayList<Machine>();
		createJobs();
		createMachines();
	}

	public void createMachines() {
		machines.add(new CoffeeMachine());
		machines.add(new Scanner());
		machines.add(new VendingMachine());
		machines.add(new Printer());
		machines.add(new Copier());

	}

	public void createJobs() {
		availabilityJ.add(new Job("PRT", "Anna", "Print Page"));
		availabilityJ.add(new Job("CFE", "Ted", "Make Coffe"));
		availabilityJ.add(new Job("VND", "Jon", "Get Chololate"));
		availabilityJ.add(new Job("SCN", "Maya", "Scann Paper"));
		availabilityJ.add(new Job("CPY", "Tom", "Copy Page"));

	}

	public String getCurrentMachine() {
		return currentMachine;
	}

	public void setCurrentMachine(String currentMachine) {
		this.currentMachine = currentMachine;
	}

	public void assignJob() {
		for (Job j : availabilityJ) {
			Machine m = getMachineFromJob(j);
			if (m != null) {
				m.acceptJobs(j);
			} else {
				System.out.println("Your Job Request Could not be Found");
				availabilityJ.remove(j);
			}
		}
	}

	private Machine getMachineFromJob(Job j) {
		String code = j.getJobCode();
		for (Machine m : machines) {
			if (m.getCode().equals(code))
				return m;
		}
		return null;

	}

	public void processJob() {
		for (Machine m : machines) {
			m.processJob();
			if (m instanceof Scanner) {
				Job j = ((Scanner) m).retrieveJob();
				Machine printer = getMachineFromJob(j);
				printer.acceptJobs(j);
				printer.processJob();

			}
		}
		availabilityJ.removeAll(availabilityJ);
	}

}
