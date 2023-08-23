package vn.teracom.tutorial.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;

public class LoginRequestDto {
    private String username;
    private String pass;

    @JsonProperty("user_info")
    private UserInfoDto userInfo;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public UserInfoDto getUserInfo() {
        return userInfo;
    }

    public void setUserInfo(UserInfoDto userInfo) {
        this.userInfo = userInfo;
    }

    static class UserInfoDto {
        public String getAge() {
            return age;
        }

        public void setAge(String age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        private String age;
        private String gender;
    }
}
