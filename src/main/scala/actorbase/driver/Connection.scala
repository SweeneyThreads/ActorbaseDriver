package actorbase.driver

/**
  * This trait defines a Connection interface.
  */
trait Connection {
  def closeConnection(): Unit

  def executeQuery(query: String): String

}
