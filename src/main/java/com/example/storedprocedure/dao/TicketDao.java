package com.example.storedprocedure.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.ParameterMode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.storedprocedure.model.Ticket;

@Repository
public class TicketDao {

	@Autowired
	private EntityManager em;

	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketInfo() {
		return em.createNamedStoredProcedureQuery("firstProcedure").getResultList();
	}

	@SuppressWarnings("unchecked")
	public List<Ticket> getTicketByCategory(String category) {
		return em.createStoredProcedureQuery("getTicketsByCategory")
				.registerStoredProcedureParameter("tcategory", String.class, ParameterMode.IN)
				.setParameter("tcategory", category).getResultList();
	}
}
