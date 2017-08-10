package by.antiquo.safetosell.controller;

import by.antiquo.safetosell.command.Command;
import by.antiquo.safetosell.command.client.CommandHelper;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class Controller extends HttpServlet {
    private static final long serialVersionUID = 1L;

    private static final String COMMAND = "command";

    public Controller() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        doPost(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String commandName = request.getParameter(COMMAND);
        Command command = CommandHelper.getInstance().getCommand(commandName);
        command.execute(request, response);
    }
}

