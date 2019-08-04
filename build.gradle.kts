import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "2.1.6.RELEASE"
	id("io.spring.dependency-management") version "1.0.7.RELEASE"
	kotlin("jvm") version "1.3.30"
	kotlin("plugin.spring") version "1.3.30"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_1_8

repositories {
	jcenter()
	mavenCentral()
}

dependencies {
	// GraphQL
	implementation("com.graphql-java-kickstart:graphql-spring-boot-starter:5.10.0")
	runtime("com.graphql-java-kickstart:graphiql-spring-boot-starter:5.10.0")

	// MyBatis
	implementation("org.mybatis.spring.boot:mybatis-spring-boot-starter:2.1.0")

	// h2 Database
	runtime("com.h2database:h2")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	implementation("org.jetbrains.kotlin:kotlin-stdlib-jdk8")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "1.8"
	}
}
