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

    /**
     * Tests that an [[com.chongdashu.scala.ecs.Entity]] created using
     * a constructor with no arguments gets assigned a valid id.
     */
    def testEntityEmptyConstructor {
        assertNotNull("Entity created should not be Null", entity0);
        assertEquals(Entity.KEY_PREFIX + "0",  entity0.key);
    }
    
    /**
     * Tests that two [[com.chongdashu.scala.ecs.Entity]] objects
     * created using constructors with no arguments are both assigned
     * a valid id, which are different.
     */
    def testEntityCreateTwo {
        assertEquals(Entity.KEY_PREFIX + "0",  entity0.key);
        assertEquals(Entity.KEY_PREFIX + "1",  entity1.key);
    }
    
    /**
     * Tests that creating an [[com.chongdashu.scala.ecs.Entity]] object
     * with a specified `key` results in one created with that 
     * `Entity.key` assigned.correctly.
     */
    def testEntityCreateSpecifiedKey {
        val entitySpecial = new Entity("Special");
        assertEquals("Special", entitySpecial.key);
    }
}