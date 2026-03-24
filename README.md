
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/

 :: Spring Boot ::                (v4.0.4)

2026-03-23T19:51:29.232+13:00  INFO 7580 --- [           main] com.seed.Application                     : Starting Application using Java 17.0.17 with PID 7580 (C:\Users\Administrator\Documents\workspace-spring-tools-for-eclipse-5.1.0.RELEASE\23_03_2026_Autodesk\target\classes started by Administrator in C:\Users\Administrator\Documents\workspace-spring-tools-for-eclipse-5.1.0.RELEASE\23_03_2026_Autodesk)
2026-03-23T19:51:29.239+13:00  INFO 7580 --- [           main] com.seed.Application                     : No active profile set, falling back to 1 default profile: "default"
2026-03-23T19:51:30.160+13:00  INFO 7580 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Bootstrapping Spring Data JPA repositories in DEFAULT mode.
2026-03-23T19:51:30.235+13:00  INFO 7580 --- [           main] .s.d.r.c.RepositoryConfigurationDelegate : Finished Spring Data repository scanning in 55 ms. Found 1 JPA repository interface.
2026-03-23T19:51:30.852+13:00  INFO 7580 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat initialized with port 8080 (http)
2026-03-23T19:51:30.866+13:00  INFO 7580 --- [           main] o.apache.catalina.core.StandardService   : Starting service [Tomcat]
2026-03-23T19:51:30.867+13:00  INFO 7580 --- [           main] o.apache.catalina.core.StandardEngine    : Starting Servlet engine: [Apache Tomcat/11.0.18]
2026-03-23T19:51:30.951+13:00  INFO 7580 --- [           main] b.w.c.s.WebApplicationContextInitializer : Root WebApplicationContext: initialization completed in 1612 ms
2026-03-23T19:51:31.162+13:00  INFO 7580 --- [           main] org.hibernate.orm.jpa                    : HHH008540: Processing PersistenceUnitInfo [name: default]
2026-03-23T19:51:31.229+13:00  INFO 7580 --- [           main] org.hibernate.orm.core                   : HHH000001: Hibernate ORM core version 7.2.7.Final
2026-03-23T19:51:31.756+13:00  INFO 7580 --- [           main] o.s.o.j.p.SpringPersistenceUnitInfo      : No LoadTimeWeaver setup: ignoring JPA class transformer
2026-03-23T19:51:31.806+13:00  INFO 7580 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Starting...
2026-03-23T19:51:32.165+13:00  INFO 7580 --- [           main] com.zaxxer.hikari.pool.HikariPool        : HikariPool-1 - Added connection com.mysql.cj.jdbc.ConnectionImpl@248b2b61
2026-03-23T19:51:32.168+13:00  INFO 7580 --- [           main] com.zaxxer.hikari.HikariDataSource       : HikariPool-1 - Start completed.
2026-03-23T19:51:32.271+13:00  INFO 7580 --- [           main] org.hibernate.orm.connections.pooling    : HHH10001005: Database info:
	Database JDBC URL [jdbc:mysql://localhost:3306/jada]
	Database driver: MySQL Connector/J
	Database dialect: MySQLDialect
	Database version: 8.0.33
	Default catalog/schema: jada/undefined
	Autocommit mode: undefined/unknown
	Isolation level: REPEATABLE_READ [default REPEATABLE_READ]
	JDBC fetch size: none
	Pool: DataSourceConnectionProvider
	Minimum pool size: undefined/unknown
	Maximum pool size: undefined/unknown
2026-03-23T19:51:33.313+13:00  INFO 7580 --- [           main] org.hibernate.orm.core                   : HHH000489: No JTA platform available (set 'hibernate.transaction.jta.platform' to enable JTA platform integration)
Hibernate: 
    drop table if exists student
Hibernate: 
    create table student (
        id integer not null,
        course varchar(255),
        email varchar(255),
        name varchar(255),
        primary key (id)
    ) engine=InnoDB
2026-03-23T19:51:33.423+13:00  INFO 7580 --- [           main] j.LocalContainerEntityManagerFactoryBean : Initialized JPA EntityManagerFactory for persistence unit 'default'
2026-03-23T19:51:33.534+13:00  INFO 7580 --- [           main] o.s.d.j.r.query.QueryEnhancerFactories   : Hibernate is in classpath; If applicable, HQL parser will be used.
2026-03-23T19:51:33.687+13:00  WARN 7580 --- [           main] JpaBaseConfiguration$JpaWebConfiguration : spring.jpa.open-in-view is enabled by default. Therefore, database queries may be performed during view rendering. Explicitly configure spring.jpa.open-in-view to disable this warning
2026-03-23T19:51:34.153+13:00  INFO 7580 --- [           main] o.s.boot.tomcat.TomcatWebServer          : Tomcat started on port 8080 (http) with context path '/'
2026-03-23T19:51:34.171+13:00  INFO 7580 --- [           main] com.seed.Application                     : Started Application in 5.968 seconds (process running for 6.809)
2026-03-23T19:51:41.038+13:00  INFO 7580 --- [nio-8080-exec-1] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header
 Note: further occurrences of HTTP request parsing errors will be logged at DEBUG level.

java.lang.IllegalArgumentException: Invalid character found in method name [0x160x030x010x000xf70x010x000x000xf30x030x030xdfU70xc90xec0xfb0xc60x0e0x8170x8a80x83!0xe80xda;0xe10x03y0xc50x040x8f0x7f0x880xffM0xedO0x990x9a0xf9 ]. HTTP method names must be tokens
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:391) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:270) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:903) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1779) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:946) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:480) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:57) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at java.base/java.lang.Thread.run(Thread.java:840) ~[na:na]

