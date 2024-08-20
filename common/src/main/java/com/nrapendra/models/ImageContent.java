package com.nrapendra.models;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class ImageContent {

    private int imageId;
    private String imageName;
    private AwsS3BucketContent awsS3BucketContent;
    private FtpContent ftpContent;
}
