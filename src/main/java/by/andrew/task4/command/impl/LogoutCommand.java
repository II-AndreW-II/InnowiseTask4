package by.andrew.task4.command.impl;

import by.andrew.task4.command.Command;
import jakarta.servlet.http.HttpServletRequest;

public class LogoutCommand implements Command {
	@Override
	public String execute(HttpServletRequest request) {
		return null;
	}
}
