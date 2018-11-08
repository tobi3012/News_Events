package com.example.tranq.newsevents.model;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HiepTQ on 11/8/2018.
 */
public class Event {

    @SerializedName("id")
    private long eventId;

    @SerializedName("status")
    private String eventStatus;

    @SerializedName("photo")
    private String eventPhoto;

    @SerializedName("name")
    private String eventName;

    @SerializedName("description_raw")
    private String eventDescriptionRaw;

    @SerializedName("description_html")
    private String eventDescriptionHtml;

    @SerializedName("schedule_permanent")
    private String eventSchedulePermanent;

    @SerializedName("schedule_date_warning")
    private String eventScheduleDateWarning;

    @SerializedName("schedule_time_alert")
    private String eventScheduleTimeAlert;

    @SerializedName("schedule_start_date")
    private String eventScheduleStartDate;

    @SerializedName("schedule_start_time")
    private String eventScheduleStartTime;

    @SerializedName("schedule_end_date")
    private String eventScheduleEndDate;

    @SerializedName("schedule_end_time")
    private String eventScheduleEndTime;

    @SerializedName("schedule_one_day_event")
    private String eventScheduleOneDayEvent;

    @SerializedName("schedule_extra")
    private String eventScheduleExtra;

    @SerializedName("going_count")
    private String eventGoingCount;

    @SerializedName("went_count")
    private String eventWentCount;

    @SerializedName("my_status")
    private String eventMyStatus;

    public class Venue {

        @SerializedName("id")
        private long eventVenueId;

        @SerializedName("name")
        private String eventVenueName;

        @SerializedName("type")
        private String eventVenueType;

        @SerializedName("description")
        private String eventVenueDescription;

        @SerializedName("phone")
        private String eventVenuePhone;

        @SerializedName("permanant")
        private String eventVenuePermanat;

        @SerializedName("schedule_openinghour")
        private String eventVenueScheduleOpeninghour;

        @SerializedName("schedule_closinghour")
        private String eventVenueScheduleClosinghour;

        @SerializedName("schedule_scheduleNote")
        private String eventVenueScheduleScheduleNote;

        @SerializedName("schedule_closed")
        private String eventVenueScheduleClosed;

        public Venue(long eventVenueId, String eventVenueName, String eventVenueType, String eventVenueDescription,
                     String eventVenuePhone, String eventVenuePermanat, String eventVenueScheduleOpeninghour,
                     String eventVenueScheduleClosinghour, String eventVenueScheduleScheduleNote, String eventVenueScheduleClosed) {
            this.eventVenueId = eventVenueId;
            this.eventVenueName = eventVenueName;
            this.eventVenueType = eventVenueType;
            this.eventVenueDescription = eventVenueDescription;
            this.eventVenuePhone = eventVenuePhone;
            this.eventVenuePermanat = eventVenuePermanat;
            this.eventVenueScheduleOpeninghour = eventVenueScheduleOpeninghour;
            this.eventVenueScheduleClosinghour = eventVenueScheduleClosinghour;
            this.eventVenueScheduleScheduleNote = eventVenueScheduleScheduleNote;
            this.eventVenueScheduleClosed = eventVenueScheduleClosed;
        }

        public String getEventVenueScheduleClosed() {
            return eventVenueScheduleClosed;
        }

        public long getEventVenueId() {
            return eventVenueId;
        }

        public String getEventVenueName() {
            return eventVenueName;
        }

        public String getEventVenueType() {
            return eventVenueType;
        }

        public String getEventVenueDescription() {
            return eventVenueDescription;
        }

        public String getEventVenuePhone() {
            return eventVenuePhone;
        }

        public String getEventVenuePermanat() {
            return eventVenuePermanat;
        }

        public String getEventVenueScheduleOpeninghour() {
            return eventVenueScheduleOpeninghour;
        }

        public String getEventVenueScheduleClosinghour() {
            return eventVenueScheduleClosinghour;
        }

        public String getEventVenueScheduleScheduleNote() {
            return eventVenueScheduleScheduleNote;
        }
    }

    public Event(long eventId, String eventStatus, String eventPhoto, String eventName, String eventDescriptionRaw,
                 String eventDescriptionHtml, String eventSchedulePermanent, String eventScheduleDateWarning, String eventScheduleTimeAlert,
                 String eventScheduleStartDate, String eventScheduleStartTime, String eventScheduleEndDate, String eventScheduleEndTime,
                 String eventScheduleOneDayEvent, String eventScheduleExtra, String eventGoingCount, String eventWentCount, String eventMyStatus) {
        this.eventId = eventId;
        this.eventStatus = eventStatus;
        this.eventPhoto = eventPhoto;
        this.eventName = eventName;
        this.eventDescriptionRaw = eventDescriptionRaw;
        this.eventDescriptionHtml = eventDescriptionHtml;
        this.eventSchedulePermanent = eventSchedulePermanent;
        this.eventScheduleDateWarning = eventScheduleDateWarning;
        this.eventScheduleTimeAlert = eventScheduleTimeAlert;
        this.eventScheduleStartDate = eventScheduleStartDate;
        this.eventScheduleStartTime = eventScheduleStartTime;
        this.eventScheduleEndDate = eventScheduleEndDate;
        this.eventScheduleEndTime = eventScheduleEndTime;
        this.eventScheduleOneDayEvent = eventScheduleOneDayEvent;
        this.eventScheduleExtra = eventScheduleExtra;
        this.eventGoingCount = eventGoingCount;
        this.eventWentCount = eventWentCount;
        this.eventMyStatus = eventMyStatus;
    }

    public long getEventId() {
        return eventId;
    }

    public String getEventStatus() {
        return eventStatus;
    }

    public String getEventPhoto() {
        return eventPhoto;
    }

    public String getEventName() {
        return eventName;
    }

    public String getEventDescriptionRaw() {
        return eventDescriptionRaw;
    }

    public String getEventDescriptionHtml() {
        return eventDescriptionHtml;
    }

    public String getEventSchedulePermanent() {
        return eventSchedulePermanent;
    }

    public String getEventScheduleDateWarning() {
        return eventScheduleDateWarning;
    }

    public String getEventScheduleTimeAlert() {
        return eventScheduleTimeAlert;
    }

    public String getEventScheduleStartDate() {
        return eventScheduleStartDate;
    }

    public String getEventScheduleStartTime() {
        return eventScheduleStartTime;
    }

    public String getEventScheduleEndDate() {
        return eventScheduleEndDate;
    }

    public String getEventScheduleEndTime() {
        return eventScheduleEndTime;
    }

    public String getEventScheduleOneDayEvent() {
        return eventScheduleOneDayEvent;
    }

    public String getEventScheduleExtra() {
        return eventScheduleExtra;
    }

    public String getEventGoingCount() {
        return eventGoingCount;
    }

    public String getEventWentCount() {
        return eventWentCount;
    }

    public String getEventMyStatus() {
        return eventMyStatus;
    }
}
