package oma.command.command.argument;

import org.bukkit.command.CommandSender;

public class ExactArgument implements CommandNode {

    public CommandNode argX;
    
    private String permission;
    private byte requiredLength;

    public ExactArgument(String permission, byte requiredLength) {
        super();
        this.permission = permission;
        this.requiredLength = requiredLength;
    }

    public boolean validatePermission(CommandSender sender) {
        return sender.hasPermission(permission);
    }

    @Override
    public CommandNode getChild() {
        return argX;
    }
}