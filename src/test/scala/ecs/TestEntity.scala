package com.chongdashu.scala.ecs

import junit.framework.TestCase
import org.junit.Assert._

abstract class TestEntity extends TestCase {
    
    var entity0 : Entity;
    var entity1 : Entity;
    var entity2 : Entity;
    
    override def setUp {
       entity0 = new Entity();
       entity1 = new Entity();
       entity2 = new Entity();
    }

    def testEntityEmptyConstructor {
        assertNotNull("Entity created should not be Null", entity0);
        assertEquals(Entity.KEY_PREFIX + "0",  entity0.key);
    }
    
    def testEntityCreateTwo {
        assertEquals(Entity.KEY_PREFIX + "0",  entity0.key);
        assertEquals(Entity.KEY_PREFIX + "1",  entity1.key);
    }
}