package oma.command.command.argument;

/** Children of this interface are considered "Command Nodes," or arguments (Or a root node in the case of Command). */
public interface CommandNode {

    CommandNode getChild();
}