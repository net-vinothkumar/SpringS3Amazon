# SpringS3Amazon
Demo Spring boot application which connects to AWS S3 bucket.

In the tutorial, we will setup an Amazon S3 bucket, IAM Role, then use SpringBoot application with aws-java-sdk to upload/download files to/from S3.

Using this Spring Boot Application we can Upload/Download files to Amazon S3.
Amazon Simple Storage Service (Amazon S3) is object storage built to store and retrieve any amount of data from web or mobile. Amazon S3 is designed to scale computing easier for developers. For starting, in the tutorial, InterviewDOT shows you how to create a SpringBoot Amazon S3 application.

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
            throws SdkClientException, AmazonServiceException;```


