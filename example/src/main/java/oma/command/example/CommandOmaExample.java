package oma.command.example;

import oma.command.example.commands.GuildCMD;
import org.bukkit.plugin.java.JavaPlugin;

public class CommandOmaExample extends JavaPlugin {

    @Override
    public void onEnable() {
        initCommands();
    }

    private void initCommands() {
        GuildCMD guildCMD = new GuildCMD();
    }
}