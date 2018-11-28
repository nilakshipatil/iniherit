package demo;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

@Entity
// default 
@DiscriminatorValue(value="t")
public class TempEmp extends Emp {
	private String  outcomp;

	public String getOutcomp() {
		return outcomp;
	}

	public void setOutcomp(String outcomp) {
		this.outcomp = outcomp;
	}

	@Override
	public String toString() {
		return "TempEmp [outcomp=" + outcomp + ", getEmpno()=" + getEmpno() + ", getEname()=" + getEname()
				+ ", getSalary()=" + getSalary() + "]";
	}
	
}
