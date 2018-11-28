package demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value="p")
public class PermEmp extends Emp
{
private String hra; 
private String da;
public String getHra() {
	return hra;
}
public void setHra(String hra) {
	this.hra = hra;
}
public String getDa() {
	return da;
}
public void setDa(String da) {
	this.da = da;
}
@Override
public String toString() {
	return "PermEmp [hra=" + hra + ", da=" + da + ", getEmpno()=" + getEmpno() + ", getEname()=" + getEname()
			+ ", getSalary()=" + getSalary() + "]";
}

	
}
