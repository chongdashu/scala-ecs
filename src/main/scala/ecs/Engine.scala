package com.chongdashu.scala.ecs

/** The main engine of the ECS framework.
  */
class Engine() {
    
    /**
     * A list of `Entity` objects.
     * @see [[com.chongdashu.scala.ecs.Entity]]
     */
    var entities : List[Entity] = List();
    
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
    
    def addEntity(entity : Entity) : Unit = {
       entities = entities :+ entity;
    }
    
    def removeEntity(entity : Entity) : Unit = {
        
    }
    
    
}