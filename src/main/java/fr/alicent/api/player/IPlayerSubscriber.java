package fr.alicent.api.player;

import java.util.UUID;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IPlayerSubscriber {


    /**
     * Récupère le suffixe associé à l'abonné.
     * @return le suffixe sous forme de chaîne de caractères.
     */
    String getSuffix();

    /**
     * Récupère le préfixe associé à l'abonné.
     * @return le préfixe sous forme de chaîne de caractères.
     */
    String getPrefix();

    /**
     * Récupère la date de fin du rang.
     * @return la date en format long.
     */
    long getFinishSubscriber();

    /**
     * Récupère le nombre de mois où le joueur a l'offre.
     * @return le numéro du mois actuel.
     */
    int getCurrentStage();

    /**
     * Récupère l'identifiant unique (UUID) du joueur.
     * @return l'UUID de l'abonné.
     */
    UUID getUuid();

    /**
     * Vérifie si l'offre subscriber est activée.
     * @return true si l'offre est active, false sinon.
     */
    boolean isEnable();

    /**
     * Déclenche l'achat de l'offre subscriber pour un mois.
     */
    void buySubscriber();

    /**
     * Définit le suffixe associé au joueur.
     * @param string le nouveau suffixe sous forme de chaîne de caractères.
     */
    void setSuffix(String string);

    /**
     * Définit le préfixe associé au joueur.
     * @param string le nouveau préfixe sous forme de chaîne de caractères.
     */
    void setPrefix(String string);

}
