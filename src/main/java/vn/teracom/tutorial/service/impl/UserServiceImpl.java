package vn.teracom.tutorial.service.impl;

import org.springframework.stereotype.Service;
import org.springframework.util.Assert;
import vn.teracom.tutorial.dto.request.LoginRequestDto;

@Service
public class UserServiceImpl implements UserInterface{
    @Override
    public void validateUserInfo(LoginRequestDto data) {
        Assert.isTrue(null != data.getUsername() && data.getUsername().length() > 0,
                "Username cannot be empty");
    }
}
