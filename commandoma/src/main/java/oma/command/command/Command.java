package oma.command.command;

import oma.command.command.argument.CommandNode;
import org.bukkit.command.CommandSender;
import org.bukkit.command.defaults.BukkitCommand;

import java.util.Arrays;

public abstract class Command extends BukkitCommand implements CommandNode {

    public CommandNode arg0;

    public Command(String name, String permission, String... aliases) {
        super(name);

        setPermission(permission);

        this.setAliases(Arrays.asList(aliases));

        // register command
        CommandRegistry.register(this);
    }

    @Override
    public boolean execute(CommandSender sender, String alias, String[] args) {
        if (!sender.hasPermission(getPermission())) return false;

        System.out.println("execute...");

        return true;
    }

    @Override
    public CommandNode getChild() {
        return arg0;
    }
}