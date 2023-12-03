package ru.erxxshll6y.xlab.contentstudioservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Import

@Import(WebSocketConfig::class)
@Configuration
class RootConfiguration