import org.jetbrains.kotlin.cli.jvm.main

val postgres_driver_version: String by project
val jooq_version: String by project


plugins {
    kotlin("jvm")
    id("nu.studer.jooq") version "5.2.1"
    id("org.flywaydb.flyway") version "7.5.1"
    id("com.avast.gradle.docker-compose") version "0.14.3"
}

group = "me.sumit.uptime"
version = "0.0.1"


repositories {
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    api("org.flywaydb:flyway-core:7.5.1")

    api("com.zaxxer:HikariCP:4.0.3")
    api("org.jooq:jooq:$jooq_version")

    api("org.postgresql:postgresql:$postgres_driver_version")

    jooqGenerator("org.postgresql:postgresql:$postgres_driver_version")
}


flyway {
    url = "jdbc:postgresql://localhost:5432/postgres"
    user = "postgres"
    password = "example"
}

jooq {
    version.set(jooq_version)
    configurations {
        create("main") {  // name of the jOOQ configuration
            generateSchemaSourceOnCompilation.set(false)  // default (can be omitted)

            jooqConfiguration.apply {
                logging = org.jooq.meta.jaxb.Logging.WARN
                jdbc.apply {
                    driver = "org.postgresql.Driver"
                    url = "jdbc:postgresql://localhost:5432/postgres"
                    user = "postgres"
                    password = "example"
                }
                generator.apply {
                    name = "org.jooq.codegen.KotlinGenerator"
                    database.apply {
                        name = "org.jooq.meta.postgres.PostgresDatabase"
                        excludes = "flyway_schema_history"
                        inputSchema = "public"
                        forcedTypes.addAll(arrayOf(
                            org.jooq.meta.jaxb.ForcedType()
                                .withName("varchar")
                                .withIncludeExpression(".*")
                                .withIncludeTypes("JSONB?"),
                            org.jooq.meta.jaxb.ForcedType()
                                .withName("varchar")
                                .withIncludeExpression(".*")
                                .withIncludeTypes("INET")
                        ).toList())
                    }
                    generate.apply {
                        isRelations = true
                        isDeprecated = false
                        isRecords = true
                        isPojos = true
                        isPojosEqualsAndHashCode = true
                        isDaos = true
                    }
                    target.apply {
                        packageName = "me.sumit.uptime.database.generated"
                        directory = "src/main/kotlin"
                    }
                    strategy.name = "org.jooq.codegen.DefaultGeneratorStrategy"
                }
            }
        }
    }
}

tasks.named<nu.studer.gradle.jooq.JooqGenerate>("generateJooq") {
    inputs.dir("${projectDir}/src/main/resources/db/migration")
    outputs.cacheIf {
        true
    }
}

tasks.named("flywayMigrate") {
    dependsOn("composeUp")
}
tasks.named("generateJooq") {
    dependsOn("flywayMigrate")
    finalizedBy("composeDownForced")
}
