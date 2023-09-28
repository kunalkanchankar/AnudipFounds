package day28092023;

class Demo{
	public
		int userid;
		String name;
		String password;
	public Demo(int userid, String name, String password){
		this.userid = userid;
		this.name = name;
		this.password = password;
	}
}

public class User {

	public static void main(String[] args) {
		Demo[] obj = new Demo[5];
        obj[0] = new Demo(101,"kunal","pass123");
        obj[1] = new Demo(202,"vivek","word123");
        obj[2] = new Demo(302,"Pratik","go123");
        obj[3] = new Demo(405,"Aman", "doit123");
        obj[4] = new Demo(504,"Tarun", "good123");
        
        for (int i = 0; i < obj.length; i++) {
        	System.out.println("UserID : " + obj[i].userid+"\nName : "+obj[i].name+"\nPassword : "+obj[i].password+"\n");
        }

	}

}