package daggerok.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.Map;

@RestController
public class Resource {

  @GetMapping
  public Map get() {
    return Collections.singletonMap("message", "Hi!");
  }
}
