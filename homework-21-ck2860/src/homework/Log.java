package homework;
 import java.text.DateFormat;
 import java.text.SimpleDateFormat;
 import java.util.Date;
 import java.util.Random;


public class Log {
    /**
     * the private fields for severity, name, date, and message
     */
    private Severity severity;
    private String name;
    private String timeStamp;
    private String message;

    /**
     * a constructor for severity, name, and string. Time would be recorded as well.
     * date would be recorded as the message is logged in.
     * @param severity  can be debug, info, warning, error or critical
     * @param name the name creates the log
     * @param message message to be logged
     */

    public Log(Severity severity, String name, String message){
        this.severity = severity;
        this.name = name;
        SimpleDateFormat timeStamp1 = new SimpleDateFormat("YYYY/MM/dd HH:mm:ss.SSS");
        timeStamp = timeStamp1.format(new Date());
        this.message = message;
    }

    /**
     * getter for severity
     * @return severity.
     */


    public Severity getSeverity() {
        return severity;
    }

    /**
     * a getter for message
     * @return message
     */

    public String getMessage() {
        return message;
    }

    /**
     * getter for date
     * @return date
     */

    public String getTimeStamp() {
        return timeStamp;
    }

    /**
     * the getter for name
     * @return name
     */

    public String getName() {
        return name;
    }

    /**
     * toString method is used to print all of the fields/return a string in the format as severity, timestamp, name, and message
     * @return severity, date, name, and message
     */

    @Override
    public String toString () {
        return "[ " + getSeverity() + " ][ " + getTimeStamp() + " ][ " + getName() + "] " + getMessage();
    }

}
