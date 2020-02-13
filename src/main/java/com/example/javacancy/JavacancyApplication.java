package com.example.javacancy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
@Controller
public class JavacancyApplication {

    List<Vacancy> vacancyList;

    public JavacancyApplication() {
        vacancyList = new ArrayList<>();
        Vacancy job1 = new Vacancy("Junior Java Developer", "Microsoft", Location.OSLO, Experience.ENTRY, 563000, "Experience in applications development using Java Spring Framework with expertise on Core Java , J2EE, OOPS, Spring Boot, Spring MVC, REST , Hibernate, Javascipt.\n" +
                "Should have mandatory experience in JSP, Servlets.\n" +
                "Excellent experience in web UI like HTML, CSS, JavaScript, JQuery, AJAX, ReactJS etc.\n" +
                "Web services like Restful and Soap.\n" +
                "Databases : Oracle or MySQL or SQL Server with JDBC connections.\n" +
                "Working experience in Servers like Tomcat Apache, WebLogic, JBoss.\n" +
                "JSON/XML : request/response understanding.\n" +
                "GIT or repository management.", "15240");
        Vacancy job2 = new Vacancy("Senior Software Developer (Java)", "ABB", Location.STAVANGER, Experience.SENIOR, 880000, "Requires a bachelor’s or foreign equivalent degree in computer science, engineering, or a related field and 8 years of experience in the position offered or 8 years of experience developing software with at least one of the following software development models: Waterfall, Iterative, Agile, BDD, or Dev Ops. Also requires 5 years of experience: programming with Java Swings; programming with application tools for Open JMS (Apache ActiveMQ); programming with at least one of the following databases: Oracle DBMS with PL/SQL, SQL Server or MySql; working with at least one of the following web service languages: XML, XSD, or WSDL; working with at least one of the following web application assets: HTML, XML/XSL Technologies, JavaScript, JSP/Servlets or CSS; developing with Java and J2EE; using at least one of the messaging tools and integration tools: Tibco, Websphere, ActiveMQ, or RabbitMQ; developing with .net, C#, VB.net, Java and Eclipse on Visual Studio; and working on Unix/Linux operating system. Requires 3 years of experience: programming with SOAP based or Rest Easy Framework web services; developing with object oriented design and programming; installing and configuring web servers for WebTier and Apache Tomcat; using at least one of the following defect tracking assets: VersionOne, TFS, or ClearQuest; and using Clearcase or Team Foundation Server source control assets. Requires 2 years of experience working with products integrated with SCADA system. Experience may be, but need not be, acquired concurrently.","14265");
        vacancyList.add(job1);
        vacancyList.add(job2);
    }



    public static void main(String[] args) {
        SpringApplication.run(JavacancyApplication.class, args);
    }


    @GetMapping("/")
    public String getIndex(Model m) {

        m.addAttribute("vacancyList", vacancyList);

        return "index";
    }

    @GetMapping("/{jobId}")
    public String getIndex(Model m, @PathVariable(required = true) String jobId) {
        Vacancy currentJob = null;

        for(Vacancy v : vacancyList){
            if(v.getJobId().equals(jobId)){
                currentJob = v;
            }
        }

        m.addAttribute("vacancyList", vacancyList);
        m.addAttribute("job", currentJob);

        return "jobPage";
    }

    @GetMapping ("/add")
    public String addVacancy (@ModelAttribute Vacancy vacancy, Model m) {
        m.addAttribute("vacancy", vacancy);
        return "addVacancy";
    }

    @PostMapping("/add")
    public String addVacancy (@ModelAttribute Vacancy vacancy) {

        Vacancy newVacancy = new Vacancy(vacancy.getJobTitle(), vacancy.getCompanyName(), Location.OSLO, vacancy.getExperience(), 2504444, vacancy.getJobDescription(), "22445");
        vacancyList.add(newVacancy);


        return "redirect:/";
    }

}
