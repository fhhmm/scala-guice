package com.example.repository

import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class InMemoryAccountRepository @Inject() () extends AccountRepository {
  private val accounts = Map[Long, Account](
    1L -> Account(1L, 1L, BigDecimal(1000)),
    2L -> Account(2L, 2L, BigDecimal(2000)),
    3L -> Account(3L, 3L, BigDecimal(3000))
  )

  override def findBy(userId: Long): Option[Account] = accounts.get(userId)
}
