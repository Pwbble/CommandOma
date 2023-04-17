package oma.command.example.commands;

import oma.command.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

/**
 * /guild info
 * /guild disband
 * /guild invites
 * /guild settings
 * /guild mute (duration)
 * /guild invite [target] - invites [target] to the guild
 * /guild create [name]
 * /guild promote [target]
 * /guild transfer [target]
 * /guild join [guild]
 * /guild kick [target] (reason)
 */
public class GuildCMD extends Command {

    public GuildCMD() {
        // init
        super("guild", "Oma.Command.Guild", "clan", "faction", "f", "g");
    }

    // todo: link methods with command nodes

    public void guild(CommandSender sender) {
        System.out.println("/guild was called");
    }

    public void info(CommandSender sender) {
        System.out.println("/guild info was called");
    }

    public void disband(CommandSender sender) {
        System.out.println("/guild disband was called");
    }

    public void invites(CommandSender sender) {
        System.out.println("/guild invites was called");
    }

    public void settings(CommandSender sender) {
        System.out.println("/guild settings was called");
    }

    public void mute(CommandSender sender, String duration) {
        System.out.println("/guild mute (duration) was called");
    }

    public void create(CommandSender sender, String name) {
        System.out.println("/guild create <name> was called");
    }

    public void invite(CommandSender sender, Player player) {
        System.out.println("/guild invite <player> was called");
    }

    public void promote(CommandSender sender, Player player) {
        System.out.println("/guild promote <player> was called");
    }

    public void transfer(CommandSender sender, Player player) {
        System.out.println("/guild transfer <player> was called");
    }

    public void join(CommandSender sender, String name) {
        System.out.println("/guild join <name> was called");
    }

    public void kick(CommandSender sender, Player player, String reason) {
        System.out.println("/guild kick <player> (reason) was called");
    }
}