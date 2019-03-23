# SpringS3Amazon
Demo Spring boot application which connects to AWS S3 bucket.

In the tutorial, we will setup an Amazon S3 bucket, IAM Role, then use SpringBoot application with aws-java-sdk to upload/download files to/from S3.

Using this Spring Boot Application we can Upload/Download files to Amazon S3.
Amazon Simple Storage Service (Amazon S3) is object storage built to store and retrieve any amount of data from web or mobile. Amazon S3 is designed to scale computing easier for developers. For starting, in the tutorial, InterviewDOT shows you how to create a SpringBoot Amazon S3 application.

# Spring Boot - AWS S3 - Design :

<img width="1277" alt="Screen Shot 2019-03-23 at 10 16 21" src="https://user-images.githubusercontent.com/30971809/54864520-cd663880-4d58-11e9-8235-d14cd67db50b.png">


# Technologies
- Java 8
- Maven 3.6.1
- Spring Boot: 1.5.4.RELEASE
- Amazon S3
- Amazon IAM Role

# SpringBoot Amazon S3
In the tutorial, InterviewDOT will setup an Amazon S3 bucket, then use SpringBoot application with aws-java-sdk to upload/download files to/from S3.

```
– For init an AmazonS3 client, we use:

BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsId, awsKey);
AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
			.withRegion(Regions.fromName(region))
			.withCredentials(new AWSStaticCredentialsProvider(awsCreds))
			.build();

BasicAWSCredentials awsCreds = new BasicAWSCredentials(awsId, awsKey);
AmazonS3 s3Client = AmazonS3ClientBuilder.standard()
      .withRegion(Regions.fromName(region))
      .withCredentials(new AWSStaticCredentialsProvider(awsCreds))
      .build();
      
 # – For upload S3 objects, we use:

public PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws SdkClientException, AmazonServiceException;

public PutObjectResult putObject(PutObjectRequest putObjectRequest)
            throws SdkClientException, AmazonServiceException;
            
# – For download S3 objects, we use:

 public S3Object getObject(GetObjectRequest getObjectRequest)
            throws SdkClientException, AmazonServiceException;

public S3Object getObject(GetObjectRequest getObjectRequest)
            throws SdkClientException, AmazonServiceException;
```

# Demo

In the tutorial, we will setup an Amazon S3 bucket, an IAM user and create a SpringBoot application to upload/download files to/from S3.

# Step to do:
# Setup Amazon S3
– Sign Up
– Create a AWS S3 Bucket
– Create an IAM user

# SpringBoot Amazon S3 application
– Create SpringBoot project
– Set Amazon S3 client
– Implement S3 download/upload services
– Implement simple client
– Run and check results

# Open application.properties, add aws configuration:
```
aws.access_key_id=<REPLACE THE KEY>
aws.secret_access_key=<REPLACE THE SECRET>
s3.bucket=testawss3bucket
s3.region=us-east-2

s3.uploadfile=springboot-s3-upload-file.txt
s3.key=springboot-s3-upload-file.txt
```

# Spring Boot Application Console Output :
```
  .   ____          _            __ _ _
 /\\ / ___'_ __ _ _(_)_ __  __ _ \ \ \ \
( ( )\___ | '_ | '_| | '_ \/ _` | \ \ \ \
 \\/  ___)| |_)| | | | | || (_| |  ) ) ) )
  '  |____| .__|_| |_|_| |_\__, | / / / /
 =========|_|==============|___/=/_/_/_/
 :: Spring Boot ::        (v1.5.4.RELEASE)

2019-03-23 08:43:58.151  INFO 20507 --- [           main] c.i.s3.SpringS3AmazonApplication         : Starting SpringS3AmazonApplication on Vinoths-MBP.fritz.box with PID 20507 (/Users/vinothkumar/Downloads/SpringS3Amazon/SpringS3Amazon/target/classes started by vinothkumar in /Users/vinothkumar/Downloads/SpringS3Amazon/SpringS3Amazon)
2019-03-23 08:43:58.154  INFO 20507 --- [           main] c.i.s3.SpringS3AmazonApplication         : No active profile set, falling back to default profiles: default
2019-03-23 08:43:58.219  INFO 20507 --- [           main] s.c.a.AnnotationConfigApplicationContext : Refreshing org.springframework.context.annotation.AnnotationConfigApplicationContext@1a052a00: startup date [Sat Mar 23 08:43:58 CET 2019]; root of context hierarchy
2019-03-23 08:43:59.537  INFO 20507 --- [           main] o.s.j.e.a.AnnotationMBeanExporter        : Registering beans for JMX exposure on startup
---------------- START UPLOAD FILE ----------------
2019-03-23 08:44:00.523  INFO 20507 --- [           main] c.i.s3.services.impl.S3ServicesImpl      : ===================== Upload File - Done! =====================
---------------- START DOWNLOAD FILE ----------------
Downloading an object
Content-Type: text/plain
    ################################################
    ################################################
    test file to upload in aws s3 bucket....
    are you able to learn how to load a file to AWS S3 bucket ?
    Thanks and all the best.......
    ################################################
    ################################################
2019-03-23 08:44:00.672  INFO 20507 --- [           main] c.i.s3.services.impl.S3ServicesImpl      : ===================== Import File - Done! =====================
2019-03-23 08:44:00.675  INFO 20507 --- [           main] c.i.s3.SpringS3AmazonApplication         : Started SpringS3AmazonApplication in 2.832 seconds (JVM running for 3.245)
2019-03-23 08:44:00.676  INFO 20507 --- [       Thread-2] s.c.a.AnnotationConfigApplicationContext : Closing org.springframework.context.annotation.AnnotationConfigApplicationContext@1a052a00: startup date [Sat Mar 23 08:43:58 CET 2019]; root of context hierarchy
2019-03-23 08:44:00.677  INFO 20507 --- [       Thread-2] o.s.j.e.a.AnnotationMBeanExporter        : Unregistering JMX-exposed beans on shutdown
```
