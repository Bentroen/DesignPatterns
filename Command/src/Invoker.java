import java.util.HashMap;
import java.util.Map;

import commands.Command;
import commands.OpenFileCommand;
import commands.SaveFileCommand;

public class Invoker {
	
	public static Map<String, Command> commands = new HashMap<String, Command>();
	
	static {
		commands.put("OpenFile", new OpenFileCommand());
		commands.put("SaveFile", new SaveFileCommand());
	}
	
	public static void invoke(String command) {
		commands.get(command).execute();
	}
	
}
