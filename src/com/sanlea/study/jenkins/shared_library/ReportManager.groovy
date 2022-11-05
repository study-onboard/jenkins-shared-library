package com.sanlea.study.jenkins.shared_library

class ReportManager {
    static List<String> events = new ArrayList<>()

    static void report(String event) {
        events.add(event)
        println("Current events: " + events.toString())
    }

    static void save() {
        println("Current events: " + events.toString())

        StringBuilder builder = new StringBuilder("<html><body>")
        builder.append("<h1>Event Report</h1>")
        builder.append("<hr />")
        events.each {
            builder.append("<div>${it}</div>")
        }
        builder.append("</body></html>")

        def file = new File("./addReportItem.html")
        file.write(builder.toString())
    }
}
