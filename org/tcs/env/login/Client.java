package org.tcs.env.login;

public class Client extends Employee {
private void clientId() {
	System.out.println("4433");

}
public static void main(String[] args) {
	Client cl=new Client();
	cl.clientId();//child 2
	cl.empId();//Parent
	cl.empName();
}

}
