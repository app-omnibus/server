tasks.getByName("bootJar") {
    enabled = true
}

tasks.getByName("jar") {
    enabled = false
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation(project(":core:core-enum"))
    testImplementation(kotlin("test"))
    implementation(project(":core:core-enum"))
    implementation(project(":support:logging"))
    implementation(project(":storage:core-mysql"))
    testImplementation(project(":tests:api-docs"))
}