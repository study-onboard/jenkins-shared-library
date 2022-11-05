package com.sanlea.study.jenkins.shared_library

/**
 * Message request
 *
 * @author kut
 */
class MessageRequest {

    // receiver
    String receiver

    // title
    String title

    // content
    String content

    // sender
    String sender

    void receiver(String receiver) {
        this.receiver = receiver
    }

    void title(String title) {
        this.title = title
    }

    void content(String content) {
        this.content = content
    }

    void sender(String sender) {
        this.sender = sender
    }
}
