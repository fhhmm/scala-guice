package com.example.config

import com.example.repository.{ UserRepository, InMemoryUserRepository }
import com.example.service.{ UserService, DefaultUserService }
import com.google.inject.{ AbstractModule, Provides }
import javax.inject.Singleton

class AppConfigModule extends AbstractModule {
  override def configure(): Unit =
    // 基本的なバインディング
    bind(classOf[UserRepository]).to(classOf[InMemoryUserRepository])

  @Provides
  @Singleton
  def provideUserService(userRepository: UserRepository): UserService =
    new DefaultUserService(userRepository)
}
