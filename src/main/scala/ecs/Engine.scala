package com.chongdashu.scala.ecs

import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

/** The main engine of the ECS framework.
  */
class Engine() {
    
    /**
     * A list of `Entity` objects.
     * @see [[com.chongdashu.scala.ecs.Entity]]
     */
    var entities : ListBuffer[Entity] = ListBuffer();
    
    /**
     * A list of [[com.chongdashu.scala.ecs.System]] objects.
     */
    var systems : List[System] = List();
    
    /**
     * A map associating a name with a given entity.
     */
    val entityMap : Map[String, Entity] = Map();
    
    /**
     * A map associating a name with a given [[Family]].
     */
    val familyMap : Map[String, Family] = Map();
    
    /**
     * Indicates if the engine is currently executing
     * the update loop.
     */
    var isUpdating : Boolean = false;
    
    /**
     * Register an entity to be added to this engine.
     * This function will not add the entity if it is already in the system.
     */
    def addEntity(entity : Entity) : Unit = {
        if (!entityMap.contains(entity.key)) {
            entityMap.put(entity.key, entity);
            entities = entities :+ entity;    
        }
        
    }
    
    def removeEntity(entity : Entity) : Unit = {
        entities -= entity;  
    }
    
    
}