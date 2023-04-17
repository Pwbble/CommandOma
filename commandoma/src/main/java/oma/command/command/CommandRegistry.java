package oma.command.command;

import org.bukkit.Bukkit;
import org.bukkit.command.CommandMap;

import java.lang.reflect.Field;

public class CommandRegistry {

    // map of inited commands, used to register new commands.
    private static CommandMap commandMap;

    static {
        try {
            // init commandMap
            final Field bukkitCommandMap = Bukkit.getServer().getClass().getDeclaredField("commandMap");

            bukkitCommandMap.setAccessible(true);
            commandMap = (CommandMap) bukkitCommandMap.get(Bukkit.getServer());
        } catch (NoSuchFieldException | IllegalAccessException e) {
            e.printStackTrace();
            // possibly throw error, because without commandMap you literally can't do anything
        }
    }

    public static void register(/* oma.command.Command */ Command command) {
        // registers the command
        commandMap.register("seen", command); // passed as a BukkitCommand because Command is subclass
    }
}