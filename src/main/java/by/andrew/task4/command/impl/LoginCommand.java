package by.andrew.task4.command.impl;

import by.andrew.task4.command.Command;
import by.andrew.task4.service.UserService;
import by.andrew.task4.service.impl.UserServiceImpl;
import jakarta.servlet.http.HttpServletRequest;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class LoginCommand implements Command {
	private static final Logger LOGGER = LogManager.getLogger();

	@Override
	public String execute(HttpServletRequest request) {
		String login = request.getParameter("login");
		String password = request.getParameter("pass");
		UserService userService = UserServiceImpl.getInstance();
		String page;
		if (userService.authenticate(login, password)) {
			request.setAttribute("user", login);
			page = "pages/main.jsp";
		} else {
			request.setAttribute("login_msg", "Incorrect login or password");
			page = "index.jsp";
		}

		return page;
	}
}
