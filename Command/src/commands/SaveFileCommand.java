package commands;

public class SaveFileCommand implements Command {

	@Override
	public void execute() {
		System.out.println("Arquivo salvo");
	}
	
}