package com.example.flightbooking.entity;

import jakarta.persistence.*;

@Entity
public class Passenger {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private String email;

    // getters setters
    public Long getId() { return id; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }
}2026-03-24T20:46:21.581+13:00  INFO 7580 --- [nio-8080-exec-3] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header
 Note: further occurrences of HTTP request parsing errors will be logged at DEBUG level.

java.lang.IllegalArgumentException: Invalid character found in method name [0x160x030x010x000xf70x010x000x000xf30x030x03K0x83e0x050xd20xa80x050xbd0x140xbaL0xe75u0xe70xe2+y0x150xe60xcb0xd30x1f0xb0C&0xab0x890xf1?0x970xed ]. HTTP method names must be tokens
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:391) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:270) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:903) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1779) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:946) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:480) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:57) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at java.base/java.lang.Thread.run(Thread.java:840) ~[na:na]

2026-03-24T21:54:45.759+13:00  INFO 7580 --- [nio-8080-exec-6] o.a.c.c.C.[Tomcat].[localhost].[/]       : Initializing Spring DispatcherServlet 'dispatcherServlet'
2026-03-24T21:54:45.760+13:00  INFO 7580 --- [nio-8080-exec-6] o.s.web.servlet.DispatcherServlet        : Initializing Servlet 'dispatcherServlet'
2026-03-24T21:54:45.763+13:00  INFO 7580 --- [nio-8080-exec-6] o.s.web.servlet.DispatcherServlet        : Completed initialization in 3 ms
2026-03-24T22:00:26.006+13:00  INFO 7580 --- [nio-8080-exec-1] o.apache.coyote.http11.Http11Processor   : Error parsing HTTP request header
 Note: further occurrences of HTTP request parsing errors will be logged at DEBUG level.

java.lang.IllegalArgumentException: Invalid character found in method name [0x160x030x010x070x120x010x000x070x0e0x030x030xde]wd0x8b0xe7W\0x1a0xfe0xed0xc6q0x04&0x0d;R!e0x85Am0xf20xfbf0x10q0x07;0xa0> ]. HTTP method names must be tokens
	at org.apache.coyote.http11.Http11InputBuffer.parseRequestLine(Http11InputBuffer.java:391) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.http11.Http11Processor.service(Http11Processor.java:270) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.AbstractProcessorLight.process(AbstractProcessorLight.java:63) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.coyote.AbstractProtocol$ConnectionHandler.process(AbstractProtocol.java:903) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.net.NioEndpoint$SocketProcessor.doRun(NioEndpoint.java:1779) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.net.SocketProcessorBase.run(SocketProcessorBase.java:52) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor.runWorker(ThreadPoolExecutor.java:946) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.ThreadPoolExecutor$Worker.run(ThreadPoolExecutor.java:480) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at org.apache.tomcat.util.threads.TaskThread$WrappingRunnable.run(TaskThread.java:57) ~[tomcat-embed-core-11.0.18.jar:11.0.18]
	at java.base/java.lang.Thread.run(Thread.java:840) ~[na:na]

