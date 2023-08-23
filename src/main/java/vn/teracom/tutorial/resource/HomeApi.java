package vn.teracom.tutorial.resource;


import com.google.gson.Gson;
import org.springframework.web.bind.annotation.*;
import vn.teracom.tutorial.dto.request.LoginRequestDto;
import vn.teracom.tutorial.service.impl.UserInterface;

@RestController
@RequestMapping ("/home")
public class HomeApi {
    private final UserInterface userService;
    public HomeApi (UserInterface userInterfaceService) {
        this.userService = userInterfaceService;
    }

    @GetMapping("/hello/{id}")
    String hello(@RequestParam("var1") String value, @PathVariable("id") String value2,
                 @RequestHeader("X_LANGUAGE") String header) {
        return "Hello world!: " + value +" " + value2 + " header:" + header;
    }

    @PostMapping ("/post")
    String postTest(@RequestBody LoginRequestDto data) {
        System.out.println(new Gson().toJson(data));

        userService.validateUserInfo(data);
        return "Post Ok";
    }
}
