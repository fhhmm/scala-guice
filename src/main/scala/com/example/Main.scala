package com.example

import com.example.service.MessageService
import com.google.inject.Guice

object Main extends App {
  val injector = Guice.createInjector(new AppModule)
  val messageService = injector.getInstance(classOf[MessageService])
  
  println(messageService.getMessage)
} 