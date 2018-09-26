package com.db.interview.controller;

import com.db.interview.resource.Round;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class QuestionnaireController  {

  @RequestMapping("/interview")
  public Round interview() {
    return new Round(999, null, null);
  }
}
