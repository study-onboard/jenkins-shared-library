import com.sanlea.study.jenkins.shared_library.ReportManager

void call(script, String event) {
    script.echo(event)
    ReportManager.report(script, event)
}
