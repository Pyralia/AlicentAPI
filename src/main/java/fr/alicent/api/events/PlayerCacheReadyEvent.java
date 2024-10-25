package fr.alicent.api.events;

import fr.alicent.api.player.CorePlayer;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.event.Event;
import org.bukkit.event.HandlerList;

public class PlayerCacheReadyEvent extends Event {

    private static final HandlerList HANDLERS = new HandlerList();
    private final CorePlayer corePlayer;
    private final Player player;

    public PlayerCacheReadyEvent(CorePlayer corePlayer) {
        this.corePlayer = corePlayer;
        this.player = Bukkit.getPlayer(corePlayer.getUuid());
    }

    /**
     * Permet de récupérer le joueur qui vient d'être caché.
     * @return l'objet Player du joueur caché.
     */
    public Player getPlayer() {
        return this.player;
    }

    /**
     * Permet de récupérer le joueur qui vient d'être caché.
     * @return l'objet CorePlayer du joueur caché.
     */
    public CorePlayer getCorePlayer() {
        return this.corePlayer;
    }

    @Override
    public HandlerList getHandlers() {
        return HANDLERS;
    }

    public static HandlerList getHandlerList() {
        return HANDLERS;
    }
}
