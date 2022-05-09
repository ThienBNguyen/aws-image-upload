package com.tnb.awsimageupload.bucket;

public enum BucketName {
    PROFILE_IMAGE("tbn-image-upload");
    private final String bucketName;
    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }
    public String getBucketName() {
        return bucketName;
    }
}
