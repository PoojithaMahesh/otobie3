package onetoonebia2.controller;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import onetoonebia2.dao.AdharCardDao;
import onetoonebia2.dao.PersonDao;
import onetoonebia2.dto.AadharCard;
import onetoonebia2.dto.Person;

public class PersonAadharCont {
public static void main(String[] args) {
	
	PersonDao personDao=new PersonDao();
	AdharCardDao adharCardDao=new AdharCardDao();
	
//	Person person=new Person();
//	person.setId(3);
//	person.setName("sandhya");
//	person.setAddress("bang");
//	
//	AadharCard aadharCard=new AadharCard();
//	aadharCard.setId(300);
//	aadharCard.setName("Sandy");
//	aadharCard.setAge(18);
//	
//	aadharCard.setPerson(person);
//
//	
//	
////	personDao.savePerson(person);
//	adharCardDao.saveAadharCard(3, aadharCard);
	
//	Update
//	Person person=new Person();
//	person.setName("soundarya");
//	person.setAddress("bang");
//	
//	
//	
//	personDao.updatePerson(3, person);
//	
//	AadharCard aadharCard=new AadharCard();
//	
//	aadharCard.setName("Soundarya");
//	aadharCard.setAge(18);
//	
//	
//	adharCardDao.updateAadharCard(300, aadharCard);
	
//	personDao.findPerson(3);
//	
	
	adharCardDao.deleteAadharCard(300);
	
	
	
	
	
	
}
}
