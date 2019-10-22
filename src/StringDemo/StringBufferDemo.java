package StringDemo;

public class StringBufferDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
StringBuffer sb=new StringBuffer("Admin");
sb.append("user");
sb.delete(0,2);

StringBuilder st=new StringBuilder("Mansi");
st.reverse();
System.out.println(st);


System.out.println(sb);
	}

}
