package mx.com.develop.employees;

public class MyDate {
    private int day;
    private int month;
    private int year;

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public void setDay(int day) {
        this.day = day;
        switch(this.month){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                if(day>0 && day<32){
                    this.day = day ;
                }else{
                    throw new IllegalArgumentException("dia"+"invalido para el mes"+ this.month);
                }              
            break;
            case 4:
            case 6:
            case 9:
            case 11:
                if(day>0 && day<31){
                    this.day = day ;
                }else{
                    throw new IllegalArgumentException("dia"+"invalido para el mes"+ this.month);
                }              
            break;
            case 2:
                if(day>0 && day<30){
                    this.day = day ;
                }else{
                    throw new IllegalArgumentException("dia"+"invalido para el mes"+ this.month);
                }
                if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0)))
                	System.out.println("El año es bisiesto");
                else
                	System.out.println("El año no es bisiesto");
                break;
        }
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
}
