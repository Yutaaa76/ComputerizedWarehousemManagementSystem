package bean;

// Generated 2013-6-8 23:00:05 by Hibernate Tools 3.4.0.CR1

/**
 * Department generated by hbm2java
 */
public class Department implements java.io.Serializable {

	private Integer id;
	private String deptName;
	private String manager;
	private String comments;
	private String status;

	public Department() {
	}

	public Department(String deptName, String manager, String status) {
		this.deptName = deptName;
		this.manager = manager;
		this.status = status;
	}

	public Department(String deptName, String manager, String comments,
			String status) {
		this.deptName = deptName;
		this.manager = manager;
		this.comments = comments;
		this.status = status;
	}

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getDeptName() {
		return this.deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getManager() {
		return this.manager;
	}

	public void setManager(String manager) {
		this.manager = manager;
	}

	public String getComments() {
		return this.comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

}