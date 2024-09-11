package fr.alicent.api.protocol;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface AlicentPacketHandler {

    /**
     * Méthode appelée lorsqu'un ou plusieurs paquets sont reçus.
     * @param strings tableau de chaînes de caractères représentant les données reçues avec le paquet.
     */
    void onReceive(String... strings);

}
