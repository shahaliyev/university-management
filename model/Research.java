package model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Research {
    private String title;
    private String journal;
    private String paperAbstract;
    private LocalDate startDate;
    private LocalDate endDate;
    private String status; // ongoing or completed
    private double budget;
    private String methodology;
    private ArrayList<String> authors;
    private ArrayList<Research> references;
    private ArrayList<String> findings;
    
    public Research(String title, String journal, String paperAbstract, LocalDate startDate, LocalDate endDate,
            String status, double budget, String methodology, ArrayList<String> authors, ArrayList<Research> references,
            ArrayList<String> findings) {
        this.title = title;
        this.journal = journal;
        this.paperAbstract = paperAbstract;
        this.startDate = startDate;
        this.endDate = endDate;
        this.status = status;
        this.budget = budget;
        this.methodology = methodology;
        this.authors = authors;
        this.references = references;
        this.findings = findings;
    }
    public Research(String title, String journal, String paperAbstract, ArrayList<String> authors) {
        this.title = title;
        this.journal = journal;
        this.paperAbstract = paperAbstract;
        this.authors = authors;
    }

    public String getTitle() { return title; }
    public String getJournal() { return journal; }
    public String getPaperAbstract() { return paperAbstract; }
    public LocalDate getStartDate() { return startDate; }
    public LocalDate getEndDate() { return endDate; }
    public String getStatus() { return status; }
    public double getBudget() { return budget; }
    public String getMethodology() { return methodology; }
    public ArrayList<String> getAuthors() { return authors; }
    public ArrayList<Research> getReferences() { return references; }
    public ArrayList<String> getFindings() { return findings; }

    public void setTitle(String title) { this.title = title; }
    public void setJournal(String journal) { this.journal = journal; }
    public void setPaperAbstract(String paperAbstract) { this.paperAbstract = paperAbstract; }
    public void setStartDate(LocalDate startDate) { this.startDate = startDate; }
    public void setEndDate(LocalDate endDate) { this.endDate = endDate; }
    public void setStatus(String status)  { this.status = status; }
    public void setBudget(double budget) { this.budget = budget; }
    public void setMethodology(String methodology) { this.methodology = methodology; }
    public void setAuthors(ArrayList<String> authors) { this.authors = authors; }
    public void setReferences(ArrayList<Research> references) { this.references = references; }
    public void setFindings(ArrayList<String> findings) { this.findings = findings; }
    public void addAuthor(String author) { authors.add(author); }
    public void addReference(Research reference) { references.add(reference); }
    public void addFinding(String finding) { findings.add(finding); }
    
    @Override
    public String toString() {
        StringBuilder info = new StringBuilder();
        info.append("Title: " + title)
            .append("\nJournal: " + journal)
            .append("\nAbstract: " + paperAbstract)
            .append("\nStart Date: " + startDate.toString())
            .append("\nEnd Date: " + endDate.toString())
            .append("\nStatus: " + status)
            .append("\nBudget: " + budget)
            .append("\nMethadology: " + methodology)
            .append("\nAuthors: " + authors.size()).append(" authors")
            .append("\nReferences: " + references.size()).append(" references")
            .append("\nFindings: " + findings.size()).append(" findings");
        return info.toString();
    }
}
