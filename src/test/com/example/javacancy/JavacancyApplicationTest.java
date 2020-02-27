package com.example.javacancy;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;


public class JavacancyApplicationTest {

    JavacancyApplication var;

    @Before
    public void before(){
        var = new JavacancyApplication(null, null, new VacancyRepository() {

            List<Vacancy> vacancies = new ArrayList<>();

            @Override
            public <S extends Vacancy> S save(S s) {
                vacancies.add(s);
                return s;
            }

            @Override
            public <S extends Vacancy> Iterable<S> saveAll(Iterable<S> iterable) {
                return null;
            }

            @Override
            public Optional<Vacancy> findById(Integer integer) {
                return Optional.empty();
            }

            @Override
            public boolean existsById(Integer integer) {
                return false;
            }

            @Override
            public Iterable<Vacancy> findAll() {
                return null;
            }

            @Override
            public Iterable<Vacancy> findAllById(Iterable<Integer> iterable) {
                return null;
            }

            @Override
            public long count() {
                return vacancies.size();
            }

            @Override
            public void deleteById(Integer integer) {

            }

            @Override
            public void delete(Vacancy vacancy) {

            }

            @Override
            public void deleteAll(Iterable<? extends Vacancy> iterable) {

            }

            @Override
            public void deleteAll() {

            }
        });
    }


    @Test
    public void testVacancyLength() {
        Assert.assertEquals(23L, var.getVacancyLength());
    }

    @Test
    public void testNumberOfVacanciesInLocation() {
        var.lastLocationSearch = "Oslo";
        var.isFilteredByLocation = true;
        Assert.assertEquals(11, var.filterVacancies().size());
        var.lastLocationSearch = "Trondheim";
        var.isFilteredByLocation = true;
        Assert.assertEquals(4, var.filterVacancies().size());
        var.lastLocationSearch = "Bergen";
        var.isFilteredByLocation = true;
        Assert.assertEquals(4, var.filterVacancies().size());
        var.lastLocationSearch = "Stavanger";
        var.isFilteredByLocation = true;
        Assert.assertEquals(4, var.filterVacancies().size());
    }

    @Test
    public void testNumberOfVacanciesIn() {
        var.lastLocationSearch = "Oslo";
        var.isFilteredByLocation = true;
        Assert.assertEquals(11, var.filterVacancies().size());
        var.lastLocationSearch = "Trondheim";
        var.isFilteredByLocation = true;
        Assert.assertEquals(4, var.filterVacancies().size());
        var.lastLocationSearch = "Bergen";
        var.isFilteredByLocation = true;
        Assert.assertEquals(4, var.filterVacancies().size());
        var.lastLocationSearch = "Stavanger";
        var.isFilteredByLocation = true;
        Assert.assertEquals(4, var.filterVacancies().size());
    }
}
