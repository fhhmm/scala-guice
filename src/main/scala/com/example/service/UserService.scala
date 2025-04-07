package com.example.service

import com.google.inject.{ Inject, Singleton }
import com.example.repository.UserRepository
import com.example.repository.User

@Singleton
class UserService @Inject() (userRepository: UserRepository) {
  def getUserBy(id: Long): Option[User] = userRepository.findBy(id)
}
