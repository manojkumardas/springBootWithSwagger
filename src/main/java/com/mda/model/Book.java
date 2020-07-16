package com.mda.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
@Getter
@Setter
@NoArgsConstructor
@ToString
public class Book implements Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = -7637098828266511151L;
	@Id
	@GeneratedValue
	private int bookId;
	private String bookName;
	private double price;

}
