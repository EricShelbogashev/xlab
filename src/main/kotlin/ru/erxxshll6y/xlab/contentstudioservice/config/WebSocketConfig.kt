package ru.erxxshll6y.xlab.contentstudioservice.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.socket.config.annotation.EnableWebSocket
import org.springframework.web.socket.config.annotation.WebSocketConfigurer
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry
import ru.erxxshll6y.xlab.contentstudioservice.controller.WebSocketController

@Configuration
@EnableWebSocket
class WebSocketConfig : WebSocketConfigurer {

    val endpoint: String = "/v1/ws"

    override fun registerWebSocketHandlers(registry: WebSocketHandlerRegistry) {
        val handler = WebSocketController()
        registry.addHandler(handler, endpoint)
    }
}