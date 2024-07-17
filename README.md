# Fetch_Project

Command to run the Project:
Prior requirements to run the project:
Java 17
Apache Maven 3.9.8
Docker Desktop (to run the docker-compose file)
Pull the Project:
Command to run the application: "mvn spring-boot:run"
This runs the docker-compose file which runs the zookeeper and Apache Kafka Server in localhost:9092.
Post this the springboot application with producer and consumer will run. After all the applications have reached the running state.

To test the project use Postman to send a http POST request to the url
"localhost:8080/send"

with body of type JSON in the following format

{
  "user_id": "424cdd21-063a-43a7-b91b-7ca1a833afae",
  "app_version": "2.3.0",
  "device_type": "android",
  "ip": "199.172.111.135",
  "locale": "RU",
  "device_id": "593-47-5928",
  "timestamp": "1694479551"
}

The Producer will send the message to the Kafka topic "user-login" and the consumer will consume any JSON value from the topic and print it onto the "command prompt" as a "Response Entity".