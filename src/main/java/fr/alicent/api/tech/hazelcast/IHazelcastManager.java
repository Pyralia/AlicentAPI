package fr.alicent.api.tech.hazelcast;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IHazelcastManager {

    /**
     * Définit une valeur associée à une clé primaire et une clé secondaire dans le système de stockage.
     * @param primaryKey   la clé primaire dans laquelle la valeur sera stockée.
     * @param secondaryKey la clé secondaire associée à la clé primaire.
     * @param value        la valeur à stocker.
     */
    void setValue(String primaryKey, String secondaryKey, Object value);

    /**
     * Remplace une valeur existante associée à une clé primaire et une clé secondaire.
     * @param primaryKey   la clé primaire dans laquelle la valeur sera remplacée.
     * @param secondaryKey la clé secondaire associée à la clé primaire.
     * @param value        la nouvelle valeur à enregistrer.
     */
    void replaceValue(String primaryKey, String secondaryKey, Object value);

    /**
     * Supprime une valeur associée à une clé dans le système de stockage.
     * @param key la clé pour laquelle la valeur sera supprimée.
     */
    void deleteValue(String key);

    /**
     * Supprime plusieurs valeurs associées à une clé primaire et à plusieurs clés secondaires.
     * @param primaryKey    la clé primaire dans laquelle les valeurs seront supprimées.
     * @param secondaryKeys les clés secondaires associées aux valeurs à supprimer.
     */
    void deleteValues(String primaryKey, String... secondaryKeys);

    /**
     * Vérifie de manière asynchrone si une valeur existe dans une liste spécifique.
     * @param listname le nom de la liste dans laquelle chercher la valeur.
     * @param value    la valeur à vérifier.
     * @return un CompletableFuture contenant true si la valeur existe, false sinon.
     */
    CompletableFuture<Boolean> existsInList(String listname, String value);

    /**
     * Récupère de manière asynchrone une liste d'objets stockée sous un nom de map spécifique.
     * @param mapname le nom de la map contenant la liste.
     * @return un CompletableFuture contenant la liste d'objets récupérée.
     */
    CompletableFuture<List<Object>> getList(String mapname);

    /**
     * Ajoute une valeur à une liste spécifique.
     * @param listname le nom de la liste dans laquelle ajouter la valeur.
     * @param value    la valeur à ajouter.
     */
    void addInList(String listname, String value);

    /**
     * Supprime une valeur d'une liste spécifique.
     * @param listname le nom de la liste de laquelle supprimer la valeur.
     * @param value    la valeur à supprimer.
     */
    void removeFromList(String listname, String value);

    /**
     * Récupère de manière asynchrone une valeur associée à une clé primaire et une clé secondaire.
     * @param primaryKey   la clé primaire associée à la valeur.
     * @param secondaryKey la clé secondaire associée à la valeur.
     * @return un CompletableFuture contenant la valeur récupérée.
     */
    CompletableFuture<Object> getValue(String primaryKey, String secondaryKey);

}
