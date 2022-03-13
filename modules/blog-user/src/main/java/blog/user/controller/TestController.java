package blog.user.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/user")
@RestController
public class TestController {
    @GetMapping("/test")
    @ApiOperation(value = "777")
    public String test(){
        return "111";
    }
}
