package com.nt.entity;

import java.time.LocalDateTime;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.lang.NonNull;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Version;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.RequiredArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@RequiredArgsConstructor
@Table(name="REST_JPA_ACTOR")
public class ActorEntity {
	@Id
	@SequenceGenerator(name="gen1",sequenceName="actor_seq",initialValue=1,allocationSize=1)
	@GeneratedValue(generator="gen1",strategy=GenerationType.SEQUENCE)
	private Integer aid;
	@NonNull
	@Column(length=30)
	private String aname;
	@NonNull
	@Column(length=30)
	private String category;
	@NonNull
	@Column(length=30)
	private Double fee;
	@NonNull
	@Column(length=30)
	private String industry;
	@NonNull
	@Column(length=30)
	private LocalDateTime dob;
	
	@Version
	private Integer updateCount;
	@CreationTimestamp
	@Column(updatable=false)
	private LocalDateTime creationTime;
	@UpdateTimestamp
	@Column(insertable=false)
	private LocalDateTime lastupdateTime;
	@Column(length=30)
	private String createdBy;
	@Column(length=30)
	private String updatedBy;
	@Column(length=30)
	private String status="active";

}
