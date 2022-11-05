import com.sanlea.study.jenkins.shared_library.ReportManager

void call(script, env) {
    ReportManager.save(script, env)
}
