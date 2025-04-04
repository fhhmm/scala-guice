package com.example.repository

case class Account(
  id: Long,
  userId: Long,
  balance: BigDecimal)

trait AccountRepository {
  def findBy(userId: Long): Option[Account]
}
