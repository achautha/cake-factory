# Spring & Springboot Introduction

## What is Spring

- A complex application is composed of many components ( classes, interfaces ) each having its own reposibility.
- At runtime, these components need to be created and introduced to each other.
- Spring does this job with a `container` a.k.a `Application Context`

## Spring container / Application Context

- Container creates and manages components lifecycle
- Components are called `Beans`
- Beans are wired to make a complete application.
- Act of wiring beans -> Dependency injection.
- IOC ( Inversion of control) is a DI pattern

## Spring ecosystem

- Web framework
- JPA
- Security
- Monitoring and more..

## Bean wiring

- Old way : XML file.
- New way : Java annotaion `@Configuration` & `@Bean`.

## Autowiring & Component scanning

- Component scanning: Auto discover components from classpath and create them as beans.
- Autowiring: Injects the components with dependent beans.

## AutoConfiguration

- Next step in wiring and scanning offered by SpringBoot
- Boot does autowiring based on classpath and environment variables/properties file.
  - If h2 db jar is in classpath, Boot wires the corresponding beans

## Bootstrapping the app

`@SpringBootApplication` : Annotation to denote entry point of the app. It is a combination of

- `@SpringBootConfiguration` : Specialized form of `@Configuration`
- `@EnableAutoConfiguration` : Automatically configure components from classpath.
- `@ComponentScan`: Discover and register beans in application context.
