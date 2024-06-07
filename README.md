# SpringBootProfiles
Hello world example of spring boot profile for quick reference

Approach:
1. We require a POJO class to hold the Configuration properties
2. The set of configuration properties could vary for Non-Prod vs Prod
3. We'll inject the active profile - Non-Prod vs Prod

Adjustments:
1. We've to exclude datasourceautoconfiguration from loading in springcontext - we don't use, and we want to avoid the error when spring context builds up during application startup
2. We've to set spring.jmx.enabled = false - we're not using spring JMX.
