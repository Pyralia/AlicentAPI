package fr.alicent.api.tech.mongo;

import com.mongodb.BasicDBObject;
import com.mongodb.DBObject;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public class MongoProfileCreator {

    private final Object profileId;
    private final Map<String, Object> stringObjectMap = new HashMap<>();

    /**
     * Constructeur de MongoProfileCreator.
     * @param profileId l'identifiant du profil.
     */
    public MongoProfileCreator(Object profileId){
        this.profileId = profileId;
    }


    /**
     * Permet d'ajouter une entrée dans le document.
     * @param key la clé de l'entrée.
     * @param value la valeur de l'entrée.
     * @return l'instance actuelle de MongoProfileCreator.
     */
    public MongoProfileCreator addEntry(String key, Object value){
        this.stringObjectMap.put(key, value);
        return this;
    }

    /**
     * Permet de build le document.
     * @return le DB Object qui va être inséré dans la base de données.
     */
    public DBObject build(){
        DBObject profile = new BasicDBObject("_id", profileId.toString());
        stringObjectMap.forEach(profile::put);
        return profile;
    }

    /**
     * Permet de récuperer l'Id du document.
     * @return l'Id du document
     */
    public Object getProfileId() {
        return profileId;
    }
}
