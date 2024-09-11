package fr.alicent.api.tech.redis;

import redis.clients.jedis.Jedis;

/**
 * @author Ruler - File is a part of AlicentAPI
 */
public interface IRedisManager {

    /**
     * Récupère la ressource Jedis associée au manager.
     * @return le Jedis lié au Redis qui tourne derrière.
     */
    Jedis getResource();

}
