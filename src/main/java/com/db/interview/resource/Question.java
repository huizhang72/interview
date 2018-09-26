package com.db.interview.resource;

public class Question {

  private final long id;
  private final String content;
  private final String answer;
  private final int score;
  private final boolean deprecated;

  public Question(long id, String content, String answer, int score, boolean deprecated) {
    this.id = id;
    this.content = content;
    this.answer = answer;
    this.score = score;
    this.deprecated = deprecated;
  }

  public long getId() {
    return id;
  }

  public String getContent() {
    return content;
  }

  public String getAnswer() {
    return answer;
  }

  public int getScore() {
    return score;
  }

  public boolean getDeprecated() {
    return deprecated;
  }
}
