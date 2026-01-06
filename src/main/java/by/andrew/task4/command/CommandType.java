package by.andrew.task4.command;

import by.andrew.task4.command.impl.AddUserCommand;
import by.andrew.task4.command.impl.DefaultCommand;
import by.andrew.task4.command.impl.LoginCommand;
import by.andrew.task4.command.impl.LogoutCommand;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public enum CommandType {
	ADD_USER(new AddUserCommand()),
	LOGIN(new LoginCommand()),
	LOGOUT(new LogoutCommand()),
	DEFAULT(new DefaultCommand());

	private static final Logger LOGGER = LogManager.getLogger();
	Command command;

	CommandType(Command command) {
		this.command = command;
	}

	public static Command define(String commandStr){
		CommandType current = CommandType.valueOf(commandStr.toUpperCase());
		return current.command;
	}
}
