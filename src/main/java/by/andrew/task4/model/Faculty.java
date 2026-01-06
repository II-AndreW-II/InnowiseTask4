package by.andrew.task4.model;

import java.time.LocalDateTime;
import java.util.Objects;

public class Faculty {
	private Long id;
	private String name;
//  private String nameEn;
//  private String nameRu;
//  private String nameBe;
	private Integer enrollmentPlan;
	private Boolean isActive;
	private LocalDateTime createdAt;

	public Faculty() {
	}


	public Faculty(Long id, String name, Integer enrollmentPlan) {
		this.id = id;
		this.name = name;
		this.enrollmentPlan = enrollmentPlan;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getEnrollmentPlan() {
		return enrollmentPlan;
	}

	public void setEnrollmentPlan(Integer enrollmentPlan) {
		this.enrollmentPlan = enrollmentPlan;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}

	public LocalDateTime getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(LocalDateTime createdAt) {
		this.createdAt = createdAt;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Faculty faculty = (Faculty) o;
		return Objects.equals(id, faculty.id) && Objects.equals(name, faculty.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Faculty{" +
						"id=" + id +
						", name='" + name + '\'' +
						", enrollmentPlan=" + enrollmentPlan +
						'}';
	}
}
