package fr.alicent.api.protocol;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AlicentPacket {

    /**
     * Définit le nom du paquet.
     * @return le nom du paquet sous forme de chaîne de caractères.
     */
    String packetName();


    /**
     * Définit l'identifiant unique du paquet.
     * @return l'identifiant du paquet sous forme d'entier.
     */
    int packetId();

    /**
     * Définit le type de canal par lequel le paquet est transmis.
     * @return le type de canal sous forme de chaîne de caractères.
     */
    String channelType();

}
