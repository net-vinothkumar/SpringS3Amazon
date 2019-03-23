package com.javasampleapproach.s3.services;

public interface S3Services {
	public void downloadFile(String keyName);
	public void uploadFile(String keyName, String uploadFilePath);
}
