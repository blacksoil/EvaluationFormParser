import scala.collection.mutable.HashMap
import scala.collection.mutable.StringBuilder

object Main {
  // String hashmap
  val stringMap: HashMap[String, String] = new HashMap[String, String]
  // Integer hashmap
  val integerMap: HashMap[String, Integer] = new HashMap[String, Integer]

  def addString(data: String, name: String) = {
    stringMap.put(name, data)
  }

  def addInteger(data: String, name: String) = {
    integerMap.put(name, Integer parseInt (data))
  }
  
  // Put the content of the hashmap into the DB
  def putIntoDatabase() = {
    
  }

  def main(args: Array[String]) = {
    addString("nama", "denny")
    print(stringMap size);
  }

}

