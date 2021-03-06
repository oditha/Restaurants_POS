package ORM;
// Generated May 1, 2018 9:49:59 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;

/**
 * Employees generated by hbm2java
 */
public class Employees  implements java.io.Serializable {


     private Integer idEmployees;
     private String employeeNic;
     private String employeName;
     private String employeeContactNo;
     private String employeesAddress1;
     private String employeeAddress2;
     private String employeeCity;
     private String employeeEtf;
     private String employeeEpf;
     private String isDelete;
     private Double basicSalary;
     private Set logins = new HashSet(0);
     private Set allowanceHasEmployeeses = new HashSet(0);
     private Set employeesHasDeductionses = new HashSet(0);
     private Set invoiceCommissonses = new HashSet(0);
     private Set salaries = new HashSet(0);
     private Set tmpemployeesHasJobroalses = new HashSet(0);
     private Set serviceChargeEmployees = new HashSet(0);
     private Set employeesHasTables = new HashSet(0);
     private Set employeeContactDetailses = new HashSet(0);
     private Set employeesHasJobroalses = new HashSet(0);
     private Set paymentses = new HashSet(0);
     private Set attendences = new HashSet(0);
     private Set leaveManagements = new HashSet(0);

    public Employees() {
    }

    public Employees(String employeeNic, String employeName, String employeeContactNo, String employeesAddress1, String employeeAddress2, String employeeCity, String employeeEtf, String employeeEpf, String isDelete, Double basicSalary, Set logins, Set allowanceHasEmployeeses, Set employeesHasDeductionses, Set invoiceCommissonses, Set salaries, Set tmpemployeesHasJobroalses, Set serviceChargeEmployees, Set employeesHasTables, Set employeeContactDetailses, Set employeesHasJobroalses, Set paymentses, Set attendences, Set leaveManagements) {
       this.employeeNic = employeeNic;
       this.employeName = employeName;
       this.employeeContactNo = employeeContactNo;
       this.employeesAddress1 = employeesAddress1;
       this.employeeAddress2 = employeeAddress2;
       this.employeeCity = employeeCity;
       this.employeeEtf = employeeEtf;
       this.employeeEpf = employeeEpf;
       this.isDelete = isDelete;
       this.basicSalary = basicSalary;
       this.logins = logins;
       this.allowanceHasEmployeeses = allowanceHasEmployeeses;
       this.employeesHasDeductionses = employeesHasDeductionses;
       this.invoiceCommissonses = invoiceCommissonses;
       this.salaries = salaries;
       this.tmpemployeesHasJobroalses = tmpemployeesHasJobroalses;
       this.serviceChargeEmployees = serviceChargeEmployees;
       this.employeesHasTables = employeesHasTables;
       this.employeeContactDetailses = employeeContactDetailses;
       this.employeesHasJobroalses = employeesHasJobroalses;
       this.paymentses = paymentses;
       this.attendences = attendences;
       this.leaveManagements = leaveManagements;
    }
   
    public Integer getIdEmployees() {
        return this.idEmployees;
    }
    
    public void setIdEmployees(Integer idEmployees) {
        this.idEmployees = idEmployees;
    }
    public String getEmployeeNic() {
        return this.employeeNic;
    }
    
    public void setEmployeeNic(String employeeNic) {
        this.employeeNic = employeeNic;
    }
    public String getEmployeName() {
        return this.employeName;
    }
    
    public void setEmployeName(String employeName) {
        this.employeName = employeName;
    }
    public String getEmployeeContactNo() {
        return this.employeeContactNo;
    }
    
    public void setEmployeeContactNo(String employeeContactNo) {
        this.employeeContactNo = employeeContactNo;
    }
    public String getEmployeesAddress1() {
        return this.employeesAddress1;
    }
    
    public void setEmployeesAddress1(String employeesAddress1) {
        this.employeesAddress1 = employeesAddress1;
    }
    public String getEmployeeAddress2() {
        return this.employeeAddress2;
    }
    
