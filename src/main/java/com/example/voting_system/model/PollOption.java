package com.example.voting_system.model;

import jakarta.persistence.*;

@Entity
public class PollOption {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "poll_id", nullable = false)
    private Poll poll;

    private String optionText;

    private int votes;

    public PollOption() {}

    public PollOption(Poll poll, String optionText) {
        this.poll = poll;
        this.optionText = optionText;
        this.votes = 0;
    }

    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Poll getPoll() { return poll; }
    public void setPoll(Poll poll) { this.poll = poll; }

    public String getOptionText() { return optionText; }
    public void setOptionText(String optionText) { this.optionText = optionText; }

    public int getVotes() { return votes; }
    public void setVotes(int votes) { this.votes = votes; }
}
