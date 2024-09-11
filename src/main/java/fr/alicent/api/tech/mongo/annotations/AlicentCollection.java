package fr.alicent.api.tech.mongo.annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * @author Ruler - File is a part of AlicentAPI
 */

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.TYPE)
public @interface AlicentCollection {

    /**
     * Spécifie le nom de la collection MongoDB associée à la classe annotée.
     * @return le nom de la collection sous forme de chaîne de caractères.
     */
    String collectionName();

}
