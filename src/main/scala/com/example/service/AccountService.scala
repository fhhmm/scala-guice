package com.example.service

import com.google.inject.{ Inject, Singleton }
import com.example.repository.AccountRepository
import com.example.repository.Account

@Singleton
class AccountService @Inject() (accountRepository: AccountRepository) {
  def getAccountBy(userId: Long): Option[Account] = accountRepository.findBy(userId)
}
