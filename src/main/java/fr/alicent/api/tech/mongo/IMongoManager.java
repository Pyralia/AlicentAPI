package fr.alicent.api.tech.mongo;

import com.mongodb.DBCursor;
import com.mongodb.DBObject;

import java.util.List;
import java.util.concurrent.CompletableFuture;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
import java.util.List;
import java.util.concurrent.CompletableFuture;
import com.mongodb.DBObject;
import com.mongodb.DBCursor;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IMongoManager {

    /**
     * Enregistre un objet dans MongoDB en fonction de la classe spécifiée.
     * @param clazz la classe de l'objet à enregistrer.
     */
    void registerObject(Class<?> clazz);

    /**
     * Modifie un champ spécifique dans un document de la collection MongoDB.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param mainValue la valeur principale du document à modifier.
     * @param string    le champ à mettre à jour.
     * @param toSet     la nouvelle valeur à définir pour le champ.
     */
    void setFromCollection(Class<?> clazz, Object mainValue, String string, Object toSet);

    /**
     * Récupère tous les documents d'une collection MongoDB sous forme de liste asynchrone.
     * @param clazz la classe associée à la collection MongoDB.
     * @return un CompletableFuture contenant une liste d'objets DBObject représentant tous les documents.
     */
    CompletableFuture<List<DBObject>> getAllFromCollection(Class<?> clazz);

    /**
     * Récupère tous les documents d'une collection MongoDB sous forme de curseur asynchrone.
     * @param clazz la classe associée à la collection MongoDB.
     * @return un CompletableFuture contenant un curseur (DBCursor) pour parcourir les documents.
     */
    CompletableFuture<DBCursor> getAllFromCollectionToCursor(Class<?> clazz);

    /**
     * Récupère tous les documents d'une collection MongoDB correspondant à une condition spécifique.
     * @param clazz la classe associée à la collection MongoDB.
     * @param key   la clé sur laquelle la condition porte.
     * @param value la valeur attendue pour la clé.
     * @return un CompletableFuture contenant une liste d'objets DBObject correspondant à la condition.
     */
    CompletableFuture<List<DBObject>> getAllFromCollectionWhere(Class<?> clazz, Object key, Object value);

    /**
     * Modifie un champ spécifique dans un document de la collection MongoDB en utilisant une clé principale.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param mainKey   la clé principale du document à modifier.
     * @param mainValue la valeur associée à la clé principale.
     * @param string    le champ à mettre à jour.
     * @param toSet     la nouvelle valeur à définir pour le champ.
     */
    void setFromCollection(Class<?> clazz, String mainKey, Object mainValue, String string, Object toSet);

    /**
     * Crée un nouveau profil dans une collection MongoDB à l'aide d'un créateur de profil.
     * @param clazz               la classe associée à la collection MongoDB.
     * @param mongoProfileCreator l'objet responsable de la création du profil.
     */
    void createProfile(Class<?> clazz, MongoProfileCreator mongoProfileCreator);

    /**
     * Supprime un document d'une collection MongoDB en fonction de sa valeur principale.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param mainValue la valeur principale du document à supprimer.
     */
    void deleteFromCollection(Class<?> clazz, Object mainValue);

    /**
     * Récupère de manière asynchrone un champ spécifique dans un document MongoDB.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param mainValue la valeur principale du document.
     * @param string    le champ à récupérer.
     * @return un CompletableFuture contenant la valeur du champ récupéré.
     */
    CompletableFuture<Object> getFromCollection(Class<?> clazz, Object mainValue, String string);

    /**
     * Récupère de manière asynchrone un champ spécifique dans un document MongoDB en fonction d'une clé principale.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param mainKey   la clé principale du document.
     * @param mainValue la valeur associée à la clé principale.
     * @param string    le champ à récupérer.
     * @return un CompletableFuture contenant la valeur du champ récupéré.
     */
    CompletableFuture<Object> getFromCollection(Class<?> clazz, String mainKey, Object mainValue, String string);

    /**
     * Récupère de manière asynchrone un document complet de MongoDB en fonction de sa valeur principale.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param mainValue la valeur principale du document.
     * @return un CompletableFuture contenant l'objet DBObject représentant le document complet.
     */
    CompletableFuture<DBObject> getAllFromCollection(Class<?> clazz, Object mainValue);

    /**
     * Vérifie de manière asynchrone si un document dans une collection MongoDB contient une valeur spécifique pour un paramètre donné.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param parameter le paramètre à vérifier.
     * @param mainValue la valeur à comparer.
     * @return un CompletableFuture contenant true si le document existe, false sinon.
     */
    CompletableFuture<Boolean> contains(Class<?> clazz, String parameter, Object mainValue);

    /**
     * Vérifie de manière asynchrone si un document existe dans une collection MongoDB en fonction de sa valeur principale.
     * @param clazz     la classe associée à la collection MongoDB.
     * @param mainValue la valeur principale à vérifier.
     * @return un CompletableFuture contenant true si le document existe, false sinon.
     */
    CompletableFuture<Boolean> contains(Class<?> clazz, Object mainValue);

}

