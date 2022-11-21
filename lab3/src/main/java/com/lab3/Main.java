package com.lab3;

import com.lab3.entity.SocialMedia;
import com.lab3.factoryMethod.FacebookCreate;
import com.lab3.factoryMethod.LinkedInCreate;
import com.lab3.factoryMethod.SocialMediaCreate;

public class Main {

    public static void main(String[] args) {
        final String socialMediaName = "linkedIn";

        SocialMediaCreate socialMediaCreate;
        switch (socialMediaName) {
            case "facebook":
                socialMediaCreate = new FacebookCreate();
                break;
            case "linkedIn":
                socialMediaCreate = new LinkedInCreate();
                break;
            default:
                throw new IllegalStateException("no such social media ==> " + socialMediaName);
        }
        SocialMedia socialMedia = socialMediaCreate.create("dev_login_1", "password_example");
        socialMedia.publishMessage("message_example");
    }
}
