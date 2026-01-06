package by.andrew.task4.model;

import java.util.Objects;

public class Subject {
	private Long id;
	private String name;
//  private String nameEn;
//  private String nameRu;
//  private String nameBe;
	private Integer maxScore;
	private Boolean isActive;


	public Subject() {
	}

	public Subject(Long id, String name, Integer maxScore) {
		this.id = id;
		this.name = name;
		this.maxScore = maxScore;
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

	public Integer getMaxScore() {
		return maxScore;
	}

	public void setMaxScore(Integer maxScore) {
		this.maxScore = maxScore;
	}

	public Boolean getActive() {
		return isActive;
	}

	public void setActive(Boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;
		Subject subject = (Subject) o;
		return Objects.equals(id, subject.id) && Objects.equals(name, subject.name);
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public String toString() {
		return "Subject{" +
						"id=" + id +
						", name='" + name + '\'' +
						", maxScore=" + maxScore +
						'}';
	}
}
