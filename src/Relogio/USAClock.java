package Relogio;

public class USAClock extends Clock{

    private String periodIndicador;

    public String getPeriodIndicador() {
        return periodIndicador;
    }
    public void setPeriodIndicadorMid() {
        this.periodIndicador = "PM";
    }
    public void setPeriodIndicadorDay() {
        this.periodIndicador = "AM";
    }

    public void setHour(int hour) {
        setPeriodIndicadorDay();
        if((hour > 12) && (hour <= 23)){
            setPeriodIndicadorMid();
            this.hour = hour - 12;
        }else if(hour >= 24){
            this.hour = 0;
        }
        else{
            this.hour = hour;
        }
    }

    @Override
    public Clock convert(Clock clock) {
        return null;
    }
    
}
