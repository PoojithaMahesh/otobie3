package onetoonebia2.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebia2.dto.AadharCard;
import onetoonebia2.dto.Person;

public class AdharCardDao {
	public EntityManager getEntityManager() {
		return Persistence.createEntityManagerFactory("vinod").createEntityManager();
	}

	public void saveAadharCard(int personId, AadharCard aadharCard) {
		EntityManager entityManager = getEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		Person dbPerson = entityManager.find(Person.class, personId);
		if (dbPerson != null) {
			entityTransaction.begin();
			entityManager.persist(aadharCard);
//			update person details 
			dbPerson.setAadharCard(aadharCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry that id is not present");
		}

	}

	public void updateAadharCard(int id, AadharCard aadharCard) {
		EntityManager entityManager = getEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);

		if (dbAadharCard != null) {
//			adhar is present then i can update the data

			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			aadharCard.setId(id);
			aadharCard.setPerson(dbAadharCard.getPerson());
			entityManager.merge(aadharCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry id is not present");
		}
	}

	public void findAadharCard(int id) {
		EntityManager entityManager = getEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);

		if (dbAadharCard != null) {
//			adhar is present then i can update the data
			System.out.println(dbAadharCard);
		} else {
			System.out.println("Sorry id is not present");
		}
	}

	public void deleteAadharCard(int id) {
		EntityManager entityManager = getEntityManager();
		AadharCard dbAadharCard = entityManager.find(AadharCard.class, id);

		if (dbAadharCard != null) {
//			adhar is present then i can update the data
			EntityTransaction entityTransaction = entityManager.getTransaction();
			entityTransaction.begin();
			Person person=dbAadharCard.getPerson();
			
			person.setAadharCard(null);
			
			entityManager.remove(dbAadharCard);
			entityTransaction.commit();
		} else {
			System.out.println("Sorry id is not present");
		}
	}

}
