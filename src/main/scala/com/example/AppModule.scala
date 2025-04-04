package com.example

import com.example.service.{ DefaultMessageService, MessageService }
import com.google.inject.AbstractModule

class AppModule extends AbstractModule {
  override def configure(): Unit = bind(classOf[MessageService]).to(classOf[DefaultMessageService])
}
