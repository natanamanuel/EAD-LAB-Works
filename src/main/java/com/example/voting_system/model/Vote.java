package com.example.voting_system.model;

import jakarta.persistence.*;

@Entity
@Table(name = "votes")
public class Vote {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private Long pollId;

    @Column(nullable = false)
    private Long optionId;

    @Column(nullable = false)
    private Long userId;

    public Vote() {}

    public Vote(Long pollId, Long optionId, Long userId) {
        this.pollId = pollId;
        this.optionId = optionId;
        this.userId = userId;
    }

    public Long getId() {
        return id;
    }

    public Long getPollId() {
        return pollId;
    }

    public void setPollId(Long pollId) {
        this.pollId = pollId;
    }

    public Long getOptionId() {
        return optionId;
    }

    public void setOptionId(Long optionId) {
        this.optionId = optionId;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }
}
