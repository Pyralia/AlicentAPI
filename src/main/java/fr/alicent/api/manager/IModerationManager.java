package fr.alicent.api.manager;

import fr.alicent.api.player.CorePlayer;
import org.bukkit.entity.Player;

import java.util.List;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IModerationManager {

    /**
     * Allows you to get the list of moderators currently in moderation mode connected to the server.
     * @return the list of moderators.
     */
    List<CorePlayer> getModeratorsList();

    /**
     * Allows you to add a player to the list of moderators.
     * @param player the player to add.
     */
    void addModerator(CorePlayer player);

    /**
     * Allows you to remove a player from the list of moderators.
     * @param player the player to remove.
     */
    void removeModerator(CorePlayer player);

    /**
     * Get the chat consumer to see the comportement of current messages.
     * @return the consumer that manages the chat
     */
    PlayerChatConsumer getPlayerStringBiConsumer();

    /**
     * Allows you to set the chat consumer to change the actual comportement of current messages.
     * @param playerStringBiConsumer the consumer that manages the chat
     */
    void setPlayerStringBiConsumer(PlayerChatConsumer playerStringBiConsumer);

    interface PlayerChatConsumer {

        void accept(Player player, String message, String messageId);

    }

}
