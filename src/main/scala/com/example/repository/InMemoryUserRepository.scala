package com.example.repository

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InMemoryUserRepository @Inject() () extends UserRepository {
  private val users = Map[Long, User](
    1L -> User(1L, "Alice", 25),
    2L -> User(2L, "Bob", 30),
    3L -> User(3L, "Charlie", 35)
  )

  override def findBy(id: Long): Option[User] = users.get(id)
}
