package com.example.repository

import javax.inject.Inject
import javax.inject.Singleton
import scala.collection.mutable

@Singleton
class InMemoryUserRepository @Inject() () extends UserRepository {
  private val users = mutable.Map[String, User](
    "1" -> User("1", "Alice", 25),
    "2" -> User("2", "Bob", 30),
    "3" -> User("3", "Charlie", 35)
  )

  override def findBy(id: String): Option[User] = users.get(id)
}
