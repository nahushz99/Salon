package com.salon.java.entities;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@NoArgsConstructor
@Entity
@Table(name="appoinment")
public class appoinment {
	
	
	@Id
    @Column(name= "ID")
    private String appoinId;
    @Column(name= "FULLNAME",length = 20)
    private String fullname;
    @Column(name= "MOBILE")
    private String mobile;
    @Column(name= "INFO")
    private String informtion;
	public String getAppoinId() {
		return appoinId;
	}
	public void setAppoinId(String appoinId) {
		this.appoinId = appoinId;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getInformtion() {
		return informtion;
	}
	public void setInformtion(String informtion) {
		this.informtion = informtion;
	}
    
    
    
    
    
    


}








