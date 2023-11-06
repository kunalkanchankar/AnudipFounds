package day1106;

import java.io.File; import java.io.IOException;

public class IOFiles {

public static void main(String[] args) {

// TODO Auto-generated method stub

File obj=new File("demo.txt");

System.out.println("Create a new File");

try {

if(obj.createNewFile()) {

System.out.println("New file is created with name:="+obj.getName());

System.out.println("Path:="+obj.getAbsolutePath());

}

else {

System.out.println("File is already exist in folder");

} 
}
catch (IOException e) {

e.printStackTrace();

}
}
}