package by.andrew.task4.model;

import java.math.BigDecimal;
import java.util.Objects;

public class ApplicationScore {
	private Long id;
	private Long applicationId;
	private Long subjectId;
	private BigDecimal score;
	private Subject subject;

	public ApplicationScore(){
	}

	public ApplicationScore(Long id, Long applicationId, Long subjectId, BigDecimal score) {
		this.id = id;
		this.applicationId = applicationId;
		this.subjectId = subjectId;
		this.score = score;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getApplicationId() {
		return applicationId;
	}

	public void setApplicationId(Long applicationId) {
		this.applicationId = applicationId;
	}

	public Long getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(Long subjectId) {
		this.subjectId = subjectId;
	}

	public BigDecimal getScore() {
		return score;
	}

	public void setScore(BigDecimal score) {
		this.score = score;
	}

	public Subject getSubject() {
		return subject;
	}

	public void setSubject(Subject subject) {
		this.subject = subject;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		ApplicationScore that = (ApplicationScore) o;
		return Objects.equals(id, that.id) && Objects.equals(applicationId, that.applicationId) && Objects.equals(subjectId, that.subjectId);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, applicationId, subjectId);
	}

	@Override
	public String toString() {
		return "ApplicationScore{" +
						"id=" + id +
						", applicationId=" + applicationId +
						", subjectId=" + subjectId +
						", score=" + score +
						'}';
	}
}
