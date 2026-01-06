package by.andrew.task4.model;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Objects;

public class Statement {
	private Long id;
	private Long facultyId;
	private Long administratorId;
	private Faculty faculty;
	private User administrator;
	private List<Application> enrolledApplications;
	private LocalDateTime createdAt;

	public Statement() {
	}

	public Statement(Long id, Long facultyId, Long administratorId) {
		this.id = id;
		this.facultyId = facultyId;
		this.administratorId = administratorId;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getFacultyId() {
		return facultyId;
	}

	public void setFacultyId(Long facultyId) {
		this.facultyId = facultyId;
	}

	public Long getAdministratorId() {
		return administratorId;
	}

	public void setAdministratorId(Long administratorId) {
		this.administratorId = administratorId;
	}

	public Faculty getFaculty() {
		return faculty;
	}

	public void setFaculty(Faculty faculty) {
		this.faculty = faculty;
	}

	public User getAdministrator() {
		return administrator;
	}

	public void setAdministrator(User administrator) {
		this.administrator = administrator;
	}

	public List<Application> getEnrolledApplications() {
		return enrolledApplications;
	}

	public void setEnrolledApplications(List<Application> enrolledApplications) {
		this.enrolledApplications = enrolledApplications;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Statement statement = (Statement) o;
		return Objects.equals(id, statement.id);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Statement{" +
						"id=" + id +
						", facultyId=" + facultyId +
						", administratorId=" + administratorId +
						'}';
	}
}
