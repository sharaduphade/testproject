package com.s;

public class User {
	 private int id;
	    private String firstName;
	    private String lastName;
	    @Override
		public String toString() {
			return "User [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", age=" + age
					+ ", gender=" + gender + "]";
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
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
		public int getAge() {
			return age;
		}
		public void setAge(int age) {
			this.age = age;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		private int age;
	    private String gender;
}
