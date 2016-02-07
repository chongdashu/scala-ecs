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
        assertEquals(engine.entities.size, 1);
    }
    
    def testAddEntityTwo {
        engine.addEntity(new Entity());
        engine.addEntity(new Entity());
        assertEquals(engine.entities.size, 2);
    }


}