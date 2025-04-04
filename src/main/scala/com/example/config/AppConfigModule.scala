package com.example.config

import com.example.repository.{ UserRepository, InMemoryUserRepository }
import com.example.repository.{ AccountRepository, InMemoryAccountRepository }
import com.google.inject.{ AbstractModule, Provides, Singleton }

class AppConfigModule extends AbstractModule {
  // Using @Provides pattern
  override def configure(): Unit =
    bind(classOf[AccountRepository]).to(classOf[InMemoryAccountRepository])

  // Using @Provides pattern
  @Provides
  @Singleton
  def provideUserRepository(impl: InMemoryUserRepository): UserRepository = impl
}
