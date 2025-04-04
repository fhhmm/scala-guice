package com.example.repository

case class User(
  id: String,
  name: String,
  age: Int)

trait UserRepository {
  def findUser(id: String): Option[User]
}