    public void setEmployeeAddress2(String employeeAddress2) {
        this.employeeAddress2 = employeeAddress2;
    }
    public String getEmployeeCity() {
        return this.employeeCity;
    }
    
    public void setEmployeeCity(String employeeCity) {
        this.employeeCity = employeeCity;
    }
    public String getEmployeeEtf() {
        return this.employeeEtf;
    }
    
    public void setEmployeeEtf(String employeeEtf) {
        this.employeeEtf = employeeEtf;
    }
    public String getEmployeeEpf() {
        return this.employeeEpf;
    }
    
    public void setEmployeeEpf(String employeeEpf) {
        this.employeeEpf = employeeEpf;
    }
    public String getIsDelete() {
        return this.isDelete;
    }
    
    public void setIsDelete(String isDelete) {
        this.isDelete = isDelete;
    }
    public Double getBasicSalary() {
        return this.basicSalary;
    }
    
    public void setBasicSalary(Double basicSalary) {
        this.basicSalary = basicSalary;
    }
    public Set getLogins() {
        return this.logins;
    }
    
    public void setLogins(Set logins) {
        this.logins = logins;
    }
    public Set getAllowanceHasEmployeeses() {
        return this.allowanceHasEmployeeses;
    }
    
    public void setAllowanceHasEmployeeses(Set allowanceHasEmployeeses) {
        this.allowanceHasEmployeeses = allowanceHasEmployeeses;
    }
    public Set getEmployeesHasDeductionses() {
        return this.employeesHasDeductionses;
    }
    
    public void setEmployeesHasDeductionses(Set employeesHasDeductionses) {
        this.employeesHasDeductionses = employeesHasDeductionses;
    }
    public Set getInvoiceCommissonses() {
        return this.invoiceCommissonses;
    }
    
    public void setInvoiceCommissonses(Set invoiceCommissonses) {
        this.invoiceCommissonses = invoiceCommissonses;
    }
    public Set getSalaries() {
        return this.salaries;
    }
    
    public void setSalaries(Set salaries) {
        this.salaries = salaries;
    }
    public Set getTmpemployeesHasJobroalses() {
        return this.tmpemployeesHasJobroalses;
    }
    
    public void setTmpemployeesHasJobroalses(Set tmpemployeesHasJobroalses) {
        this.tmpemployeesHasJobroalses = tmpemployeesHasJobroalses;
    }
    public Set getServiceChargeEmployees() {
        return this.serviceChargeEmployees;
    }
    
    public void setServiceChargeEmployees(Set serviceChargeEmployees) {
        this.serviceChargeEmployees = serviceChargeEmployees;
    }
    public Set getEmployeesHasTables() {
        return this.employeesHasTables;
    }
    
    public void setEmployeesHasTables(Set employeesHasTables) {
        this.employeesHasTables = employeesHasTables;
    }
    public Set getEmployeeContactDetailses() {
        return this.employeeContactDetailses;
    }
    
    public void setEmployeeContactDetailses(Set employeeContactDetailses) {
        this.employeeContactDetailses = employeeContactDetailses;
    }
    public Set getEmployeesHasJobroalses() {
        return this.employeesHasJobroalses;
    }
    
    public void setEmployeesHasJobroalses(Set employeesHasJobroalses) {
        this.employeesHasJobroalses = employeesHasJobroalses;
    }
    public Set getPaymentses() {
        return this.paymentses;
    }
    
    public void setPaymentses(Set paymentses) {
        this.paymentses = paymentses;
    }
    public Set getAttendences() {
        return this.attendences;
    }
    
    public void setAttendences(Set attendences) {
        this.attendences = attendences;
    }
    public Set getLeaveManagements() {
        return this.leaveManagements;
    }
    
    public void setLeaveManagements(Set leaveManagements) {
        this.leaveManagements = leaveManagements;
    }




}


