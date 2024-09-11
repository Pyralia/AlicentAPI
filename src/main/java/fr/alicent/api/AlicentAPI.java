package fr.alicent.api;

import fr.alicent.api.manager.IModerationManager;
import fr.alicent.api.manager.IPlayerManager;
import fr.alicent.api.manager.IServerManager;
import fr.alicent.api.protocol.IProtocolManager;
import fr.alicent.api.tech.hazelcast.IHazelcastManager;
import fr.alicent.api.tech.mongo.IMongoManager;
import fr.alicent.api.tech.redis.IRedisManager;
import org.bukkit.plugin.java.JavaPlugin;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public abstract class AlicentAPI {

    /**
     * L'instance unique de l'AlicentAPI.
     */
    private static AlicentAPI instance;

    /**
     * Récupère l'instance actuelle de l'API.
     * @return l'instance actuelle de l'API.
     */
    public static AlicentAPI getApi() {
        return instance;
    }

    /**
     * Initialise l'instance de l'API avec une implémentation spécifique.
     * Normalement vous ne devrez jamais appeler cette méthode.
     * @param instance l'instance concrète d'AlicentAPI à utiliser.
     * @throws IllegalStateException si l'API est déjà initialisée.
     */
    public static void initializeCore(AlicentAPI instance) {
        if (AlicentAPI.instance != null)
            throw new IllegalStateException("AlicentAPI is already initialized");

        AlicentAPI.instance = instance;
    }

    /**
     * Méthode appelée lors du chargement de l'API. Sert à initialiser le core.
     */
    public abstract void onLoad();

    /**
     * Méthode appelée lors de l'activation de l'API. Sert à initialiser le core.
     */
    public abstract void onEnable();

    /**
     * Méthode appelée lors de la désactivation de l'API. Sert à initialiser le core.
     */
    public abstract void onDisable();

    /**
     * Récupère l'instance de {@link JavaPlugin} associée à l'API.
     * @return l'instance de JavaPlugin.
     */
    public abstract JavaPlugin getJavaPlugin();

    /**
     * Récupère l'instance de {@link IPlayerManager} pour gérer les joueurs.
     * @return l'instance de IPlayerManager.
     */
    public abstract IPlayerManager getPlayerManager();

    /**
     * Récupère l'instance de {@link IProtocolManager} pour gérer les protocoles de communication.
     * @return l'instance de IProtocolManager.
     */
    public abstract IProtocolManager getProtocolManager();

    /**
     * Récupère l'instance de {@link IHazelcastManager} pour la gestion des opérations Hazelcast.
     * @return l'instance de IHazelcastManager.
     */
    public abstract IHazelcastManager getHazelcastManager();

    /**
     * Récupère l'instance de {@link IMongoManager} pour la gestion des opérations MongoDB.
     * @return l'instance de IMongoManager.
     */
    public abstract IMongoManager getMongoManager();

    /**
     * Récupère l'instance de {@link IRedisManager} pour la gestion des opérations Redis.
     * @return l'instance de IRedisManager.
     */
    public abstract IRedisManager getRedisManager();

    /**
     * Récupère l'instance de {@link IServerManager} pour la gestion des serveurs.
     * @return l'instance de IServerManager.
     */
    public abstract IServerManager getServerManager();

    /**
     * Récupère l'instance de {@link IModerationManager} pour gérer les actions de modération.
     * @return l'instance de IModerationManager.
     */
    public abstract IModerationManager getModerationManager();
}

