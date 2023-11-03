<h3> Office Manager

<h5>The task at hand was to model a network of typical office equipment, including:

<h5> •Printer
<h5> •Scanner
<h5> •Coffee machine
<h5> •Copier
<h5> •Vending machine
 
<h5> A simple monitoring and management tool was created to notify users of the status (online, offline, or in an error state) of each connected piece of equipment. All machines have unique alphanumeric codes.

<h5> A Class UML Diagram was created, and each machine processes a job differently:

<h5> The Printer displays the job description in the console and then sets the job field to null.
<h5> The Scanner modifies the job to prepare it for printing. The scanner swaps the job's owner with their machine code, replaces the first three letters in the job code with "PRT," and does not set the job to null afterward. However, there is a method to allow clearing the job explicitly.
<h5> The Coffee and Vending machines check the job's owner. If it starts with "1," the owner is senior management and receives coffee or food for free. Otherwise, a message is displayed in the console, notifying the owner that a standard amount has been deducted from their account as payment for the job. The job is set to null afterward.
<h5> The Copier accepts jobs with extra data indicating the number of copies to be made. The copier prefixes each copy it produces with the copy count and the total number requested in that job. Finally, the copier sets the job field to null.
<h5> The manager is not a piece of office equipment. It is a fully digital system that monitors all machines in the office and has the main task of supervising the job assignment process. The manager stores a list of all the jobs currently active (those not yet processed) and a record of all available machines.

<h5> The manager performs the following tasks:

<h5> Assigns jobs: Every job in the list is assigned to the first machine found capable of performing the job (the first three letters of the code match those of the job). If no compatible machine is found, the appropriate message is displayed in the console.
<h5> Processes jobs: Every machine in the system is asked to process the job previously assigned to it. If the machine is a scanner, the manager explicitly retrieves the job processed by the scanner and assigns it to the first available printer. At the end of the process, all jobs are deleted from the manager's memory, even those that were not assigned to machines.
 
 
# ![OfficeManager](https://github.com/IngaPosiunaite/TheatreBookingSystem/assets/119749457/4c102c4e-0eee-45b9-a920-e46e17a54294)


 
 
 
