package vn.teracom.tutorial.service.impl;

import vn.teracom.tutorial.dto.request.LoginRequestDto;

public interface UserInterface {

    void validateUserInfo(LoginRequestDto data);
}
