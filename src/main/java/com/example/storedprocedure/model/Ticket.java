package com.example.storedprocedure.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedStoredProcedureQueries;
import javax.persistence.NamedStoredProcedureQuery;
import javax.persistence.Table;

import lombok.Data;

@Entity
@Table
@Data
@NamedStoredProcedureQueries({ @NamedStoredProcedureQuery(name = "firstProcedure", procedureName = "getTickets") })
public class Ticket {

	@Id
	private int id;
	private int amount;
	private String category;

}
