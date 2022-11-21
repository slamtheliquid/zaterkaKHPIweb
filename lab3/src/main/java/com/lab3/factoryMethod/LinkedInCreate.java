package com.lab3.factoryMethod;

import com.lab3.entity.LinkedInSM;
import com.lab3.entity.SocialMedia;

public class LinkedInCreate extends SocialMediaCreate {
    public SocialMedia create(String email, String password) {
        return new LinkedInSM(email, password);
    }
}
