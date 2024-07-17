# Fetch_Project

## Prerequisites

Before running the project, ensure you have the following installed:
- **Java 17**
- **Apache Maven 3.9.8**
- **Docker Desktop** (for running the Docker Compose file)

## Getting Started

### Pull the Project

Clone the repository to your local machine using the following command:

" git clone https://github.com/keerthi-4301/Fetch_Project.git "


### Running the Application

Navigate to the project directory and run the application with Maven:

" mvn spring-boot:run "

This command will execute the Docker Compose file, which starts the Zookeeper and Apache Kafka Server on localhost:9092. Once the servers are running, the Spring Boot application, including the producer and consumer, will start.
To test the project use Postman to send a http POST request to the url
"localhost:8080/send".

### Testing the Application

To test the project, use Postman to send an HTTP POST request to the following URL:

" http://localhost:8080/send "

Request Body
Set the body type to JSON and use the following format:

{
  "user_id": "424cdd21-063a-43a7-b91b-7ca1a833afae",
  "app_version": "2.3.0",
  "device_type": "android",
  "ip": "199.172.111.135",
  "locale": "RU",
  "device_id": "593-47-5928",
  "timestamp": "1694479551"
}

### Expected Behavior
The producer sends the message to the Kafka topic user-login.
The consumer listens to the Kafka topic and prints any JSON value received to the command prompt as a Response Entity.


### Additional Questions

#### 1. How would you deploy this application in production?

- Dockerize the Application: Ensure that your Spring Boot application, Zookeeper, and Kafka are containerized using Docker. Create a Docker Compose file to manage these services.
- Kubernetes (K8s): Use Kubernetes for container orchestration. Deploy the Docker containers to a Kubernetes cluster to manage scaling, load balancing, and high availability.
- Deploy the application to a cloud provider like AWS, GCP, or Azure. These platforms offer managed services for Kubernetes (e.g., Amazon EKS, Google Kubernetes Engine, Azure AKS).
- Use tools like Jenkins, GitHub Actions, or GitLab CI to automate the build, test, and deployment processes. This ensures that any code changes are automatically tested and deployed.
- Use monitoring tools like Prometheus and Grafana to monitor the health and performance of your application and Kafka cluster.
- Use SSL/TLS to secure communication between clients and Kafka brokers.

#### 2. What other components would you want to add to make this production ready?

- Integrate a database (e.g., PostgreSQL, MongoDB) for persistent storage of processed data or metadata.
- Use Redis or Memcached to cache frequently accessed data, reducing load on the Kafka consumers and improving performance.
- Use tools like Apache Kafka Streams or Apache Flink for real-time stream processing and analytics.
- Implement data backup and disaster recovery strategies to ensure data integrity and availability.
- Use Confluent Schema Registry to manage schemas for Kafka topics, ensuring data compatibility and evolution.
- Implement readiness and liveness probes in Kubernetes to automatically restart unhealthy containers.

#### 3. How can this application scale with a growing dataset?

- Kafka Scaling: Increase the number of partitions for Kafka topics to distribute the load across multiple brokers. Add more Kafka brokers to the cluster to handle increased throughput and provide high availability.
- Consumer Scaling: Use multiple consumers within a consumer group to parallelize the processing of messages from Kafka topics. Deploy multiple instances of the Spring Boot application to distribute the load and improve fault tolerance.
- Storage Scaling: Use distributed storage solutions like Amazon S3, Google Cloud Storage, or HDFS to handle large datasets.
- Use Kubernetes Horizontal Pod Autoscaler (HPA) to automatically scale the number of pods based on CPU/memory usage or custom metrics.
- Use cloud provider load balancers or Kubernetes Ingress to distribute incoming requests across multiple instances of your application.
- Implement data sharding techniques to partition large datasets across multiple databases or storage systems.
