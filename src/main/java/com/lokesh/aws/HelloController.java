package com.lokesh.aws;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/hello")
public class HelloController {

  public String hello() {
    return "hello lokesh";
  }

}
