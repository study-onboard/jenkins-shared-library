import com.sanlea.study.jenkins.shared_library.ReportManager

void call(String event) {
    println(event)
    ReportManager.report(event)
}
