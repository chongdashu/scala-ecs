package com.chongdashu.scala.ecs

import junit.framework.TestCase
import org.junit.Assert._

class TestEngineAddEntity extends TestCase {

    var engine: Engine = _;

    override def setUp {
        engine = new Engine;
    }

    def testAddEntityOne {
        engine.addEntity(new Entity());
        assertEquals(1, engine.entities.size);
    }
    
    def testAddEntityTwo {
        engine.addEntity(new Entity());
        engine.addEntity(new Entity());
        assertEquals(2, engine.entities.size);
    }
    
    def testAddEntityTwo_InOrder {
        val e1 = new Entity();
        val e2 = new Entity();
        engine.addEntity(e1);
        engine.addEntity(e2);
        assertTrue("e1 is in first position", engine.entities(0) == e1);
        assertTrue("e2 is in second position", engine.entities(1) == e2);
    }
    
    def testAddEntityOne_RemoveOne {
        val e1 = new Entity();
        engine.addEntity(e1);
        assertTrue("e1 is in first position", engine.entities(0) == e1);
        
        engine.removeEntity(e1);
        assertEquals(0, engine.entities.size);
    }
    
     def testAddEntityTwo_RemoveOne {
        val e1 = new Entity();
         val e2 = new Entity();
        engine.addEntity(e1);
        engine.addEntity(e2);
        
        engine.removeEntity(e2);
        assertTrue("e1 is still in list of entities", engine.entities.contains(e1));
        assertFalse("e2 is no longer in list of entities", engine.entities.contains(e2));
        
        assertEquals(1, engine.entities.size);
                
    }


}