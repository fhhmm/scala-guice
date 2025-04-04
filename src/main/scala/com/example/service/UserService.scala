package com.example.service

trait UserService {
  def getUserName(id: String): String
  def getUserAge(id: String): Int
}
