package com.chongdashu.scala.ecs

/**
 * An Entity in the Entity-Component-System framework.
 */
case class Entity(var key : String) {
    
    def this() {
        this(Entity.KEY_PREFIX + Entity.getNextEntityId());
    }
    
     
     
}

object Entity{
   
    val KEY_PREFIX = "entity:"
    
    private var lastEntityId : Int = -1;
    
     private def getNextEntityId() : Int = {
        lastEntityId += 1;
        return lastEntityId;
        
    }
    
    
}