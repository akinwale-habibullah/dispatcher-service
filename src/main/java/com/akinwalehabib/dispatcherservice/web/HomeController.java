package com.akinwalehabib.dispatcherservice.web;

import org.springframework.web.bind.annotation.RestController;

import com.akinwalehabib.dispatcherservice.config.PolarProperties;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
@RequestMapping("/")
public class HomeController {
  private PolarProperties polarProperties;

  public HomeController(PolarProperties polarProperties) {
    this.polarProperties = polarProperties;
  }
  
  @GetMapping
  public String getGreeting() {
    return polarProperties.getGreeting();
  }
}
