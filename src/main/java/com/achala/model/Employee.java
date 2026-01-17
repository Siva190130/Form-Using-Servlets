package com.achala.model;

public class Employee {

    private String empId;
    private String fullName;
    private String gender;
    private String maritalStatus;
    private String roleType;
    private String primarySkills;
    private String secondarySkills;
    private String certifications;
    private int totalExp;
    private int achalaExp;
    private int skillRating;
    private String skillGaps;
    private String resourcing;
    private String onCall;
    private String comments;

    public Employee() {}

    public Employee(String empId, String fullName, String gender, String maritalStatus,
                    String roleType, String primarySkills, String secondarySkills,
                    String certifications, int totalExp, int achalaExp,
                    int skillRating, String skillGaps,
                    String resourcing, String onCall, String comments) {

        this.empId = empId;
        this.fullName = fullName;
        this.gender = gender;
        this.maritalStatus = maritalStatus;
        this.roleType = roleType;
        this.primarySkills = primarySkills;
        this.secondarySkills = secondarySkills;
        this.certifications = certifications;
        this.totalExp = totalExp;
        this.achalaExp = achalaExp;
        this.skillRating = skillRating;
        this.skillGaps = skillGaps;
        this.resourcing = resourcing;
        this.onCall = onCall;
        this.comments = comments;
    }

    // Getters only (clean & safe)
    public String getEmpId() { return empId; }
    public String getFullName() { return fullName; }
    public String getGender() { return gender; }
    public String getMaritalStatus() { return maritalStatus; }
    public String getRoleType() { return roleType; }
    public String getPrimarySkills() { return primarySkills; }
    public String getSecondarySkills() { return secondarySkills; }
    public String getCertifications() { return certifications; }
    public int getTotalExp() { return totalExp; }
    public int getAchalaExp() { return achalaExp; }
    public int getSkillRating() { return skillRating; }
    public String getSkillGaps() { return skillGaps; }
    public String getResourcing() { return resourcing; }
    public String getOnCall() { return onCall; }
    public String getComments() { return comments; }

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fullName=" + fullName + ", gender=" + gender + ", maritalStatus="
				+ maritalStatus + ", roleType=" + roleType + ", primarySkills=" + primarySkills + ", secondarySkills="
				+ secondarySkills + ", certifications=" + certifications + ", totalExp=" + totalExp + ", achalaExp="
				+ achalaExp + ", skillRating=" + skillRating + ", skillGaps=" + skillGaps + ", resourcing=" + resourcing
				+ ", onCall=" + onCall + ", comments=" + comments + "]";
	}
    
    
}
