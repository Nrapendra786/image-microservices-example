package com.nrapendra.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.beans.factory.annotation.Value;

@Getter
@Setter
@ToString
public class AwsS3BucketContent {

    private String accessKey;
    private String secretKey;
    private String region;
    private String bucketName;
}
