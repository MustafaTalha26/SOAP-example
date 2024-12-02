package com.mtmert.item_service;

import com.spring.mtmert.people_service.Gender;
import com.spring.mtmert.people_service.Person;
import jakarta.annotation.PostConstruct;

import java.math.BigInteger;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import com.spring.mtmert.people_service.Country;
import com.spring.mtmert.people_service.Currency;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

@Component
public class PersonRepository {
    private static final Map<String, Person> people = new HashMap<>();

    @PostConstruct
    public void initData() throws DatatypeConfigurationException {
        Country spain = new Country();
        spain.setName("Spain");
        spain.setCapital("Madrid");
        spain.setCurrency(Currency.EUR);
        spain.setPopulation(46704314);

        Person diego = new Person();
        diego.setCountry(spain);
        diego.setName("Diego");
        diego.setSurname("Lopez");
        diego.setId(BigInteger.valueOf(123456789));
        diego.setGender(Gender.MALE);

        GregorianCalendar c = new GregorianCalendar(2000, GregorianCalendar.JANUARY,1);
        XMLGregorianCalendar date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        diego.setBirthday(date);

        people.put(diego.getName(),diego);

        Country poland = new Country();
        poland.setName("Poland");
        poland.setCapital("Warsaw");
        poland.setCurrency(Currency.PLN);
        poland.setPopulation(38186860);

        Person marcel = new Person();
        marcel.setCountry(poland);
        marcel.setName("Marcel");
        marcel.setSurname("Nowak");
        marcel.setId(BigInteger.valueOf(100100100));
        marcel.setGender(Gender.MALE);

        c = new GregorianCalendar(2000, GregorianCalendar.FEBRUARY,20);
        date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        marcel.setBirthday(date);

        people.put(marcel.getName(),marcel);

        Country uk = new Country();
        uk.setName("United Kingdom");
        uk.setCapital("London");
        uk.setCurrency(Currency.GBP);
        uk.setPopulation(63705000);

        Person john = new Person();
        john.setCountry(uk);
        john.setName("John");
        john.setSurname("Abbott");
        john.setId(BigInteger.valueOf(100200300));
        john.setGender(Gender.MALE);

        c = new GregorianCalendar(2000, GregorianCalendar.MARCH,3);
        date = DatatypeFactory.newInstance().newXMLGregorianCalendar(c);
        john.setBirthday(date);

        people.put(john.getName(), john);
    }

    public Person findPerson(String name) {
        Assert.notNull(name, "The person's name must not be null");
        return people.get(name);
    }
}
