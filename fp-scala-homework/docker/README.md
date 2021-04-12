## Assignment: Alpakka-Kafka 
Use this docker-compose file to run a minimal
Kafka system for development with a single zookeeper node,
and a single kafka broker.
 
### Running Kafka and Alpakka Stream Connectors
Run the following commands in the ./docker folder.
- Start Kafka
  
  use
  
  `docker-compose -f docker-compose-alpakka-kafka.yml up`
  
  Wait for the message `kafka-setup exited with code 0` on the console before using the system

- Shutdown Kafka
  
  use
  
  `docker-compose -f docker-compose-alpakka-kafka.yml down`

- Run Akka Streams producer
 
  In the fp-scala-homework directory, use
  
  `sbt "testOnly *SimpleKafkaProducerTest*"`

- Run Akka Streams consumer
 
  In the fp-scala-homework directory, use
  
  `sbt "testOnly *SimpleKafkaConsumerTest*"`


### Debugging Kafka
Use the kafkacat tool from https://github.com/edenhill/kafkacat to debug kafka configuration

- Validate kafka brokers and topics
  
  use
  
  `kafkacat -L -b localhost:9092`

- Validate kafka producer
  
  use
  
  `kafkacat -C -b localhost:9092 -t orders -f 'Topic %t [%p] at offset %o: key %k: %s\n' -q`
  



### License
Copyright 2021, Edward Sumitra

Licensed under the Apache License, Version 2.0.