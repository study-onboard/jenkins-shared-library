package com.sanlea.study.jenkins.shared_library

class ReportManager {
    static List<String> events = new ArrayList<>()

    static void report(script, String event) {
        events.add(event)
        script.echo("Current events: " + events.toString())
    }

    static void save(script, env) {
        script.echo("Current events: " + events.toString())

        StringBuilder builder = new StringBuilder("<html><body>")
        builder.append("<h1>Event Report</h1>")
        builder.append("<hr />")
        events.each {
            builder.append("<div>${it}</div>")
        }
        builder.append("</body></html>")

        def dir = env.WORKSPACE + '/report'
        script.dir('report') {
            def file = new File(dir,"report.html")
            file.createNewFile()
            file.write(builder.toString())
        }
    }
}
