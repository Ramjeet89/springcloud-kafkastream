# springcloud-kafkastream

import org.springframework.cloud.stream.annotation.Input

confluent local service start
confluent local service stop

confluent local destroy(clean up cluster)

every time run the below command to connect with specific ip address


netsh interface portproxy add v4tov4 listenport=9092 listenaddress=0.0.0.0 connectport=9092 connectaddress=172.19.227.19

kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic users

kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic users

kafka-topics --create --bootstrap-server localhost:9092 --replication-factor 1 --partitions 1 --topic users(correct)

kafka-console-producer --broker-list localhost:9092 --topic users
{"name":"Ramjeet Kumar", "Age":34,"Gender":"Male"}

{"name":"Reem Kumari", "Age":28,"Gender":"Female"}

http://localhost:9021/clusters

kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic users
kafka-topics --create --zookeeper localhost:2181 --replication-factor 1 --partitions 1 --topic users


 kafka-console-producer --topic test-topic --broker-list localhost:9092


kafka-console-consumer --topic test-topic --bootstrap-server localhost:9092 --from-beginning
