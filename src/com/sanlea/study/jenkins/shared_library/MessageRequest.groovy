package com.sanlea.study.jenkins.shared_library

/**
 * Message request
 *
 * @author kut
 */
class MessageRequest {

    // receiver
    String receiver = "<Not set>"

    // title
    String title = "<Not set>"

    // content
    String content = "<Not set>"

    // sender
    String sender = "<Not set>"

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
