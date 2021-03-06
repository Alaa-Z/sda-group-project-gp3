package se.kth.sda.freethinker.lecture;

import se.kth.sda.freethinker.assignments.Assignment;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
public class Lecture {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String title;

    @Column(columnDefinition = "TEXT")
    private String body;
    private String youtubeUrl;
    private String zoomLink;

    @Column(columnDefinition = "TIMESTAMP")
    private LocalDateTime unlockTime;

    @OneToMany
    public List<Assignment> assignments;

    public Lecture() {

    }

    public Lecture(Long id, String title, String body) {
        this.id = id;
        this.title = title;
        this.body = body;

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public List<Assignment> getAssignments() {
        return assignments;
    }

    public void setAssignments(List<Assignment> assignments) {
        this.assignments = assignments;
    }

    public LocalDateTime getUnlockTime() {
        return unlockTime;
    }

    public void setUnlockTime(LocalDateTime unlockTime) {
        this.unlockTime = unlockTime;
    }

    public String getYoutubeUrl() {
        return youtubeUrl;
    }

    public void setYoutubeUrl(String youtubeUrl) {
        this.youtubeUrl = youtubeUrl;
    }

    public String getZoomLink() {
        return zoomLink;
    }
    public void setZoomLink(String zoomLink) {
        this.zoomLink = zoomLink;
    }
}
