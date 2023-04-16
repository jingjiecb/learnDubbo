# Sample code for learning Dubbo

In this example, Dubbo uses Zookeeper to keep its registry information.

## Dubbo Provider

To provide service for others to use. 

In this example, it provide an implementation for HelloService, which is in dubbo-api, acting as a common service.

## Dubbo Consumer

A sample consumer using spring boot web. Request like /hello?name=claws will use HelloService from Dubbo registry.

## Dubbo Commandline Consumer

A sample consumer using a commandline runner in spring, shows the basic usage of HelloService in Dubbo registry

