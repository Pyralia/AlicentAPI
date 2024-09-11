package fr.alicent.api.player;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IRank {


    /**
     * Vérifie si l'utilisateur est un membre du lead.
     * @return true si l'utilisateur est un Head Staff, false sinon.
     */
    boolean isHeadStaff();

    /**
     * Vérifie si l'utilisateur est un modérateur.
     * @return true si l'utilisateur est un modérateur, false sinon.
     */
    boolean isModerator();

    /**
     * Vérifie si l'utilisateur fait partie du staff.
     * @return true si l'utilisateur est un membre du staff, false sinon.
     */
    boolean isStaff();

    /**
     * Récupère le nom du rang.
     * @return le nom du rang sous forme de chaîne de caractères.
     */
    String getName();

    /**
     * Récupère le niveau de pouvoir ou d'autorité liée au rang.
     * @return le niveau de pouvoir sous forme d'entier.
     */
    int getPower();

    /**
     * Récupère le préfixe associé au rang.
     * @return le préfixe sous forme de chaîne de caractères.
     */
    String getPrefix();

    /**
     * Récupère la priorité associée au rang.
     * @return la priorité sous forme de chaîne de caractères.
     */
    String getPriority();

}
