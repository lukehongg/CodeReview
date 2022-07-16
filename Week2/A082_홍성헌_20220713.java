package W2;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class User {
	int age;
	String name;
	
	public User() {
		
	}
	public User(int age, String name) {
		this.age = age;
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return age + " " + name;
	}
}

public class A082_홍성헌_20220713 {
	public static void run(String[]args) throws IOException  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		List<User> users = new ArrayList<User>();
		int i = 0;
		while(i < N) {
			st = new StringTokenizer(br.readLine(), " ");
			int age = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			users.add(new User(age, name)); 
		}
		users.sort(new UserAgeComparator());
		for(User u: users) {
			System.out.println(u.toString());
		}
		
	}
	
}
class UserAgeComparator implements Comparator<User> {
	@Override    
	public int compare(User u1, User u2) {
		if (u1.age > u2.age) {
			return 1;
		} else if (u1.age < u2.age) {
			return -1;
		}        
		return 0;    
	}
}

