package test.scala.com.chongdashu.scala.ecs.tests

import org.junit.Test
import junit.framework.TestCase
import org.junit.Assert._
import com.chongdashu.scala.ecs.Engine
import com.chongdashu.scala.ecs.Entity

class TestEngineAddEntityOne extends TestCase {

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