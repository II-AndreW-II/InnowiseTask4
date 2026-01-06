package by.andrew.task4.model;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Application {
	private Long id;
	private Long userId;
	private Long facultyId;
	private User user;
	private Faculty faculty;
	private BigDecimal certificateScore;
	private BigDecimal totalScore;
	private ApplicationStatus applicationStatus;
	private List<ApplicationScore> scores;
	private LocalDateTime createdAt;
	private LocalDateTime updatedAt;

	public Application() {
	}

	public Application(Long id, Long userId, Long facultyId, BigDecimal certificateScore,
	                   BigDecimal totalScore, ApplicationStatus applicationStatus) {
		this.id = id;
		this.userId = userId;
		this.facultyId = facultyId;
		this.certificateScore = certificateScore;
		this.totalScore = totalScore;
		this.applicationStatus = applicationStatus;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public BigDecimal getCertificateScore() {
		return certificateScore;
	}

	public void setCertificateScore(BigDecimal certificateScore) {
		this.certificateScore = certificateScore;
	}

	public BigDecimal getTotalScore() {
		return totalScore;
	}

	public void setTotalScore(BigDecimal totalScore) {
		this.totalScore = totalScore;
	}

	public ApplicationStatus getApplicationStatus() {
		return applicationStatus;
	}

	public void setApplicationStatus(ApplicationStatus applicationStatus) {
		this.applicationStatus = applicationStatus;
	}

	public List<ApplicationScore> getScores() {
		return scores;
	}

	public void setScores(List<ApplicationScore> scores) {
		this.scores = scores;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public LocalDateTime getUpdatedAt() {
		return updatedAt;
	}

	public void setUpdatedAt(LocalDateTime updatedAt) {
		this.updatedAt = updatedAt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Application that = (Application) o;
		return Objects.equals(id, that.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Application{" +
						"id=" + id +
						", userId=" + userId +
						", facultyId=" + facultyId +
						", totalScore=" + totalScore +
						", applicationStatus=" + applicationStatus +
						'}';
	}
}
