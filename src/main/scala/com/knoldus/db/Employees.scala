package com.knoldus.db
import com.knoldus.models.Employee
import scala.collection.immutable.HashMap

class Employees {
  val emp : Employee = Employee("Rohit","Verma",23,15000,"Intern","Knoldus","rohit.verma@knoldus.com")
  val emp1 : Employee = Employee("Prageet","Singh",23,15000,"Intern","Knoldus","rohit.verma@knoldus.com")
  val totalEmp : HashMap[String,Employee] = HashMap("emp1"->emp,"emp2"->emp1)
}