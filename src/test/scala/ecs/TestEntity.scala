package com.chongdashu.scala.ecs

import org.scalatest.{FunSuite, FlatSpec}


class TestEntity extends FunSuite{
    
    var entity0 : Entity = new Entity();
    var entity1 : Entity = new Entity();
    var entity2 : Entity = new Entity();
    


    /**
     * Tests that an [[com.chongdashu.scala.ecs.Entity]] created using
     * a constructor with no arguments gets assigned a valid id.
     */
    test("An Entity created with constructor with no arguments should not break") {
    }
    
    /**
     * Tests that two [[com.chongdashu.scala.ecs.Entity]] objects
     * created using constructors with no arguments are both assigned
     * a valid id, which are different.
     */
    test("Creating two entities should automatically assign them unique keys") {
    }
    
    /**
     * Tests that creating an [[com.chongdashu.scala.ecs.Entity]] object
     * with a specified `key` results in one created with that 
     * `Entity.key` assigned.correctly.
     */
    test("Creating an entity with a specific key") {
    }
}