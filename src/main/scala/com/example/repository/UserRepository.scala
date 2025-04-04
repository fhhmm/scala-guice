package com.example.repository

case class User(
  id: String,
  name: String,
  age: Int)

trait UserRepository {
  def findBy(id: String): Option[User]
}
