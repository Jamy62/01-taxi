package com.jdc.mth;

import java.sql.Date;
import java.time.LocalDateTime;

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
@Table(name = "drivers")
public class Driver {
	@Id
	@Generatedval(strategy = Generation)
	private int id;
	
	@Column(length = 45)
	private String name;
	
	@Column(length = 10)
	private String phone;
	
	@Enumerated(EnumType.STRING)
	private Gender Gender;
	
	@Temporal(TemporalType.DATE)
	private LocalDateTime dob;
	
	public enum Gender {
		MALE, FEMALE, OTHER
	}
	
	@OneToOne()
	private License license;
	
}
