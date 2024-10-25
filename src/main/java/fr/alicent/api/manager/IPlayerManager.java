package fr.alicent.api.manager;

import fr.alicent.api.player.CorePlayer;
import fr.alicent.api.player.IRank;
import org.bukkit.entity.Player;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IPlayerManager {

    /**
     * Allows to initialize a player.
     * @param player the player to initialize.
     * @return the CorePlayer object linked to the player.
     */
    CorePlayer initPlayer(Player player);

    /**
     * Allows to initialize a player.
     * @param uuid the player's uuid to initialize.
     * @return the CorePlayer object linked to the player.
     */
    CorePlayer initPlayer(UUID uuid);

    /**
     * Get the CorePlayer object linked to the player.
     * @param player the player to get.
     * @return the CorePlayer object.
     */
    CorePlayer getPlayer(Player player);

    /**
     * Get the CorePlayer object linked to the player.
     * @param uuid the uuid to get.
     * @return the CorePlayer object.
     */
    CorePlayer getPlayer(UUID uuid);

    /**
     * Remove a CorePlayer object from the server's cache.
     * @param player the player to remove.
     * @return the CorePlayer object that just got removed.
     */
    CorePlayer deletePlayer(Player player);

    /**
     * Remove a CorePlayer object from the server's cache.
     * @param uuid the uuid to remove.
     * @return the CorePlayer object that just got removed.
     */
    CorePlayer deletePlayer(UUID uuid);

    /**
     * Get informations from a specific rank
     * @param name the raw name linked to the rank.
     * @return the Rank object.
     */
    IRank getRank(String name);

    /**
     * Get all ranks currently registered on the server's memory
     * @return a list of Rank object.
     */
    List<IRank> getRanks();

    Map<CorePlayer, String> getPlayerToNickMap();
    Map<String, CorePlayer> getNickToPlayerMap();


    Player getBukkitPlayer(String name);

    Player getBukkitPlayer(UUID uuid);

}
