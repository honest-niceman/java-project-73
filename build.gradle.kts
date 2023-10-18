plugins {
	application
	id("org.springframework.boot") version "3.1.4"
	id("io.spring.dependency-management") version "1.1.3"
}

group = "hexlet.code"
version = "1.0-SNAPSHOT"

application {
	mainClass.set("hexlet.code.app.AppApplication")
}

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	implementation("org.springframework.boot:spring-boot-starter-web")
}

tasks.withType<Test> {
	useJUnitPlatform()
}
