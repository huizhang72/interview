package com.db.interview.resource;

public class Round {

  private final int id;
  private final Candidate candidate;
  private final Questionnaire questionnaire;

  public Round(int id, Candidate candidate, Questionnaire questionnaire) {
    this.id = id;
    this.candidate = candidate;
    this.questionnaire = questionnaire;
  }

  public int getId() {
    return id;
  }

  public Candidate getCandidate() {
    return candidate;
  }

  public Questionnaire getQuestionnaire() {
    return questionnaire;
  }
}
