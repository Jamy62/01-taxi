package com.jdc.mth;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import lombok.Data;

@Entity
@Data
@Table(name = "licenses")
public class License {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Temporal(TemporalType.DATE)
	private Date dob;
	
	@Enumerated(EnumType.STRING)
	private BloodType bloodType;
	
	@Enumerated(EnumType.STRING)
	private LicenseType licenseType;
	
	@Column(length = 4)
	private int licenseNumber;
	
	@Temporal(TemporalType.DATE)
	private Date issuedDate;
	
	@OneToOne(mappedBy = "license")
	private Driver driver;
	
	private enum BloodType {
		A, B, O, AB;
	}
	
	private enum LicenseType {
		A, B, C, D, E;
	}
}
