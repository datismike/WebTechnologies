package controller;

import controller.command.ICommand;
import controller.command.impl.AddBaseObject;
import controller.command.impl.RemoveBaseObject;
import javafx.scene.web.HTMLEditorSkin;

import java.util.HashMap;
import java.util.Map;

final class CommandProvider {
    private final Map<CommandName, ICommand> repository = new HashMap<>();

    CommandProvider() {
        repository.put(CommandName.ADD_BASE_OBJECT, new AddBaseObject());
        repository.put(CommandName.REMOVE_BASE_OBJECT, new RemoveBaseObject());
    }

    ICommand getCommand(String name) {
        CommandName commandName = null;
        ICommand command = null;
        try {
            commandName = CommandName.valueOf(name.toUpperCase());
            command = repository.get(commandName);
        } catch (IllegalArgumentException | NullPointerException e) {
            command = repository.get(CommandName.WRONG_REQUEST);
        }
        return command;
    }
}

enum CommandName {
    ADD_BASE_OBJECT,
    REMOVE_BASE_OBJECT,
    WRONG_REQUEST
}