package com.example

// import com.example.service.MessageService
import com.example.config.AppConfigModule
import com.example.service.UserService
import com.google.inject.Guice

object Main extends App {
  // val injecttor = Guice.createInjector(new AppModule)
  // val messageService = injector.getInstance(classOf[MessageService])
  // println(messageService.getMessage)

  val injector    = Guice.createInjector(new AppConfigModule)
  val userService = injector.getInstance(classOf[UserService])

  println("=== User Information ===")
  println(s"User 1: ${userService.getUserName("1")}, Age: ${userService.getUserAge("1")}")
  println(s"User 2: ${userService.getUserName("2")}, Age: ${userService.getUserAge("2")}")
  println(s"User 3: ${userService.getUserName("3")}, Age: ${userService.getUserAge("3")}")
  println(s"Unknown User: ${userService.getUserName("999")}, Age: ${userService.getUserAge("999")}")
}
