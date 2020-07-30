package com.scy.designpattern.structural.filter.Criteria;

import com.scy.designpattern.structural.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 女性标准
 */
public class CriteriaFemale implements Criteria {

    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> femalePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("FEMALE")){
                femalePersons.add(person);
            }
        }
        return femalePersons;
    }
}
