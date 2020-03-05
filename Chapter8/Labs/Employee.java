// ************************************************************
//   Employee.java
//
//   Represents an hourly wage worker.
// ************************************************************

public class Employee
{
    String name;
    int hours;        // hours worked
    double rate;      // hourly pay rate

    // --------------------------------------------------
    //  Sets up the Employee object with the given data.
    // --------------------------------------------------
    public Employee (String name, int hours, double rate)
    {
	this.name = name;
	this.hours = hours;
	this.rate = rate;
    }

    // --------------------------------------------------
    //  Returns the number of hours worked.
    // --------------------------------------------------
    public int getHours ()
    {
	return hours;
    }
}