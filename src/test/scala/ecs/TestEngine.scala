package com.chongdashu.scala.ecs

import org.scalatest.FunSuite

class TestEngine extends FunSuite {

    test("Create an engine and add one entity should give size 1") {
        var engine = new Engine();
        engine.addEntity(new Entity());
        assert(engine.entities.size==1);
    }

    test("Create an engine and add two entities should give size 2") {
        var engine = new Engine();
        engine.addEntity(new Entity());
        engine.addEntity(new Entity());
        assert(engine.entities.size==2);
    }

    test("Create an engine and add two entities should maintain order or their addition") {
        var engine = new Engine();
        val e1 = new Entity();
        val e2 = new Entity();
        engine.addEntity(e1);
        engine.addEntity(e2);
        assert(engine.entities(0) == e1);
        assert(engine.entities(1) == e2);
    }

    test("Create an engine, add one entity, and removing it should result in empty entities list") {
        var engine = new Engine();
        val e1 = new Entity();
        engine.addEntity(e1);
        assert(engine.entities(0) == e1);

        engine.removeEntity(e1);
        assert(engine.entities.size == 0);
    }

    test("Create an engine, adding two entities, and removing the second should still keep the first") {

        var engine = new Engine();
        val e1 = new Entity();
        val e2 = new Entity();
        engine.addEntity(e1);
        engine.addEntity(e2);

        engine.removeEntity(e2);

        assert(engine.entities.contains(e1));
        assert(!engine.entities.contains(e2));
        assert(engine.entities.size==1);

    }


}