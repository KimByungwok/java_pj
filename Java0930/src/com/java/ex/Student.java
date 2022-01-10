package com.java.ex;

public class Student {
		private String name;
		private int num;
		
		public Student(String name, int num) {
			this.name = name;
			this.num = num;
		}
		@Override
		public String toString() {
			return name +" : "+num;
		}
		@Override
		public boolean equals (Object obj) {
			String comparevalue = obj.toString();
			String thisvalue = toString();
			return thisvalue.equals(comparevalue);
		}
		
		@Override
		public int hashCode() {
			return toString().hashCode();
		}
}
