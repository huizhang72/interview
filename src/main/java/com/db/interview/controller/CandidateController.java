package com.db.interview.controller;

import com.db.interview.CandidateProtos.Candidate;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CandidateController {
  private Candidate candidate;

  @RequestMapping("/candidate")
  public String candidate() {
    candidate = Candidate.newBuilder().setName("candidate name").build();
    return candidate.toString();
  }
}
