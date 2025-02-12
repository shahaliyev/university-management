import java.util.*;

public class Event {
    public String eventName;
    public List<EventPeople> invitedPeople;
    public String heldBy;
    public int numberOfPeople;
    public String place;
    public int durationMinutes;
    public String startingTime;
    public List<String> topics;
    public int seats; 

    // Constructor
    public Event(String eventName, List<EventPeople> invitedPeople, String heldBy, 
                  int numberOfPeople, String place, int durationMinutes, 
                  String startingTime, List<String> topics, int seats) {
        this.eventName = eventName;
        this.invitedPeople = (invitedPeople != null) ? invitedPeople : new ArrayList<>(); // Initialize if null
        this.heldBy = heldBy;
        this.numberOfPeople = numberOfPeople;
        this.place = place;
        this.durationMinutes = durationMinutes;
        this.startingTime = startingTime;
        this.topics = topics;
        this.seats = seats;
    }

    // Method to add an invited person
    private void addInvitedPerson(EventPeople invitedPerson) {
        this.invitedPeople.add(invitedPerson);
    }

    // Set methods

    public void setEventName(String eventName) { this.eventName = eventName; }
    public void setInvitedPeople(List<EventPeople> invitedPeople) { 
        this.invitedPeople = (invitedPeople != null) ? invitedPeople : new ArrayList<>();
    }
    public void setHeldBy(String heldBy) { this.heldBy = heldBy; }
    public void setNumberOfPeople(int numberOfPeople) { this.numberOfPeople = numberOfPeople; }
    public void setPlace(String place) { this.place = place; }
    public void setDurationMinutes(int durationMinutes) { this.durationMinutes = durationMinutes; }
    public void setStartingTime(String startingTime) { this.startingTime = startingTime; }
    public void setTopics(List<String> topics) { this.topics = topics; }
    public void setSeats(int seats) { this.seats = seats; }

    // Get methods
    public String getEventName() { return eventName; }
    public List<EventPeople> getInvitedPeople() { return invitedPeople; }
    public String getHeldBy() { return heldBy; }
    public int getNumberOfPeople() { return numberOfPeople; }
    public String getPlace() { return place; }
    public int getDurationMinutes() { return durationMinutes; }
    public String getStartingTime() { return startingTime; }
    public List<String> getTopics() { return topics; }

    // Invite whole bunch of people
    public void invitePeople(Person[] ppl) {
        for (int i = 0; i < ppl.length; i++) { 
            addInvitedPerson(new EventPeople(ppl[i], this.seats + i+1)); 
        }
    }
}


