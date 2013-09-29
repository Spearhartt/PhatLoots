package com.codisimus.plugins.phatloots.commands;

import com.codisimus.plugins.phatloots.PhatLoot;
import com.codisimus.plugins.phatloots.commands.CommandHandler.CodCommand;
import org.bukkit.entity.Player;

/**
 * Executes Player Commands
 *
 * @author Codisimus
 */
public class VariableLootCommand {
    @CodCommand(
        command = "&variable",
        usage = {
            "§2<command> <Name>§b Loot a virtual Chest for the given PhatLoot"
        },
        permission = "phatloots.commandloot"
    )
    public boolean loot(Player player, PhatLoot phatLoot) {
        phatLoot.rollForLoot(player);
        return true;
    }
}