package ru.erxxshll6y.xlab.contentstudioservice.controller

import io.github.oshai.kotlinlogging.KotlinLogging
import org.springframework.web.socket.CloseStatus
import org.springframework.web.socket.WebSocketHandler
import org.springframework.web.socket.WebSocketMessage
import org.springframework.web.socket.WebSocketSession

class WebSocketController : WebSocketHandler {
    private val logger = KotlinLogging.logger {}

    override fun afterConnectionEstablished(session: WebSocketSession) {
        logger.info { "new connection : ${session.remoteAddress}" }
    }

    override fun handleMessage(session: WebSocketSession, message: WebSocketMessage<*>) {
        logger.info { "incoming message : ${session.remoteAddress}, ${message.payload}" }
    }

    override fun handleTransportError(session: WebSocketSession, exception: Throwable) {
        logger.error { "error : ${session.remoteAddress}, ${exception.message}" }
    }

    override fun afterConnectionClosed(session: WebSocketSession, closeStatus: CloseStatus) {
        logger.info { "connection closed : ${session.remoteAddress}" }
    }

    override fun supportsPartialMessages(): Boolean {
        return false
    }
}