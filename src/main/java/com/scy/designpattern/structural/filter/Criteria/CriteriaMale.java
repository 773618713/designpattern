package com.scy.designpattern.structural.filter.Criteria;

import com.scy.designpattern.structural.filter.Person;

import java.util.ArrayList;
import java.util.List;

/**
 * 男性标准
 */
public class CriteriaMale implements Criteria {
    @Override
    public List<Person> meetCriteria(List<Person> persons) {
        List<Person> malePersons = new ArrayList<Person>();
        for (Person person : persons) {
            if(person.getGender().equalsIgnoreCase("MALE")){
                malePersons.add(person);
            }
        }
        return malePersons;
    }
}