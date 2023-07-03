package maasHesap;

import java.math.BigDecimal;
import java.util.Date;

public class Employee {

    private String name;
    private double salary;
    private int workHours;
    private int hireYear;

    public Employee(String name, double salary, int workHours, int hireYear) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.hireYear = hireYear;
    }

    public double tax(){
        if(this.salary<1000){
            return 0;
        }
        return(this.salary *3) /100;
    }

    public double bonus(){
        if(workHours>40){
            return (workHours-40)*30;
        }
        return 0;
    }

    public double raiseSalary(){
       int yearDiff = new Date().getYear()-this.hireYear;
       if(yearDiff<10){
           return salary + ((salary*5)/100);
       }
       if(yearDiff>10 && yearDiff<20){
          return this.salary = salary + ((salary*10)/100);

       }
       return this.salary = salary + ((salary*15)/100);

    }

    @Override
    public String toString(){
        double top = this.salary + raiseSalary() - tax();
       return String.format(
                "Adı: %s \n Maaşı : %s \n Çalışma saati : %s \n Başlangıç Yılı : %s \n Vergi: %s \n Bonus: %s  \n" +
                        "Maaş Artışı: %s \n Vergi ve bonuslar ile birlikte maaş %s \n Toplam Maaş %s "
        ,this.name,this.salary,this.workHours,this.hireYear,this.tax(),this.bonus(),this.raiseSalary(),top,top);
    }
}
