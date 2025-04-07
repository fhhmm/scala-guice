package com.example.module

import com.example.repository.{ UserRepository, InMemoryUserRepository }
import com.example.repository.{ AccountRepository, InMemoryAccountRepository }
import com.google.inject.{ AbstractModule, Provides, Singleton }

class AppConfigModule extends AbstractModule {
  // Using @Provides pattern
  override def configure(): Unit = bind(classOf[UserRepository]).to(classOf[InMemoryUserRepository])

  // Using @Provides pattern
  @Provides
  @Singleton
  def provideAccountRepository(impl: InMemoryAccountRepository): AccountRepository = impl
}
