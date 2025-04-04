package com.example

// import com.example.service.MessageService
import com.example.config.AppConfigModule
import com.example.service.{ UserService, AccountService }
import com.google.inject.Guice

object Main extends App {
  val injector       = Guice.createInjector(new AppConfigModule)
  val userService    = injector.getInstance(classOf[UserService])
  val accountService = injector.getInstance(classOf[AccountService])

  println("=== User Information ===")
  println(s"User 1: ${userService.getUserBy("1")}, Account: ${accountService.getAccountBy(1L)}")
  println(s"User 2: ${userService.getUserBy("2")}, Account: ${accountService.getAccountBy(2L)}")
  println(s"User 3: ${userService.getUserBy("3")}, Account: ${accountService.getAccountBy(3L)}")
  println(
    s"Unknown User: ${userService.getUserBy("999")}, Account: ${accountService.getAccountBy(999L)}"
  )
}
