package com.example.repository

case class User(
  id: Long,
  name: String,
  age: Int)

trait UserRepository {
  def findBy(id: Long): Option[User]
}
