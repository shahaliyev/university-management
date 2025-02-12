import java.util.List;

public class Event{
    public String eventName;
    public List<EventPeople> invitedPeople;
    public String heldBy;
    private int numberOfPeople;
    public String place;
    public int durationMinutes;
    public String startingTime;
    public List<String> topics;
    

    public Event(String eventName, List<EventPeople> invitedPeople, String heldBy, 
                  int numberOfPeople, String place, int durationMinutes, 
                  String startingTime, List<String> topics) {
        this.eventName = eventName;
        this.invitedPeople = invitedPeople;
        this.heldBy = heldBy;
        this.numberOfPeople = numberOfPeople;
        this.place = place;
        this.durationMinutes = durationMinutes;
        this.startingTime = startingTime;
        this.topics = topics;
    }

     public String getEventName() {
        return eventName;
    }

    public List<EventPeople> getInvitedPeople() {
        return invitedPeople;
    }

    public String getHeldBy() {
        return heldBy;
    }

    public int getNumberOfPeople() {
        return numberOfPeople;
    }

    public String getPlace() {
        return place;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public String getStartingTime() {
        return startingTime;
    }

    public List<String> getTopics() {
        return topics;
    }
}

