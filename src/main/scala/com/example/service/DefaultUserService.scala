package com.example.service

import javax.inject.Inject
import javax.inject.Singleton
import com.example.repository.UserRepository

@Singleton
class DefaultUserService @Inject() (userRepository: UserRepository) extends UserService {
  override def getUserName(id: String): String =
    userRepository.findUser(id).map(_.name).getOrElse("Unknown")

  override def getUserAge(id: String): Int = userRepository.findUser(id).map(_.age).getOrElse(0)
}
