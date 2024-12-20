package model;



public class CustomerLoginModel {


/*
+------------+-----------+----------+------------------------+-----------+---------------------+-----------------+-------------+---------------------+
| customerId | firstName | lastName | customerEmail          | password  | customerPhoneNumber | customerAddress | dateOfBirth | registrationDate    |
+------------+-----------+----------+------------------------+-----------+---------------------+-----------------+-------------+---------------------+


*/
		private int customerId;
		private String firstName;
		private String lastName;
		private String customerEmail;
		private String password;
		private String customerPhoneNumber;
		private String customerAdress;
		private String  dateofBirth ;
		
		
		
		public int getCustomerId() {
			return customerId;
		}
		public void setCustomerId(int customerId) {
			this.customerId = customerId;
		}
		public String getFirstName() {
			return firstName;
		}
		public void setFirstName(String firstName) {
			this.firstName = firstName;
		}
		public String getLastName() {
			return lastName;
		}
		public void setLastName(String lastName) {
			this.lastName = lastName;
		}
		public String getCustomerEmail() {
			return customerEmail;
		}
		public void setCustomerEmail(String customerEmail) {
			this.customerEmail = customerEmail;
		}
		public String getPassword() {
			return password;
		}
		public void setPassword(String password) {
			this.password = password;
		}
		public String getCustomerPhoneNumber() {
			return customerPhoneNumber;
		}
		public void setCustomerPhoneNumber(String customerPhoneNumber) {
			this.customerPhoneNumber = customerPhoneNumber;
		}
		public String getCustomerAdress() {
			return customerAdress;
		}
		public void setCustomerAdress(String customerAdress) {
			this.customerAdress = customerAdress;
		}
		public String getDateofBirth() {
			return dateofBirth;
		}
		public void setDateofBirth(String dateofBirth) {
			this.dateofBirth = dateofBirth;
		}
		
		
		
		
		


}
