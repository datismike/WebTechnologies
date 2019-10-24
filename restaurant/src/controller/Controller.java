package controller;

import controller.command.ICommand;

public class Controller {
    private final CommandProvider provider = new CommandProvider();
    private final char paramDelimeter = ' ';

    public String executeTask(String request) {
        String commandName = request.substring(0, request.indexOf(paramDelimeter));
        ICommand executionCommand = provider.getCommand(commandName);
        String response = executionCommand.execute(request);
        return response;
    }
}