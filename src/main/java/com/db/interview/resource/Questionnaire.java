package com.db.interview.resource;

import java.util.List;

public class Questionnaire {

  private final long id;
  
  private List<Question> questions;

  public Questionnaire(long id) {
    this.id = id;
  }

  public long getId() {
    return id;
  }
}
