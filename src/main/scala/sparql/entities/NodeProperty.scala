package sparql.entities

import org.w3.banana.RDF

case class NodeProperty(name:String,propertyType:String, value:String, action:Option[String], hasProperty:Set[RDF#URI])
