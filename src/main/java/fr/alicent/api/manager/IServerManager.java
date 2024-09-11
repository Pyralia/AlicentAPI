package fr.alicent.api.manager;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IServerManager {

    /**
     * Get informations about the visibility of the ranks on the TABlist.
     * @return a boolean to know it.
     */
    boolean isRanksEnabled();

    /**
     * Allows you to enable or disable the ranks on the TABlist.
     * @param ranksEnabled the boolean to set.
     */
    void setRanksEnabled(boolean ranksEnabled);

    /**
     * Get informations about the chat usage.
     * @return a boolean to know it.
     */
    boolean isChatEnabled();

    /**
     * Allows you to enable or disable the chat.
     * @param chatEnabled the boolean to set.
     */
    void setChatEnabled(boolean chatEnabled);

}
