package fr.alicent.api.player;

import java.util.List;
import java.util.UUID;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface CorePlayer {

    /**
     * Get the UUID of the player.
     * @return the current UUID.
     */
    UUID getUuid();

    /**
     * Get rank of the player.
     * @return the current rank object.
     */
    IRank getRank();

    /**
     * Get the discord ID.
     * @return the current name.
     * @nullable if the player has no discord ID.
     */
    String getDiscordId();

    /**
     * Allows you to SET a discord id for the player.
     * @param discordId the newest discord id.
     */
    void setDiscordId(String discordId);

    /**
     * Allows you to SET a new rank
     * @param rankName the newest rank's raw id.
     */
    void setRank(String rankName);

    /**
     * Get the player's first connexion date. Already formatted.
     * @return a string formatted dd/mm/YY HH:mm:ss.
     */
    String getFirstConnexion();

    /**
     * Get the player's latest connexion date. Already formatted.
     * @return a string formatted dd/mm/YY HH:mm:ss.
     */
    String getLastConnexion();

    /**
     * Return the player's IP list.
     * @return list of ips.
     */
    List<String> getIpList();

    /**
     * Get the player's inventorys data. It is used to keep track of many informations (friends for example).
     * @return list of datas
     */
    List<String> getInventory();

    /**
     * Get the player's playtime.
     * @return the playtime in seconds.
     */
    int getPlaytime();

    /**
     * Get the player's cristaux count.
     * @return the cristaux numbers
     */
    int getCristaux();

    /**
     * Get the player's connected since.
     * @return the connected since in seconds.
     */
    int getConnectedSince();

    /**
     * Get the player's credits count.
     * @return the credits numbers
     */
    int getCredits();

    /**
     * Allows you to remove a data from player's inventory.
     * @param item the item to remove.
     */
    void removeInventory(String item);

    /**
     * Allows you to add a data to player's inventory.
     * @param item the item to add.
     */
    void addInventory(String item);

    /**
     * Allows you to change player's cristaux count
     * @param cristaux the newest amount.
     */
    void setCristaux(int cristaux);

    /**
     * Allows you to change player's credits count
     * @param cristaux the newest amount.
     */
    void setCredits(int cristaux);

    /**
     * Get the informations relatives to the subscriber offers about the player
     * @return subscriber object.
     */
    IPlayerSubscriber getSubscriber();

}
