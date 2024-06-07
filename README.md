# SpringBootProfiles
Hello world example of spring boot profile for quick reference

Approach 1: (POJO Class injected with profile from properties)
1. We require a POJO class to hold the Configuration properties
2. The set of configuration properties could vary for Non-Prod vs Prod
3. We'll inject the active profile - Non-Prod vs Prod

Adjustments:
1. We've to exclude datasourceautoconfiguration from loading in springcontext - we don't use, and we want to avoid the error when spring context builds up during application startup
2. We've to set spring.jmx.enabled = false - we're not using spring JMX.

Approach 2: (Custom Bean Injected into SpringContext from Environment Variable)
1. We require a custom model class to hold the configurationsettings
2. Instantiate custom class as a Bean into the springContext

How do we test a Bean ?
@SpyBean is used in Spring Boot tests to create a real Spring bean (if it’s not already defined as a bean) and then spy on it.
reference: https://mohosinmiah1610.medium.com/understanding-spy-and-spybean-in-spring-boot-testing-f5dfeb493fb6