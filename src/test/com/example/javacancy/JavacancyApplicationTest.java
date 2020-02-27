package com.example.javacancy;

import org.junit.Assert;
import org.junit.Test;


public class JavacancyApplicationTest {


    @Test
    public void testVacancyLength() {
        JavacancyApplication var = new JavacancyApplication();
        Assert.assertEquals(23, var.getVacancyLength());
    }

    @Test
    public void testNumberOfVacanciesInLocation() {
        JavacancyApplication var = new JavacancyApplication();
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
        JavacancyApplication var = new JavacancyApplication();
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
