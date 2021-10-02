package Exercise2;

import java.util.Date;

public class HourContract {
    private Date date;
    private Double valuePerHour;
    private Integer hours;

    public HourContract(Date date,Double valuePerHour, Integer hours){
        this.valuePerHour = valuePerHour;
        this.hours = hours;
        this.date = date;
    }

    public Double totalValue(){
        return this.valuePerHour * this.hours;
    }

    public Date getDate() {
		return date;
	}
}
