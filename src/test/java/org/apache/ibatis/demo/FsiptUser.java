/**
 *    Copyright 2009-2015 the original author or authors.
 *
 *    Licensed under the Apache License, Version 2.0 (the "License");
 *    you may not use this file except in compliance with the License.
 *    You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *    Unless required by applicable law or agreed to in writing, software
 *    distributed under the License is distributed on an "AS IS" BASIS,
 *    WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *    See the License for the specific language governing permissions and
 *    limitations under the License.
 */
package org.apache.ibatis.demo;

import java.util.Date;

/**
 * @Description
 * @auther qimy
 * @date 2020/12/21
 */
public class FsiptUser {
    private Integer id;

    private String phone;

    private int used;

    private String userCode;

    private String userAccount;

    private String userName;

    private String userMobile;

    private String userDepartment;

    private String userCompany;

    private String userCostcenter;

    private String userMail;

    private String leaderMail;

    /**
     * DDD 国内长途 IDD 国际长途
     */
    private String userRestriction;

    /**
     * 转接到手机
     */
    private String redirect;

    /**
     * 录音 1开启 0关闭
     */
    private Integer recording;

    private Date createdTime;

    private Date datachangeLasttime;

    private String deployCode;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getUsed() {
        return used;
    }

    public void setUsed(int used) {
        this.used = used;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String getUserAccount() {
        return userAccount;
    }

    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(String userMobile) {
        this.userMobile = userMobile;
    }

    public String getUserDepartment() {
        return userDepartment;
    }

    public void setUserDepartment(String userDepartment) {
        this.userDepartment = userDepartment;
    }

    public String getUserCompany() {
        return userCompany;
    }

    public void setUserCompany(String userCompany) {
        this.userCompany = userCompany;
    }

    public String getUserCostcenter() {
        return userCostcenter;
    }

    public void setUserCostcenter(String userCostcenter) {
        this.userCostcenter = userCostcenter;
    }

    public String getUserMail() {
        return userMail;
    }

    public void setUserMail(String userMail) {
        this.userMail = userMail;
    }

    public String getLeaderMail() {
        return leaderMail;
    }

    public void setLeaderMail(String leaderMail) {
        this.leaderMail = leaderMail;
    }

    public String getUserRestriction() {
        return userRestriction;
    }

    public void setUserRestriction(String userRestriction) {
        this.userRestriction = userRestriction;
    }

    public String getRedirect() {
        return redirect;
    }

    public void setRedirect(String redirect) {
        this.redirect = redirect;
    }

    public Integer getRecording() {
        return recording;
    }

    public void setRecording(Integer recording) {
        this.recording = recording;
    }

    public Date getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(Date createdTime) {
        this.createdTime = createdTime;
    }

    public Date getDatachangeLasttime() {
        return datachangeLasttime;
    }

    public void setDatachangeLasttime(Date datachangeLasttime) {
        this.datachangeLasttime = datachangeLasttime;
    }

    public String getDeployCode() {
        return deployCode;
    }

    public void setDeployCode(String deployCode) {
        this.deployCode = deployCode;
    }

    @Override
    public String toString() {
        return "FsiptUser{" +
                "id=" + id +
                ", phone='" + phone + '\'' +
                ", used=" + used +
                ", userCode='" + userCode + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userName='" + userName + '\'' +
                ", userDepartment='" + userDepartment + '\'' +
                ", userCompany='" + userCompany + '\'' +
                ", userCostcenter='" + userCostcenter + '\'' +
                ", userMail='" + userMail + '\'' +
                ", userRestriction='" + userRestriction + '\'' +
                ", redirect='" + redirect + '\'' +
                ", recording=" + recording +
                ", deployCode='" + deployCode + '\'' +
                '}';
    }
}
