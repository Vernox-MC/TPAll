package VernoxMC.TPAll;

import java.util.*;

import cn.nukkit.Player;
import cn.nukkit.command.Command;
import cn.nukkit.command.CommandSender;
import cn.nukkit.plugin.PluginBase;
import cn.nukkit.utils.TextFormat;
    public class Main extends PluginBase {


        public void onEnable() {

            this.getLogger().info(TextFormat.GREEN + "TPAll Enabled");

        }

        public void onDisable() {

            this.getLogger().info(TextFormat.RED + "TPAll Disabled!");

        }


        public boolean onCommand(CommandSender sender, Command cmd, String label, String[] args) {
            {
                switch (cmd.getName()) {

                    case "tpall":
                        if(!sender.hasPermission("tpall.comamnd")){
                            sender.sendMessage(TextFormat.RED + "You do not have permission too use this command");
                            break;
                        }

                        if(!sender.isPlayer()){
                            sender.sendMessage(TextFormat.RED + "This command can only be run ingame!");
                            break;
                        }
                        for(Player p : this.getServer().getOnlinePlayers().values()){
                            p.teleport((Player) sender);
                        }
                        sender.sendMessage(TextFormat.GREEN + "[TPALL] You teleported everyone online to yourself!");
                        break;
                }

                return true;

            }
        }
    }

