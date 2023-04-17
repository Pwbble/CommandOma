package oma.command.command.argument;

public class TypeArgument implements CommandNode {
    
    public CommandNode argX;
    
    @Override
    public CommandNode getChild() {
        return argX;
    }
}
