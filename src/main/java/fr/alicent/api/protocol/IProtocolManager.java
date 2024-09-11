package fr.alicent.api.protocol;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IProtocolManager {

    /**
     * Enregistre un paquet à partir d'une classe spécifique dans le gestionnaire de protocole.
     * @param clazz la classe du paquet à enregistrer.
     */
    void registerPacket(Class<?> clazz);

    /**
     * Envoie un paquet vers un canal donné en utilisant la classe du paquet et des chaînes de données.
     * @param channel le canal vers lequel le paquet doit être envoyé.
     * @param clazz la classe du paquet à envoyer.
     * @param strings les données du paquet sous forme de tableau de chaînes de caractères.
     */
    void sendPacket(String channel, Class<?> clazz, String... strings);

    /**
     * Envoie un paquet vers un canal donné en utilisant le nom du paquet et des chaînes de données.
     * @param channel le canal vers lequel le paquet doit être envoyé.
     * @param packetName le nom du paquet à envoyer.
     * @param strings les données du paquet sous forme de tableau de chaînes de caractères.
     */
    void sendPacket(String channel, String packetName, String... strings);

}
