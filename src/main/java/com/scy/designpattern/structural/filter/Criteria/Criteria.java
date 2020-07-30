package com.scy.designpattern.structural.filter.Criteria;

import com.scy.designpattern.structural.filter.Person;

import java.util.List;

public interface Criteria {
    public List<Person> meetCriteria(List<Person> persons);
}
