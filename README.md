
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
[32m :: Spring Boot :: [39m              [2m (v3.2.5)[0;39m

[2m2026-03-24T21:52:28.307+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mcom.bus.BusBookingApplication           [0;39m [2m:[0;39m Starting BusBookingApplication using Java 17.0.17 with PID 14700 (C:\Users\Administrator\Documents\workspace-spring-tools-for-eclipse-5.1.0.RELEASE\BusBooking\target\classes started by Administrator in C:\Users\Administrator\Documents\workspace-spring-tools-for-eclipse-5.1.0.RELEASE\BusBooking)
[2m2026-03-24T21:52:28.310+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mcom.bus.BusBookingApplication           [0;39m [2m:[0;39m No active profile set, falling back to 1 default profile: "default"
[2m2026-03-24T21:52:29.265+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Bootstrapping Spring Data JPA repositories in DEFAULT mode.
[2m2026-03-24T21:52:29.339+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36m.s.d.r.c.RepositoryConfigurationDelegate[0;39m [2m:[0;39m Finished Spring Data repository scanning in 59 ms. Found 2 JPA repository interfaces.
[2m2026-03-24T21:52:29.952+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.s.b.w.embedded.tomcat.TomcatWebServer [0;39m [2m:[0;39m Tomcat initialized with port 8080 (http)
[2m2026-03-24T21:52:29.972+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Starting service [Tomcat]
[2m2026-03-24T21:52:29.973+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardEngine   [0;39m [2m:[0;39m Starting Servlet engine: [Apache Tomcat/10.1.20]
[2m2026-03-24T21:52:30.066+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.a.c.c.C.[Tomcat].[localhost].[/]      [0;39m [2m:[0;39m Initializing Spring embedded WebApplicationContext
[2m2026-03-24T21:52:30.067+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mw.s.c.ServletWebServerApplicationContext[0;39m [2m:[0;39m Root WebApplicationContext: initialization completed in 1661 ms
[2m2026-03-24T21:52:30.282+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.hibernate.jpa.internal.util.LogHelper [0;39m [2m:[0;39m HHH000204: Processing PersistenceUnitInfo [name: default]
[2m2026-03-24T21:52:30.375+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36morg.hibernate.Version                   [0;39m [2m:[0;39m HHH000412: Hibernate ORM core version 6.4.4.Final
[2m2026-03-24T21:52:30.431+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.h.c.internal.RegionFactoryInitiator   [0;39m [2m:[0;39m HHH000026: Second-level cache disabled
[2m2026-03-24T21:52:31.068+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.s.o.j.p.SpringPersistenceUnitInfo     [0;39m [2m:[0;39m No LoadTimeWeaver setup: ignoring JPA class transformer
[2m2026-03-24T21:52:31.118+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mcom.zaxxer.hikari.HikariDataSource      [0;39m [2m:[0;39m HikariPool-1 - Starting...
[2m2026-03-24T21:52:32.612+13:00[0;39m [31mERROR[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mcom.zaxxer.hikari.pool.HikariPool       [0;39m [2m:[0;39m HikariPool-1 - Exception during pool initialization.

java.sql.SQLException: Access denied for user 'root'@'localhost' (using password: YES)
	at com.mysql.cj.jdbc.exceptions.SQLError.createSQLException(SQLError.java:130) ~[mysql-connector-j-8.3.0.jar:8.3.0]
	at com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping.translateException(SQLExceptionsMapping.java:122) ~[mysql-connector-j-8.3.0.jar:8.3.0]
	at com.mysql.cj.jdbc.ConnectionImpl.createNewIO(ConnectionImpl.java:815) ~[mysql-connector-j-8.3.0.jar:8.3.0]
	at com.mysql.cj.jdbc.ConnectionImpl.<init>(ConnectionImpl.java:438) ~[mysql-connector-j-8.3.0.jar:8.3.0]
	at com.mysql.cj.jdbc.ConnectionImpl.getInstance(ConnectionImpl.java:241) ~[mysql-connector-j-8.3.0.jar:8.3.0]
	at com.mysql.cj.jdbc.NonRegisteringDriver.connect(NonRegisteringDriver.java:189) ~[mysql-connector-j-8.3.0.jar:8.3.0]
	at com.zaxxer.hikari.util.DriverDataSource.getConnection(DriverDataSource.java:138) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newConnection(PoolBase.java:359) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.PoolBase.newPoolEntry(PoolBase.java:201) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.createPoolEntry(HikariPool.java:470) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.checkFailFast(HikariPool.java:561) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.pool.HikariPool.<init>(HikariPool.java:100) ~[HikariCP-5.0.1.jar:na]
	at com.zaxxer.hikari.HikariDataSource.getConnection(HikariDataSource.java:112) ~[HikariCP-5.0.1.jar:na]
	at org.hibernate.engine.jdbc.connections.internal.DatasourceConnectionProviderImpl.getConnection(DatasourceConnectionProviderImpl.java:122) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator$ConnectionProviderJdbcConnectionAccess.obtainConnection(JdbcEnvironmentInitiator.java:428) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:61) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:276) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:107) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:223) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:191) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:170) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1432) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1503) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1833) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1782) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:600) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:522) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1234) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:952) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:624) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:334) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1343) ~[spring-boot-3.2.5.jar:3.2.5]
	at com.bus.BusBookingApplication.main(BusBookingApplication.java:9) ~[classes/:na]

[2m2026-03-24T21:52:32.619+13:00[0;39m [33m WARN[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.h.e.j.e.i.JdbcEnvironmentInitiator    [0;39m [2m:[0;39m HHH000342: Could not obtain connection to query metadata

java.lang.NullPointerException: Cannot invoke "org.hibernate.engine.jdbc.spi.SqlExceptionHelper.convert(java.sql.SQLException, String)" because the return value of "org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.sqlExceptionHelper()" is null
	at org.hibernate.resource.transaction.backend.jdbc.internal.JdbcIsolationDelegate.delegateWork(JdbcIsolationDelegate.java:116) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:276) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:107) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:223) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:191) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:170) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1432) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1503) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1833) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1782) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:600) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:522) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1234) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:952) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:624) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:334) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1343) ~[spring-boot-3.2.5.jar:3.2.5]
	at com.bus.BusBookingApplication.main(BusBookingApplication.java:9) ~[classes/:na]

[2m2026-03-24T21:52:32.623+13:00[0;39m [31mERROR[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mj.LocalContainerEntityManagerFactoryBean[0;39m [2m:[0;39m Failed to initialize JPA EntityManagerFactory: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
[2m2026-03-24T21:52:32.624+13:00[0;39m [33m WARN[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mConfigServletWebServerApplicationContext[0;39m [2m:[0;39m Exception encountered during context initialization - cancelling refresh attempt: org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
[2m2026-03-24T21:52:32.630+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.apache.catalina.core.StandardService  [0;39m [2m:[0;39m Stopping service [Tomcat]
[2m2026-03-24T21:52:32.650+13:00[0;39m [32m INFO[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36m.s.b.a.l.ConditionEvaluationReportLogger[0;39m [2m:[0;39m 

Error starting ApplicationContext. To display the condition evaluation report re-run your application with 'debug' enabled.
[2m2026-03-24T21:52:32.679+13:00[0;39m [31mERROR[0;39m [35m14700[0;39m [2m---[0;39m [2m[           main][0;39m [2m[0;39m[36mo.s.boot.SpringApplication              [0;39m [2m:[0;39m Application run failed

org.springframework.beans.factory.BeanCreationException: Error creating bean with name 'entityManagerFactory' defined in class path resource [org/springframework/boot/autoconfigure/orm/jpa/HibernateJpaConfiguration.class]: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1786) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.doCreateBean(AbstractAutowireCapableBeanFactory.java:600) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.createBean(AbstractAutowireCapableBeanFactory.java:522) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.lambda$doGetBean$0(AbstractBeanFactory.java:326) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.DefaultSingletonBeanRegistry.getSingleton(DefaultSingletonBeanRegistry.java:234) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.doGetBean(AbstractBeanFactory.java:324) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractBeanFactory.getBean(AbstractBeanFactory.java:200) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.getBean(AbstractApplicationContext.java:1234) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.finishBeanFactoryInitialization(AbstractApplicationContext.java:952) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.context.support.AbstractApplicationContext.refresh(AbstractApplicationContext.java:624) ~[spring-context-6.1.6.jar:6.1.6]
	at org.springframework.boot.web.servlet.context.ServletWebServerApplicationContext.refresh(ServletWebServerApplicationContext.java:146) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refresh(SpringApplication.java:754) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.refreshContext(SpringApplication.java:456) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:334) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1354) ~[spring-boot-3.2.5.jar:3.2.5]
	at org.springframework.boot.SpringApplication.run(SpringApplication.java:1343) ~[spring-boot-3.2.5.jar:3.2.5]
	at com.bus.BusBookingApplication.main(BusBookingApplication.java:9) ~[classes/:na]
Caused by: org.hibernate.service.spi.ServiceException: Unable to create requested service [org.hibernate.engine.jdbc.env.spi.JdbcEnvironment] due to: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:276) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.initializeService(AbstractServiceRegistryImpl.java:238) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.getService(AbstractServiceRegistryImpl.java:215) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.model.relational.Database.<init>(Database.java:45) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.getDatabase(InFlightMetadataCollectorImpl.java:223) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.internal.InFlightMetadataCollectorImpl.<init>(InFlightMetadataCollectorImpl.java:191) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.model.process.spi.MetadataBuildingProcess.complete(MetadataBuildingProcess.java:170) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.metadata(EntityManagerFactoryBuilderImpl.java:1432) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.jpa.boot.internal.EntityManagerFactoryBuilderImpl.build(EntityManagerFactoryBuilderImpl.java:1503) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.springframework.orm.jpa.vendor.SpringHibernateJpaPersistenceProvider.createContainerEntityManagerFactory(SpringHibernateJpaPersistenceProvider.java:75) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.createNativeEntityManagerFactory(LocalContainerEntityManagerFactoryBean.java:390) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.buildNativeEntityManagerFactory(AbstractEntityManagerFactoryBean.java:409) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.AbstractEntityManagerFactoryBean.afterPropertiesSet(AbstractEntityManagerFactoryBean.java:396) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.orm.jpa.LocalContainerEntityManagerFactoryBean.afterPropertiesSet(LocalContainerEntityManagerFactoryBean.java:366) ~[spring-orm-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.invokeInitMethods(AbstractAutowireCapableBeanFactory.java:1833) ~[spring-beans-6.1.6.jar:6.1.6]
	at org.springframework.beans.factory.support.AbstractAutowireCapableBeanFactory.initializeBean(AbstractAutowireCapableBeanFactory.java:1782) ~[spring-beans-6.1.6.jar:6.1.6]
	... 16 common frames omitted
Caused by: org.hibernate.HibernateException: Unable to determine Dialect without JDBC metadata (please set 'jakarta.persistence.jdbc.url' for common cases or 'hibernate.dialect' when a custom Dialect implementation must be provided)
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.determineDialect(DialectFactoryImpl.java:191) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.dialect.internal.DialectFactoryImpl.buildDialect(DialectFactoryImpl.java:87) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentWithDefaults(JdbcEnvironmentInitiator.java:143) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.getJdbcEnvironmentUsingJdbcMetadata(JdbcEnvironmentInitiator.java:348) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:107) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.engine.jdbc.env.internal.JdbcEnvironmentInitiator.initiateService(JdbcEnvironmentInitiator.java:68) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.boot.registry.internal.StandardServiceRegistryImpl.initiateService(StandardServiceRegistryImpl.java:130) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	at org.hibernate.service.internal.AbstractServiceRegistryImpl.createService(AbstractServiceRegistryImpl.java:263) ~[hibernate-core-6.4.4.Final.jar:6.4.4.Final]
	... 31 common frames omitted

