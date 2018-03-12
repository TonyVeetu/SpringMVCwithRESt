package uteevbkru.domain;


import java.util.Calendar;

public class DataObject {

        private Calendar time;
        private String message;

        public DataObject(Calendar time, String message) {
            this.time = time;
            this.message = message;
        }

        public DataObject() {
        }

        public Calendar getTime() {
            return time;
        }

        public void setTime(Calendar time) {
            this.time = time;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }