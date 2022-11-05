import com.sanlea.study.jenkins.shared_library.MessageRequest

void call(script, Closure closure) {
    def request = new MessageRequest()
    closure.delegate = request
    closure.call()
    def message = "${request.sender} send message to ${request.receiver} - " +
            "title: ${request.title}, content: ${request.content}"
    script.echo(message)
}