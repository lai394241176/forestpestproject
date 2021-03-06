package com.lovo.system.bean;

/**
 * @Description: 专家实体类
 * @Author: che
 * @CreateDate: 2019/6/24  12:52
 * @UpdateRemark: 修改内容
 * @Version: 1.0
 */
public class SysDoctor {

    /**
     * 专家id
     */
    private long doctorId;
    /**
     * 专家姓名
     */
    private String doctorName;
    /**
     * 专家性别
     */
    private String doctorSex;
    /**
     * 专家生日
     */
    private String doctorBirthday;
    /**
     * 专家头像路径
     */
    private String doctorImgPath;
    /**
     * 专家专长
     */
    private String doctorSpeciality;
    /**
     * 专家职务
     */
    private String doctorPost;
    /**
     * 专家电话
     */
    private String doctorTel;
    /**
     * 专家公司
     */
    private String doctorCompany;
    /**
     * 专家住址
     */
    private String doctorHome;
    /**
     * 专家邮箱
     */
    private String doctorEmail;


    public long getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(long doctorId) {
        this.doctorId = doctorId;
    }


    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }


    public String getDoctorSex() {
        return doctorSex;
    }

    public void setDoctorSex(String doctorSex) {
        this.doctorSex = doctorSex;
    }


    public String getDoctorBirthday() {
        return doctorBirthday;
    }

    public void setDoctorBirthday(String doctorBirthday) {
        this.doctorBirthday = doctorBirthday;
    }


    public String getDoctorImgPath() {
        return doctorImgPath;
    }

    public void setDoctorImgPath(String doctorImgPath) {
        this.doctorImgPath = doctorImgPath;
    }


    public String getDoctorSpeciality() {
        return doctorSpeciality;
    }

    public void setDoctorSpeciality(String doctorSpeciality) {
        this.doctorSpeciality = doctorSpeciality;
    }


    public String getDoctorPost() {
        return doctorPost;
    }

    public void setDoctorPost(String doctorPost) {
        this.doctorPost = doctorPost;
    }


    public String getDoctorTel() {
        return doctorTel;
    }

    public void setDoctorTel(String doctorTel) {
        this.doctorTel = doctorTel;
    }


    public String getDoctorCompany() {
        return doctorCompany;
    }

    public void setDoctorCompany(String doctorCompany) {
        this.doctorCompany = doctorCompany;
    }


    public String getDoctorHome() {
        return doctorHome;
    }

    public void setDoctorHome(String doctorHome) {
        this.doctorHome = doctorHome;
    }


    public String getDoctorEmail() {
        return doctorEmail;
    }

    public void setDoctorEmail(String doctorEmail) {
        this.doctorEmail = doctorEmail;
    }

    @Override
    public String toString() {
        return "SysDoctor{" +
                "doctorId=" + doctorId +
                ", doctorName='" + doctorName + '\'' +
                ", doctorSex='" + doctorSex + '\'' +
                ", doctorBirthday='" + doctorBirthday + '\'' +
                ", doctorImgPath='" + doctorImgPath + '\'' +
                ", doctorSpeciality='" + doctorSpeciality + '\'' +
                ", doctorPost='" + doctorPost + '\'' +
                ", doctorTel='" + doctorTel + '\'' +
                ", doctorCompany='" + doctorCompany + '\'' +
                ", doctorHome='" + doctorHome + '\'' +
                ", doctorEmail='" + doctorEmail + '\'' +
                '}';
    }
}
